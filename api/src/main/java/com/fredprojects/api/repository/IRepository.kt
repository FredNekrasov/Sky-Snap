package com.fredprojects.api.repository

import com.fredprojects.api.utils.Response
import kotlinx.coroutines.flow.Flow

interface IRepository<T> {
    fun fetchData(): Flow<Response<T>>
}