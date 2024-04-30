package com.fredprojects.tickets.data.mappers

import com.fredprojects.api.models.ticket.HandLuggage
import com.fredprojects.tickets.data.remote.dto.HandLuggageDto

fun HandLuggageDto.toDomain() = HandLuggage(
    hasHandLuggage = hasHandLuggage,
    size = size ?: ""
)