package com.sdds.plugin.themebuilder.internal.components.accordion

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized

internal class AccordionItemComposeVariationGenerator(
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
) : ComposeVariationGenerator<AccordionItemProperties>(
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

    override val componentStyleName: String = "AccordionItemStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "AccordionIconPlacement",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: AccordionItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            titleStyleCall(props),
            contentTextStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            iconPlacement(props),
            iconRotationCall(props),
            iconClosedCall(props),
            iconOpenedCall(props),
        )
    }

    private fun iconRotationCall(props: AccordionItemProperties): String? {
        return props.iconRotation?.let {
            ".iconRotation(${it.value}f)"
        }
    }

    private fun iconPlacement(props: AccordionItemProperties): String? {
        return props.iconPlacement?.let {
            ".iconPlacement(AccordionIconPlacement.${it.value.capitalized()})"
        }
    }

    private fun shapeCall(props: AccordionItemProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun dimensionsCall(
        props: AccordionItemProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.contentPaddingStart?.let {
                    appendDimension("content_padding_start", it, variationId)
                }
                props.contentPaddingEnd?.let {
                    appendDimension("content_padding_end", it, variationId)
                }
                props.contentPaddingTop?.let {
                    appendDimension("content_padding_top", it, variationId)
                }
                props.contentPaddingBottom?.let {
                    appendDimension("content_padding_bottom", it, variationId)
                }
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
                props.iconPadding?.let {
                    appendDimension("icon_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun AccordionItemProperties.hasDimensions(): Boolean {
        return contentPaddingStart != null ||
            contentPaddingEnd != null ||
            contentPaddingTop != null ||
            contentPaddingBottom != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            iconPadding != null
    }

    private fun colorsCall(props: AccordionItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.contentTextColor?.let {
                    appendLine(getColor("contentTextColor", it))
                }
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun AccordionItemProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            titleColor != null ||
            contentTextColor != null ||
            iconColor != null
    }

    private fun titleStyleCall(props: AccordionItemProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun contentTextStyleCall(props: AccordionItemProperties): String? {
        return props.contentTextStyle?.let {
            getTypography("contentTextStyle", it)
        }
    }

    private fun iconClosedCall(props: AccordionItemProperties): String? {
        return props.closedIcon?.let {
            getIcon("iconClosed", it)
        }
    }

    private fun iconOpenedCall(props: AccordionItemProperties): String? {
        return props.openedIcon?.let {
            getIcon("iconOpened", it)
        }
    }
}
