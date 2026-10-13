package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.preview.compose.ResolvedProperty
import com.sdds.preview.compose.ResolvedState
import kotlin.test.Test
import kotlin.test.assertEquals

class BasicButtonStatefulValueTest {
    private val property = ResolvedProperty(
        base = "base",
        states = listOf(
            ResolvedState(setOf("pressed"), "first"),
            ResolvedState(setOf("pressed"), "second"),
            ResolvedState(setOf("pressed", "selected"), "both"),
            ResolvedState(setOf("pressed", "fancy"), "unsupported"),
        ),
    )

    @Test
    fun `later entry wins among equal sets and the larger set wins regardless of order`() {
        val value = property.toStateful()

        assertEquals("second", value.getValue(setOf(InteractiveState.Pressed)))
        assertEquals("both", value.getValue(setOf(InteractiveState.Pressed, InteractiveState.Selected)))
        assertEquals("base", value.getValue(setOf(InteractiveState.Hovered)))
    }

    @Test
    fun `entries with an unsupported state name are skipped`() {
        val value = property.toStateful()

        assertEquals(3, value.getStateSets().size)
        assertEquals("both", value.getValue(setOf(InteractiveState.Pressed, InteractiveState.Selected)))
    }

    @Test
    fun `state names are case sensitive`() {
        val value = ResolvedProperty("base", listOf(ResolvedState(setOf("Pressed"), "x"))).toStateful()

        assertEquals("base", value.getValue(setOf(InteractiveState.Pressed)))
        assertEquals(
            setOf("pressed", "hovered", "focused", "activated", "selected"),
            BasicButtonPreviewStyleFactory.supportedStates,
        )
    }
}
