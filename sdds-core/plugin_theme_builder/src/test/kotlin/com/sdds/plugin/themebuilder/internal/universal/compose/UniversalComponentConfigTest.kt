package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.Dimension
import com.sdds.plugin.themebuilder.internal.universal.Shape
import kotlinx.serialization.decodeFromString
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class UniversalComponentConfigTest {

    @Test
    fun `config декодирует отсутствующие optional sections как empty defaults`() {
        val config = Serializer.componentConfig.decodeFromString<UniversalComponentConfig>("{}")

        assertNull(config.props.getValue(dimensionMeta("height")))
        assertTrue(config.view.isEmpty())
        assertTrue(config.variations.isEmpty())
        assertTrue(config.bindings.isEmpty())
    }

    @Test
    fun `child variation декодирует пропущенные parent binding view и props как defaults`() {
        val config = Serializer.componentConfig.decodeFromString<UniversalComponentConfig>(
            """
            {
              "variations": [
                { "id": "primary" }
              ]
            }
            """.trimIndent(),
        )

        val variation = config.variations.single()
        assertEquals("primary", variation.id)
        assertNull(variation.parent)
        assertNull(variation.binding)
        assertTrue(variation.view.isEmpty())
        assertNull(variation.props.getValue(dimensionMeta("height")))
    }

    @Test
    fun `view variation merge сохраняет child binding и накладывает props поверх parent`() {
        val parent = viewVariation(
            """
            {
              "props": {
                "height": { "value": 32.0 },
                "shape": { "value": "round.m" }
              },
              "binding": [
                { "name": "state", "value": "parent" }
              ]
            }
            """.trimIndent(),
        )
        val child = viewVariation(
            """
            {
              "props": {
                "height": { "value": 48.0 }
              },
              "binding": [
                { "name": "state", "value": "child" }
              ]
            }
            """.trimIndent(),
        )

        val merged = child.merge(parent) as UniversalViewVariation

        assertEquals("child", merged.binding?.single()?.value)
        assertEquals(Dimension(48f), merged.props.getValue(dimensionMeta("height")))
        assertEquals(Shape("round.m"), merged.props.getValue(shapeMeta("shape")))
    }

    @Test
    fun `view variation merge наследует parent binding если child binding отсутствует`() {
        val parent = viewVariation(
            """
            {
              "props": {
                "height": { "value": 32.0 }
              },
              "binding": [
                { "name": "state", "value": "parent" }
              ]
            }
            """.trimIndent(),
        )
        val child = viewVariation(
            """
            {
              "props": {
                "height": { "value": 48.0 }
              }
            }
            """.trimIndent(),
        )

        val merged = child.merge(parent) as UniversalViewVariation

        assertEquals("parent", merged.binding?.single()?.value)
        assertEquals(Dimension(48f), merged.props.getValue(dimensionMeta("height")))
    }

    private fun viewVariation(json: String): UniversalViewVariation =
        Serializer.componentConfig.decodeFromString(json)

    private fun dimensionMeta(id: String) = ComposeDimensionPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun shapeMeta(id: String) = ComposeShapePropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
