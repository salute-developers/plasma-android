package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.universal.ComposeStyleApiParamType
import com.sdds.plugin.themebuilder.internal.universal.VariationInfo
import com.sdds.plugin.themebuilder.internal.universal.VariationProp
import com.sdds.plugin.themebuilder.internal.universal.VariationReference
import com.squareup.kotlinpoet.ClassName
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayOutputStream

class ComposeStyleApiInfoBuilderTest {

    @Test
    fun `buildComposeStyleApiInfos создает api для одного appearance`() {
        val appearance = MetaClassAppearance("test.component")
        val info = composeMetaClassInfo(
            appearances = mapOf(
                appearance to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "enabled",
                            defaultValue = "true",
                        ),
                        VariationProp(
                            name = "size",
                            values = setOf("s", "m"),
                            defaultValue = "m",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentDefault.defaultStyle",
                            props = listOf(
                                VariationProp(name = "enabled", value = "true"),
                                VariationProp(name = "size", value = "m"),
                            ),
                        ),
                    ),
                ),
            ),
        )

        val result = buildComposeStyleApiInfos(
            info = info,
            componentPackage = "com.test.component",
        )

        val styleApi = result.getValue(appearance)
        assertEquals("TestComponentStyles", styleApi.stylesClassName)
        assertEquals("com.test.component.TestComponentStyles", styleApi.stylesClassQualifiedName)
        assertEquals("TestComponentStyles.Companion", styleApi.receiverClassName)
        assertEquals("com.test.component.TestComponentStyles.Companion", styleApi.receiverClassQualifiedName)
        assertEquals(null, styleApi.holderName)

        val enabled = styleApi.params[0]
        assertEquals("enabled", enabled.name)
        assertEquals(ComposeStyleApiParamType.BOOLEAN, enabled.type)
        assertEquals(false, enabled.required)
        assertEquals("Boolean", enabled.typeName)
        assertEquals("kotlin.Boolean", enabled.typeQualifiedName)
        assertEquals("true", enabled.defaultValue?.value)
        assertEquals("true", enabled.defaultValue?.codeName)
        assertEquals(listOf("true", "false"), enabled.values?.map { it.value })

        val size = styleApi.params[1]
        assertEquals("size", size.name)
        assertEquals(ComposeStyleApiParamType.ENUM, size.type)
        assertEquals(false, size.required)
        assertEquals("TestComponentSize", size.typeName)
        assertEquals("com.test.component.TestComponentSize", size.typeQualifiedName)
        assertEquals("m", size.defaultValue?.value)
        assertEquals("M", size.defaultValue?.codeName)
        assertEquals(listOf("S", "M"), size.values?.map { it.codeName })
    }

    @Test
    fun `buildComposeStyleApiInfos создает holders для нескольких appearances`() {
        val primary = MetaClassAppearance("test.component.primary")
        val secondary = MetaClassAppearance("test.component.secondary")
        val info = composeMetaClassInfo(
            appearances = mapOf(
                primary to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "size",
                            values = setOf("small", "large"),
                            defaultValue = "small",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentPrimary.smallStyle",
                            props = listOf(VariationProp(name = "size", value = "small")),
                        ),
                    ),
                ),
                secondary to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "selected",
                            defaultValue = "false",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentSecondary.defaultStyle",
                            props = listOf(VariationProp(name = "selected", value = "false")),
                        ),
                    ),
                ),
            ),
        )

        val result = buildComposeStyleApiInfos(
            info = info,
            componentPackage = "com.test.component",
        )

        assertEquals("Primary", result.getValue(primary).holderName)
        assertEquals("TestComponentStyles.Primary", result.getValue(primary).receiverClassName)
        assertEquals("TestComponentPrimarySize", result.getValue(primary).params.single().typeName)

        assertEquals("Secondary", result.getValue(secondary).holderName)
        assertEquals("TestComponentStyles.Secondary", result.getValue(secondary).receiverClassName)
        assertEquals("Boolean", result.getValue(secondary).params.single().typeName)
    }

    @Test
    fun `buildComposeStyleApiInfos падает при invalid boolean default value`() {
        val info = composeMetaClassInfo(
            appearances = mapOf(
                MetaClassAppearance("test.component") to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "enabled",
                            defaultValue = "maybe",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentDefault.defaultStyle",
                            props = listOf(VariationProp(name = "enabled", value = "true")),
                        ),
                    ),
                ),
            ),
        )

        val exception = assertThrows(IllegalArgumentException::class.java) {
            buildComposeStyleApiInfos(
                info = info,
                componentPackage = "com.test.component",
            )
        }

        assertTrue(
            exception.message.orEmpty().contains("Invalid boolean defaultValue `maybe`"),
        )
    }

    @Test
    fun `buildComposeStyleApiInfos падает при invalid enum default value`() {
        val info = composeMetaClassInfo(
            appearances = mapOf(
                MetaClassAppearance("test.component") to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "size",
                            values = setOf("small", "large"),
                            defaultValue = "medium",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentDefault.smallStyle",
                            props = listOf(VariationProp(name = "size", value = "small")),
                        ),
                    ),
                ),
            ),
        )

        val exception = assertThrows(IllegalArgumentException::class.java) {
            buildComposeStyleApiInfos(
                info = info,
                componentPackage = "com.test.component",
            )
        }

        assertTrue(
            exception.message.orEmpty().contains("Invalid enum defaultValue `medium`"),
        )
    }

    @Test
    fun `buildComposeStyleApiInfos падает если required prop отсутствует в variation`() {
        val info = composeMetaClassInfo(
            appearances = mapOf(
                MetaClassAppearance("test.component") to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "size",
                            values = setOf("small", "large"),
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentDefault.smallStyle",
                            props = listOf(VariationProp(name = "size", value = "small")),
                        ),
                        variation(
                            reference = "TestComponentDefault.defaultStyle",
                        ),
                    ),
                ),
            ),
        )

        val exception = assertThrows(IllegalStateException::class.java) {
            buildComposeStyleApiInfos(
                info = info,
                componentPackage = "com.test.component",
            )
        }

        assertEquals(
            "Missing defaultValue for binding `size` in `test.component`",
            exception.message,
        )
    }

    @Test
    fun `buildComposeStyleApiInfos нормализует invalid identifiers`() {
        val appearance = MetaClassAppearance("test.component")
        val info = composeMetaClassInfo(
            appearances = mapOf(
                appearance to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "1-density",
                            values = setOf("1", "!"),
                            defaultValue = "1",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentDefault.denseStyle",
                            props = listOf(VariationProp(name = "1-density", value = "!")),
                        ),
                    ),
                ),
            ),
        )

        val styleApi = buildComposeStyleApiInfos(
            info = info,
            componentPackage = "com.test.component",
        ).getValue(appearance)

        val param = styleApi.params.single()
        assertEquals("value1Density", param.name)
        assertEquals("TestComponent1Density", param.typeName)
        assertEquals("1", param.defaultValue?.value)
        assertEquals("Value1", param.defaultValue?.codeName)
        assertEquals(listOf("Value1", "Value"), param.values?.map { it.codeName })
    }

    @Test
    fun `generate создает fallback resolve для appearance без props`() {
        val output = ByteArrayOutputStream()
        val underTest = composeMetaClassGenerator(output)
        val info = composeMetaClassInfo(
            appearances = mapOf(
                MetaClassAppearance("test.component") to AppearanceInfo(
                    props = emptyList(),
                    variations = listOf(
                        variation(reference = "TestComponentDefault.defaultStyle"),
                    ),
                ),
            ),
        )

        underTest.generate(info)

        val generated = output.toString()
        assertTrue(generated.contains("public companion object"))
        assertTrue(generated.contains("public fun TestComponentStyles.Companion.resolve(): TestComponentStyles"))
        assertTrue(generated.contains("TestComponentStyles.TestComponentDefaultdefaultStyle"))
        assertTrue(generated.contains("public fun TestComponentStyles.Companion.style("))
        assertTrue(generated.contains("resolve().style(modify)"))
    }

    @Test
    fun `generate создает holder api и пропускает variations без compose reference`() {
        val output = ByteArrayOutputStream()
        val underTest = composeMetaClassGenerator(output)
        val primary = MetaClassAppearance("test.component.primary")
        val info = composeMetaClassInfo(
            appearances = mapOf(
                primary to AppearanceInfo(
                    props = listOf(
                        VariationProp(
                            name = "size",
                            values = setOf("small", "large"),
                            defaultValue = "small",
                        ),
                    ),
                    variations = listOf(
                        variation(
                            reference = "TestComponentPrimary.largeStyle",
                            props = listOf(VariationProp(name = "size", value = "large")),
                        ),
                        VariationInfo(
                            name = "viewOnly",
                            props = listOf(VariationProp(name = "size", value = "small")),
                        ),
                    ),
                ),
                MetaClassAppearance("test.component.secondary") to AppearanceInfo(
                    props = emptyList(),
                    variations = listOf(
                        variation(reference = "TestComponentSecondary.defaultStyle"),
                    ),
                ),
            ),
        )

        underTest.generate(info)

        val generated = output.toString()
        assertTrue(generated.contains("public object Primary"))
        assertTrue(generated.contains("public enum class TestComponentPrimarySize"))
        assertTrue(generated.contains("size: TestComponentPrimarySize ="))
        assertTrue(generated.contains("TestComponentPrimarySize.Small"))
        assertTrue(
            generated.contains(
                "size == TestComponentPrimarySize.Large -> " +
                    "TestComponentStyles.TestComponentPrimarylargeStyle",
            ),
        )
        assertTrue(generated.contains("public object Secondary"))
        assertFalse(generated.contains("viewOnly"))
    }

    @Test
    fun `generate падает для appearance без props и variations`() {
        val output = ByteArrayOutputStream()
        val underTest = composeMetaClassGenerator(output)
        val info = composeMetaClassInfo(
            appearances = mapOf(
                MetaClassAppearance("test.component.empty") to AppearanceInfo(
                    props = emptyList(),
                    variations = emptyList(),
                ),
            ),
        )

        val exception = assertThrows(IllegalStateException::class.java) {
            underTest.generate(info)
        }

        assertEquals("No variations available for `test.component.empty`", exception.message)
    }

    private fun composeMetaClassInfo(
        appearances: Map<MetaClassAppearance, AppearanceInfo>,
    ): ComposeMetaClassInfo {
        return ComposeMetaClassInfo(
            coreComponentName = "test-component",
            styleClassName = ClassName("com.test.component", "TestComponentStyle"),
            styleBuilderClassName = ClassName("com.test.component", "TestComponentStyleBuilder"),
            appearances = appearances,
        )
    }

    private fun variation(
        reference: String,
        props: List<VariationProp> = emptyList(),
    ): VariationInfo {
        return VariationInfo(
            name = reference.substringAfterLast("."),
            composeReference = VariationReference(reference),
            props = props,
        )
    }

    private fun composeMetaClassGenerator(
        output: ByteArrayOutputStream,
    ): ComposeMetaClassGenerator {
        return ComposeMetaClassGenerator(
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            componentPackage = "com.test.component",
            outputLocation = KtFileBuilder.OutputLocation.Stream(output),
        )
    }
}
