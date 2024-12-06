package plumperpumpkin

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import plumperpumpkin.puzzles.Day1
import plumperpumpkin.puzzles.Day2
import plumperpumpkin.puzzles.Day3
import plumperpumpkin.puzzles.Day5

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

        post("/Day3Part1"){
            val input = call.receiveText()
            val day3 = Day3()
            val result = day3.part1(input)
            call.respondText { result }
        }

        post("/Day5Part1") {
            val input = call.receiveText()
            val day5 = Day5()
            val result = day5.part1(input)
            call.respondText { result }
        }

    }
}
