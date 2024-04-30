package com.fredprojects.tickets.data.remote.api

import com.fredprojects.tickets.data.remote.dto.TicketsDto
import retrofit2.http.GET

interface TicketsApi {
    @GET("/uc?export=download&id=1HogOsz4hWkRwco4kud3isZHFQLUAwNBA")
    suspend fun getTickets(): TicketsDto
}