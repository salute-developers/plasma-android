package com.sdds.preview.compose.plugin

import androidx.compose.ui.text.font.FontFamily
import com.sdds.preview.compose.ComposePreviewRuntime
import com.sdds.preview.compose.InMemoryPreviewAssetResolver
import com.sdds.preview.compose.LoadedFontFamilyFactory
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewResult
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class ComponentNotFoundTest {
    private val runtime = ComposePreviewRuntime(
        assetResolver = InMemoryPreviewAssetResolver(emptyMap()),
        fontFamilyFactory = LoadedFontFamilyFactory { FontFamily.Default },
        components = emptyList(),
    )
    private val coordinator = PreviewRequestCoordinator(prepare = runtime::prepare, apply = {})

    @Test
    fun `payload for an unregistered component fails with component_not_found`() = runTest {
        val json = PreviewContractJson.encodeToString(
            PreviewPayload(
                requestId = "r",
                platform = PreviewPlatform.COMPOSE,
                theme = emptyMap(),
                component = PreviewComponent("Text"),
                example = PreviewExample("default"),
            ),
        )

        val result = assertIs<PreviewResult.Failure>(coordinator.submit(json))

        assertEquals("component_not_found", result.code)
        assertEquals("r", result.requestId)
    }
}
