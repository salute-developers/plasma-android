package com.sdds.preview.compose.plugin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeViewport
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.preview.compose.ComposePreviewRuntime
import com.sdds.preview.compose.PreparedComposePreview
import com.sdds.preview.compose.WasmLoadedFontFamilyFactory
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.previewComponentOf
import com.sdds.preview.contract.PREVIEW_PROTOCOL_VERSION
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.StoryRegistry
import kotlinx.browser.document
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlin.js.ExperimentalJsExport

private sealed interface RenderState {
    data object Empty : RenderState
    data class Ready(val preview: PreparedComposePreview) : RenderState
}

/** Компоненты спайка: для остальных историй генерируются фабрики, но в плагине они пока не регистрируются. */
private val SPIKE_COMPONENTS = listOf(
    ComponentKey.BasicButton to "BasicButton",
    // ComponentKey.CheckBox.value == "Checkbox", а в мете компонент называется "CheckBox": идентификатор из меты.
    ComponentKey.CheckBox to "CheckBox",
    ComponentKey.TextField to "TextField",
    ComponentKey.Avatar to "Avatar",
    ComponentKey.Tabs to "Tabs",
)

private val scope = MainScope()
private var renderState: RenderState by mutableStateOf(RenderState.Empty)
private val runtime = ComposePreviewRuntime(
    assetResolver = HttpPreviewAssetResolver,
    fontFamilyFactory = WasmLoadedFontFamilyFactory,
    components = SPIKE_COMPONENTS.also { registerStories() }.mapNotNull { (key, componentId) ->
        val story = StoryRegistry.get(key) as? ComposeBaseStory<*, *>
        val factory = GeneratedPreviewStyleFactories.all[componentId]
        if (story != null && factory != null) previewComponentOf(componentId, story, factory) else null
    },
)
private val coordinator = PreviewRequestCoordinator(
    prepare = runtime::prepare,
    apply = { preview ->
        renderState = RenderState.Ready(preview)
        document.documentElement?.setAttribute("data-sdds-preview-request-id", preview.requestId)
    },
)

/** Принимает следующий полный payload и сообщает browser bridge результат после применения state. */
@OptIn(ExperimentalJsExport::class)
@JsExport
public fun submitPreviewPayload(json: String) {
    scope.launch {
        val result = coordinator.submit(json)
        notifyPreviewResult(PreviewContractJson.encodeToString(result))
    }
}

/** Возвращает сериализованное описание зарегистрированной story. */
@OptIn(ExperimentalJsExport::class)
@JsExport
public fun describePreviewComponent(componentId: String, requestId: String): String =
    PreviewContractJson.encodeToString(runtime.describe(componentId, requestId))

/** Browser entrypoint типизированного BasicButton PoC. */
@OptIn(ExperimentalComposeUiApi::class)
public fun main() {
    if (document.getElementById("root") == null) {
        document.body?.appendChild(document.createElement("div").apply { id = "root" })
    }
    ComposeViewport(viewportContainerId = "root") { PreviewViewport() }
    notifyPreviewReady(PREVIEW_PROTOCOL_VERSION)
}

@Composable
private fun PreviewViewport() {
    val state = renderState
    val backgroundModifier = when (state) {
        RenderState.Empty -> Modifier
        is RenderState.Ready -> state.preview.surfaceBackground?.let { Modifier.background(it) } ?: Modifier
    }
    Box(
        modifier = Modifier.fillMaxSize().then(backgroundModifier),
        contentAlignment = Alignment.Center,
    ) {
        when (state) {
            RenderState.Empty -> Unit
            is RenderState.Ready -> state.preview.Content()
        }
    }
}

@JsFun("(result) => globalThis.__sddsPreviewResult(result)")
private external fun notifyPreviewResult(result: String)

@JsFun("(protocolVersion) => globalThis.__sddsPreviewReady(protocolVersion)")
private external fun notifyPreviewReady(protocolVersion: Int)
