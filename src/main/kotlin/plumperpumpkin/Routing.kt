package plumperpumpkin

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import plumperpumpkin.puzzles.Day1
import plumperpumpkin.puzzles.Day2

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/Day1Part1"){
            val input = call.receiveText()
            val day1 = Day1()
            val result = day1.part1(input)
            call.respondText { "Day1 Part1 $result" }

        }
        post("/Day1Part2") {
            val input = call.receiveText()
            val day1 = Day1()
            val result = day1.part2(input)
            call.respondText { result }
        }

        post("/Day2Part1"){
            val input = call.receiveText()
            val day2 = Day2()
            val result = day2.part1(input)
            call.respondText { result }
        }

        post("/Day2Part2"){
            val input = call.receiveText()
            val day2 = Day2()
            val result = day2.part2(input)
            call.respondText { result }
        }

    }
}
