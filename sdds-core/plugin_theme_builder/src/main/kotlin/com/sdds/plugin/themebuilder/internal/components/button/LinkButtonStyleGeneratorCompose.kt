package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import java.util.Locale

internal class LinkButtonStyleGeneratorCompose(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val themeClassName: String,
    private val themePackage: String,
    private val dimensionsConfig: DimensionsConfig,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
) : ComponentStyleGenerator<ButtonComponentConfig> {

    private val ktFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(
            fileName = "LinkButtonStyles",
            fullPackageName = componentPackage,
        )
    }
    private val rFileImport = ClassName(namespace, "R")

    override fun generate(config: ButtonComponentConfig) {
        addImports()
        addSizes(config)
        ktFileBuilder.build(outputLocation)
    }

    private fun addSizes(config: ButtonComponentConfig) {
        val sizeVariations = config.variations.size
        sizeVariations.forEach { (size, sizeData) ->
            with(ktFileBuilder) {
                val fromResources = dimensionsConfig.fromResources
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
                                        height = ${sizeData.getHeight(fromResources, size)},
                                        paddings = Button.Dimensions.PaddingValues(
                                            start = ${sizeData.getPaddingStart(fromResources, size)},
                                            end = ${sizeData.getPaddingEnd(fromResources, size)},
                                        ),
                                        minWidth = ${sizeData.getMinWidth(fromResources, size)},
                                        iconSize = ${sizeData.getIconSize(fromResources, size)},
                                        spinnerSize = ${sizeData.getSpinnerSize(fromResources, size)},
                                        iconMargin = ${sizeData.getIconMargin(fromResources, size)},
                                    ),
                                )
                                .labelStyle($themeClassName.typography.${sizeData.labelStyle?.toKtTokenName()})
                        """.trimIndent(),
                    ),
                )
            }
        }
    }

    private fun ButtonComponentConfig.Size.getHeight(fromResources: Boolean, size: String): String {
        return getDimension("height", height, fromResources, size)
    }

    private fun ButtonComponentConfig.Size.getPaddingStart(
        fromResources: Boolean,
        size: String,
    ): String {
        return getDimension("padding_start", paddingStart, fromResources, size)
    }

    private fun ButtonComponentConfig.Size.getPaddingEnd(
        fromResources: Boolean,
        size: String,
    ): String {
        return getDimension("padding_end", paddingEnd, fromResources, size)
    }

    private fun ButtonComponentConfig.Size.getMinWidth(
        fromResources: Boolean,
        size: String,
    ): String {
        return getDimension("min_width", minWidth, fromResources, size)
    }

    private fun ButtonComponentConfig.Size.getIconSize(
        fromResources: Boolean,
        size: String,
    ): String {
        return getDimension("icon_size", iconSize, fromResources, size)
    }

    private fun ButtonComponentConfig.Size.getSpinnerSize(
        fromResources: Boolean,
        size: String,
    ): String {
        return getDimension("spinner_size", spinnerSize, fromResources, size)
    }

    private fun ButtonComponentConfig.Size.getIconMargin(
        fromResources: Boolean,
        size: String,
    ): String {
        return getDimension("icon_margin", iconMargin ?: 0f, fromResources, size)
    }

    private fun getDimension(
        dimenName: String,
        dimenValue: Float,
        fromResources: Boolean,
        size: String,
    ): String {
        return if (fromResources) {
            val dimenData = DimenData(
                name = "${LINK_BUTTON_XML_PREFIX}_${dimenName}_size_$size",
                value = dimenValue,
                type = DimenData.Type.DP,
            )
            dimensAggregator.addDimen(dimenData)
            "dimensionResource(${resourceReferenceProvider.dimenR(dimenData)})"
        } else {
            "$dimenValue.dp"
        }
    }

    private fun String.toKtTokenName(): String = techToCamelCase().decapitalize(Locale.getDefault())

    private fun addImports() {
        with(ktFileBuilder) {
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
            if (dimensionsConfig.fromResources) {
                addImport(KtFileBuilder.TypeLocalDensity)
                addImport(KtFileBuilder.TypeDimensionResource)
                addImport(rFileImport)
            }
        }
    }

    private companion object {
        const val LINK_BUTTON_XML_PREFIX = "link_button"
    }
}
