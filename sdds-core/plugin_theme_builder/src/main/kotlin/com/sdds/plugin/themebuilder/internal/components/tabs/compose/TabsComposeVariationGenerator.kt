package com.sdds.plugin.themebuilder.internal.components.tabs.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.tabs.TabsProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class TabsComposeVariationGenerator(
    private val tabItemStylesPackage: String,
    private val iconTabItemStylesPackage: String,
    private val dividerStylesPackage: String,
    private val dropDownMenuStylesPackage: String,
    themeClassName: String,
    themePackage: String,
    dimensionsConfig: DimensionsConfig,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    componentPackage: String,
    outputLocation: KtFileBuilder.OutputLocation,
    private val componentName: String,
) : ComposeVariationGenerator<TabsProperties>(
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
    styleBuilderName = "TabsStyleBuilder",
) {

    override val componentStyleName: String = "TabsStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf("TabsOrientation"),
        )
    }

    override fun propsToBuilderCalls(
        props: TabsProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            colorsCall(props),
            dimensionsCall(props, variationId),
            tabItemStyleCall(props, ktFileBuilder),
            dropDownMenuStyleCall(props, ktFileBuilder),
            dividerStyleCall(props, ktFileBuilder),
            disclosureIconCall(props),
            overflowNextIconCall(props),
            overflowPrevIconCall(props),
            disclosureTextStyleCall(props),
            orientationCall(props),
            dividerEnabledCall(props),
            indicatorEnabledCall(props),
        )
    }

    private fun dividerEnabledCall(props: TabsProperties): String? {
        return props.dividerEnabled?.let {
            ".dividerEnabled(${it.value})"
        }
    }

    private fun indicatorEnabledCall(props: TabsProperties): String? {
        return props.indicatorEnabled?.let {
            ".indicatorEnabled(${it.value})"
        }
    }

    private fun orientationCall(props: TabsProperties): String? {
        return props.orientation?.let {
            val enumValue = when {
                it.value.equals("horizontal", ignoreCase = true) -> "Horizontal"
                it.value.equals("vertical", ignoreCase = true) -> "Vertical"
                else -> "Horizontal"
            }
            ".orientation(TabsOrientation.$enumValue)"
        }
    }

    private fun disclosureTextStyleCall(props: TabsProperties): String? {
        return props.disclosureTextStyle?.let {
            getTypography("disclosureTextStyle", it)
        }
    }

    private fun overflowNextIconCall(props: TabsProperties): String? {
        return props.overflowNextIcon?.let {
            getIconAsDrawableRes("overflowNextIcon", it)
        }
    }

    private fun overflowPrevIconCall(props: TabsProperties): String? {
        return props.overflowPrevIcon?.let {
            getIconAsDrawableRes("overflowPrevIcon", it)
        }
    }

    private fun disclosureIconCall(props: TabsProperties): String? {
        return props.disclosureIcon?.let {
            getIconAsDrawableRes("disclosureIcon", it)
        }
    }

    private fun shapeCall(props: TabsProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun tabItemStyleCall(
        props: TabsProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        val tabItemPackage = if (componentName.contains("icon")) {
            iconTabItemStylesPackage
        } else {
            tabItemStylesPackage
        }
        return props.tabItemStyle?.let {
            ".tabItemStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    tabItemPackage,
                )
            }.style())"
        }
    }

    private fun dropDownMenuStyleCall(
        props: TabsProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.dropdownMenuStyle?.let {
            ".dropdownMenuStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    dropDownMenuStylesPackage,
                )
            }.style())"
        }
    }

    private fun dividerStyleCall(
        props: TabsProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.dividerStyle?.let {
            ".dividerStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    dividerStylesPackage,
                )
            }.style())"
        }
    }

    private fun colorsCall(props: TabsProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.indicatorColor?.let {
                    appendLine(getColor("indicatorColor", it))
                }
                props.overflowNextIconColor?.let {
                    appendLine(getColor("overflowNextIconColor", it))
                }
                props.overflowPrevIconColor?.let {
                    appendLine(getColor("overflowPrevIconColor", it))
                }
                props.disclosureColor?.let {
                    appendLine(getColor("disclosureColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: TabsProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.indicatorThickness?.let {
                    appendDimension("indicator_thickness", it, variationId)
                }
                props.minSpacing?.let {
                    appendDimension("min_spacing", it, variationId)
                }
                props.minHeight?.let {
                    appendDimension("min_height", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun TabsProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            indicatorColor != null ||
            overflowNextIconColor != null ||
            overflowPrevIconColor != null ||
            disclosureColor != null
    }

    private fun TabsProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            indicatorThickness != null ||
            minSpacing != null ||
            minHeight != null
    }
}
