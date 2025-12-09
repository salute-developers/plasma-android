package com.sdds.plugin.themebuilder.internal.components.file.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.file.FileProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class FileComposeVariationGenerator(
    private val actionButtonStylesPackage: String,
    private val progressBarStylesPackage: String,
    private val circularProgressBarStylesPackage: String,
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
) : ComposeVariationGenerator<FileProperties>(
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

    override val componentStyleName: String = "FileStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "FileActionPlacement",
                "FileProgressPlacement",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: FileProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        labelStyleCall(props),
        descriptionStyleCall(props),
        progressPlacementCall(props),
        actionPlacementCall(props),
        actionButtonStyleCall(props, ktFileBuilder),
        progressBarStyleCall(props, ktFileBuilder),
        circularProgressBarStyleCall(props, ktFileBuilder),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun labelStyleCall(props: FileProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun descriptionStyleCall(props: FileProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
        }
    }

    private fun colorsCall(props: FileProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
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

    private fun actionButtonStyleCall(
        props: FileProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.actionButtonStyle?.let {
            ".actionButtonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    actionButtonStylesPackage,
                )
            }.style())"
        }
    }

    private fun progressBarStyleCall(
        props: FileProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.progressBarStyle?.let {
            ".progressBarStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    progressBarStylesPackage,
                )
            }.style())"
        }
    }

    private fun circularProgressBarStyleCall(
        props: FileProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.circularProgressBarStyle?.let {
            ".circularProgressBarStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    circularProgressBarStylesPackage,
                )
            }.style())"
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun dimensionsCall(
        props: FileProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.startContentPadding?.let {
                    appendDimension("start_content_padding", it, variationId)
                }
                props.endContentPadding?.let {
                    appendDimension("end_content_padding", it, variationId)
                }
                props.bottomContentPadding?.let {
                    appendDimension("bottom_content_padding", it, variationId)
                }
                props.descriptionPadding?.let {
                    appendDimension("description_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun FileProperties.hasDimensions(): Boolean {
        return startContentPadding != null ||
            endContentPadding != null ||
            bottomContentPadding != null ||
            descriptionPadding != null
    }

    private fun FileProperties.hasColors() =
        labelColor != null ||
            descriptionColor != null ||
            iconColor != null

    private fun progressPlacementCall(props: FileProperties): String? {
        return props.progressPlacement?.let {
            val enumValue = when {
                it.value.equals("inline", ignoreCase = true) -> "Inline"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> "None"
            }
            ".progressPlacement(FileProgressPlacement.$enumValue)"
        }
    }

    private fun actionPlacementCall(props: FileProperties): String? {
        return props.actionPlacement?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                it.value.equals("end", ignoreCase = true) -> "End"
                else -> "None"
            }
            ".actionPlacement(FileActionPlacement.$enumValue)"
        }
    }
}
