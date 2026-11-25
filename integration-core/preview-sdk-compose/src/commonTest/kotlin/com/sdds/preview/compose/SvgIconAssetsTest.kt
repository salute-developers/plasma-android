package com.sdds.preview.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ImageSource
import com.sdds.preview.contract.PreviewAsset
import com.sdds.preview.contract.PreviewAssetType
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewComponentDescription
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals

class SvgIconAssetsTest {
    private val known = mutableMapOf<String, Boolean>()
    private val vector = ImageVector.Builder("icon", 16.dp, 16.dp, 16f, 16f).build()

    private val component = object : ComposePreviewComponent {
        override val componentId: String = "button"
        override val description: PreviewComponentDescription =
            PreviewComponentDescription(componentId = "button", storyId = "button", properties = emptyList())

        override fun prepare(payload: PreviewPayload, theme: PreparedComposeTheme): PreparedComposePreview {
            listOf("plus.16", "bad.16", "missing.16", "other.16").forEach { known[it] = theme.hasIcon(it) }
            return object : PreparedComposePreview {
                override val requestId: String = payload.requestId

                @Composable
                override fun Content() = Unit
            }
        }
    }

    private val runtime = ComposePreviewRuntime(
        assetResolver = PreviewAssetResolver { asset ->
            when (asset.id) {
                "icon:missing.16" -> error("HTTP 404")
                "icon:bad.16" -> "bad".encodeToByteArray()
                else -> "<svg/>".encodeToByteArray()
            }
        },
        fontFamilyFactory = LoadedFontFamilyFactory { FontFamily.Default },
        components = listOf(component),
        svgIcons = SvgIconFactory { bytes ->
            check(bytes.decodeToString() != "bad") { "SVG не разбирается" }
            ImageSource { rememberVectorPainter(vector) }
        },
    )

    private fun asset(id: String, type: PreviewAssetType = PreviewAssetType.SVG) =
        PreviewAsset(id, type, "https://example.test/$id.svg")

    @Test
    fun `svg icon assets become known icons and failing ones are skipped`() = runTest {
        val json = PreviewContractJson.encodeToString(
            PreviewPayload(
                requestId = "r",
                platform = PreviewPlatform.COMPOSE,
                theme = emptyMap(),
                component = PreviewComponent("button"),
                example = PreviewExample("button"),
                assets = listOf(
                    asset("icon:plus.16"),
                    asset("icon:bad.16"),
                    asset("icon:missing.16"),
                    // Не иконка: префикса нет, ресурс не должен попасть в реестр.
                    asset("other.16"),
                    asset("icon:other.16", PreviewAssetType.PNG),
                ),
            ),
        )

        runtime.prepare(json)

        assertEquals(
            mapOf("plus.16" to true, "bad.16" to false, "missing.16" to false, "other.16" to false),
            known,
        )
    }
}
