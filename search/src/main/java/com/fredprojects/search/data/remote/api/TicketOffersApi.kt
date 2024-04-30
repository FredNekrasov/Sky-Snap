package com.fredprojects.search.data.remote.api

import com.fredprojects.search.data.remote.dto.TicketOffersDto
import retrofit2.http.GET

interface TicketOffersApi {
    @GET("uc?export=download&id=13WhZ5ahHBwMiHRXxWPq-bYlRVRwAujta")
    suspend fun getTicketOffers(): TicketOffersDto
}