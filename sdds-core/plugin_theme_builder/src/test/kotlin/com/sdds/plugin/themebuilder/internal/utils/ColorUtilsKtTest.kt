package com.sdds.plugin.themebuilder.internal.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class ColorUtilsKtTest {

    @Test
    fun testResolveColor() {
        assertEquals("0xFFF", resolveColor("#FFF", palette, HexFormat.INT_HEX))
        assertEquals("0xFFABABAB", resolveColor("#ABABAB", palette, HexFormat.INT_HEX))
        assertEquals("0xFFABABAB", resolveColor("#ABABABFF", palette, HexFormat.INT_HEX))
        assertEquals("0xFFABABAB", resolveColor("[general.red.100]", palette, HexFormat.INT_HEX))
        assertEquals("0xFFEEEEEE", resolveColor("[general.green.1000]", palette, HexFormat.INT_HEX))

        assertEquals("#FFF", resolveColor("#FFF", palette, HexFormat.XML_HEX))
        assertEquals("#FFABABAB", resolveColor("#ABABAB", palette, HexFormat.XML_HEX))
        assertEquals("#FFABABAB", resolveColor("#ABABABFF", palette, HexFormat.XML_HEX))
        assertEquals("#FFABABAB", resolveColor("[general.red.100]", palette, HexFormat.XML_HEX))
        assertEquals("#FFEEEEEE", resolveColor("[general.green.1000]", palette, HexFormat.XML_HEX))
    }

    private companion object {
        val palette = mapOf(
            "red" to mapOf(
                "100" to "#ABABAB",
                "150" to "#000000",
            ),
            "green" to mapOf(
                "1000" to "#EEEEEEFF",
            ),
        )
    }
}
