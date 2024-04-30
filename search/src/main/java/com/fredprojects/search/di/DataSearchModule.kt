package com.fredprojects.search.di

import com.fredprojects.api.models.TicketOffer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.search.data.remote.api.TicketOffersApi
import com.fredprojects.search.data.repository.TicketOffersRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataSearchModule = module {
    single(createdAtStart = true) {
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TicketOffersApi::class.java)
}
    single<IRepository<TicketOffer>> {
        TicketOffersRepository(get<TicketOffersApi>())
    }
}
const val BASE_URL = "https://drive.google.com/"