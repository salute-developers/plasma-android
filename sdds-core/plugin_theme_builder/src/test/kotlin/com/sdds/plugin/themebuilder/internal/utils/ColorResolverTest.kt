package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.resolveColor
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Unit-тесты [ColorResolver]
 */
class ColorResolverTest {

    @Test
    fun testResolveColor() {
        assertEquals("0xFFFFFFFF", resolveColor("#FFF", "tokenName", palette, HexFormat.INT_HEX))
        assertEquals("0xFFABABAB", resolveColor("#ABABAB", "tokenName", palette, HexFormat.INT_HEX))
        assertEquals(
            "0xFFABABAB",
            resolveColor("#ABABABFF", "tokenName", palette, HexFormat.INT_HEX),
        )
        assertEquals(
            "0xFFABABAB",
            resolveColor("[general.red.100]", "tokenName", palette, HexFormat.INT_HEX),
        )
        assertEquals(
            "0xFFEEEEEE",
            resolveColor("[general.green.1000]", "tokenName", palette, HexFormat.INT_HEX),
        )

        assertEquals("#FFFFFFFF", resolveColor("#FFF", "tokenName", palette, HexFormat.XML_HEX))
        assertEquals("#FFABABAB", resolveColor("#ABABAB", "tokenName", palette, HexFormat.XML_HEX))
        assertEquals(
            "#FFABABAB",
            resolveColor("#ABABABFF", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#FFABABAB",
            resolveColor("[general.red.100]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#FFEEEEEE",
            resolveColor("[general.green.1000]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#FFEEEEEE",
            resolveColor("[general.green.1000][1.0]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#FFEEEEEE",
            resolveColor("[general.green.1000][1]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#7FEEEEEE",
            resolveColor("[general.green.1000][0.5]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#19ABABAB",
            resolveColor("[general.red.100][0.1]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#19AAAAAA",
            resolveColor("[general.green.100][0.1]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#05AAAAAA",
            resolveColor("[general.green.100][0.02]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#00AAAAAA",
            resolveColor("[general.green.100][0.0]", "tokenName", palette, HexFormat.XML_HEX),
        )
        assertEquals(
            "#00AAAAAA",
            resolveColor("[general.green.100][0]", "tokenName", palette, HexFormat.XML_HEX),
        )
    }

    private companion object {
        val palette = mapOf(
            "red" to mapOf(
                "100" to "#ABABAB",
                "150" to "#000000",
            ),
            "green" to mapOf(
                "100" to "#AAA",
                "1000" to "#EEEEEEFF",
            ),
        )
    }
}
