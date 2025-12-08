package com.sdds.plugin.themebuilder.internal.components.bottomsheet.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.bottomsheet.BottomSheetProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.squareup.kotlinpoet.ClassName

/**
 * Генератор вариаций BottomSheet на Compose
 */
internal class BottomSheetComposeVariationGenerator(
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
) : ComposeVariationGenerator<BottomSheetProperties>(
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

    override val componentStyleName = "ModalBottomSheetStyle"
    override fun propsToBuilderCalls(
        props: BottomSheetProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            shadowCall(props),
            dimensionsCall(props, variationId),
            colorsCall(props),
            handlePlacementCall(props),
        )
    }

    override fun KtFileBuilder.onAddImports() {
        addImport(ClassName("com.sdds.compose.uikit", "BottomSheetHandlePlacement"))
    }

    private fun shapeCall(props: BottomSheetProperties, variationId: String): String? {
        return if (props.hasShape()) {
            buildString {
                props.shape?.let {
                    appendLine(getShape(it, variationId))
                }
                props.handleShape?.let {
                    appendLine(getShape(it, variationId, "handleShape"))
                }
            }
        } else {
            null
        }
    }

    private fun shadowCall(props: BottomSheetProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: BottomSheetProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
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

    private fun BottomSheetProperties.hasColors(): Boolean {
        return backgroundColor != null || handleColor != null
    }

    private fun dimensionsCall(
        props: BottomSheetProperties,
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
                props.handleHeight?.let {
                    appendDimension("handle_height", it, variationId)
                }
                props.handleWidth?.let {
                    appendDimension("handle_width", it, variationId)
                }
                props.handleOffset?.let {
                    appendDimension("handle_offset", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun BottomSheetProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            handleWidth != null ||
            handleHeight != null ||
            handleOffset != null
    }

    private fun BottomSheetProperties.hasShape(): Boolean {
        return shape != null || handleShape != null
    }

    private fun handlePlacementCall(props: BottomSheetProperties): String? {
        return props.handlePlacement?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                it.value.equals("auto", ignoreCase = true) -> "Auto"
                else -> "None"
            }
            ".handlePlacement(BottomSheetHandlePlacement.$enumValue)"
        }
    }
}
