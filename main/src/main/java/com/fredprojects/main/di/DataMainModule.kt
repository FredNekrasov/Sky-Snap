package com.fredprojects.main.di

import com.fredprojects.api.models.Offer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.main.data.remote.api.OffersApi
import com.fredprojects.main.data.repository.OffersRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataMainModule = module {
    single(createdAtStart = true) {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OffersApi::class.java)
    }
    single<IRepository<Offer>> {
        OffersRepository(get<OffersApi>())
    }
}
const val BASE_URL = "https://drive.google.com/"