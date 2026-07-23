package com.sdds.preview.compose.plugin

import com.sdds.preview.compose.PreparedComposePreview
import com.sdds.preview.contract.PREVIEW_PROTOCOL_VERSION
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewResult
import com.sdds.preview.contract.TokenValue
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString

internal class PreviewRequestCoordinator(
    private val prepare: suspend (String) -> PreparedComposePreview,
    private val apply: (PreparedComposePreview) -> Unit,
) {
    private var latestGeneration: Long = 0

    @Suppress("ReturnCount", "TooGenericExceptionCaught")
    suspend fun submit(json: String): PreviewResult {
        val generation = ++latestGeneration
        val payload = try {
            PreviewContractJson.decodeFromString<PreviewPayload>(json)
        } catch (error: SerializationException) {
            return decodeFailure(json, error)
        } catch (error: IllegalArgumentException) {
            return decodeFailure(json, error)
        }

        if (payload.protocolVersion != PREVIEW_PROTOCOL_VERSION) {
            return PreviewResult.Failure(
                requestId = payload.requestId,
                code = "unsupported_protocol_version",
                message = "Preview Protocol ${payload.protocolVersion} не поддерживается",
                path = "$.protocolVersion",
            )
        }

        val preview = try {
            prepare(json)
        } catch (error: Throwable) {
            return PreviewResult.Failure(
                requestId = payload.requestId,
                code = classifyPreparationFailure(payload, error),
                message = error.message ?: "Preview preparation failed",
            )
        }

        if (generation != latestGeneration) {
            return PreviewResult.Failure(
                requestId = payload.requestId,
                code = "superseded",
                message = "Preview request superseded by a newer payload",
            )
        }

        return try {
            apply(preview)
            PreviewResult.Success(payload.requestId)
        } catch (error: Throwable) {
            PreviewResult.Failure(
                requestId = payload.requestId,
                code = "render_state_apply_failed",
                message = error.message ?: "Preview render state could not be applied",
            )
        }
    }

    private fun decodeFailure(json: String, error: Throwable): PreviewResult.Failure =
        PreviewResult.Failure(
            requestId = extractRequestId(json).orEmpty(),
            code = "invalid_payload",
            message = error.message ?: "Preview payload could not be decoded",
        )

    private fun extractRequestId(json: String): String? =
        REQUEST_ID_REGEX.find(json)?.groupValues?.getOrNull(1)

    private fun classifyPreparationFailure(payload: PreviewPayload, error: Throwable): String {
        val message = error.message.orEmpty().lowercase()
        return when {
            "не зарегистрирован" in message || "not registered" in message -> "component_not_found"
            payload.theme.values.any { it is TokenValue.FontFamily } -> "asset_loading_failed"
            "asset" in message || "font" in message || "http" in message -> "asset_loading_failed"
            else -> "preview_preparation_failed"
        }
    }

    private companion object {
        val REQUEST_ID_REGEX = Regex(""""requestId"\s*:\s*"([^"]+)"""")
    }
}
