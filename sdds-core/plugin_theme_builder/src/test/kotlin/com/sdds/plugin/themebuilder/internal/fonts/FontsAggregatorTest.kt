package com.sdds.plugin.themebuilder.internal.fonts

import org.junit.Assert
import org.junit.Test

/**
 * Unit-тесты [FontsAggregator]
 */
class FontsAggregatorTest {
    @Test
    fun `FontsAggregator сохраняет данные о шрифтах`() {
        val testFontFamily = "testFontFamily"
        val underTest = FontsAggregator()

        underTest.addFont(testFontFamily, fontDataSet)

        Assert.assertNull(underTest.fonts["wrongFontFamily"])
        Assert.assertEquals(fontDataSet, underTest.fonts[testFontFamily])
        Assert.assertTrue(
            underTest.fonts[testFontFamily]?.contains(
                FontData(
                    "testFontFamily",
                    400,
                    "normal",
                ),
            ) == true,
        )
    }

    private companion object {
        val fontDataSet = setOf(
            FontData("testFontFamily", 200, "normal"),
            FontData("testFontFamily", 400, "normal"),
            FontData("testFontFamily", 600, "italic"),
        )
    }
}
