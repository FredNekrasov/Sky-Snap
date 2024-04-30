package com.fredprojects.api.utils

sealed class Response<T>(val list: List<T>, val connectionStatus : ConnectionStatus) {
    data class Success<T>(val data: List<T>) : Response<T>(data, ConnectionStatus.SUCCESS)
    class Failure<T>(status : ConnectionStatus) : Response<T>(emptyList(), status)
    class Loading<T> : Response<T>(emptyList(), ConnectionStatus.LOADING)
}