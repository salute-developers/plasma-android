package com.sdds.preview.compose.plugin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontFamily
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.preview.compose.ProvideHostDefaults
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.prepareComposeTheme
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewDefaultStyles
import com.sdds.preview.contract.PreviewDefaultText
import com.sdds.preview.contract.PreviewDefaults
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStyle
import com.sdds.preview.contract.TokenValue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class HostDefaultsTest {
    private fun token(id: String) = PreviewPropertyValue(PreviewPropertySource.TokenReference(id))

    private fun payload(defaults: PreviewDefaults?) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = mapOf("color.red" to TokenValue.Color("#FF0000FF"), "color.green" to TokenValue.Color("#00FF00FF")),
        component = PreviewComponent("Avatar", properties = emptyMap()),
        styles = mapOf("button.default" to PreviewStyle("BasicButton", mapOf("labelColor" to token("color.red")))),
        example = PreviewExample("default"),
        defaults = defaults,
    )

    /** Значения локалей внутри содержимого: цвет подписи кнопки по умолчанию и цвет текста. */
    private fun provided(payload: PreviewPayload): Pair<androidx.compose.ui.graphics.Brush, Color> {
        val theme = payload.prepareComposeTheme(mapOf("font.body" to FontFamily.Default))
        return composeOnce {
            var result: Pair<androidx.compose.ui.graphics.Brush, Color>? = null
            ProvideHostDefaults(payload, theme, GeneratedPreviewStyleFactories.all) {
                result = LocalButtonStyle.current.colors.labelBrush.getDefaultValue() to LocalTextStyle.current.color
            }
            result!!
        }
    }

    @Test
    fun `the default button style and text colour from the payload are provided to the content`() {
        val (label, text) = provided(
            payload(
                PreviewDefaults(
                    text = PreviewDefaultText(color = "color.green"),
                    styles = PreviewDefaultStyles(button = "button.default"),
                ),
            ),
        )

        assertEquals(SolidColor(Color.Red), label)
        assertEquals(Color(0xFF00FF00), text)
    }

    @Test
    fun `without defaults the library values stay`() {
        val (label, text) = provided(payload(null))

        assertNotEquals(SolidColor(Color.Red), label)
        assertNotEquals(Color(0xFF00FF00), text)
    }

    @Test
    fun `an unknown style or token is skipped without failing`() {
        val (label, text) = provided(
            payload(
                PreviewDefaults(
                    text = PreviewDefaultText(color = "color.missing"),
                    styles = PreviewDefaultStyles(button = "button.missing"),
                ),
            ),
        )

        assertNotEquals(SolidColor(Color.Red), label)
        assertNotEquals(Color(0xFF00FF00), text)
    }
}
