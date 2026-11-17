package com.sdds.compose.uikit

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WheelWidthModeTest {

    @Test
    fun `auto resolves to center content for mixed alignment`() {
        assertEquals(
            WheelWidthMode.CenterContent,
            WheelWidthMode.Auto.resolveFor(WheelAlignment.Mixed),
        )
    }

    @Test
    fun `auto resolves to equal for non-mixed alignments`() {
        val alignments = listOf(
            WheelAlignment.Start,
            WheelAlignment.End,
            WheelAlignment.Center,
        )
        alignments.forEach { alignment ->
            assertEquals(WheelWidthMode.Equal, WheelWidthMode.Auto.resolveFor(alignment))
        }
    }

    @Test
    fun `explicit modes ignore alignment`() {
        assertEquals(
            WheelWidthMode.Equal,
            WheelWidthMode.Equal.resolveFor(WheelAlignment.Mixed),
        )
        assertEquals(
            WheelWidthMode.CenterContent,
            WheelWidthMode.CenterContent.resolveFor(WheelAlignment.Center),
        )
    }

    @Test
    fun `equal mode stretches every wheel`() {
        (1..4).forEach { wheelCount ->
            (0 until wheelCount).forEach { wheelIndex ->
                assertTrue(
                    "count=$wheelCount index=$wheelIndex",
                    shouldStretchWheel(WheelWidthMode.Equal, wheelIndex, wheelCount),
                )
            }
        }
    }

    @Test
    fun `center content with a single wheel stretches it`() {
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 0, 1))
    }

    @Test
    fun `center content with two wheels stretches both`() {
        (0..1).forEach { wheelIndex ->
            assertTrue(
                "index=$wheelIndex",
                shouldStretchWheel(WheelWidthMode.CenterContent, wheelIndex, 2),
            )
        }
    }

    @Test
    fun `center content with three wheels stretches only edges`() {
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 0, 3))
        assertFalse(shouldStretchWheel(WheelWidthMode.CenterContent, 1, 3))
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 2, 3))
    }

    @Test
    fun `center content with four wheels stretches only edges`() {
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 0, 4))
        assertFalse(shouldStretchWheel(WheelWidthMode.CenterContent, 1, 4))
        assertFalse(shouldStretchWheel(WheelWidthMode.CenterContent, 2, 4))
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 3, 4))
    }
}
