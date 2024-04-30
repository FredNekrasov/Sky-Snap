package com.fredprojects.main.data.remote.dto

data class OfferDto(
    val id: Int,
    val price: PriceDto,
    val title: String,
    val town: String
)