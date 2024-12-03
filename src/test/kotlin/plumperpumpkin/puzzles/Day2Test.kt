package plumperpumpkin.puzzles

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day2Test {

    private val saveReport = ArrayList<Int>(listOf(1,2,3))
    private val unsafeReportDirection = ArrayList<Int>(listOf(2,1,3))
    private val unsafeReportStepToBig = ArrayList<Int>(listOf(1,2,9))


    private val unsafeReportNoDirection = ArrayList<Int>(listOf(1,2,2))
    private val unsafeReportMixedDirection = ArrayList<Int>(listOf(1,2,1))

    private val day2 = Day2()


    @Test
    fun prepareInput() {
    }

    @Test
    fun directionCheck() {


        assertTrue(day2.directionCheck(saveReport))
        assertFalse(day2.directionCheck(unsafeReportDirection))
        assertFalse(day2.directionCheck(unsafeReportMixedDirection))
        assertFalse(day2.directionCheck(unsafeReportNoDirection))

    }

    @Test
    fun distanceCheck() {
        assertTrue(day2.distanceCheck(saveReport))
        assertFalse(day2.distanceCheck(unsafeReportNoDirection))
        assertFalse(day2.distanceCheck(unsafeReportStepToBig))
    }
}