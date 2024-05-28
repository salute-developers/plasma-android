package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
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
) : SimpleBaseGenerator {
    private val shapes = mutableListOf<ShapeTokenResult.TokenData>()

    private val shapeKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(shapeClassName)
    }

    private val shapeClassName = "${themeName}Shapes"

    fun setShapeTokenData(shapes: List<ShapeTokenResult.TokenData>) {
        this.shapes.clear()
        this.shapes.addAll(shapes)
    }

    override fun generate() {
        generateShapes(shapes)
    }

    private fun generateShapes(shapes: List<ShapeTokenResult.TokenData>) {
        if (shapes.isEmpty()) return

        addImports()
        addShapesClass(shapes)
        addLocalShapesVal()

        shapeKtFileBuilder.build(outputLocation)
    }

    private fun addShapesClass(shapes: List<ShapeTokenResult.TokenData>) {
        with(shapeKtFileBuilder) {
            rootClass(
                name = shapeClassName,
                constructorParams = shapes.map {
                    KtFileBuilder.FunParameter(
                        name = it.attrName,
                        type = KtFileBuilder.TypeCornerBasedShape,
                        defValue = "RoundShapeTokens.${it.tokenRefName}",
                        asProperty = true,
                    )
                },
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Формы $themeName",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLocalShapesVal() {
        shapeKtFileBuilder.appendRootVal(
            name = "Local${themeName}Shapes",
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
        }
    }
}
