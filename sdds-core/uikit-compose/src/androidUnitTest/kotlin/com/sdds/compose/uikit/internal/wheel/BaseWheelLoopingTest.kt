package com.sdds.compose.uikit.internal.wheel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class BaseWheelLoopingTest {

    @Test
    fun `centered item resolves to initialIndex right after start`() {
        val itemsSize = 7
        val middleIndex = 2
        val initialIndex = 3

        val firstVisibleItemIndex =
            calculateLoopingInitialFirstVisibleItemIndex(itemsSize, initialIndex, middleIndex)
        val centerIndex = firstVisibleItemIndex + middleIndex

        assertEquals(initialIndex, centerIndex.mod(itemsSize))
    }

    @Test
    fun `centered item resolves to initialIndex for a single-element list`() {
        val itemsSize = 1
        val middleIndex = 0
        val initialIndex = 0

        val firstVisibleItemIndex =
            calculateLoopingInitialFirstVisibleItemIndex(itemsSize, initialIndex, middleIndex)
        val centerIndex = firstVisibleItemIndex + middleIndex

        assertEquals(initialIndex, centerIndex.mod(itemsSize))
    }

    @Test
    fun `anchor stays far from both ends of Int range`() {
        val itemsSize = 12
        val middleIndex = 3
        val initialIndex = 11

        val firstVisibleItemIndex =
            calculateLoopingInitialFirstVisibleItemIndex(itemsSize, initialIndex, middleIndex)

        val distanceFromZero = firstVisibleItemIndex.toLong()
        val distanceFromMax = Int.MAX_VALUE.toLong() - firstVisibleItemIndex.toLong()
        val billion = 1_000_000_000L

        assertTrue(distanceFromZero > billion)
        assertTrue(distanceFromMax > billion)
    }

    @Test
    fun `scrolling one full lap around the data returns to the same item`() {
        val itemsSize = 5
        val middleIndex = 1
        val initialIndex = 2

        val firstVisibleItemIndex =
            calculateLoopingInitialFirstVisibleItemIndex(itemsSize, initialIndex, middleIndex)
        val afterFullLap = firstVisibleItemIndex + itemsSize

        val centerBefore = (firstVisibleItemIndex + middleIndex).mod(itemsSize)
        val centerAfter = (afterFullLap + middleIndex).mod(itemsSize)

        assertEquals(centerBefore, centerAfter)
    }
}
