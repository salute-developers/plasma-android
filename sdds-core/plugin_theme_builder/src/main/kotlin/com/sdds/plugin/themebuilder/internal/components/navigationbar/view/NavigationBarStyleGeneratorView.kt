package com.sdds.plugin.themebuilder.internal.components.navigationbar.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.navigationbar.NavigationBarProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class NavigationBarStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    styleComponentName: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<NavigationBarProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    styleComponentName = styleComponentName,
    coreComponentName = coreComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {

    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<NavigationBarProperties>,
        props: NavigationBarProperties,
    ) = with(styleElement) {
        NavigationBarDimensionsProperty.values().forEach { dimensionProperty ->
            addDimensionProperty(dimensionProperty, variation, variationNode) {
                containsState(it.state, "text-inlined")
            }
        }
        addProps(variation, props)
        NavigationBarColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
        NavigationBarTypographyProperties.values().forEach { typographyProperty ->
            addTypographyProperty(typographyProperty, variation, variationNode) {
                containsState(it.state, "text-inlined")
            }
        }
    }

    private fun containsState(states: List<String>, stateName: String): Set<StateListAttribute> {
        return if (states.contains(stateName)) {
            setOf(StateListAttribute("app:sd_state_collapsed", "true"))
        } else {
            emptySet()
        }
    }

    private fun Element.addProps(variation: String, props: NavigationBarProperties) {
        props.backIcon?.let { iconAttribute("sd_backIcon", it.value) }
        props.bottomShape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
        props.actionButtonStyle?.let {
            componentOverlayAttribute("sd_iconButtonStyleOverlay", it.camelCaseValue(""))
        }
    }

    private enum class NavigationBarDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<NavigationBarProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "start_padding"),
        PADDING_END("android:paddingEnd", "end_padding"),
        PADDING_TOP("android:paddingTop", "top_padding"),
        PADDING_BOTTOM("android:paddingBottom", "bottom_padding"),
        DESCRIPTION_MARGIN("sd_descriptionMargin", "description_margin"),
        BACK_ICON_MARGIN("sd_backIconMargin", "back_icon_margin"),
        TEXT_BLOCK_TOP_MARGIN("sd_textBlockTopMargin", "text_block_top_margin"),
        HORIZONTAL_SPACING("sd_horizontalSpacing", "horizontal_spacing")
        ;
        override fun provide(owner: NavigationBarProperties): Dimension? {
            return when (this) {
                DESCRIPTION_MARGIN -> owner.descriptionPadding
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                BACK_ICON_MARGIN -> owner.backIconMargin
                TEXT_BLOCK_TOP_MARGIN -> owner.textBlockTopMargin
                HORIZONTAL_SPACING -> owner.horizontalSpacing
            }
        }
    }

    private enum class NavigationBarColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<NavigationBarProperties> {
        BACK_ICON_COLOR("sd_backIconTint", "back_icon_tint"),
        DESCRIPTION_COLOR("sd_descriptionColor", "description_color"),
        TITLE_COLOR("sd_titleColor", "title_color"),
        BACKGROUND_COLOR("sd_background", "background"),
        ACTION_START_COLOR("sd_actionStartColor", "action_start_color"),
        ACTION_END_COLOR("sd_actionEndColor", "action_end_color"),
        ;

        override fun provide(owner: NavigationBarProperties): Color? {
            return when (this) {
                DESCRIPTION_COLOR -> owner.descriptionColor
                BACK_ICON_COLOR -> owner.backIconColor
                TITLE_COLOR -> owner.titleColor
                BACKGROUND_COLOR -> owner.backgroundColor
                ACTION_START_COLOR -> owner.actionStartColor
                ACTION_END_COLOR -> owner.actionEndColor
            }
        }
    }

    internal enum class NavigationBarTypographyProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<NavigationBarProperties, String, Typography> {
        TITLE_APPEARANCE("sd_titleAppearance", "title_appearance"),
        DESCRIPTION_APPEARANCE("sd_descriptionAppearance", "description_appearance"),
        ;

        override fun provide(owner: NavigationBarProperties): Typography? {
            return when (this) {
                TITLE_APPEARANCE -> owner.titleStyle
                DESCRIPTION_APPEARANCE -> owner.descriptionStyle
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "NavigationBar"
        const val DEF_STYLE_ATTR = "sd_navigationBarStyle"
        const val COMPONENT_PARENT = "Sdds.Components.NavigationBar"
    }
}
