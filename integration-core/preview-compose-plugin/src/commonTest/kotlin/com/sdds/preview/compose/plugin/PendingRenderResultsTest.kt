package com.sdds.preview.compose.plugin

import com.sdds.preview.contract.PreviewResult
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PendingRenderResultsTest {

    private val delivered = mutableListOf<PreviewResult>()
    private val pending = PendingRenderResults { delivered += it }

    @Test
    fun `result is held until the render is confirmed`() {
        pending.await(PreviewResult.Success("a"))

        assertTrue(delivered.isEmpty())

        pending.confirm("a")

        assertEquals(listOf<PreviewResult>(PreviewResult.Success("a")), delivered)
    }

    @Test
    fun `result is delivered once`() {
        pending.await(PreviewResult.Success("a"))

        pending.confirm("a")
        pending.confirm("a")

        assertEquals(1, delivered.size)
    }

    @Test
    fun `confirmation of another request does not release the result`() {
        pending.await(PreviewResult.Success("b"))

        pending.confirm("a")

        assertTrue(delivered.isEmpty())
    }

    @Test
    fun `an unconfirmed result is superseded by the next one`() {
        pending.await(PreviewResult.Success("a"))
        pending.await(PreviewResult.Success("b"))

        assertEquals(1, delivered.size)
        val failure = delivered.single() as PreviewResult.Failure
        assertEquals("a", failure.requestId)
        assertEquals("superseded", failure.code)

        pending.confirm("b")

        assertEquals(PreviewResult.Success("b"), delivered.last())
    }
}
