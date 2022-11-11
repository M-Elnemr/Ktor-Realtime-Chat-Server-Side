package com.elnemr

import com.elnemr.di.mainModule
import com.elnemr.plugins.*
import io.ktor.server.application.*
import org.koin.ktor.plugin.koin


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    koin {
        modules(mainModule)
    }
    configureSockets()
    configureSerialization()
    configureSecurity()
    configureMonitoring()
    configureRouting()
}
