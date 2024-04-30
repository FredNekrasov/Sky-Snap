package com.fredprojects.search.data.mappers

import com.fredprojects.api.models.TicketOffer
import com.fredprojects.search.data.remote.dto.TicketOfferDto

fun TicketOfferDto.toDomain() = TicketOffer(
    price = price.value,
    timeRange = timeRange.joinToString(" "),
    title = title,
    id = id
)