package com.fredprojects.tickets.di

import com.fredprojects.api.models.ticket.Ticket
import com.fredprojects.api.repository.IRepository
import com.fredprojects.tickets.data.remote.api.TicketsApi
import com.fredprojects.tickets.data.repository.TicketsRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataTicketsModule = module {
    single(createdAtStart = true) {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TicketsApi::class.java)
    }
    single<IRepository<Ticket>> {
        TicketsRepository(get<TicketsApi>())
    }
}
const val BASE_URL = "https://drive.google.com/"