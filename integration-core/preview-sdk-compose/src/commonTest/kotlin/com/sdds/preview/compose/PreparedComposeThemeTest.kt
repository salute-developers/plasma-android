package com.sdds.preview.compose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.Gradients
import com.sdds.preview.contract.GradientLayer
import com.sdds.preview.contract.GradientStop
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.ShadowLayer
import com.sdds.preview.contract.TokenValue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class PreparedComposeThemeTest {
    @Test
    fun `rgba is reordered to argb`() {
        assertEquals(Color(0x44001122), "#00112244".toComposeColorOrNull())
        assertEquals(Color(0xFF001122), "#001122".toComposeColorOrNull())
        assertNull("#00112".toComposeColorOrNull())
    }

    @Test
    fun `malformed color is rejected`() {
        assertNull("".toComposeColorOrNull())
        assertNull("001122".toComposeColorOrNull())
        assertNull("00112244".toComposeColorOrNull())
        assertNull("#00112G".toComposeColorOrNull())
        assertNull("#00112G44".toComposeColorOrNull())
    }

    @Test
    fun `dimension uses dp and unknown token is ignored`() {
        val prepared = payload(mapOf("spacing" to TokenValue.Dimension(12.5))).prepareComposeTheme()
        assertEquals(12.5.dp, prepared.dimension("spacing"))
        assertNull(prepared.color("unknown"))
    }

    @Test
    fun `round circle token uses CircleShape`() {
        val prepared = payload(
            mapOf("round.circle" to TokenValue.Shape(emptyList())),
        ).prepareComposeTheme()

        assertEquals(CircleShape, prepared.shape("round.circle"))
    }

    @Test
    fun `shadow keeps spread and gradient becomes a brush`() {
        val prepared = payload(
            mapOf(
                "shadow.s" to TokenValue.Shadow(listOf(ShadowLayer(1.0, 2.0, 4.0, -1.0, "#00000040"))),
                "gradient.g" to TokenValue.Gradient(
                    listOf(
                        GradientLayer(
                            angle = 90.0,
                            stops = listOf(GradientStop("#FF0000FF", 0.0), GradientStop("#0000FFFF", 1.0)),
                        ),
                    ),
                ),
                "gradient.bad" to TokenValue.Gradient(
                    listOf(GradientLayer(0.0, listOf(GradientStop("#FF0000FF", 0.0), GradientStop("oops", 1.0)))),
                ),
            ),
        ).prepareComposeTheme()

        assertEquals(
            PreparedShadowLayer(Color(0x40000000), 1.dp, 2.dp, 4.dp, (-1).dp),
            prepared.shadow("shadow.s")?.single(),
        )
        assertEquals(
            Gradients.Linear(listOf(Color(0xFFFF0000), Color(0xFF0000FF)), listOf(0f, 1f), 90f),
            prepared.gradient("gradient.g"),
        )
        assertNull(prepared.gradient("gradient.bad"))
    }

    private fun payload(theme: Map<String, TokenValue>) = PreviewPayload(
        requestId = "test",
        platform = PreviewPlatform.COMPOSE,
        theme = theme,
        component = PreviewComponent("button"),
        example = PreviewExample("default"),
    )
}
