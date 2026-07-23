package com.sdds.preview.compose.plugin

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.sdds.compose.uikit.fixtures.stories.button.BasicButtonStory
import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.preview.compose.ComposePreviewRuntime
import com.sdds.preview.compose.PreparedComposePreview
import com.sdds.preview.compose.WasmLoadedFontFamilyFactory
import com.sdds.preview.compose.previewComponent
import kotlinx.browser.document
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.js.ExperimentalJsExport

private sealed interface RenderState {
    data object Empty : RenderState
    data class Ready(val preview: PreparedComposePreview) : RenderState
    data class Failure(val message: String) : RenderState
}

private val scope = MainScope()
private var renderState: RenderState by mutableStateOf(RenderState.Empty)
private val runtime = ComposePreviewRuntime(
    assetResolver = HttpPreviewAssetResolver,
    fontFamilyFactory = WasmLoadedFontFamilyFactory,
    components = listOf(previewComponent(BasicButtonStory, BasicButtonPreviewStyleFactory)),
)

/** Принимает следующий полный payload и заменяет состояние текущего Wasm preview. */
@OptIn(ExperimentalJsExport::class)
@JsExport
public fun submitPreviewPayload(json: String) {
    scope.launch {
        renderState = runCatching { runtime.prepare(json) }
            .fold(RenderState::Ready) { RenderState.Failure(it.message ?: "Preview preparation failed") }
    }
}

/** Browser entrypoint типизированного BasicButton PoC. */
@OptIn(ExperimentalComposeUiApi::class)
public fun main() {
    registerStories()
    if (document.getElementById("root") == null) {
        document.body?.appendChild(document.createElement("div").apply { id = "root" })
    }
    ComposeViewport(viewportContainerId = "root") { PreviewViewport() }
}

@Composable
private fun PreviewViewport() {
    when (val state = renderState) {
        RenderState.Empty -> BasicText("Waiting for PreviewPayload")
        is RenderState.Failure -> BasicText(state.message)
        is RenderState.Ready -> state.preview.Content()
    }
}
