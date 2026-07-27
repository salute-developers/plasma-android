package com.sdds.preview.contract

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PreviewContractTest {
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
