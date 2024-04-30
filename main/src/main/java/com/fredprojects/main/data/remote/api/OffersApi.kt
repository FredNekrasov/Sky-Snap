package com.fredprojects.main.data.remote.api

import com.fredprojects.main.data.remote.dto.OffersDto
import retrofit2.http.GET

interface OffersApi {
    @GET("uc?export=download&id=1o1nX3uFISrG1gR-jr_03Qlu4_KEZWhav")
    suspend fun getOffers(): OffersDto
}