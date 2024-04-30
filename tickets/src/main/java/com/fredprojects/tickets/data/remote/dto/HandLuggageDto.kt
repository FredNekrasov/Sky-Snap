package com.fredprojects.tickets.data.remote.dto

import com.google.gson.annotations.SerializedName

data class HandLuggageDto(
    @SerializedName("has_hand_luggage")
    val hasHandLuggage: Boolean,
    val size: String?
)