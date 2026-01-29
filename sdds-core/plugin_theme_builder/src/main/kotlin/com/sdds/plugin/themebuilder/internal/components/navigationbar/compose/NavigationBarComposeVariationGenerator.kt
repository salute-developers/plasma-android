package com.sdds.plugin.themebuilder.internal.components.navigationbar.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
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
    private val packageResolver: PackageResolver,
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
        addImport("com.sdds.compose.uikit", listOf("NavigationBarTextPlacement"))
    }

    override fun getCustomState(state: String): String {
        return when (state) {
            "text-inlined" -> "NavigationBarTextPlacement.Inline"
            else -> throw IllegalStateException("Unknown state $state for NavigationBar")
        }
    }

    override fun propsToBuilderCalls(
        props: NavigationBarProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        shadowCall(props),
        textStyleCall(props),
        titleStyleCall(props),
        descriptionStyleCall(props),
        backIconCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        actionButtonStyleCall(props, ktFileBuilder),
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

    private fun titleStyleCall(props: NavigationBarProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun descriptionStyleCall(props: NavigationBarProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
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

    private fun actionButtonStyleCall(
        props: NavigationBarProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.actionButtonStyle?.let {
            val buttonType = it.value.split("-").firstOrNull()
            val buttonStylesPackage =
                "${packageResolver.getPackage(TargetPackage.STYLES)}.${buttonType}button"
            ".actionButtonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    buttonStylesPackage,
                )
            }.style())"
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
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
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
                props.descriptionPadding?.let {
                    appendDimension("description_padding", it, variationId)
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
            paddingBottom != null ||
            descriptionPadding != null
    }

    private fun NavigationBarProperties.hasColors() = backgroundColor != null ||
        backIconColor != null ||
        textColor != null ||
        titleColor != null ||
        descriptionColor != null ||
        actionStartColor != null ||
        actionEndColor != null
}
