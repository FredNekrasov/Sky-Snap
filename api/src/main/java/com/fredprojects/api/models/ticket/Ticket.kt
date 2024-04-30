package com.fredprojects.api.models.ticket

data class Ticket(
    val arrival: Transition,
    val badge: String,
    val company: String,
    val departure: Transition,
    val handLuggage: HandLuggage,
    val hasTransfer: Boolean,
    val hasVisaTransfer: Boolean,
    val isExchangable: Boolean,
    val isReturnable: Boolean,
    val luggage: Luggage,
    val price: Int,
    val providerName: String,
    val id: Int
)