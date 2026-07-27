package com.sdds.preview.compose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
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

    private fun payload(theme: Map<String, TokenValue>) = PreviewPayload(
        requestId = "test",
        platform = PreviewPlatform.COMPOSE,
        theme = theme,
        component = PreviewComponent("button"),
        example = PreviewExample("default"),
    )
}
