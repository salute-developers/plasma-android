package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
internal class MergeLightAndDarkTest(
    private val tokenData: ColorTokenResult.TokenData,
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
                ColorTokenResult.TokenData(
                    light = mapOf(
                        "key1" to "value1",
                        "key2" to "value2",
                    ),
                    dark = mapOf(
                        "key1" to "value1",
                        "key2" to "value2",
                    ),
                ),
                setOf("key1", "key2"),
            ),
            arrayOf(
                ColorTokenResult.TokenData(
                    light = mapOf(
                        "key1" to "value1",
                        "key2" to "value2",
                    ),
                    dark = mapOf(
                        "key3" to "value3",
                        "key4" to "value4",
                    ),
                ),
                setOf("key1", "key2", "key3", "key4"),
            ),
            arrayOf(
                ColorTokenResult.TokenData(
                    light = emptyMap(),
                    dark = mapOf(
                        "key3" to "value3",
                        "key4" to "value4",
                    ),
                ),
                setOf("key3", "key4"),
            ),
            arrayOf(
                ColorTokenResult.TokenData(
                    light = emptyMap(),
                    dark = emptyMap(),
                ),
                emptySet<String>(),
            ),
        )
    }
}
