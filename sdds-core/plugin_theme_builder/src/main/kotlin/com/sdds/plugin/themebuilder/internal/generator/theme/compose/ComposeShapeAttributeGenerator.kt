package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.ShapeTokenGenerator.Companion.ROUND_SHAPE_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генератор Compose-атрибутов форм.
 * Генерирует kt-файл, содержащий в себе все формы темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeShapeAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {
    private val shapes = mutableListOf<ShapeTokenResult.TokenData>()

    private val shapeKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(shapeClassName, TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val shapeClassName = "${camelThemeName}Shapes"
    private val shapeClassType by unsafeLazy {
        shapeKtFileBuilder.getInternalClassType(shapeClassName)
    }

    fun setShapeTokenData(shapes: List<ShapeTokenResult.TokenData>) {
        this.shapes.clear()
        this.shapes.addAll(shapes)
    }

    override fun generate() {
        if (shapes.isEmpty()) return

        addImports()
        addShapeClassFactoryFun()
        addShapesClass(shapes)
        addLocalShapesVal()

        shapeKtFileBuilder.build(outputLocation)
    }

    private fun addShapesClass(shapes: List<ShapeTokenResult.TokenData>) {
        with(shapeKtFileBuilder) {
            rootClass(
                name = shapeClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = shapes.map {
                        KtFileBuilder.FunParameter(
                            name = it.attrName,
                            type = KtFileBuilder.TypeCornerBasedShape,
                            defValue = "RoundedCornerShape(0)",
                            asProperty = true,
                        )
                    },
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Формы $camelThemeName",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLocalShapesVal() {
        shapeKtFileBuilder.appendRootVal(
            name = "Local$shapeClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = shapeKtFileBuilder.getInternalClassType(shapeClassName),
            initializer = "staticCompositionLocalOf { $shapeClassName() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addImports() {
        with(shapeKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                ),
            )
            addImport(KtFileBuilder.TypeRoundRectShape)
            addImport(
                getInternalClassType(
                    className = ROUND_SHAPE_TOKENS_NAME,
                    classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                ),
            )
        }
    }

    private fun addShapeClassFactoryFun() = with(shapeKtFileBuilder) {
        appendRootFun(
            name = "default$shapeClassName",
            returnType = shapeClassType,
            body = listOf(
                KtFileBuilder.createConstructorCall(
                    constructorName = shapeClassName,
                    initializers = shapes.map {
                        "${it.attrName} = RoundShapeTokens.${it.tokenRefName}"
                    }.toTypedArray(),
                ).let { "return $it" },
            ),
            description = "Возвращает [$shapeClassName]",
            annotations = listOf(
                KtFileBuilder.TypeAnnotationComposable,
                KtFileBuilder.TypeAnnotationReadOnlyComposable,
            ).takeIf { dimensionsConfig.fromResources },
        )
    }
}
