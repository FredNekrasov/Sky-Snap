package com.fredprojects.api.useCases.impl.ticketOffers

import com.fredprojects.api.models.TicketOffer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.useCases.IGetDataUseCase
import com.fredprojects.api.utils.Response
import kotlinx.coroutines.flow.Flow

class GetTicketOffersUseCase(
    private val repository : IRepository<TicketOffer>
) : IGetDataUseCase<TicketOffer> {
    override operator fun invoke() : Flow<Response<TicketOffer>> = repository.fetchData()
}