package com.sdds.preview.compose

import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.ValueState
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PreviewStateMapTest {
    private enum class Custom : ValueState { Checked, Indeterminate }

    private val map = PreviewStateMap(mapOf("Checked" to Custom.Checked, "indeterminate" to Custom.Indeterminate))

    @Test
    fun `interactive state names are exact`() {
        assertEquals(setOf<ValueState>(InteractiveState.Pressed), map.resolve(setOf("pressed")))
        assertNull(map.resolve(setOf("Pressed")))
        assertFalse(map.knows("Pressed"))
        assertTrue(map.knows("pressed"))
    }

    @Test
    fun `custom state names ignore case`() {
        assertEquals(setOf<ValueState>(Custom.Checked), map.resolve(setOf("checked")))
        assertEquals(setOf<ValueState>(Custom.Checked), map.resolve(setOf("CHECKED")))
        assertEquals(setOf<ValueState>(Custom.Indeterminate), map.resolve(setOf("Indeterminate")))
    }

    @Test
    fun `combined names resolve to a set and an unknown name rejects the whole entry`() {
        val expected = setOf<ValueState>(InteractiveState.Pressed, Custom.Checked)
        assertEquals(expected, map.resolve(setOf("pressed", "checked")))
        assertNull(map.resolve(setOf("pressed", "fancy")))
        assertFalse(map.knows("fancy"))
    }

    @Test
    fun `a component without custom states knows only interactive names`() {
        val plain = PreviewStateMap()

        assertTrue(plain.knows("hovered"))
        assertFalse(plain.knows("checked"))
    }
}
