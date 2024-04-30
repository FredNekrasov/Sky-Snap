package com.fredprojects.tickets.data.mappers

import com.fredprojects.api.models.ticket.Ticket
import com.fredprojects.tickets.data.remote.dto.TicketDto

fun TicketDto.toDomain() = Ticket(
    arrival = arrival.toDomain(),
    badge = badge ?: "",
    company = company,
    departure = departure.toDomain(),
    handLuggage = handLuggage.toDomain(),
    hasTransfer = hasTransfer,
    hasVisaTransfer = hasVisaTransfer,
    isExchangable = isExchangable,
    isReturnable = isReturnable,
    luggage = luggage.toDomain(),
    price = price.value,
    providerName = providerName,
    id = id
)