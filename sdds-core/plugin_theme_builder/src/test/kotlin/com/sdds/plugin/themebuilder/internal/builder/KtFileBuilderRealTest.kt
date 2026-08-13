package com.sdds.plugin.themebuilder.internal.builder

import com.squareup.kotlinpoet.ClassName
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

    @Test
    fun `rootInterface генерирует interface с аннотацией модификатором родителем и kdoc`() {
        val output = ByteArrayOutputStream()
        val underTest = KtFileBuilder("com.test.generated", "Contracts")

        underTest.rootInterface(
            name = "ButtonContract",
            modifiers = listOf(KtFileBuilder.Modifier.INTERNAL),
            annotation = ClassName("kotlin", "PublishedApi"),
            superInterface = ClassName("com.test.base", "BaseContract"),
            description = "Public button contract.",
        )

        underTest.build(KtFileBuilder.OutputLocation.Stream(output))

        val result = output.toString()
        assertTrue(result.contains("import com.test.base.BaseContract"))
        assertTrue(result.contains("/**\n * Public button contract.\n */"))
        assertTrue(result.contains("@PublishedApi"))
        assertTrue(result.contains("internal interface ButtonContract : BaseContract"))
    }

    @Test
    fun `appendRootVal генерирует lazy property`() {
        val output = ByteArrayOutputStream()
        val underTest = KtFileBuilder("com.test.generated", "PaletteHolder")

        underTest.appendRootVal(
            name = "palette",
            typeName = ClassName("com.test.tokens", "Palette"),
            initializer = "Palette()",
            lazy = true,
        )

        underTest.build(KtFileBuilder.OutputLocation.Stream(output))

        val result = output.toString()
        assertTrue(result.contains("import com.test.tokens.Palette"))
        assertTrue(result.contains("val palette: Palette by lazy"))
        assertTrue(result.contains("Palette()"))
    }

    @Test
    fun `rootClass генерирует secondary constructor с вызовом primary constructor`() {
        val output = ByteArrayOutputStream()
        val underTest = KtFileBuilder("com.test.generated", "Users")

        underTest.rootClass(
            name = "User",
            primaryConstructor = KtFileBuilder.Constructor.Primary(
                parameters = listOf(
                    KtFileBuilder.FunParameter(
                        name = "name",
                        type = KtFileBuilder.TypeString,
                    ),
                ),
            ),
            secondaryConstructors = listOf(
                KtFileBuilder.Constructor.Secondary(
                    parameters = listOf(
                        KtFileBuilder.FunParameter(
                            name = "id",
                            type = KtFileBuilder.TypeInt,
                        ),
                    ),
                    thisConstructorCallParams = listOf("id.toString()"),
                ),
            ),
        )

        underTest.build(KtFileBuilder.OutputLocation.Stream(output))

        val result = output.toString()
        assertTrue(result.contains("class User("))
        assertTrue(result.contains("name: String"))
        assertTrue(result.contains("constructor(id: Int) : this(id.toString())"))
    }
}
