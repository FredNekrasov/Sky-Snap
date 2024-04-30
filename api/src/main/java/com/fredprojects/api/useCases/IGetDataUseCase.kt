package com.fredprojects.api.useCases

import com.fredprojects.api.utils.Response
import kotlinx.coroutines.flow.Flow

interface IGetDataUseCase<T> {
    operator fun invoke() : Flow<Response<T>>
}