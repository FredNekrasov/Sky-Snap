package com.fredprojects.tickets.data.mappers

import com.fredprojects.api.models.ticket.Luggage
import com.fredprojects.tickets.data.remote.dto.LuggageDto

fun LuggageDto.toDomain() = Luggage(
    hasLuggage = hasLuggage,
    price = price?.value ?: 0
)