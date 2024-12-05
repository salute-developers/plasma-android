package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.withIndent
import java.util.Locale

internal class BasicButtonStyleGeneratorCompose(
    private val themeClassName: String,
    themePackage: String,
    dimensionsConfig: DimensionsConfig,
    outputLocation: KtFileBuilder.OutputLocation,
    componentPackage: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
) : BaseButtonStyleGeneratorCompose<ButtonComponentConfig>(
    themeClassName = themeClassName,
    themePackage = themePackage,
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
) {
    override val componentXmlPrefix: String = "basic_button"
    override val ktFileName: String = "BasicButtonStyles"

    override fun addCode(config: ButtonComponentConfig, ktFileBuilder: KtFileBuilder) {
        super.addCode(config, ktFileBuilder)
        ktFileBuilder.addSizes(config)
        ktFileBuilder.addColors(config)
    }

    private fun KtFileBuilder.addSizes(config: ButtonComponentConfig) {
        val sizeVariations = config.variations.size
        sizeVariations.forEach { (size, sizeData) ->
            appendRootVal(
                name = size.toUpperCase(Locale.getDefault()),
                typeName = getInternalClassType(
                    "BasicButtonStyleBuilder",
                    "com.sdds.compose.uikit",
                ),
                receiver = getInternalClassType("BasicButton", "com.sdds.compose.uikit"),
                getter = KtFileBuilder.Getter.Annotated(
                    annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
                    body = """
                            return BasicButtonStyleBuilder.builder(this)
                                .shape($themeClassName.shapes.${sizeData.shape?.name?.toKtTokenName()}${
                        sizeData.shapeAdjustmentIfNeed(size)
                    })
                                .dimensions(
                                    Button.Dimensions(
                                        height = ${sizeData.getHeight(size)},
                                        paddings = Button.Dimensions.PaddingValues(
                                            start = ${sizeData.getPaddingStart(size)},
                                            end = ${sizeData.getPaddingEnd(size)},
                                        ),
                                        minWidth = ${sizeData.getMinWidth(size)},
                                        iconSize = ${sizeData.getIconSize(size)},
                                        spinnerSize = ${sizeData.getSpinnerSize(size)},
                                        iconMargin = ${sizeData.getIconMargin(size)},
                                        valueMargin = ${sizeData.getValueMargin(size)},
                                    ),
                                )
                                .labelStyle($themeClassName.typography.${sizeData.labelStyle?.toKtTokenName()})
                                .valueStyle($themeClassName.typography.${sizeData.valueStyle?.toKtTokenName()})
                    """.trimIndent(),
                ),
            )
        }
    }

    private fun KtFileBuilder.addColors(config: ButtonComponentConfig) {
        val colorVariations = config.variations.color
        val builderType = getInternalClassType(
            "BasicButtonStyleBuilder",
            "com.sdds.compose.uikit",
        )
        colorVariations.forEach { (color, colorData) ->
            appendRootVal(
                name = color.capitalize(Locale.getDefault()),
                typeName = builderType,
                receiver = builderType,
                getter = KtFileBuilder.Getter.AnnotatedCodeBlock(
                    annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
                    body = CodeBlock.builder()
                        .add("return this.colors {\n")
                        .withIndent {
                            add(colorData.getContentColor())
                            add(colorData.getBackgroundColor(config.invariant))
                            add(colorData.getValueColor())
                            add(colorData.getSpinnerMode(config.invariant))
                        }
                        .add("}\n")
                        .build(),
                ),
            )
        }
    }
}
