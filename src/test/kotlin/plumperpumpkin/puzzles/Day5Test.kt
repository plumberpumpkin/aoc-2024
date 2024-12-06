package plumperpumpkin.puzzles

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class Day5Test {

    val day5 = Day5()
    val rules = ArrayList<Pair<Int, Int>>()
    val updates = ArrayList<ArrayList<Int>>()

    @BeforeEach
    fun setUp() {

        rules.add(Pair(47, 53));
        rules.add(Pair(97, 13));
        rules.add(Pair(97, 61));
        rules.add(Pair(97, 47));
        rules.add(Pair(75, 29));
        rules.add(Pair(61, 13));
        rules.add(Pair(75, 53));
        rules.add(Pair(29, 13));
        rules.add(Pair(97, 29));
        rules.add(Pair(53, 29));
        rules.add(Pair(61, 53));
        rules.add(Pair(97, 53));
        rules.add(Pair(61, 29));
        rules.add(Pair(47, 13));
        rules.add(Pair(75, 47));
        rules.add(Pair(97, 75));
        rules.add(Pair(47, 61));
        rules.add(Pair(75, 61));
        rules.add(Pair(47, 29));
        rules.add(Pair(75, 13));
        rules.add(Pair(53, 13));
        updates.add(arrayListOf(75,47,61,53,20))
        updates.add(arrayListOf(97,61,53,29,13))
        updates.add(arrayListOf(75,29,13))
        updates.add(arrayListOf(75,97,47,61,53))
        updates.add(arrayListOf(61,13,29))
        updates.add(arrayListOf(97,13,75,29,47))
    }

    @Test
    fun part1() {
        assertEquals(day5.checkOrder(updates, rules), 143)
    }
}