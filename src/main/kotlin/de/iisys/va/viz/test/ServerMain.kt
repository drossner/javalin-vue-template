package de.iisys.va.viz.test

import io.javalin.Javalin
import io.javalin.http.Context
import io.javalin.http.staticfiles.Location

fun main() {

    val app = Javalin.create{
        //makes the built vue app available to requests
        it.addStaticFiles("statics/test-viz/dist/", Location.EXTERNAL)
        //handles any 404 (e.g. requests to /a/path) and pass them to index.html; vue-router takes care of this!
        it.addSinglePageRoot("/", "statics/test-viz/dist/index.html", Location.EXTERNAL)
        it.enableCorsForAllOrigins()
    }

    app.start(8080)
    app.get("/api/message", ::getMessage)
}

fun getMessage(ctx: Context){
    println("api-route")
    ctx.result("Hello World")
}
