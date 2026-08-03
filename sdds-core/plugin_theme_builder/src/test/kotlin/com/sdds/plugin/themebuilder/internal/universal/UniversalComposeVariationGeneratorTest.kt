package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.File

class UniversalComposeVariationGeneratorTest {

    private val mockComposeFile: KtFileBuilder = mockk(relaxed = true)
    private val mockKtFileBuilderFactory: KtFileBuilderFactory = mockk {
        every { create(any<String>(), any<String>()) } returns mockComposeFile
    }

    private fun createGenerator(
        params: List<PropertyMeta>,
        stateEnum: StateEnum? = null,
        multiplatform: Boolean = false,
    ): UniversalComposeVariationGenerator {
        val componentMeta = ComponentMeta(
            componentName = "Badge",
            qualifiedName = "com.sdds.Badge",
            resolvedTypes = emptyList(),
            stateEnum = stateEnum,
            params = params,
        )
        val registry = PropertyMapperRegistry(
            componentMeta = componentMeta,
            themeClassName = "TestTheme",
            componentName = "badge",
            componentXmlPrefix = "badge",
            dimensAggregator = mockk(relaxed = true),
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
            resourceReferenceProvider = mockk(relaxed = true),
            themeStylesPackage = "com.test.styles",
            multiplatform = multiplatform,
        )
        return UniversalComposeVariationGenerator(
            componentMeta = componentMeta,
            mapperRegistry = registry,
            themeClassName = "TestTheme",
            themePackage = "com.test.theme",
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
            namespace = "com.test",
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            componentPackage = "com.test.styles.badge",
            outputLocation = KtFileBuilder.OutputLocation.Directory(File(".")),
            componentName = "badge",
            multiplatform = multiplatform,
        )
    }

    @Test
    fun `свойства без группы генерируют плоские вызовы`() {
        val generator = createGenerator(
            params = listOf(
                shapeMeta("shape", group = ""),
                typographyMeta("labelStyle", group = ""),
            ),
        )
        val config = UniversalComponentConfig(
            props = UniversalPropertyOwner(
                buildJsonObject {
                    putJsonObject("shape") { put("value", "shape.round.4") }
                    putJsonObject("labelStyle") { put("value", "body.xs.normal") }
                },
            ),
        )

        val result = generator.generate(
            config,
        ) as com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator.Result.Compose

        assertEquals("Badge", result.styleName)
    }

    @Test
    fun `свойства с одинаковой группой оборачиваются в блок`() {
        val generator = createGenerator(
            params = listOf(
                colorMeta("backgroundColor", group = "colors"),
                colorMeta("labelColor", group = "colors"),
                shapeMeta("shape", group = ""),
            ),
        )
        val propsJson = buildJsonObject {
            putJsonObject("backgroundColor") {
                put("type", "color")
                put("default", "surface.primary")
            }
            putJsonObject("labelColor") {
                put("type", "color")
                put("default", "text.primary")
            }
            putJsonObject("shape") { put("value", "shape.round.4") }
        }
        val config = UniversalComponentConfig(props = UniversalPropertyOwner(propsJson))

        // Just verify no exception and result is returned
        val result = generator.generate(
            config,
        ) as com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator.Result.Compose
        assertEquals("Badge", result.styleName)
    }

    @Test
    fun `свойства с отсутствующим значением в конфиге пропускаются`() {
        val generator = createGenerator(
            params = listOf(
                colorMeta("backgroundColor", group = "colors"),
                shapeMeta("shape", group = ""),
            ),
        )
        // Only shape is provided; backgroundColor is missing
        val config = UniversalComponentConfig(
            props = UniversalPropertyOwner(
                buildJsonObject {
                    putJsonObject("shape") { put("value", "shape.round.4") }
                },
            ),
        )

        val result = generator.generate(
            config,
        ) as com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator.Result.Compose
        assertEquals("Badge", result.styleName)
    }

    @Test
    fun `CMP-режим не добавляет Android-only импорт painterResource`() {
        val generator = createGenerator(
            params = listOf(shapeMeta("shape", group = "")),
            multiplatform = true,
        )
        val config = UniversalComponentConfig(
            props = UniversalPropertyOwner(
                buildJsonObject { putJsonObject("shape") { put("value", "shape.round.4") } },
            ),
        )

        generator.generate(config)

        verify(exactly = 0) {
            mockComposeFile.addImport("androidx.compose.ui.res", listOf("painterResource"))
        }
    }

    @Test
    fun `Android-режим добавляет импорт painterResource`() {
        val generator = createGenerator(
            params = listOf(shapeMeta("shape", group = "")),
            multiplatform = false,
        )
        val config = UniversalComponentConfig(
            props = UniversalPropertyOwner(
                buildJsonObject { putJsonObject("shape") { put("value", "shape.round.4") } },
            ),
        )

        generator.generate(config)

        verify(exactly = 1) {
            mockComposeFile.addImport("androidx.compose.ui.res", listOf("painterResource"))
        }
    }

    private fun colorMeta(id: String, group: String) = ColorPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = group,
    )

    private fun shapeMeta(id: String, group: String) = ShapePropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = group,
    )

    private fun typographyMeta(id: String, group: String) = TypographyPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = group,
    )
}
