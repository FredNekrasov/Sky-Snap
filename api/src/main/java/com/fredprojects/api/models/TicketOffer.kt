package com.fredprojects.api.models

data class TicketOffer(
    val price: Int,
    val timeRange: String,
    val title: String,
    val id: Int
)