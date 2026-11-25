package com.sdds.preview.contract

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PreviewContractTest {
    @Test
    fun `web font assets and optional theme and style metadata survive round trip`() {
        val original = payload(PREVIEW_PROTOCOL_VERSION).copy(
            platform = PreviewPlatform.WEB,
            assets = listOf(
                PreviewAsset("regular", PreviewAssetType.WOFF, "https://example.test/regular.woff"),
                PreviewAsset("italic", PreviewAssetType.WOFF2, "https://example.test/italic.woff2"),
            ),
            theme = mapOf(
                "font.body" to TokenValue.FontFamily(
                    faces = listOf(PreviewFontFace("italic", 400, PreviewFontStyle.ITALIC)),
                    family = "SB Sans Text",
                ),
                "body" to TokenValue.Typography(
                    "font.body", 16.0, 20.0, 0.0, 400, fontStyle = PreviewFontStyle.ITALIC,
                ),
            ),
            styles = mapOf(
                "Button/view/accent" to PreviewStyle(
                    component = "Button",
                    variation = "view",
                    name = "accent",
                    default = true,
                    invariant = false,
                ),
                "Button/invariants" to PreviewStyle(component = "Button", invariant = true),
            ),
        )

        val encoded = PreviewContractJson.encodeToString(original)

        assertEquals(original, PreviewContractJson.decodeFromString<PreviewPayload>(encoded))
    }

    @Test
    fun `current protocol version is accepted`() {
        assertNull(payload(protocolVersion = PREVIEW_PROTOCOL_VERSION).validateVersion())
    }

    @Test
    fun `unknown protocol version is rejected`() {
        val failure = payload(protocolVersion = 2).validateVersion()
        assertEquals("unsupported_protocol_version", failure?.code)
        assertEquals("$.protocolVersion", failure?.path)
    }

    @Test
    fun `description semantic validation rejects duplicate names and invalid choices`() {
        val description = PreviewComponentDescription(
            componentId = "button",
            storyId = "basic",
            properties = listOf(
                PreviewExamplePropertyDescription.StringProperty("label", "Label"),
                PreviewExamplePropertyDescription.StringProperty("label", "Other"),
                PreviewExamplePropertyDescription.SingleChoiceProperty("icon", "Missing", listOf("Start")),
            ),
        )

        val errors = description.validate()

        assertTrue(errors.any { "уникальны" in it })
        assertTrue(errors.any { "defaultValue" in it })
    }

    private fun payload(protocolVersion: Int) = PreviewPayload(
        protocolVersion = protocolVersion,
        requestId = "request-1",
        platform = PreviewPlatform.COMPOSE,
        theme = emptyMap(),
        component = PreviewComponent("button"),
        example = PreviewExample("basic"),
    )
}
