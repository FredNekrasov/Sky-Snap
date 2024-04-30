package com.fredprojects.api.useCases.impl.offers

import com.fredprojects.api.models.Offer
import com.fredprojects.api.repository.IRepository
import com.fredprojects.api.useCases.IGetDataUseCase
import com.fredprojects.api.utils.Response
import kotlinx.coroutines.flow.Flow

class GetOffersUseCase(
    private val repository : IRepository<Offer>
) : IGetDataUseCase<Offer> {
    override operator fun invoke() : Flow<Response<Offer>> = repository.fetchData()
}