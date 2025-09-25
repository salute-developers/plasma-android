package com.sdds.plugin.themebuilder.internal.components.tabs.item.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.tabs.item.TabItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента TabItem
 */
internal open class BaseTabItemStyleGeneratorView(
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
) : ViewVariationGenerator<TabItemProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    styleComponentName = styleComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {
    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<TabItemProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        TabItemColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode) { colorState ->
                if (colorState.state.contains("selected")) {
                    setOf(StateListAttribute("android:state_selected", "true"))
                } else {
                    emptySet()
                }
            }
        }
        TabItemDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<TabItemProperties>,
    ) {
        val props = variationNode.value.props
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.counterStyle?.let { componentStyleAttribute("sd_counterStyle", it.camelCaseValue(".")) }
        props.actionIcon?.let { iconAttribute("sd_action", it.value) }
    }

    private enum class TabItemDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<TabItemProperties, Float, Dimension> {
        MIN_WIDTH("android:minWidth", "min_width"),
        MIN_HEIGHT("android:minHeight", "min_height"),
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        START_CONTENT_SIZE("sd_contentStartSize", "content_start_size"),
        END_CONTENT_SIZE("sd_contentEndSize", "content_end_size"),
        ICON_MARGIN("sd_iconPadding", "icon_padding"),
        COUNTER_MARGIN("sd_counterPadding", "counter_padding"),
        VALUE_MARGIN("sd_valuePadding", "value_padding"),
        ACTION_PADDING("sd_actionPadding", "action_padding"),
        ACTION_SIZE("sd_actionSize", "action_size"),
        COUNTER_OFFSET_X("sd_counterOffsetX", "counter_offset_x"),
        COUNTER_OFFSET_Y("sd_counterOffsetY", "counter_offset_y"),
        ;

        override fun provide(owner: TabItemProperties): Dimension? {
            return when (this) {
                MIN_WIDTH -> owner.minWidth
                MIN_HEIGHT -> owner.minHeight
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                START_CONTENT_SIZE -> owner.startContentSize
                END_CONTENT_SIZE -> owner.endContentSize
                ICON_MARGIN -> owner.iconPadding
                COUNTER_MARGIN -> owner.counterPadding
                VALUE_MARGIN -> owner.valuePadding
                ACTION_PADDING -> owner.actionPadding
                ACTION_SIZE -> owner.actionSize
                COUNTER_OFFSET_X -> owner.counterOffsetX
                COUNTER_OFFSET_Y -> owner.counterOffsetY
            }
        }
    }

    internal enum class TabItemColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<TabItemProperties> {
        LABEL_COLOR("android:textColor", "text_color"),
        VALUE_COLOR("sd_valueTextColor", "value_text_color"),
        BACKGROUND_COLOR("backgroundTint", "background_color"),
        START_CONTENT_COLOR("sd_iconTint", "icon_tint"),
        ACTION_COLOR("sd_actionTint", "action_tint"),
        ;

        override fun provide(owner: TabItemProperties): Color? {
            return when (this) {
                LABEL_COLOR -> owner.labelColor
                VALUE_COLOR -> owner.valueColor
                BACKGROUND_COLOR -> owner.backgroundColor
                START_CONTENT_COLOR -> owner.startContentColor
                ACTION_COLOR -> owner.actionColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "TabItem"
        const val DEF_STYLE_ATTR = "sd_tabItemStyle"
        const val COMPONENT_PARENT = "Sdds.Components.TabItem"
    }
}
