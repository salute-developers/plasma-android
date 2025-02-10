package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.SpacingTokenGenerator.Companion.SPACING_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.data.SpacingTokenResult
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генератор Compose-атрибутов отступов.
 * Генерирует kt-файл, содержащий в себе все отступы темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeSpacingAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {
    private val spacing = mutableListOf<SpacingTokenResult.TokenData>()

    private val spacingKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(spacingClassName, TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val spacingClassName = "${camelThemeName}Spacing"
    private val spacingClassType by unsafeLazy {
        spacingKtFileBuilder.getInternalClassType(spacingClassName)
    }

    fun setSpacingTokenData(spacing: List<SpacingTokenResult.TokenData>) {
        this.spacing.clear()
        this.spacing.addAll(spacing)
    }

    override fun generate() {
        if (spacing.isEmpty()) return

        addImports()
        addSpacingClassFactoryFun()
        addSpacingClass(spacing)
        addLocalSpacingVal()

        spacingKtFileBuilder.build(outputLocation)
    }

    private fun addSpacingClass(spacing: List<SpacingTokenResult.TokenData>) {
        with(spacingKtFileBuilder) {
            rootClass(
                name = spacingClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = spacing.map {
                        KtFileBuilder.FunParameter(
                            name = it.attrName,
                            type = KtFileBuilder.TypeDp,
                            defValue = "0.dp",
                            asProperty = true,
                        )
                    },
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Отступы $camelThemeName",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLocalSpacingVal() {
        spacingKtFileBuilder.appendRootVal(
            name = "Local$spacingClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = spacingKtFileBuilder.getInternalClassType(spacingClassName),
            initializer = "staticCompositionLocalOf { $spacingClassName() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addImports() {
        with(spacingKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                ),
            )
            addImport(KtFileBuilder.TypeDp)
            addImport(KtFileBuilder.TypeDpExtension)
            addImport(
                getInternalClassType(
                    className = SPACING_TOKENS_NAME,
                    classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                ),
            )
        }
    }

    private fun addSpacingClassFactoryFun() = with(spacingKtFileBuilder) {
        appendRootFun(
            name = "default$spacingClassName",
            returnType = spacingClassType,
            body = listOf(
                KtFileBuilder.createConstructorCall(
                    constructorName = spacingClassName,
                    initializers = spacing.map {
                        "${it.attrName} = $SPACING_TOKENS_NAME.${it.tokenRefName}"
                    }.toTypedArray(),
                ).let { "return $it" },
            ),
            description = "Возвращает [$spacingClassName]",
            annotations = listOf(
                KtFileBuilder.TypeAnnotationComposable,
                KtFileBuilder.TypeAnnotationReadOnlyComposable,
            ).takeIf { dimensionsConfig.fromResources },
        )
    }
}
