package com.fredprojects.api.useCases.impl.tickets

import com.fredprojects.api.models.ticket.Ticket
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.useCases.IGetDataUseCase
import com.fredprojects.api.utils.Response
import kotlinx.coroutines.flow.Flow

class GetTicketsUseCase(
    private val repository : IRepository<Ticket>
) : IGetDataUseCase<Ticket> {
    override operator fun invoke() : Flow<Response<Ticket>> = repository.fetchData()
}