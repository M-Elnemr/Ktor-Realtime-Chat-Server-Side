package com.elnemr.plugins


import com.elnemr.room.RoomController
import com.elnemr.routes.chatSocket
import com.elnemr.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    routing {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}

