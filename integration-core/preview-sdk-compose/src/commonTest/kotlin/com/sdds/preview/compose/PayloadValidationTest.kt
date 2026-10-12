package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewAsset
import com.sdds.preview.contract.PreviewAssetType
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStateEntry
import com.sdds.preview.contract.PreviewStyle
import kotlinx.serialization.json.JsonPrimitive
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class PayloadValidationTest {
    private val black = PreviewPropertySource.Literal(JsonPrimitive("#000000FF"))

    private fun value(source: PreviewPropertySource) = PreviewPropertyValue(source)

    private fun payload(
        properties: Map<String, PreviewPropertyValue>,
        styles: Map<String, PreviewStyle> = emptyMap(),
        assets: List<PreviewAsset> = emptyList(),
    ) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        assets = assets,
        theme = emptyMap(),
        component = PreviewComponent("button", properties = properties),
        styles = styles,
        example = PreviewExample("default"),
    )

    private fun style(vararg properties: Pair<String, PreviewPropertySource>) =
        PreviewStyle("divider", properties.associate { it.first to value(it.second) })

    @Test
    fun `nested styles are accepted`() {
        payload(
            mapOf("divider" to value(PreviewPropertySource.StyleReference("a"))),
            mapOf(
                "a" to style("inner" to PreviewPropertySource.StyleReference("b")),
                "b" to style("color" to black),
            ),
        ).validateReferences()
    }

    @Test
    fun `shared style referenced twice is not a cycle`() {
        payload(
            mapOf(
                "one" to value(PreviewPropertySource.StyleReference("a")),
                "two" to value(PreviewPropertySource.StyleReference("a")),
            ),
            mapOf("a" to style()),
        ).validateReferences()
    }

    @Test
    fun `unknown style is reported with its path`() {
        val error = assertFailsWith<PreviewPreparationException> {
            payload(mapOf("divider" to value(PreviewPropertySource.StyleReference("missing")))).validateReferences()
        }

        assertEquals("unknown_style_ref", error.code)
        assertEquals("$.component.properties.divider", error.path)
    }

    @Test
    fun `style cycle is reported`() {
        val error = assertFailsWith<PreviewPreparationException> {
            payload(
                mapOf("divider" to value(PreviewPropertySource.StyleReference("a"))),
                mapOf(
                    "a" to style("next" to PreviewPropertySource.StyleReference("b")),
                    "b" to style("next" to PreviewPropertySource.StyleReference("a")),
                ),
            ).validateReferences()
        }

        assertEquals("style_ref_cycle", error.code)
    }

    @Test
    fun `self reference is a cycle`() {
        val error = assertFailsWith<PreviewPreparationException> {
            payload(
                mapOf("divider" to value(PreviewPropertySource.StyleReference("a"))),
                mapOf("a" to style("self" to PreviewPropertySource.StyleReference("a"))),
            ).validateReferences()
        }

        assertEquals("style_ref_cycle", error.code)
    }

    @Test
    fun `unknown asset is reported`() {
        val error = assertFailsWith<PreviewPreparationException> {
            payload(mapOf("icon" to value(PreviewPropertySource.AssetReference("nope")))).validateReferences()
        }

        assertEquals("unknown_asset_ref", error.code)
    }

    @Test
    fun `unknown state names and image assets produce warnings`() {
        val icon = PreviewAsset("icon", PreviewAssetType.SVG, "https://example.test/i.svg")
        val warnings = payload(
            mapOf(
                "color" to PreviewPropertyValue(
                    base = black,
                    states = listOf(
                        PreviewStateEntry(listOf("pressed"), black),
                        PreviewStateEntry(listOf("pressed", "fancy"), black),
                    ),
                ),
                "icon" to value(PreviewPropertySource.AssetReference("icon")),
            ),
            assets = listOf(icon),
        ).collectWarnings(DEFAULT_SUPPORTED_STATES)

        assertEquals(listOf("unknown_state", "unsupported_asset"), warnings.map { it.code })
        assertEquals("$.component.properties.color.states[1]", warnings.first().path)
        assertTrue(warnings.all { it.message.isNotBlank() })
    }

    @Test
    fun `styles nobody references are validated too`() {
        val cycle = assertFailsWith<PreviewPreparationException> {
            payload(
                emptyMap(),
                mapOf(
                    "a" to style("next" to PreviewPropertySource.StyleReference("b")),
                    "b" to style("next" to PreviewPropertySource.StyleReference("a")),
                ),
            ).validateReferences()
        }
        val asset = assertFailsWith<PreviewPreparationException> {
            payload(emptyMap(), mapOf("a" to style("icon" to PreviewPropertySource.AssetReference("nope"))))
                .validateReferences()
        }

        assertEquals("style_ref_cycle", cycle.code)
        assertEquals("unknown_asset_ref", asset.code)
    }
}
