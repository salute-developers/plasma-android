package com.sdds.preview.compose

import androidx.compose.ui.text.font.FontFamily
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewComponentDescription
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStyle
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class ComposePreviewRuntimeTest {
    private var prepared = 0

    private val component = object : ComposePreviewComponent {
        override val componentId: String = "button"
        override val description: PreviewComponentDescription = PreviewComponentDescription(componentId = "button", storyId = "button", properties = emptyList())
        override fun prepare(payload: PreviewPayload, theme: PreparedComposeTheme): PreparedComposePreview {
            prepared++
            return object : PreparedComposePreview {
                override val requestId: String = payload.requestId

                @androidx.compose.runtime.Composable
                override fun Content() = Unit
            }
        }
    }

    private val runtime = ComposePreviewRuntime(
        assetResolver = InMemoryPreviewAssetResolver(emptyMap()),
        fontFamilyFactory = LoadedFontFamilyFactory { FontFamily.Default },
        components = listOf(component),
    )

    private fun payloadJson(styles: Map<String, PreviewStyle>, ref: String) = PreviewContractJson.encodeToString(
        PreviewPayload(
            requestId = "r",
            platform = PreviewPlatform.COMPOSE,
            theme = emptyMap(),
            component = PreviewComponent(
                "button",
                properties = mapOf("nested" to PreviewPropertyValue(PreviewPropertySource.StyleReference(ref))),
            ),
            styles = styles,
            example = PreviewExample("default"),
        ),
    )

    private fun style(next: String) =
        PreviewStyle("x", mapOf("next" to PreviewPropertyValue(PreviewPropertySource.StyleReference(next))))

    @Test
    fun `style cycle is rejected before the component prepares anything`() = runTest {
        val error = assertFailsWith<PreviewPreparationException> {
            runtime.prepare(payloadJson(mapOf("a" to style("b"), "b" to style("a")), "a"))
        }

        assertEquals("style_ref_cycle", error.code)
        assertEquals(0, prepared)
    }

    @Test
    fun `unknown style is rejected before the component prepares anything`() = runTest {
        val error = assertFailsWith<PreviewPreparationException> { runtime.prepare(payloadJson(emptyMap(), "missing")) }

        assertEquals("unknown_style_ref", error.code)
        assertEquals(0, prepared)
    }

    @Test
    fun `valid references reach the component`() = runTest {
        val preview = runtime.prepare(payloadJson(mapOf("a" to PreviewStyle("x")), "a"))

        assertEquals("r", preview.requestId)
        assertEquals(1, prepared)
        assertTrue(preview.warnings.isEmpty())
    }
}
