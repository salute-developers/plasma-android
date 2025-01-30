package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.ShadowTokenGenerator.Companion.SHADOW_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генератор Compose-атрибутов теней.
 * Генерирует kt-файл, содержащий в себе все тени темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeShadowAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {
    private val shadows = mutableListOf<ShadowTokenResult.TokenData>()

    private val shadowKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(shadowClassName, TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val shadowClassName = "${camelThemeName}Shadows"
    private val shadowClassType by unsafeLazy {
        shadowKtFileBuilder.getInternalClassType(shadowClassName)
    }

    fun setShadowTokenData(shadows: List<ShadowTokenResult.TokenData>) {
        this.shadows.clear()
        this.shadows.addAll(shadows)
    }

    override fun generate() {
        if (shadows.isEmpty()) return

        addImports()
        addShadowClassFactoryFun()
        addShadowClass(shadows)
        addLocalShadowsVal()

        shadowKtFileBuilder.build(outputLocation)
    }

    private fun addShadowClass(shapes: List<ShadowTokenResult.TokenData>) {
        with(shadowKtFileBuilder) {
            rootClass(
                name = shadowClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = shapes.map {
                        KtFileBuilder.FunParameter(
                            name = it.tokenTechName.attributeName(),
                            type = KtFileBuilder.TypeShadowAppearance,
                            defValue = "ShadowAppearance()",
                            asProperty = true,
                        )
                    },
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Тени $camelThemeName",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLocalShadowsVal() {
        shadowKtFileBuilder.appendRootVal(
            name = "Local$shadowClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = shadowKtFileBuilder.getInternalClassType(shadowClassName),
            initializer = "staticCompositionLocalOf { $shadowClassName() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addImports() {
        with(shadowKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                ),
            )
            addImport(KtFileBuilder.TypeShadowAppearance)
            addImport(KtFileBuilder.TypeShadowLayer)
            addImport(KtFileBuilder.TypeDpOffset)
            addImport(
                getInternalClassType(
                    className = SHADOW_TOKENS_NAME,
                    classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                ),
            )
        }
    }

    private fun addShadowClassFactoryFun() = with(shadowKtFileBuilder) {
        appendRootFun(
            name = "default$shadowClassName",
            returnType = shadowClassType,
            body = listOf(
                KtFileBuilder.createConstructorCall(
                    constructorName = shadowClassName,
                    initializers = shadows.map {
                        """
                            ${it.tokenTechName.attributeName()} = ${createShadowAppearanceCall(it.layers)}
                        """.trimIndent()
                    }.toTypedArray(),
                ).let { "return $it" },
            ),
            description = "Возвращает [$shadowClassName]",
            annotations = listOf(
                KtFileBuilder.TypeAnnotationComposable,
                KtFileBuilder.TypeAnnotationReadOnlyComposable,
            ).takeIf { dimensionsConfig.fromResources },
        )
    }

    private companion object {

        fun String.attributeName(): String = techToCamelCase().decapitalized()

        fun createShadowAppearanceCall(layers: List<ShadowTokenResult.ShadowLayer>): String {
            return KtFileBuilder.createFunCall("listOf", layers.map { createShadowLayerCall(it) })
                .let {
                    """ShadowAppearance(
                        ${it.trimIndent()}
                    )
                    """.trimIndent()
                }
        }

        fun createShadowLayerCall(layer: ShadowTokenResult.ShadowLayer): String =
            """
                ShadowLayer(
                    offset = DpOffset(
                        x = ${layer.offsetXRef},
                        y = ${layer.offsetYRef},
                    ),
                    spreadRadius = ${layer.spreadRef},
                    blurRadius = ${layer.blurRef},
                    color = ${layer.colorRef},
                    fallbackElevation = ${layer.fallbackElevationRef}
                )
            """.trimIndent()
    }
}
