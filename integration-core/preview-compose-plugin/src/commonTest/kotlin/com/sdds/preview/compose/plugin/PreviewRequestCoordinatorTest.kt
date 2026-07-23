package com.sdds.preview.compose.plugin

import androidx.compose.runtime.Composable
import com.sdds.preview.compose.PreparedComposePreview
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewResult
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class PreviewRequestCoordinatorTest {
    @Test
    fun `successful preparation applies preview before returning success`() = runTest {
        val applied = mutableListOf<String>()
        val coordinator = PreviewRequestCoordinator(
            prepare = { FakePreview("first") },
            apply = { applied += it.requestId },
        )

        val result = coordinator.submit(payloadJson("first"))

        assertEquals(listOf("first"), applied)
        assertEquals(PreviewResult.Success("first"), result)
    }

    @Test
    fun `invalid payload returns correlated stable failure and keeps state`() = runTest {
        var applied = "previous"
        val coordinator = PreviewRequestCoordinator(
            prepare = { error("must not prepare") },
            apply = { applied = it.requestId },
        )

        val result = coordinator.submit("""{"requestId":"broken","platform":"COMPOSE"}""")

        assertEquals("previous", applied)
        assertEquals("broken", result.requestId)
        assertEquals("invalid_payload", assertIs<PreviewResult.Failure>(result).code)
    }

    @Test
    fun `sequential payload replaces applied preview`() = runTest {
        var applied = ""
        val coordinator = PreviewRequestCoordinator(
            prepare = { json -> FakePreview(requestId(json)) },
            apply = { applied = it.requestId },
        )

        coordinator.submit(payloadJson("first"))
        val result = coordinator.submit(payloadJson("second"))

        assertEquals("second", applied)
        assertEquals(PreviewResult.Success("second"), result)
    }

    @Test
    @OptIn(ExperimentalCoroutinesApi::class)
    fun `older overlapping request is superseded and cannot replace newer preview`() = runTest {
        val releaseFirst = CompletableDeferred<Unit>()
        var applied = ""
        val coordinator = PreviewRequestCoordinator(
            prepare = { json ->
                requestId(json).also { if (it == "first") releaseFirst.await() }.let(::FakePreview)
            },
            apply = { applied = it.requestId },
        )

        val first = async { coordinator.submit(payloadJson("first")) }
        runCurrent()
        val second = coordinator.submit(payloadJson("second"))
        releaseFirst.complete(Unit)

        assertEquals(PreviewResult.Success("second"), second)
        assertEquals("superseded", assertIs<PreviewResult.Failure>(first.await()).code)
        assertEquals("second", applied)
    }

    @Test
    fun `preparation failures use stable category and preserve previous preview`() = runTest {
        var applied = "previous"
        val coordinator = PreviewRequestCoordinator(
            prepare = { error("Font asset response was HTTP 404") },
            apply = { applied = it.requestId },
        )

        val result = assertIs<PreviewResult.Failure>(coordinator.submit(payloadJson("font")))

        assertEquals("asset_loading_failed", result.code)
        assertEquals("font", result.requestId)
        assertEquals("previous", applied)
    }

    private fun payloadJson(requestId: String): String = PreviewContractJson.encodeToString(
        PreviewPayload(
            requestId = requestId,
            platform = PreviewPlatform.COMPOSE,
            theme = emptyMap(),
            component = PreviewComponent(id = "BasicButton"),
            example = PreviewExample(id = "BasicButton"),
        ),
    )

    private fun requestId(json: String): String =
        PreviewContractJson.decodeFromString<PreviewPayload>(json).requestId

    private class FakePreview(override val requestId: String) : PreparedComposePreview {
        @Composable
        override fun Content() = Unit
    }
}
