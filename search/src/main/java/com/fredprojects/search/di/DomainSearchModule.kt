package com.fredprojects.search.di

import com.fredprojects.api.models.TicketOffer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.useCases.IGetDataUseCase
import com.fredprojects.api.useCases.impl.ticketOffers.GetTicketOffersUseCase
import org.koin.dsl.module

val domainSearchModule = module {
    factory<IGetDataUseCase<TicketOffer>> {
        GetTicketOffersUseCase(get<IRepository<TicketOffer>>())
    }
}