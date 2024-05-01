package com.fredprojects.main.di

import com.fredprojects.api.models.Offer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.useCases.IGetDataUseCase
import com.fredprojects.api.useCases.impl.offers.GetOffersUseCase
import org.koin.dsl.module

val domainMainModule = module {
    factory<IGetDataUseCase<Offer>> {
        GetOffersUseCase(get<IRepository<Offer>>())
    }
}