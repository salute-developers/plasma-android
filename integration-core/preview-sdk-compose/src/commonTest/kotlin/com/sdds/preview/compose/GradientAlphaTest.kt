package com.sdds.preview.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.sdds.preview.contract.GradientLayer
import com.sdds.preview.contract.GradientStop
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.TokenValue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotEquals
import kotlin.test.assertNull

class GradientAlphaTest {
    private val gradient = TokenValue.Gradient(
        listOf(GradientLayer(45.0, listOf(GradientStop("#1A9E32FF", 0.0), GradientStop("#04C6C9FF", 1.0)))),
    )

    private val theme = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = mapOf("surface.accent-gradient" to gradient, "surface.solid" to TokenValue.Color("#112233FF")),
        component = PreviewComponent("Avatar", properties = emptyMap()),
        example = PreviewExample("default"),
    ).let { it.prepareComposeTheme() }

    private fun token(id: String, alpha: Double?) =
        PreviewPropertyValue(PreviewPropertySource.TokenReference(id, alpha))

    @Test
    fun `a gradient token with alpha is built with that alpha on every stop`() {
        val withAlpha = theme.gradient("surface.accent-gradient", 0.2f)!!
        val reference = theme.gradient("surface.accent-gradient", 1f)!!

        assertNotEquals(reference, withAlpha)
        assertEquals(withAlpha, theme.gradient("surface.accent-gradient", 0.2f))
    }

    @Test
    fun `brushValue uses the gradient with alpha and leaves a gradient without alpha unchanged`() {
        val transparent = token("surface.accent-gradient", 0.2).brushValue(theme)!!.base
        val plain = token("surface.accent-gradient", null).brushValue(theme)!!.base

        assertEquals(theme.gradient("surface.accent-gradient", 0.2f), transparent)
        assertEquals(theme.gradient("surface.accent-gradient"), plain)
        assertNotEquals(plain, transparent)
    }

    @Test
    fun `a solid colour with alpha still gets a transparent colour`() {
        val brush = token("surface.solid", 0.4).brushValue(theme)!!.base

        assertIs<SolidColor>(brush)
        assertEquals(Color(0x11, 0x22, 0x33).copy(alpha = 0.4f), brush.value)
    }

    @Test
    fun `an unknown token stays unresolved even with alpha`() {
        assertNull(token("no.such.token", 0.5).brushValue(theme))
    }
}
