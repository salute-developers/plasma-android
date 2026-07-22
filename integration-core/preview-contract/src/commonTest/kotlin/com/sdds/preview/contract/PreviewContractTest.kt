package com.sdds.preview.contract

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

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

    private fun payload(protocolVersion: Int) = PreviewPayload(
        protocolVersion = protocolVersion,
        requestId = "request-1",
        platform = PreviewPlatform.COMPOSE,
        theme = emptyMap(),
        component = PreviewComponent("button"),
        example = PreviewExample("basic"),
    )
}
