package com.sdds.plugin.themebuilder.internal.components.notification.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.notification.NotificationProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class NotificationComposeVariationGenerator(
    private val notificationContentStylesPackage: String,
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
) : ComposeVariationGenerator<NotificationProperties>(
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

    override val componentStyleName: String = "NotificationStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
    }

    override fun propsToBuilderCalls(
        props: NotificationProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        notificationContentStyleCall(props, ktFileBuilder),
        shapeCall(props, variationId),
        shadowCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun notificationContentStyleCall(
        props: NotificationProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.notificationContentStyle?.let {
            ".notificationContentStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    notificationContentStylesPackage,
                )
            }.style())"
        }
    }

    private fun shapeCall(props: NotificationProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun shadowCall(props: NotificationProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: NotificationProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.closeColor?.let {
                    appendLine(getColor("closeColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: NotificationProperties,
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
                props.closeSize?.let {
                    appendDimension("close_size", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun NotificationProperties.hasDimensions(): Boolean {
        return closeSize != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }

    private fun NotificationProperties.hasColors() = backgroundColor != null ||
        closeColor != null
}
