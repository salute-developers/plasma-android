package com.sdds.preview.compose

import androidx.compose.ui.graphics.Color
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStateEntry
import kotlinx.serialization.json.JsonPrimitive
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class PropertyValuesTest {
    private fun literal(value: String, alpha: Double? = null) =
        PreviewPropertySource.Literal(JsonPrimitive(value), alpha)

    private fun resolved(vararg states: Pair<List<String>, String>) = PreviewPropertyValue(
        base = literal("base"),
        states = states.map { (names, value) -> PreviewStateEntry(names, literal(value)) },
    ).resolveStates<String>({ (it as JsonPrimitive).content }, { null })!!

    @Test
    fun `most specific state set wins`() {
        val property = resolved(listOf("pressed") to "pressed", listOf("pressed", "selected") to "both")

        assertEquals("both", property.select(setOf("pressed", "selected")))
        assertEquals("pressed", property.select(setOf("pressed")))
        assertEquals("base", property.select(setOf("hovered")))
    }

    @Test
    fun `later entry wins among equally specific sets`() {
        val property = resolved(listOf("pressed") to "first", listOf("selected") to "second")

        assertEquals("second", property.select(setOf("pressed", "selected")))
    }

    @Test
    fun `entries need every listed state to be active`() {
        val property = resolved(listOf("pressed", "selected") to "both")

        assertEquals("base", property.select(setOf("pressed")))
    }

    @Test
    fun `alpha multiplies the colour alpha for literals and tokens`() {
        val color: (String) -> Color? = { if (it == "token") Color(0xFF112233) else null }
        val value = PreviewPropertyValue(
            base = PreviewPropertySource.TokenReference("token", alpha = 0.5),
            states = listOf(PreviewStateEntry(listOf("pressed"), literal("#FF000080", alpha = 0.5))),
        ).resolveStates(
            literal = { (it as JsonPrimitive).content.toComposeColorOrNull() },
            token = color,
            applyAlpha = Color::withAlphaFactor,
        )!!

        assertEquals(0.5f, value.base.alpha, 0.01f)
        assertEquals(0.5f * (0x80 / 255f), value.states.single().value.alpha, 0.01f)
    }

    @Test
    fun `style and asset references are not resolved as plain values`() {
        assertNull(PreviewPropertySource.StyleReference("x").resolve<String>({ "v" }, { "t" }))
        assertNull(PreviewPropertySource.AssetReference("x").resolve<String>({ "v" }, { "t" }))
    }
}
