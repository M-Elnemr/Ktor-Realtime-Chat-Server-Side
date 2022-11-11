package com.elnemr.room

import io.ktor.websocket.*

data class Member(
    val username: String,
    val sessionId: String,
    val webSocket: WebSocketSession
)