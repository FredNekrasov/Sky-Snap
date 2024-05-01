package com.fredprojects.tickets.di

import com.fredprojects.api.models.ticket.Ticket
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.useCases.IGetDataUseCase
import com.fredprojects.api.useCases.impl.tickets.GetTicketsUseCase
import org.koin.dsl.module

val domainTicketsModule = module {
    factory<IGetDataUseCase<Ticket>> {
        GetTicketsUseCase(get<IRepository<Ticket>>())
    }
}