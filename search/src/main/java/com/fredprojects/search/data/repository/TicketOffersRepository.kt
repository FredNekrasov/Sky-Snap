package com.fredprojects.search.data.repository

import com.fredprojects.api.models.TicketOffer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.utils.ConnectionStatus.*
import com.fredprojects.api.utils.Response
import com.fredprojects.search.data.mappers.toDomain
import com.fredprojects.search.data.remote.api.TicketOffersApi
import com.google.gson.JsonSyntaxException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class TicketOffersRepository(
    private val api: TicketOffersApi
) : IRepository<TicketOffer> {
    override fun fetchData() : Flow<Response<TicketOffer>> = flow {
        emit(Response.Loading())
        try {
            emit(
                Response.Success(
                    api.getTicketOffers().ticketsOffers.map { it.toDomain() }
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