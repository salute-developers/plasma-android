package com.sdds.plugin.themebuilder.internal.builder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Unit тесты [KtFileBuilder]
 * @author Малышев Александр on 14.03.2024
 */
class KtFileBuilderTest {

    private lateinit var underTest: KtFileBuilder

    @Before
    fun setUp() {
        mockkObject(
            TypeSpec,
            FileSpec,
            PropertySpec,
        )
        underTest = KtFileBuilder(TEST_PACKAGE, TEST_CLASS)
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkObject(
            TypeSpec,
            FileSpec,
            PropertySpec,
        )
    }

    @Test
    fun `rootObject создает корневой объект и добавляет его в выходной файл`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true)
        val mockRoot = mockk<TypeSpec>(relaxed = true)
        every { TypeSpec.objectBuilder("RootA") } returns mockk {
            every { build() } returns mockRoot
        }
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec

        underTest.rootObject("RootA")
        underTest.build(mockk(relaxed = true))

        verify {
            TypeSpec.objectBuilder("RootA")
            FileSpec.builder(TEST_PACKAGE, TEST_CLASS)
            mockResultFileSpec.addType(mockRoot)
        }
    }

    @Test
    fun `appendProperty добавляет kotlin свойство в корневой объект`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true)
        val mockPropSpec = mockk<PropertySpec.Builder>(relaxed = true)
        val mockProp = mockk<PropertySpec>(relaxed = true)
        val mockRootSpec = mockk<TypeSpec.Builder>(relaxed = true)
        val mockRoot = mockk<TypeSpec>(relaxed = true)

        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec

        every { TypeSpec.objectBuilder("RootA") } returns mockRootSpec
        every { mockRootSpec.build() } returns mockRoot

        every {
            PropertySpec.builder("propertyA", ClassName("kotlin", "Float"))
        } returns mockPropSpec
        every { mockRootSpec.addProperty(any()) } returns mockRootSpec
        every { mockPropSpec.initializer(any<String>()) } returns mockPropSpec
        every { mockPropSpec.build() } returns mockProp

        underTest.run {
            rootObject("RootA")
                .appendProperty(
                    "propertyA",
                    Float::class,
                    "0.5f",
                )
        }

        verify {
            PropertySpec.builder("propertyA", ClassName("kotlin", "Float"))
            mockPropSpec.initializer("0.5f")
            mockPropSpec.build()
            mockRootSpec.addProperty(mockProp)
        }
    }

    @Test
    fun `addImport добавляет импорт`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true)
        val className = ClassName("com.package", "Class")
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec

        underTest.addImport(className)

        verify {
            mockResultFileSpec.addImport(className, "")
        }
    }

    private companion object {
        const val TEST_PACKAGE = "com.package"
        const val TEST_CLASS = "TestClass"
    }
}
