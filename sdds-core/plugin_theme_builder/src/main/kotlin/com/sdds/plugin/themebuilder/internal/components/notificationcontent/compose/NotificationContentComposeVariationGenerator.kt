package com.sdds.plugin.themebuilder.internal.components.notificationcontent.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.notificationcontent.NotificationContentProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class NotificationContentComposeVariationGenerator(
    private val buttonGroupStylesPackage: String,
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
) : ComposeVariationGenerator<NotificationContentProperties>(
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

    override val componentStyleName: String = "NotificationContentStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "NotificationContentIconPlacement",
                "NotificationContentButtonLayout",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: NotificationContentProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        iconPlacementCall(props),
        buttonLayoutCall(props),
        buttonGroupStyle(props, ktFileBuilder),
        iconCall(props),
        titleStyleCall(props),
        textStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun iconCall(props: NotificationContentProperties): String? {
        return props.icon?.let {
            getIconAsDrawableRes("icon", it)
        }
    }

    private fun titleStyleCall(props: NotificationContentProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun textStyleCall(props: NotificationContentProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun colorsCall(props: NotificationContentProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.textColor?.let {
                    appendLine(getColor("textColor", it))
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

    private fun buttonGroupStyle(
        props: NotificationContentProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.buttonGroupStyle?.let {
            ".buttonGroupStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    buttonGroupStylesPackage,
                )
            }.style())"
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun dimensionsCall(
        props: NotificationContentProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.iconMargin?.let {
                    appendDimension("icon_margin", it, variationId)
                }
                props.textPadding?.let {
                    appendDimension("text_padding", it, variationId)
                }
                props.contentStartPadding?.let {
                    appendDimension("content_start_padding", it, variationId)
                }
                props.contentEndPadding?.let {
                    appendDimension("content_end_padding", it, variationId)
                }
                props.contentTopPadding?.let {
                    appendDimension("content_top_padding", it, variationId)
                }
                props.contentBottomPadding?.let {
                    appendDimension("content_bottom_padding", it, variationId)
                }
                props.textBoxStartPadding?.let {
                    appendDimension("text_box_start_padding", it, variationId)
                }
                props.textBoxEndPadding?.let {
                    appendDimension("text_box_end_padding", it, variationId)
                }
                props.textBoxTopPadding?.let {
                    appendDimension("text_box_top_padding", it, variationId)
                }
                props.textBoxBottomPadding?.let {
                    appendDimension("text_box_bottom_padding", it, variationId)
                }
                props.buttonGroupStartPadding?.let {
                    appendDimension("button_group_start_padding", it, variationId)
                }
                props.buttonGroupEndPadding?.let {
                    appendDimension("button_group_end_padding", it, variationId)
                }
                props.buttonGroupTopPadding?.let {
                    appendDimension("button_group_top_padding", it, variationId)
                }
                props.buttonGroupBottomPadding?.let {
                    appendDimension("button_group_bottom_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun NotificationContentProperties.hasDimensions(): Boolean {
        return iconSize != null ||
            iconMargin != null ||
            textPadding != null ||
            contentStartPadding != null ||
            contentEndPadding != null ||
            contentTopPadding != null ||
            contentBottomPadding != null ||
            textBoxStartPadding != null ||
            textBoxEndPadding != null ||
            textBoxTopPadding != null ||
            textBoxBottomPadding != null ||
            buttonGroupStartPadding != null ||
            buttonGroupEndPadding != null ||
            buttonGroupTopPadding != null ||
            buttonGroupBottomPadding != null
    }

    private fun NotificationContentProperties.hasColors() =
        titleColor != null ||
            textColor != null ||
            iconColor != null

    private fun iconPlacementCall(props: NotificationContentProperties): String? {
        return props.iconPlacement?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                it.value.equals("top", ignoreCase = true) -> "Top"
                else -> "None"
            }
            ".iconPlacement(NotificationContentIconPlacement.$enumValue)"
        }
    }

    private fun buttonLayoutCall(props: NotificationContentProperties): String? {
        return props.buttonLayout?.let {
            val enumValue = when {
                it.value.equals("stretch", ignoreCase = true) -> "Stretch"
                else -> "Normal"
            }
            ".buttonLayout(NotificationContentButtonLayout.$enumValue)"
        }
    }
}
