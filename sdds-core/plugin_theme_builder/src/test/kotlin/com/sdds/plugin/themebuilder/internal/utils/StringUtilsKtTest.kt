package com.sdds.plugin.themebuilder.internal.utils

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Unit тесты StringUtils.kt
 * @author Малышев Александр on 12.04.2024
 */
class StringUtilsKtTest {

    @Test
    fun testCamelToSnakeCase() {
        assertEquals("test_string", "TestString".camelToSnakeCase())
        assertEquals("teststring", "Teststring".camelToSnakeCase())
        assertEquals("test_string", "testString".camelToSnakeCase())
    }

    @Test
    fun testTechToSnakeCase() {
        assertEquals("test_test_string", "test.test_string".techToSnakeCase())
        assertEquals("test_test_string", "test.test.string".techToSnakeCase())
    }

    @Test
    fun testWithPrefixIfNeed() {
        assertEquals("pref_test_string", "test_string".withPrefixIfNeed("pref"))
        assertEquals("string/test_string", "test_string".withPrefixIfNeed("string", "/"))
    }

    @Test
    fun testColorToArgbHex() {
        assertEquals("0xFFF", colorToArgbHex("#FFF"))
        assertEquals("0xFFABABAB", colorToArgbHex("#ABABAB"))
        assertEquals("0xFFABABAB", colorToArgbHex("#ABABABFF"))
    }
}
