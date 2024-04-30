package com.fredprojects.tickets.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TicketDto(
    val arrival: TransitionDto,
    val badge: String?,
    val company: String,
    val departure: TransitionDto,
    @SerializedName("hand_luggage")
    val handLuggage: HandLuggageDto,
    @SerializedName("has_transfer")
    val hasTransfer: Boolean,
    @SerializedName("has_visa_transfer")
    val hasVisaTransfer: Boolean,
    val id: Int,
    @SerializedName("is_exchangable")
    val isExchangable: Boolean,
    @SerializedName("is_returnable")
    val isReturnable: Boolean,
    val luggage: LuggageDto,
    val price: PriceDto,
    @SerializedName("provider_name")
    val providerName: String
)