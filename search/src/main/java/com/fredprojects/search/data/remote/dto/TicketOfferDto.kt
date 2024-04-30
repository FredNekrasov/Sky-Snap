package com.fredprojects.search.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TicketOfferDto(
    val id: Int,
    val price: PriceDto,
    @SerializedName("time_range")
    val timeRange: List<String>,
    val title: String
)