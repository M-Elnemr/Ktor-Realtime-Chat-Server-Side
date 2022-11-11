package com.elnemr.di

import com.elnemr.data.IMessageDataSource
import com.elnemr.data.MessageDataSource
import com.elnemr.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mainModule = module {
    single {
        KMongo.createClient()
            .coroutine
            .getDatabase("message_db_yt")
    }
    single<IMessageDataSource> {
        MessageDataSource(get())
    }
    single {
        RoomController(get())
    }
}