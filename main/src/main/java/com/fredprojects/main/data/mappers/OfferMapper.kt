package com.fredprojects.main.data.mappers

import com.fredprojects.api.models.Offer
import com.fredprojects.main.data.remote.dto.OfferDto

fun OfferDto.toDomain() = Offer(
    price = price.value, title = title, town = town, id = id
)