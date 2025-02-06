package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult.TokenData
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
internal class MergeLightAndDarkColorsTest(
    private val tokenData: TokenData,
    private val expectedResultSet: Set<String>,
) {

    @Test
    fun `mergedLightAndDark() должна возвращать объединение ключей словарей темной и светлой темы`() {
        Assert.assertEquals(expectedResultSet, tokenData.mergedLightAndDark())
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(
                TokenData(
                    light = mapOf(
                        "key1" to TokenData.ColorInfo("value1"),
                        "key2" to TokenData.ColorInfo("value2"),
                    ),
                    dark = mapOf(
                        "key1" to TokenData.ColorInfo("value1"),
                        "key2" to TokenData.ColorInfo("value2"),
                    ),
                ),
                setOf("key1", "key2"),
            ),
            arrayOf(
                TokenData(
                    light = mapOf(
                        "key1" to TokenData.ColorInfo("value1"),
                        "key2" to TokenData.ColorInfo("value2"),
                    ),
                    dark = mapOf(
                        "key3" to TokenData.ColorInfo("value3"),
                        "key4" to TokenData.ColorInfo("value4"),
                    ),
                ),
                setOf("key1", "key2", "key3", "key4"),
            ),
            arrayOf(
                TokenData(
                    light = emptyMap(),
                    dark = mapOf(
                        "key3" to TokenData.ColorInfo("value3"),
                        "key4" to TokenData.ColorInfo("value4"),
                    ),
                ),
                setOf("key3", "key4"),
            ),
            arrayOf(
                TokenData(
                    light = emptyMap(),
                    dark = emptyMap(),
                ),
                emptySet<String>(),
            ),
        )
    }
}
