package com.fredprojects.main.data.repository

import com.fredprojects.api.models.Offer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.utils.ConnectionStatus.*
import com.fredprojects.api.utils.Response
import com.fredprojects.main.data.mappers.toDomain
import com.fredprojects.main.data.remote.api.OffersApi
import com.google.gson.JsonSyntaxException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class OffersRepository(
    private val api: OffersApi
) : IRepository<Offer> {
    override fun fetchData() : Flow<Response<Offer>> = flow {
        emit(Response.Loading())
        try {
            emit(
                Response.Success(
                    api.getOffers().offers.map { it.toDomain() }
                )
            )
        } catch(ex: IOException) {
            emit(Response.Failure(NO_INTERNET))
        } catch(ex: JsonSyntaxException) {
            emit(Response.Failure(SERVER_ERROR))
        } catch(ex: Exception) {
            emit(Response.Failure(UNKNOWN))
        }
    }
}