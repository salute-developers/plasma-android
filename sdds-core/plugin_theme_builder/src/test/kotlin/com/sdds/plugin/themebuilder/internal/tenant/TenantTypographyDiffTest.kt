package com.sdds.plugin.themebuilder.internal.tenant

import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TenantTypographyDiffTest {

    @Test
    fun `если семейств не переопределено - диф остаётся как есть`() {
        val result = fontDependentTypographyDiff(
            defaultTypography = defaultTypography,
            tenantDiff = mapOf("changed" to value("display")),
            overriddenFontFamilies = emptySet(),
        )
        assertEquals(mapOf("changed" to value("display")), result)
    }

    @Test
    fun `стиль на переопределённое семейство докидывается даже если не менялся`() {
        // display переопределён, но display.normal идентичен дефолту и не попал в tenantDiff
        val result = fontDependentTypographyDiff(
            defaultTypography = defaultTypography,
            tenantDiff = emptyMap(),
            overriddenFontFamilies = setOf("display"),
        )
        assertTrue(result.containsKey("display.normal"))
        assertEquals(
            defaultTypography.getValue("display.normal"),
            result.getValue("display.normal"),
        )
    }

    @Test
    fun `стиль на непереопределённое семейство не докидывается`() {
        val result = fontDependentTypographyDiff(
            defaultTypography = defaultTypography,
            tenantDiff = emptyMap(),
            overriddenFontFamilies = setOf("display"),
        )
        assertFalse(result.containsKey("body.normal"))
        assertFalse(result.containsKey("header.normal"))
    }

    @Test
    fun `реально изменённый стиль не перезаписывается дефолтным значением`() {
        val tenantChanged = value("display").copy(textSize = 999f)
        val result = fontDependentTypographyDiff(
            defaultTypography = defaultTypography,
            tenantDiff = mapOf("display.normal" to tenantChanged),
            overriddenFontFamilies = setOf("display"),
        )
        assertEquals(tenantChanged, result.getValue("display.normal"))
    }

    @Test
    fun `имя семейства берётся по последнему сегменту ссылки`() {
        val refWithDot = defaultTypography + ("body.normal" to value("fontFamily.body"))
        val result = fontDependentTypographyDiff(
            defaultTypography = refWithDot,
            tenantDiff = emptyMap(),
            overriddenFontFamilies = setOf("body"),
        )
        assertTrue(result.containsKey("body.normal"))
    }

    @Test
    fun `несколько переопределённых семейств докидывают все свои стили`() {
        val result = fontDependentTypographyDiff(
            defaultTypography = defaultTypography,
            tenantDiff = emptyMap(),
            overriddenFontFamilies = setOf("display", "header"),
        )
        assertTrue(result.containsKey("display.normal"))
        assertTrue(result.containsKey("header.normal"))
        assertFalse(result.containsKey("body.normal"))
    }

    private fun value(fontFamilyRef: String): TypographyTokenValue = TypographyTokenValue(
        fontFamilyRef = fontFamilyRef,
        fontWeight = 400,
        fontStyle = "normal",
        textSize = 16f,
        lineHeight = 24f,
        letterSpacing = 0f,
    )

    private val defaultTypography = mapOf(
        "display.normal" to value("fontFamily.display"),
        "header.normal" to value("fontFamily.header"),
        "body.normal" to value("fontFamily.body"),
    )
}
