package com.sdds.plugin.themebuilder.internal.components.splitter

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Splitter на Compose
 */
internal class SplitterComposeVariationGenerator(
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
) : ComposeVariationGenerator<SplitterProperties>(
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
) {
    override val componentStyleName = "SplitterStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport(
            "com.sdds.compose.uikit",
            listOf("SplitterOrientation"),
        )
    }

    override fun propsToBuilderCalls(
        props: SplitterProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            colorCall(props),
            dimensionsCall(props, variationId),
        )
    }

    override fun getCustomState(state: String): String {
        return when (state) {
            "vertical" -> "SplitterOrientation.Vertical"
            else -> throw IllegalStateException("Unknown state $state for Splitter")
        }
    }

    private fun shapeCall(props: SplitterProperties, variationId: String): String? {
        return if (props.hasShape()) {
            buildString {
                props.dividerShape?.let {
                    appendLine(getShape(it, variationId, "dividerShape"))
                }
                props.handleShape?.let {
                    appendLine(getShape(it, variationId, "handleShape"))
                }
            }
        } else {
            null
        }
    }

    private fun colorCall(props: SplitterProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".color {")
                props.dividerColor?.let {
                    appendLine(getColor("dividerColor", it))
                }
                props.handleColor?.let {
                    appendLine(getColor("handleColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun SplitterProperties.hasColors(): Boolean {
        return dividerColor != null || handleColor != null
    }

    private fun dimensionsCall(
        props: SplitterProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.dividerThickness?.let {
                    appendDimension("divider_thickness", it, variationId)
                }
                props.handleThickness?.let {
                    appendDimension("handle_thickness", it, variationId)
                }
                props.handleStartPadding?.let {
                    appendDimension("handle_start_padding", it, variationId)
                }
                props.handleEndPadding?.let {
                    appendDimension("handle_end_padding", it, variationId)
                }
                props.handleTopPadding?.let {
                    appendDimension("handle_top_padding", it, variationId)
                }
                props.handleBottomPadding?.let {
                    appendDimension("handle_bottom_padding", it, variationId)
                }
                props.handleSpacer?.let {
                    appendDimension("handle_spacer", it, variationId)
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

    private fun SplitterProperties.hasDimensions(): Boolean {
        return dividerThickness != null ||
            handleThickness != null ||
            handleStartPadding != null ||
            handleEndPadding != null ||
            handleTopPadding != null ||
            handleBottomPadding != null ||
            handleSpacer != null ||
            gap != null
    }

    private fun SplitterProperties.hasShape(): Boolean {
        return dividerShape != null || handleShape != null
    }
}
