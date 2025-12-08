package com.sdds.plugin.themebuilder.internal.components.dropdownmenu.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element
import java.io.File

internal class DropdownMenuStyleGeneratorView(
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
) : ViewVariationGenerator<DropdownMenuProperties>(
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
        variationNode: VariationNode<DropdownMenuProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        DropdownMenuDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        DropdownMenuColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<DropdownMenuProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
        props.listStyle?.let {
            componentOverlayAttribute(
                "sd_listViewStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.emptyStateStyle?.let {
            componentOverlayAttribute(
                "sd_emptyStateStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.scrollBarStyle?.let {
            componentOverlayAttribute(
                "sd_scrollBarStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.dividerStyle?.let {
            componentOverlayAttribute(
                "sd_dividerStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
    }

    internal enum class DropdownMenuColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<DropdownMenuProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        STROKE_COLOR("sd_strokeColor", "stroke_color"),
        ;

        override fun provide(owner: DropdownMenuProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                STROKE_COLOR -> owner.strokeColor
            }
        }
    }

    internal enum class DropdownMenuDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<DropdownMenuProperties, Float, Dimension> {
        MIN_WIDTH("android:minWidth", "min_width"),
        STROKE_WIDTH("sd_strokeWidth", "stroke_width"),
        OFFSET("sd_offset", "offset"),
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        SCROLLBAR_PADDING_TOP("sd_scrollBarPaddingTop", "scrollbar_padding_top"),
        SCROLLBAR_PADDING_BOTTOM("sd_scrollBarPaddingBottom", "scrollbar_padding_bottom"),
        ;

        override fun provide(owner: DropdownMenuProperties): Dimension? {
            return when (this) {
                MIN_WIDTH -> owner.width
                STROKE_WIDTH -> owner.strokeWidth
                OFFSET -> owner.offset
                PADDING_START -> owner.paddingStart
                PADDING_TOP -> owner.paddingTop
                PADDING_END -> owner.paddingEnd
                PADDING_BOTTOM -> owner.paddingBottom
                SCROLLBAR_PADDING_TOP -> owner.scrollBarPaddingTop
                SCROLLBAR_PADDING_BOTTOM -> owner.scrollBarPaddingBottom
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "DropdownMenu"
        const val DEF_STYLE_ATTR = "sd_dropdownMenuStyle"
        const val COMPONENT_PARENT = "Sdds.Components.DropdownMenu"
    }
}
