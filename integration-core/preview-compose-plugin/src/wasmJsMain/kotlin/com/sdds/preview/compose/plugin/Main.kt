package com.sdds.preview.compose.plugin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.window.ComposeViewport
import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayManagerLifecycle
import com.sdds.compose.uikit.overlay.overlayManager
import com.sdds.preview.compose.CachingLoadedFontFamilyFactory
import com.sdds.preview.compose.CachingPreviewAssetResolver
import com.sdds.preview.compose.ComposePreviewRuntime
import com.sdds.preview.compose.PreparedComposePreview
import com.sdds.preview.compose.WasmLoadedFontFamilyFactory
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.previewComponentsFrom
import com.sdds.preview.contract.PREVIEW_PROTOCOL_VERSION
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewResult
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

private val scope = MainScope()
private var renderState: RenderState by mutableStateOf(RenderState.Empty)
private val runtime = ComposePreviewRuntime(
    // Редактор присылает одни и те же шрифты при каждом переключении компонента: байты и семейства переиспользуются.
    assetResolver = CachingPreviewAssetResolver(HttpPreviewAssetResolver),
    fontFamilyFactory = CachingLoadedFontFamilyFactory(WasmLoadedFontFamilyFactory),
    components = run {
        registerStories()
        previewComponentsFrom(StoryRegistry.previewEntries(), GeneratedPreviewStyleFactories.all)
    },
)
private val coordinator = PreviewRequestCoordinator(
    prepare = runtime::prepare,
    apply = { preview ->
        renderState = RenderState.Ready(preview)
        document.documentElement?.setAttribute("data-sdds-preview-request-id", preview.requestId)
    },
)

private val pendingRenders = PendingRenderResults { result ->
    notifyPreviewResult(PreviewContractJson.encodeToString(result))
}

/**
 * Принимает следующий полный payload. Успех сообщается browser bridge только после отрисовки содержимого,
 * ошибки подготовки и применения state сообщаются сразу.
 */
@OptIn(ExperimentalJsExport::class)
@JsExport
public fun submitPreviewPayload(json: String) {
    scope.launch {
        when (val result = coordinator.submit(json)) {
            is PreviewResult.Success -> pendingRenders.await(result)
            else -> notifyPreviewResult(PreviewContractJson.encodeToString(result))
        }
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
            // Toast и Notification показываются через LocalOverlayManager: как и песочница, плагин предоставляет хост оверлеев.
            // Каждый payload получает свой менеджер оверлеев: уведомления прошлого render не должны оставаться на экране.
            is RenderState.Ready -> key(state.preview.requestId) {
                // Эффект запускается после композиции содержимого; два кадра подтверждают, что layout и draw прошли.
                // Исключение в кадре останавливает Compose, и подтверждения не будет.
                LaunchedEffect(state.preview.requestId) {
                    withFrameNanos { }
                    withFrameNanos { }
                    pendingRenders.confirm(state.preview.requestId)
                }
                OverlayHost(overlayManager = overlayManager(OverlayManagerLifecycle.ComposableScoped)) {
                    // OverlayHost кладёт содержимое в левый верхний угол, поэтому центрируем его внутри хоста.
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CrashCause { state.preview.Content() }
                    }
                }
            }
        }
    }
}

/**
 * Исключение Kotlin/Wasm доходит до браузера как `WebAssembly.Exception` без текста и stack, поэтому причину сбоя layout
 * фиксируем здесь: [measure] содержимого выполняется внутри `try`, а текст и stack уходят в `reportCrashCause`.
 * Размер и положение содержимого остаются теми же, что без обёртки. Сбои композиции и отрисовки обёртка не видит.
 */
@Composable
private fun CrashCause(content: @Composable () -> Unit) {
    Layout(content = content) { measurables, constraints ->
        val placeables = try {
            measurables.map { it.measure(constraints) }
        } catch (error: Throwable) {
            reportCrashCause(error.toString(), error.stackTraceToString())
            throw error
        }
        layout(
            width = placeables.maxOfOrNull { it.width } ?: constraints.minWidth,
            height = placeables.maxOfOrNull { it.height } ?: constraints.minHeight,
        ) {
            placeables.forEach { it.place(0, 0) }
        }
    }
}

@JsFun("(result) => globalThis.__sddsPreviewResult(result)")
private external fun notifyPreviewResult(result: String)

@JsFun("(protocolVersion) => globalThis.__sddsPreviewReady(protocolVersion)")
private external fun notifyPreviewReady(protocolVersion: Int)

@JsFun("(message, stack) => { globalThis.__sddsPreviewCrashCause = { message, stack }; }")
private external fun reportCrashCause(message: String, stack: String)
