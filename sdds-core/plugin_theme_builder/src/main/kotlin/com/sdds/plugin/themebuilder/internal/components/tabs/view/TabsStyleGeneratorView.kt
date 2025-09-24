package com.sdds.plugin.themebuilder.internal.components.tabs.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.tabs.TabsProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class TabsStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    styleComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<TabsProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    componentParent = componentParent,
    styleComponentName = styleComponentName,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {
    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<TabsProperties>,
        props: TabsProperties,
    ) = with(styleElement) {
        addProps(variation, props)
        TabsColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
        TabsDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(
        variation: String,
        props: TabsProperties,
    ) {
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.disclosureTextStyle?.let { typographyAttribute("sd_disclosureTextAppearance", it.value) }
        props.overflowNextIcon?.let { iconAttribute("sd_overflowNextIcon", it.value) }
        props.overflowPrevIcon?.let { iconAttribute("sd_overflowPrevIcon", it.value) }
        props.disclosureIcon?.let { iconAttribute("sd_disclosureIcon", it.value) }
        props.orientation?.let { valueAttribute("android:orientation", it.value) }
        props.dividerEnabled?.let { booleanAttribute("sd_dividerEnabled", it.value) }
        props.indicatorEnabled?.let { booleanAttribute("sd_tabIndicatorEnabled", it.value) }
        props.tabItemStyle?.let {
            componentOverlayAttribute("sd_tabItemStyleOverlay", it.camelCaseValue(""))
        }
        props.dividerStyle?.let {
            componentOverlayAttribute("sd_dividerStyleOverlay", it.camelCaseValue(""))
        }
    }

    private enum class TabsDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<TabsProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        INDICATOR_THICKNESS("sd_tabIndicatorThickness", "indicator_thickness"),
        MIN_SPACING("sd_tabsMinSpacing", "min_spacing"),
        MIN_HEIGHT("android:minHeight", "min_height"),
        ;

        override fun provide(owner: TabsProperties): Dimension? {
            return when (this) {
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                INDICATOR_THICKNESS -> owner.indicatorThickness
                MIN_SPACING -> owner.minSpacing
                MIN_HEIGHT -> owner.minHeight
            }
        }
    }

    internal enum class TabsColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<TabsProperties> {
        BACKGROUND_COLOR("android:backgroundTint", "background_color"),
        INDICATOR_COLOR("sd_tabIndicatorColor", "indicator_color"),
        OVERFLOW_NEXT_COLOR("sd_overflowNextIconColor", "next_color"),
        OVERFLOW_PREV_COLOR("sd_overflowPrevIconColor", "prev_color"),
        DISCLOSURE_COLOR("sd_disclosureColor", "disclosure_color"),
        ;

        override fun provide(owner: TabsProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                INDICATOR_COLOR -> owner.indicatorColor
                OVERFLOW_NEXT_COLOR -> owner.overflowNextIconColor
                OVERFLOW_PREV_COLOR -> owner.overflowPrevIconColor
                DISCLOSURE_COLOR -> owner.disclosureColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Tabs"
        const val DEF_STYLE_ATTR = "sd_tabsStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Tabs"
    }
}
