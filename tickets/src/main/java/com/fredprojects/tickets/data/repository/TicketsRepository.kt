package com.fredprojects.tickets.data.repository

import com.fredprojects.api.models.ticket.Ticket
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.utils.ConnectionStatus.*
import com.fredprojects.api.utils.Response
import com.fredprojects.tickets.data.mappers.toDomain
import com.fredprojects.tickets.data.remote.api.TicketsApi
import com.google.gson.JsonSyntaxException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class TicketsRepository(
    private val api: TicketsApi
) : IRepository<Ticket> {
    override fun fetchData() : Flow<Response<Ticket>> = flow {
        emit(Response.Loading())
        try {
            emit(
                Response.Success(
                    api.getTickets().tickets.map { it.toDomain() }
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