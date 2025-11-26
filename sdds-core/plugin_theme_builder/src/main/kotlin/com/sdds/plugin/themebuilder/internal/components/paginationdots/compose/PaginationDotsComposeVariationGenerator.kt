package com.sdds.plugin.themebuilder.internal.components.paginationdots.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.paginationdots.PaginationDotsProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class PaginationDotsComposeVariationGenerator(
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
) : ComposeVariationGenerator<PaginationDotsProperties>(
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
    styleBuilderName = "PaginationDotsStyleBuilder",
) {
    override val componentStyleName = "PaginationDotsStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf("PaginationDotsOrientation"),
        )
    }

    override fun propsToBuilderCalls(
        props: PaginationDotsProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        orientationCall(props),
        edgeCountCall(props),
        edgeShrinkFactorCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun orientationCall(props: PaginationDotsProperties): String? {
        return props.orientation?.let {
            val enumValue = when {
                it.value.equals("vertical", ignoreCase = true) -> "Vertical"
                else -> "Horizontal"
            }
            ".orientation(PaginationDotsOrientation.$enumValue)"
        }
    }

    private fun edgeCountCall(props: PaginationDotsProperties): String? {
        return props.edgeCount?.let {
            ".edgeCount(${it.value})"
        }
    }

    private fun edgeShrinkFactorCall(props: PaginationDotsProperties): String? {
        return props.edgeShrinkFactor?.let {
            ".edgeShrinkFactor(${it.value}f)"
        }
    }

    private fun colorsCall(props: PaginationDotsProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.dotBackgroundColor?.let {
                    appendLine(getColor("dotBackgroundColor", it, forceStatefulSuffix = true))
                }

                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: PaginationDotsProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.dotWidth?.let {
                    appendDimension("dot_width", it, variationId)
                }
                props.dotHeight?.let {
                    appendDimension("dot_height", it, variationId)
                }
                props.gap?.let {
                    appendDimension("gap", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun PaginationDotsProperties.hasDimensions(): Boolean {
        return dotHeight != null || dotWidth != null || gap != null
    }

    private fun PaginationDotsProperties.hasColors(): Boolean {
        return dotBackgroundColor != null
    }
}
