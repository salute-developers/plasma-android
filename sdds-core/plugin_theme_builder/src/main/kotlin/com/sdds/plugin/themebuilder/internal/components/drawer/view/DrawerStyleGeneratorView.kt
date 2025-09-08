package com.sdds.plugin.themebuilder.internal.components.drawer.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.drawer.DrawerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class DrawerStyleGeneratorView(
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
) : ViewVariationGenerator<DrawerProperties>(
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
        variationNode: VariationNode<DrawerProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        DrawerDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        DrawerColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<DrawerProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
        props.closeIcon?.let { iconAttribute("sd_closeIcon", it.value) }
        props.closeIconPlacement?.let { valueAttribute("sd_closeIconPlacement", it.value) }
    }

    internal enum class DrawerColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<DrawerProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        CLOSE_COLOR("sd_closeIconTint", "close_icon_color"),
        STROKE_COLOR("sd_strokeColor", "stroke_color"),
        ;

        override fun provide(owner: DrawerProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                CLOSE_COLOR -> owner.closeColor
                STROKE_COLOR -> owner.strokeColor
            }
        }
    }

    internal enum class DrawerDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<DrawerProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        CLOSE_PADDING("sd_closeIconHeaderPadding", "close_icon_header_padding"),
        CLOSE_OFFSET_X("sd_closeIconOffsetX", "close_icon_offset_x"),
        CLOSE_OFFSET_Y("sd_closeIconOffsetY", "close_icon_offset_y"),
        STROKE_SIZE("sd_strokeWidth", "stroke_width"),
        ;

        override fun provide(owner: DrawerProperties): Dimension? {
            return when (this) {
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                CLOSE_PADDING -> owner.closeIconHeaderPadding
                CLOSE_OFFSET_X -> owner.closeIconOffsetX
                CLOSE_OFFSET_Y -> owner.closeIconOffsetY
                STROKE_SIZE -> owner.strokeSize
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Drawer"
        const val DEF_STYLE_ATTR = "sd_drawerStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Drawer"
    }
}
