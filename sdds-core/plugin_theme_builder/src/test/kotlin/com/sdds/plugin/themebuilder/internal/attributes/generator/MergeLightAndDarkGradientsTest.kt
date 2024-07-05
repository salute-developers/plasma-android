package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
internal class MergeLightAndDarkGradientsTest(
    private val tokenData: GradientTokenResult.TokenData,
    private val expectedResultSet: Set<String>,
) {

    @Test
    fun `mergedLightAndDark() должна возвращать объединение ключей словарей темной и светлой темы`() {
        Assert.assertEquals(expectedResultSet, tokenData.mergedLightAndDark())
    }

    companion object {
        private fun getParams(value: String) = listOf(
            GradientTokenResult.TokenData.Gradient(
                listOf(value),
                GradientTokenResult.TokenData.GradientType.LINEAR,
            ),
        )

        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(
                GradientTokenResult.TokenData(
                    light = mapOf(
                        "key1" to getParams("value1"),
                        "key2" to getParams("value2"),
                    ),
                    dark = mapOf(
                        "key1" to getParams("value1"),
                        "key2" to getParams("value2"),
                    ),
                ),
                setOf("key1", "key2"),
            ),
            arrayOf(
                GradientTokenResult.TokenData(
                    light = mapOf(
                        "key1" to getParams("value1"),
                        "key2" to getParams("value2"),
                    ),
                    dark = mapOf(
                        "key3" to getParams("value3"),
                        "key4" to getParams("value4"),
                    ),
                ),
                setOf("key1", "key2", "key3", "key4"),
            ),
            arrayOf(
                GradientTokenResult.TokenData(
                    light = emptyMap(),
                    dark = mapOf(
                        "key3" to getParams("value3"),
                        "key4" to getParams("value4"),
                    ),
                ),
                setOf("key3", "key4"),
            ),
            arrayOf(
                GradientTokenResult.TokenData(
                    light = emptyMap(),
                    dark = emptyMap(),
                ),
                emptySet<String>(),
            ),
        )
    }
}
