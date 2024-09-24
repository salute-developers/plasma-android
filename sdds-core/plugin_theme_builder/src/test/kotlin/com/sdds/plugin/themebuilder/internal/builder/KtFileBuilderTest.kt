package com.sdds.plugin.themebuilder.internal.builder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
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
            FunSpec,
            ParameterSpec,
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
            FunSpec,
            ParameterSpec,
        )
    }

    @Test
    fun `rootObject создает корневой объект и добавляет его в выходной файл`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true) {
            every { addFileComment(any()) } returns this
        }
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
    fun `rootClass создает корневой класс и добавляет его в выходной файл`() {
        val annotationType = ClassName("com.example.app", "Annotation")
        val superType = ClassName("com.android", "ReturnType")

        val mockResultFileSpecBuilder = mockk<FileSpec.Builder>(relaxed = true) {
            every { addFileComment(any()) } returns this
        }
        val mockRoot = mockk<TypeSpec>(relaxed = true)

        val mockFunSpec = mockk<FunSpec>(relaxed = true)
        val mockFunSpecBuilder = mockk<FunSpec.Builder>(relaxed = true) {
            every { build() } returns mockFunSpec
        }
        val mockkClassBuilder = mockk<TypeSpec.Builder>(relaxed = true) {
            every { build() } returns mockRoot
            every { primaryConstructor(mockFunSpec) } returns this
        }
        val mockParamSpec = mockk<ParameterSpec>(relaxed = true)
        val mockParamSpecBuilder = mockk<ParameterSpec.Builder>(relaxed = true) {
            every { build() } returns mockParamSpec
        }
        every { FunSpec.constructorBuilder() } returns mockFunSpecBuilder
        every {
            ParameterSpec.builder(
                testFunParameter.name,
                testParameterType,
            )
        } returns mockParamSpecBuilder
        every { TypeSpec.classBuilder("RootA") } returns mockkClassBuilder
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpecBuilder

        underTest.rootClass(
            name = "RootA",
            modifiers = listOf(KtFileBuilder.Modifier.INTERNAL),
            annotation = annotationType,
            primaryConstructor = KtFileBuilder.Constructor.Primary(
                parameters = listOf(testFunParameter),
            ),
            superType = superType,
        )
        underTest.build(mockk(relaxed = true))

        verify {
            TypeSpec.classBuilder("RootA")
            FunSpec.constructorBuilder()
            ParameterSpec.builder(
                name = testFunParameter.name,
                type = testParameterType,
            )
            mockkClassBuilder.addAnnotation(annotationType)
            mockkClassBuilder.primaryConstructor(mockFunSpec)
            mockFunSpecBuilder.addParameters(listOf(mockParamSpec))
            mockParamSpecBuilder.defaultValue(testFunParameter.defValue!!)
            mockkClassBuilder.superclass(superType)
            FileSpec.builder(TEST_PACKAGE, TEST_CLASS)
            mockResultFileSpecBuilder.addType(mockRoot)
        }
    }

    @Test
    fun `appendRootVal добавляет немутабельное свойство в корневой объект`() {
        val propertyType = ClassName(TEST_PACKAGE, "PropertyType")
        val parameterizedType = ClassName(TEST_PACKAGE, "ParameterizedType")
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true) {
            every { addFileComment(any()) } returns this
        }
        val mockPropSpec = mockk<PropertySpec>(relaxed = true)
        val mockPropBuilder = mockk<PropertySpec.Builder>(relaxed = true) {
            every { build() } returns mockPropSpec
        }
        every {
            PropertySpec.builder(
                name = "testProperty",
                type = propertyType.parameterizedBy(parameterizedType),
            )
        } returns mockPropBuilder
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec

        underTest.appendRootVal(
            name = "testProperty",
            typeName = propertyType,
            parameterizedType = parameterizedType,
            initializer = "initializer",
        )
        underTest.build(mockk(relaxed = true))

        verify {
            PropertySpec.builder("testProperty", propertyType.parameterizedBy(parameterizedType))
            mockPropBuilder.initializer("initializer")
            mockResultFileSpec.addProperty(mockPropSpec)
        }
    }

    @Test
    fun `appendRootFun добавляет функцию в корневой объект`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true) {
            every { addFileComment(any()) } returns this
        }
        val mockFunSpecBuilder = mockk<FunSpec.Builder>(relaxed = true)
        val mockFunSpec = mockk<FunSpec>(relaxed = true)
        val mockParamSpec = mockk<ParameterSpec>(relaxed = true)
        val mockParamSpecBuilder = mockk<ParameterSpec.Builder>(relaxed = true) {
            every { build() } returns mockParamSpec
        }

        every {
            ParameterSpec.builder(
                testFunParameter.name,
                testParameterType,
            )
        } returns mockParamSpecBuilder
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec
        every { FunSpec.builder("testFun") } returns mockFunSpecBuilder
        every { mockFunSpecBuilder.build() } returns mockFunSpec

        underTest.appendRootFun(
            name = "testFun",
            params = listOf(testFunParameter),
            modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
            body = listOf(
                "val testVal = 1",
                "var testVar = 2",
            ),
            returnType = testReturnType,
            annotation = KtFileBuilder.TypeAnnotationComposable,
        )
        underTest.build(mockk(relaxed = true))

        verify {
            FunSpec.builder("testFun")
            mockFunSpecBuilder.addParameters(listOf(mockParamSpec))
            mockParamSpecBuilder.defaultValue(testFunParameter.defValue!!)
            mockFunSpecBuilder.addModifiers(listOf(KModifier.PRIVATE))
            mockFunSpecBuilder.addCode("val testVal = 1")
            mockFunSpecBuilder.addCode("var testVar = 2")
            mockFunSpecBuilder.returns(testReturnType)
            mockResultFileSpec.addFunction(mockFunSpec)
        }
    }

    @Test
    fun `appendProperty добавляет kotlin свойство в корневой объект, если в качестве typeName KClass`() {
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
    fun `appendProperty добавляет kotlin свойство в корневой объект, если в качестве typeName TypeName`() {
        val mockResultFileSpecBuilder = mockk<FileSpec.Builder>(relaxed = true)
        val mockPropSpecBuilder = mockk<PropertySpec.Builder>(relaxed = true)
        val mockPropSpec = mockk<PropertySpec>(relaxed = true)
        val mockRootSpecBuilder = mockk<TypeSpec.Builder>(relaxed = true)
        val mockRootSpec = mockk<TypeSpec>(relaxed = true)

        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpecBuilder

        every { TypeSpec.objectBuilder("RootA") } returns mockRootSpecBuilder
        every { mockRootSpecBuilder.build() } returns mockRootSpec

        every {
            PropertySpec.builder("propertyA", testParameterType)
        } returns mockPropSpecBuilder
        every { mockRootSpecBuilder.addProperty(mockPropSpec) } returns mockRootSpecBuilder
        every { mockPropSpecBuilder.initializer("0.5f") } returns mockPropSpecBuilder
        every { mockPropSpecBuilder.build() } returns mockPropSpec

        underTest.run {
            rootObject("RootA")
                .appendProperty(
                    name = "propertyA",
                    typeName = testParameterType,
                    initializer = "0.5f",
                    description = null,
                    modifiers = listOf(KtFileBuilder.Modifier.INTERNAL),
                    isMutable = true,
                    setter = null,
                    delegate = null,
                )
        }

        verify {
            PropertySpec.builder("propertyA", testParameterType)
            mockPropSpecBuilder.initializer("0.5f")
            mockPropSpecBuilder.build()
            mockRootSpecBuilder.addProperty(mockPropSpec)
            mockPropSpecBuilder.addModifiers(listOf(KModifier.INTERNAL))
            mockPropSpecBuilder.mutable(true)
        }
    }

    @Test
    fun `addImport добавляет импорт по ClassName`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true) {
            every { addFileComment(any()) } returns this
        }
        val className = ClassName("com.package", "Class")
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec

        underTest.addImport(className)

        verify {
            mockResultFileSpec.addImport(className, "")
        }
    }

    @Test
    fun `addImport добавляет импорты по names и package`() {
        val mockResultFileSpec = mockk<FileSpec.Builder>(relaxed = true) {
            every { addFileComment(any()) } returns this
        }
        every { FileSpec.builder(TEST_PACKAGE, TEST_CLASS) } returns mockResultFileSpec

        underTest.addImport(
            packageName = TEST_PACKAGE,
            names = listOf("Type1", "Type2", "Type3"),
        )

        verify {
            mockResultFileSpec.addImport(TEST_PACKAGE, listOf("Type1", "Type2", "Type3"))
        }
    }

    private companion object {
        const val TEST_PACKAGE = "com.package"
        const val TEST_CLASS = "TestClass"

        val testParameterType = ClassName(TEST_PACKAGE, "TestParameterType")
        val testFunParameter = KtFileBuilder.FunParameter(
            name = "parameter_name",
            type = testParameterType,
            defValue = "def_value",
        )
        val testReturnType = ClassName(TEST_PACKAGE, "ReturnType")
    }
}
