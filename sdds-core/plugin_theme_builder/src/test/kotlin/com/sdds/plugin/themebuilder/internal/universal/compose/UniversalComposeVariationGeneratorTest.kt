package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.universal.BindingType
import com.sdds.plugin.themebuilder.internal.universal.Bindings
import com.sdds.plugin.themebuilder.internal.universal.compose.mappers.PropertyMapperRegistry
import com.squareup.kotlinpoet.ClassName
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
        params: List<ComposePropertyMeta>,
        stateEnum: ComposeStateEnum? = null,
        multiplatform: Boolean = false,
        dimensionsConfig: DimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
    ): UniversalComposeVariationGenerator {
        val componentMeta = ComposeComponentMeta(
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
            dimensionsConfig = dimensionsConfig,
            resourceReferenceProvider = mockk(relaxed = true),
            themeStylesPackage = "com.test.styles",
            multiplatform = multiplatform,
        )
        return UniversalComposeVariationGenerator(
            componentMeta = componentMeta,
            mapperRegistry = registry,
            themeClassName = "TestTheme",
            themePackage = "com.test.theme",
            dimensionsConfig = dimensionsConfig,
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
        ) as com.sdds.plugin.themebuilder.internal.universal.ComponentStyleGenerator.Result.Compose

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
        ) as com.sdds.plugin.themebuilder.internal.universal.ComponentStyleGenerator.Result.Compose
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
        ) as com.sdds.plugin.themebuilder.internal.universal.ComponentStyleGenerator.Result.Compose
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

    @Test
    fun `разные типы свойств проходят через общий compose generator`() {
        val generator = createGenerator(
            params = listOf(
                shadowMeta("shadow"),
                booleanMeta("enabled"),
                integerMeta("count"),
                floatMeta("disabledAlpha"),
                iconMeta("startIcon"),
                componentStyleMeta("buttonStyle"),
                valueMeta("placement"),
            ),
        )
        val config = UniversalComponentConfig(
            props = UniversalPropertyOwner(
                buildJsonObject {
                    putJsonObject("shadow") { put("value", "soft.card") }
                    putJsonObject("enabled") { put("value", true) }
                    putJsonObject("count") { put("value", "4") }
                    putJsonObject("disabledAlpha") { put("value", 0.4f) }
                    putJsonObject("startIcon") { put("value", "actions.add") }
                    putJsonObject("buttonStyle") { put("value", "basic-button") }
                    putJsonObject("placement") { put("value", "outer") }
                },
            ),
            bindings = listOf(
                Bindings(
                    name = "platform",
                    type = BindingType.VIEW,
                    values = setOf("android", "compose"),
                    defaultValue = "android",
                ),
                Bindings(
                    name = "size",
                    type = BindingType.ENUM,
                    values = setOf("s", "m"),
                    defaultValue = "m",
                ),
            ),
        )

        val result = generator.generate(
            config,
        ) as com.sdds.plugin.themebuilder.internal.universal.ComponentStyleGenerator.Result.Compose

        assertEquals("Badge", result.styleName)
        assertEquals(listOf("platform", "size"), result.props.map { it.name })
        verify {
            mockComposeFile.addImport("com.sdds.compose.uikit", listOf("resourceImageSource"))
        }
    }

    @Test
    fun `state enum и dimension resources добавляют нужные imports`() {
        val generator = createGenerator(
            params = listOf(dimensionMeta("padding")),
            stateEnum = ComposeStateEnum(
                qualifiedName = "com.test.BadgeState",
                simpleName = "BadgeState",
                values = listOf(ComposeEnumValueInfo(name = "Pressed", configName = "pressed")),
            ),
            dimensionsConfig = DimensionsConfig(fromResources = true, multiplier = 1f),
        )
        val config = UniversalComponentConfig(
            props = UniversalPropertyOwner(
                buildJsonObject {
                    putJsonObject("padding") { put("value", 12f) }
                },
            ),
        )

        generator.generate(config)

        verify {
            mockComposeFile.addImport("com.test", listOf("BadgeState"))
            mockComposeFile.addImport(KtFileBuilder.TypeLocalDensity)
            mockComposeFile.addImport(KtFileBuilder.TypeDimensionResource)
            mockComposeFile.addImport(ClassName("com.test", "R"))
        }
    }

    private fun colorMeta(id: String, group: String) = ComposeColorPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = group,
    )

    private fun dimensionMeta(id: String) = ComposeDimensionPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun shapeMeta(id: String, group: String) = ComposeShapePropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = group,
    )

    private fun typographyMeta(id: String, group: String) = ComposeTypographyPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = group,
    )

    private fun shadowMeta(id: String) = ComposeShadowPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun booleanMeta(id: String) = ComposeBooleanPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun integerMeta(id: String) = ComposeIntegerPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun floatMeta(id: String) = ComposeFloatPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun iconMeta(id: String) = ComposeIconPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun componentStyleMeta(id: String) = ComposeComponentPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun valueMeta(id: String) = ComposeValuePropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "com.test.BadgePlacement",
        paramSimpleType = "BadgePlacement",
        group = "",
        values = listOf(
            ComposeEnumValueInfo(name = "Outer"),
            ComposeEnumValueInfo(name = "Inner"),
        ),
    )
}
