package com.sdds.plugin.themebuilder.internal.components.navigationbar.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.navigationbar.NavigationBarProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class NavigationBarComposeVariationGenerator(
    themeClassName: String,
    themePackage: String,
    dimensionsConfig: DimensionsConfig,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    componentPackage: String,
    outputLocation: KtFileBuilder.OutputLocation,
    componentName: String,
    styleBuilderName: String,
) : ComposeVariationGenerator<NavigationBarProperties>(
    themeClassName = themeClassName,
    themePackage = themePackage,
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
    componentName = componentName,
    styleBuilderName = styleBuilderName,
) {

    override val componentStyleName: String = "NavigationBarStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
    }

    override fun propsToBuilderCalls(
        props: NavigationBarProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        shadowCall(props),
        textStyleCall(props),
        backIconCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun backIconCall(props: NavigationBarProperties): String? {
        return props.backIcon?.let {
            getIconAsDrawableRes("backIcon", it)
        }
    }

    private fun textStyleCall(props: NavigationBarProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun shapeCall(props: NavigationBarProperties, variationId: String): String? {
        return props.bottomShape?.let {
            getShape(it, variationId, "bottomShape")
        }
    }

    private fun shadowCall(props: NavigationBarProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: NavigationBarProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.backIconColor?.let {
                    appendLine(getColor("backIconColor", it))
                }
                props.textColor?.let {
                    appendLine(getColor("textColor", it))
                }
                props.actionStartColor?.let {
                    appendLine(getColor("actionStartColor", it))
                }
                props.actionEndColor?.let {
                    appendLine(getColor("actionEndColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: NavigationBarProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.paddingStart?.let {
                    appendDimension("padding_start", it, variationId)
                }
                props.paddingEnd?.let {
                    appendDimension("padding_end", it, variationId)
                }
                props.paddingTop?.let {
                    appendDimension("padding_top", it, variationId)
                }
                props.paddingBottom?.let {
                    appendDimension("padding_bottom", it, variationId)
                }
                props.backIconMargin?.let {
                    appendDimension("back_icon_margin", it, variationId)
                }
                props.textBlockTopMargin?.let {
                    appendDimension("text_block_top_margin", it, variationId)
                }
                props.horizontalSpacing?.let {
                    appendDimension("horizontal_spacing", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun NavigationBarProperties.hasDimensions(): Boolean {
        return backIconMargin != null ||
            textBlockTopMargin != null ||
            horizontalSpacing != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }

    private fun NavigationBarProperties.hasColors() = backgroundColor != null ||
        backIconColor != null ||
        textColor != null ||
        actionStartColor != null ||
        actionEndColor != null
}
