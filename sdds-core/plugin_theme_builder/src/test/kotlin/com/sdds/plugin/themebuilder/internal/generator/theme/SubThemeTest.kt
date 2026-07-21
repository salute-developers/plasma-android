package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.token.ColorToken
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class SubThemeTest {

    @Test
    fun `default токены переопределяются в non-default подтвемах`() {
        val defaultToken = colorToken("light.text.default.primary", setOf("default"))
        val onLightToken = colorToken("light.text.on-light.primary", setOf("on-light"))
        val onDarkToken = colorToken("light.text.on-dark.primary", setOf("on-dark"))

        val result =
            listOf(defaultToken, onLightToken, onDarkToken).overriddenBySubTheme()

        assertEquals(
            listOf(OverrideToken(defaultToken, onLightToken)),
            result[SubTheme.ON_LIGHT].orEmpty(),
        )
        assertEquals(
            listOf(OverrideToken(defaultToken, onDarkToken)),
            result[SubTheme.ON_DARK].orEmpty(),
        )
        assertTrue(result[SubTheme.DEFAULT].orEmpty().isEmpty())
    }

    private fun colorToken(
        name: String,
        tags: Set<String>,
    ) = ColorToken(
        displayName = name,
        name = name,
        tags = tags,
        enabled = true,
        description = name,
    )
}
