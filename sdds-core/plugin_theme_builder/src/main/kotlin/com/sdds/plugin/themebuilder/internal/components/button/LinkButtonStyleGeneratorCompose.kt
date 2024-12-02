package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.util.Locale

internal class LinkButtonStyleGeneratorCompose(
    private val themeClassName: String,
    private val themePackage: String,
    dimensionsConfig: DimensionsConfig,
    outputLocation: KtFileBuilder.OutputLocation,
    componentPackage: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
) : BaseButtonStyleGeneratorCompose<ButtonComponentConfig>(
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
) {
    override val componentXmlPrefix = "link_button"
    override val ktFileName = "LinkButtonStyles"

    override fun KtFileBuilder.addCode(config: ButtonComponentConfig) {
        addImports()
        addSizes(config)
    }

    private fun KtFileBuilder.addSizes(config: ButtonComponentConfig) {
        val sizeVariations = config.variations.size
        sizeVariations.forEach { (size, sizeData) ->
            appendRootVal(
                name = size.toUpperCase(Locale.getDefault()),
                typeName = getInternalClassType(
                    "LinkButtonStyleBuilder",
                    "com.sdds.compose.uikit",
                ),
                receiver = getInternalClassType("LinkButton", "com.sdds.compose.uikit"),
                getter = KtFileBuilder.Getter.Annotated(
                    annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
                    body = """
                            return LinkButtonStyleBuilder.builder(this)
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
                                    ),
                                )
                                .labelStyle($themeClassName.typography.${sizeData.labelStyle?.toKtTokenName()})
                    """.trimIndent(),
                ),
            )
        }
    }

    private fun KtFileBuilder.addImports() {
        addImport(
            packageName = themePackage,
            names = listOf(themeClassName),
        )
        addImport(
            packageName = "com.sdds.compose.uikit",
            names = listOf(
                "Button",
                "adjustBy",
            ),
        )
        addImport(
            packageName = "androidx.compose.foundation.shape",
            names = listOf("CircleShape"),
        )
        addImport(
            packageName = "androidx.compose.runtime",
            names = listOf("Composable"),
        )
        addImport(
            packageName = "androidx.compose.ui.unit",
            names = listOf("dp"),
        )
    }
}
