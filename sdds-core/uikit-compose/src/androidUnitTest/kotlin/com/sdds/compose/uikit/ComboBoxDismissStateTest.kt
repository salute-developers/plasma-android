package com.sdds.compose.uikit

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ComboBoxDismissStateTest {
    @Test
    fun `dismiss is consumed once so the same tap cannot reopen the popup`() {
        val state = ComboBoxDismissState()
        assertFalse(state.consumeRecentDismiss())
        state.markDismissed()
        assertEquals(1, state.dismissEventCount)
        assertTrue(state.consumeRecentDismiss())
        assertFalse(state.consumeRecentDismiss())
    }

    @Test
    fun `timeout reset allows a later click to reopen`() {
        val state = ComboBoxDismissState()
        state.markDismissed()
        state.reset()
        assertFalse(state.consumeRecentDismiss())
        state.markDismissed()
        assertEquals(2, state.dismissEventCount)
        assertTrue(state.consumeRecentDismiss())
    }
}
