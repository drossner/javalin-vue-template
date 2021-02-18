package de.iisys.va.viz.test

import io.javalin.Javalin
import io.javalin.http.Context
import io.javalin.http.staticfiles.Location

fun main() {

    val app = Javalin.create{
        it.addStaticFiles("statics/test-viz/dist/", Location.EXTERNAL)
        it.enableCorsForAllOrigins()
    }

    app.start(8080)

    app.get("/api/message", ::getMessage)
}

fun getMessage(context: Context){
    context.result("Hello World")
}