package com.fredprojects.tickets.data.mappers

import com.fredprojects.api.models.ticket.Transition
import com.fredprojects.tickets.data.remote.dto.TransitionDto

fun TransitionDto.toDomain() = Transition(
    airport = airport,
    date = date.replace("\\d{4}-\\d{2}-\\d{2}\\w".toRegex(), ""),
    town = town
)