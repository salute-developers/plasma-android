package com.sdds.plugin.themebuilder.internal.components.answer.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.answer.AnswerProperties
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class AnswerComposeVariationGenerator(
    private val noteStylesPackage: String,
    private val spinnerStylesPackage: String,
    private val buttonGroupStylesPackage: String,
    private val chipGroupStylesPackage: String,
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
) : ComposeVariationGenerator<AnswerProperties>(
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
    componentStylePackage = "com.sdds.compose.uikit.ai",
) {
    override val componentStyleName: String = "AnswerStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport("com.sdds.compose.uikit.ai", listOf("AnswerState"))
    }

    override fun getCustomState(state: String): String {
        return when (state) {
            "default" -> "AnswerState.Default"
            "error", "negative" -> "AnswerState.Error"
            "loading" -> "AnswerState.Loading"
            else -> throw IllegalStateException("Unknown state $state for Answer")
        }
    }

    override fun propsToBuilderCalls(
        props: AnswerProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            titleStyleCall(props),
            contentStyleCall(props),
            loadingTextStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            noteStyleCall(props, ktFileBuilder),
            loadingSpinnerStyleCall(props, ktFileBuilder),
            actionsStartButtonGroupStyleCall(props, ktFileBuilder),
            actionsEndButtonGroupStyleCall(props, ktFileBuilder),
            suggestionsChipGroupStyleCall(props, ktFileBuilder),
        )
    }

    private fun titleStyleCall(props: AnswerProperties): String? =
        props.titleStyle?.let { getTypography("titleStyle", it) }

    private fun contentStyleCall(props: AnswerProperties): String? =
        props.contentStyle?.let { getTypography("contentStyle", it) }

    private fun loadingTextStyleCall(props: AnswerProperties): String? =
        props.loadingTextStyle?.let { getTypography("loadingTextStyle", it) }

    private fun colorsCall(props: AnswerProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let { appendLine(getGradientOrWrappedColor("background", it)) }
                props.titleColor?.let { appendLine(getGradientOrWrappedColor("titleColor", it)) }
                props.contentColor?.let { appendLine(getGradientOrWrappedColor("contentColor", it)) }
                props.loadingTextColor?.let { appendLine(getGradientOrWrappedColor("loadingTextColor", it)) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: AnswerProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.paddingStart?.let { appendDimension("padding_start", it, variationId) }
                props.paddingEnd?.let { appendDimension("padding_end", it, variationId) }
                props.paddingTop?.let { appendDimension("padding_top", it, variationId) }
                props.paddingBottom?.let { appendDimension("padding_bottom", it, variationId) }
                props.contentGap?.let { appendDimension("content_gap", it, variationId) }
                props.actionsGap?.let { appendDimension("actions_gap", it, variationId) }
                props.suggestionsGap?.let { appendDimension("suggestions_gap", it, variationId) }
                props.loadingGap?.let { appendDimension("loading_gap", it, variationId) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun noteStyleCall(props: AnswerProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.noteStyle?.let {
            ".noteStyle(${it.value.getComponentStyle(ktFileBuilder, noteStylesPackage)}.style())"
        }
    }

    private fun loadingSpinnerStyleCall(props: AnswerProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.loadingSpinnerStyle?.let {
            ".loadingSpinnerStyle(${it.value.getComponentStyle(ktFileBuilder, spinnerStylesPackage)}.style())"
        }
    }

    private fun actionsStartButtonGroupStyleCall(props: AnswerProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.actionsStartButtonGroupStyle?.let {
            ".actionsStartButtonGroupStyle(${
                it.value.getComponentStyle(ktFileBuilder, buttonGroupStylesPackage)
            }.style())"
        }
    }

    private fun actionsEndButtonGroupStyleCall(props: AnswerProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.actionsEndButtonGroupStyle?.let {
            ".actionsEndButtonGroupStyle(${
                it.value.getComponentStyle(ktFileBuilder, buttonGroupStylesPackage)
            }.style())"
        }
    }

    private fun suggestionsChipGroupStyleCall(props: AnswerProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.suggestionsChipGroupStyle?.let {
            ".suggestionsChipGroupStyle(${it.value.getComponentStyle(ktFileBuilder, chipGroupStylesPackage)}.style())"
        }
    }

    private fun AnswerProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            titleColor != null ||
            contentColor != null ||
            loadingTextColor != null
    }

    private fun AnswerProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            contentGap != null ||
            actionsGap != null ||
            suggestionsGap != null ||
            loadingGap != null
    }
}
