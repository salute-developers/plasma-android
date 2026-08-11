package com.sdds.plugin.themebuilder.internal.builder

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayOutputStream

class KtFileBuilderRealTest {

    @Test
    fun `rootEnum генерирует enum с primary constructor и constants`() {
        val output = ByteArrayOutputStream()
        val underTest = KtFileBuilder("com.test.generated", "SizeTokens")

        underTest.rootEnum(
            name = "Size",
            primaryConstructor = KtFileBuilder.Constructor.Primary(
                parameters = listOf(
                    KtFileBuilder.FunParameter(
                        name = "code",
                        type = KtFileBuilder.TypeString,
                        asProperty = true,
                        modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
                    ),
                ),
            ),
            enumConstants = mapOf(
                "SMALL" to listOf("\"small\""),
                "LARGE" to listOf("\"large\""),
            ),
        )

        underTest.build(KtFileBuilder.OutputLocation.Stream(output))

        val result = output.toString()
        assertTrue(result.contains("enum class Size("))
        assertTrue(result.contains("private val code: String"))
        assertTrue(result.contains("SMALL(\"small\")"))
        assertTrue(result.contains("LARGE(\"large\")"))
    }

    @Test
    fun `createFunCall и createConstructorCall форматируют один и несколько параметров`() {
        assertEquals("Factory(value)", KtFileBuilder.createConstructorCall("Factory", "value"))
        assertEquals("call(value)", KtFileBuilder.createFunCall("call", listOf("value")))

        assertEquals(
            "Factory(\n    first,\n    second,\n)",
            KtFileBuilder.createConstructorCall("Factory", "first", "second"),
        )
        assertEquals(
            "call(\n    first,\n    second,\n)",
            KtFileBuilder.createFunCall("call", listOf("first", "second")),
        )
    }
}
