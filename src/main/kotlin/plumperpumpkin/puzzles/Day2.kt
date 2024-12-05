package plumperpumpkin.puzzles

import kotlin.math.abs

class Day2 {

    fun part1(puzzleInput: String) : String {
        val reports = prepareInput(puzzleInput)
        var counter = 0
        for (report in reports){
            if (directionCheck(report) && distanceCheck(report)) counter += 1
        }


        return "Day 2 Part 1 : Total count of save reports is $counter"
    }

    fun part2(puzzleInput: String) : String {
        val reports = prepareInput(puzzleInput)
        var counter = 0
        for (report in reports){
            if (directionCheck(report) && distanceCheck(report)) {
                counter += 1
                continue
            } else{
                for (i in 0 ..< report.size - 1){
                    val reducedReport = ArrayList<Int>(report)
                    reducedReport.removeAt(i)
                    if (directionCheck(reducedReport) && distanceCheck(reducedReport) ) {
                        counter += 1
                        break
                    }
                }
            }
        }
        return "Day 2Part 2 : Total count of save reports is $counter"
    }

    fun prepareInput(input: String) : ArrayList<ArrayList<Int>> {
        val results = ArrayList<ArrayList<Int>>()
        val lines = input.split("\r\n")
        for(line in lines){
            val report = ArrayList<Int>()
            val levels = line.split(" ")
            for (level in levels){
                report.add(level.toInt())
            }
            results.add(report)
        }
        return results
    }
    fun directionCheck(report: ArrayList<Int>) : Boolean {
        var goesUp = false
        var goesDown = false
        var noDirection = false

        for (index in 0 ..<report.size-1){
            val results = ArrayList<Boolean>()
            if (report[index] > report[index + 1]) {
                goesDown = true
            } else if (report[index] < report[index + 1]){
                goesUp = true
            } else{
                noDirection = true
            }
            results.add(goesUp)
            results.add(goesDown)
            if (results.count{ it } != 1 || noDirection ) return false
        }
        return true
    }
    fun distanceCheck(report: ArrayList<Int>) : Boolean {
        for (index in 0..<report.size-1){
            var result = false
            val distance = abs(report[index] - report[index + 1])
            if (distance in 1..3) result = true
            if (!result) return false
        }
        return true
    }

}