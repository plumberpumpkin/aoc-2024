package plumperpumpkin.puzzles

import kotlin.collections.ArrayList
import kotlin.math.abs

class Day1 {

    private fun inputPreparation(input: String):  ArrayList<ArrayList<Long>> {
        val lines = input.split("\r\n")
        val list1 = ArrayList<Long>()
        val list2 = ArrayList<Long>()
        for (line in lines) {
            val positions = line.split("   ")
            list1.add(positions[0].toLong())
            list2.add(positions[1].toLong())
        }
        val result = ArrayList<ArrayList<Long>>()
        result.add(list1)
        result.add(list2)
        return result
    }
    fun part1(puzzleInput: String): String{
        val inputPrep = inputPreparation(puzzleInput)
        val list1 = inputPrep[0]
        val list2 = inputPrep[1]
        list1.sort()
        list2.sort()

        var totalDistance: Long = 0
        assert(list1.size == list2.size)
        for (i in list1.indices){
            totalDistance += abs(list1[i] - list2[i])
        }

        return "Day1Part1: Total distance is $totalDistance"
    }

    fun part2(puzzleInput: String) : String {
        val inputPrep = inputPreparation(puzzleInput)
        val list1 = inputPrep[0]
        val list2 = inputPrep[1]
        var similarityScore : Long = 0
        for (location in list1){
            val occurences: Long = list2.count{it == location}.toLong()
            similarityScore += location * occurences
        }

        return "Day1 Part2 - Similarity Score: $similarityScore"
    }
}