package com.elnemr.data

import com.elnemr.data.model.Message

interface IMessageDataSource {
    suspend fun getAllMessages(): List<Message>
    suspend fun insertMessage(message: Message)
}