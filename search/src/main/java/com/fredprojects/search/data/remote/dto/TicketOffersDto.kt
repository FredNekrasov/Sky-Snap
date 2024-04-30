package com.fredprojects.search.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TicketOffersDto(
    @SerializedName("tickets_offers")
    val ticketsOffers: List<TicketOfferDto>
)