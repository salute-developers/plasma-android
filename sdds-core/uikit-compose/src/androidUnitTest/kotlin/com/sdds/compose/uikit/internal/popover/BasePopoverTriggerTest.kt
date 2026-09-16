package com.sdds.compose.uikit.internal.popover

import androidx.compose.ui.geometry.Rect
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class BasePopoverTriggerTest {

    @Test
    fun `finite bounds are converted to screen coordinates and rounded`() {
        val bounds = Rect(left = 10.4f, top = 20.5f, right = 30.6f, bottom = 40.4f)

        val result = bounds.toScreenRect(intArrayOf(100, 200))

        assertEquals(Rect(left = 110f, top = 221f, right = 131f, bottom = 240f), result)
    }

    @Test
    fun `NaN bounds are ignored instead of being rounded`() {
        val bounds = Rect(left = Float.NaN, top = 20f, right = 30f, bottom = 40f)

        val result = bounds.toScreenRect(intArrayOf(100, 200))

        assertNull(result)
    }

    @Test
    fun `infinite bounds are ignored instead of being rounded`() {
        val bounds = Rect(left = 10f, top = 20f, right = Float.POSITIVE_INFINITY, bottom = 40f)

        val result = bounds.toScreenRect(intArrayOf(100, 200))

        assertNull(result)
    }
}
