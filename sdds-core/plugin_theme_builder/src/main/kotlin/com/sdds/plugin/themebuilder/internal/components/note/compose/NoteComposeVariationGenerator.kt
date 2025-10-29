package com.sdds.plugin.themebuilder.internal.components.note.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.note.NoteProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class NoteComposeVariationGenerator(
    private val linkButtonStylesPackage: String,
    private val styleName: String,
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
) : ComposeVariationGenerator<NoteProperties>(
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

    override val componentStyleName: String = styleName

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport("com.sdds.compose.uikit", listOf("ContentBeforeVerticalArrangement"))
    }

    override fun propsToBuilderCalls(
        props: NoteProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        contentBeforeArrangementCall(props),
        closeIconCall(props),
        linkButtonStyleCall(props, ktFileBuilder),
        colorsCall(props),
        titleStyleCall(props),
        textStyleCall(props),
        generalDimensionsCall(props, variationId),
    )

    private fun shapeCall(props: NoteProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun closeIconCall(props: NoteProperties): String? {
        return props.closeIcon?.let {
            getIconAsDrawableRes("closeIcon", it)
        }
    }

    private fun linkButtonStyleCall(props: NoteProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.linkButtonStyle?.let {
            ".linkButtonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    linkButtonStylesPackage,
                )
            }.style())"
        }
    }

    private fun colorsCall(props: NoteProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.closeColor?.let {
                    appendLine(getColor("closeColor", it))
                }
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.textColor?.let {
                    appendLine(getColor("textColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun titleStyleCall(props: NoteProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun textStyleCall(props: NoteProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun generalDimensionsCall(
        props: NoteProperties,
        variationId: String,
    ): String? {
        return if (props.hasGeneralDimensions()) {
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
                props.closeSize?.let {
                    appendDimension("close_size", it, variationId)
                }
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.closeTopMargin?.let {
                    appendDimension("close_top_margin", it, variationId)
                }
                props.contentBeforeEndMargin?.let {
                    appendDimension("content_before_end_margin", it, variationId)
                }
                props.textTopMargin?.let {
                    appendDimension("text_top_margin", it, variationId)
                }
                verticalDimensionsCall(props, variationId)?.let { appendLine(it) }
                horizontalDimensionsCall(props, variationId)?.let { appendLine(it) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun verticalDimensionsCall(
        props: NoteProperties,
        variationId: String,
    ): String? {
        return if (props.hasVerticalDimensions()) {
            buildString {
                props.titlePaddingEnd?.let {
                    appendDimension("title_padding_end", it, variationId)
                }
                props.closeEndMargin?.let {
                    appendDimension("close_end_margin", it, variationId)
                }
                props.actionTopMargin?.let {
                    appendDimension("action_top_margin", it, variationId)
                }
            }
        } else {
            null
        }
    }

    private fun horizontalDimensionsCall(
        props: NoteProperties,
        variationId: String,
    ): String? {
        return if (props.hasHorizontalDimensions()) {
            buildString {
                props.closeStartMargin?.let {
                    appendDimension("close_start_margin", it, variationId)
                }
                props.actionStartMargin?.let {
                    appendDimension("action_start_margin", it, variationId)
                }
                props.actionEndMargin?.let {
                    appendDimension("action_end_margin", it, variationId)
                }
            }
        } else {
            null
        }
    }

    private fun contentBeforeArrangementCall(props: NoteProperties): String? {
        return props.contentBeforeArrangement?.let {
            val enumValue = when {
                it.value.equals("bottom", ignoreCase = true) -> "Bottom"
                it.value.equals("center", ignoreCase = true) -> "Center"
                else -> "Top"
            }
            ".contentBeforeArrangement(ContentBeforeVerticalArrangement.$enumValue)"
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun NoteProperties.hasGeneralDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            closeSize != null ||
            iconSize != null ||
            textTopMargin != null ||
            contentBeforeEndMargin != null
    }

    private fun NoteProperties.hasVerticalDimensions(): Boolean {
        return titlePaddingEnd != null ||
            closeEndMargin != null ||
            closeTopMargin != null ||
            actionTopMargin != null
    }

    private fun NoteProperties.hasHorizontalDimensions(): Boolean {
        return closeStartMargin != null ||
            actionStartMargin != null ||
            actionEndMargin != null
    }

    private fun NoteProperties.hasColors() = backgroundColor != null ||
        closeColor != null ||
        iconColor != null ||
        titleColor != null ||
        textColor != null
}
