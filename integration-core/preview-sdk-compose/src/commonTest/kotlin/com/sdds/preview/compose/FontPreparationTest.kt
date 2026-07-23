package com.sdds.preview.compose

import androidx.compose.ui.text.font.FontFamily
import com.sdds.preview.contract.PreviewAsset
import com.sdds.preview.contract.PreviewAssetType
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewFontFace
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.TokenValue
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FontPreparationTest {
    @Test
    fun `required missing font fails preparation`() = runTest {
        assertFailsWith<IllegalArgumentException> {
            payload(false).prepareComposeTheme(InMemoryPreviewAssetResolver(emptyMap())) { FontFamily.Default }
        }
    }

    @Test
    fun `explicit fallback uses default family`() = runTest {
        val theme = payload(true).prepareComposeTheme(InMemoryPreviewAssetResolver(emptyMap())) { error("not called") }
        assertEquals(FontFamily.Default, theme.fontFamily("font.family"))
    }

    @Test
    fun `face weight and style reach platform factory`() = runTest {
        var captured: LoadedFontFace? = null
        payloadWithBytes().prepareComposeTheme(InMemoryPreviewAssetResolver(mapOf("font" to byteArrayOf(1)))) { faces ->
            captured = faces.single()
            FontFamily.Default
        }
        assertEquals(650, captured?.weight)
        assertTrue(captured?.italic == true)
    }

    private fun payload(fallback: Boolean) = PreviewPayload(
        requestId = "font-test",
        platform = PreviewPlatform.COMPOSE,
        assets = listOf(PreviewAsset("font", PreviewAssetType.TTF, "font.ttf")),
        theme = mapOf(
            "font.family" to TokenValue.FontFamily(listOf(PreviewFontFace("font", 400)), fallback),
            "typography.body" to TokenValue.Typography("font.family", 16.0, 20.0, 0.0, 400),
        ),
        component = PreviewComponent("button"),
        example = PreviewExample("default"),
    )

    private fun payloadWithBytes() = PreviewPayload(
        requestId = "font-style-test",
        platform = PreviewPlatform.COMPOSE,
        assets = listOf(PreviewAsset("font", PreviewAssetType.OTF, "font.otf")),
        theme = mapOf(
            "font.family" to TokenValue.FontFamily(
                listOf(PreviewFontFace("font", 650, com.sdds.preview.contract.PreviewFontStyle.ITALIC)),
            ),
        ),
        component = PreviewComponent("button"),
        example = PreviewExample("default"),
    )
}
