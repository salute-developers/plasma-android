package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult.TypographyInfo
import com.sdds.plugin.themebuilder.internal.generator.data.mergedScreenClasses
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
internal class MergeScreenClassesTest(
    private val tokenData: TypographyTokenResult.ComposeTokenData,
    private val expectedResultSet: Set<String>,
) {

    @Test
    fun `mergedScreenClasses() должна возвращать объединение ключей словарей темной и светлой темы`() {
        Assert.assertEquals(expectedResultSet, tokenData.mergedScreenClasses())
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(
                TypographyTokenResult.ComposeTokenData(
                    small = mapOf(
                        "key1" to TypographyInfo("value1"),
                        "key2" to TypographyInfo("value2"),
                    ),
                    medium = mapOf(
                        "key1" to TypographyInfo("value1"),
                        "key2" to TypographyInfo("value2"),
                    ),
                    large = mapOf(
                        "key1" to TypographyInfo("value1"),
                        "key2" to TypographyInfo("value2"),
                    ),
                ),
                setOf("key1", "key2"),
            ),
            arrayOf(
                TypographyTokenResult.ComposeTokenData(
                    small = mapOf(
                        "key1" to TypographyInfo("value1"),
                        "key2" to TypographyInfo("value2"),
                    ),
                    medium = mapOf(
                        "key3" to TypographyInfo("value3"),
                        "key4" to TypographyInfo("value4"),
                    ),
                    large = mapOf(
                        "key5" to TypographyInfo("value5"),
                        "key6" to TypographyInfo("value6"),
                    ),
                ),
                setOf("key1", "key2", "key3", "key4", "key5", "key6"),
            ),
            arrayOf(
                TypographyTokenResult.ComposeTokenData(
                    small = emptyMap(),
                    medium = emptyMap(),
                    large = mapOf(
                        "key3" to TypographyInfo("value3"),
                        "key4" to TypographyInfo("value4"),
                    ),
                ),
                setOf("key3", "key4"),
            ),
            arrayOf(
                TypographyTokenResult.ComposeTokenData(
                    small = emptyMap(),
                    medium = emptyMap(),
                    large = emptyMap(),
                ),
                emptySet<String>(),
            ),
        )
    }
}
