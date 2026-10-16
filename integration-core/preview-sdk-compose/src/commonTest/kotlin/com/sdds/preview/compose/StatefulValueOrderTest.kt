package com.sdds.preview.compose

import com.sdds.compose.uikit.interactions.InteractiveState
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * UIKit при равном числе состояний выбирает первую подходящую запись, а Preview Protocol последнюю:
 * `toStateful` разворачивает порядок записей.
 */
class StatefulValueOrderTest {
    private val states = PreviewStateMap()

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
        val value = property.toStateful(states)

        assertEquals("second", value.getValue(setOf(InteractiveState.Pressed)))
        assertEquals("both", value.getValue(setOf(InteractiveState.Pressed, InteractiveState.Selected)))
        assertEquals("base", value.getValue(setOf(InteractiveState.Hovered)))
    }

    @Test
    fun `entries with an unsupported state name are skipped`() {
        val value = property.toStateful(states)

        assertEquals(3, value.getStateSets().size)
    }

    @Test
    fun `interactive state names are case sensitive`() {
        val value = ResolvedProperty("base", listOf(ResolvedState(setOf("Pressed"), "x"))).toStateful(states)

        assertEquals("base", value.getValue(setOf(InteractiveState.Pressed)))
    }
}
