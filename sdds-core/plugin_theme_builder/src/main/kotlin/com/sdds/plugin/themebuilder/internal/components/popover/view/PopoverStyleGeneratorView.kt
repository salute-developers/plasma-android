package com.sdds.plugin.themebuilder.internal.components.popover.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.popover.PopoverProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class PopoverStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<PopoverProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
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
        variationNode: VariationNode<PopoverProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        PopoverDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        PopoverColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<PopoverProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
    }

    internal enum class PopoverColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<PopoverProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        ;

        override fun provide(owner: PopoverProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
            }
        }
    }

    internal enum class PopoverDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<PopoverProperties, Float, Dimension> {
        MIN_WIDTH("android:minWidth", "min_width"),
        OFFSET("sd_offset", "offset"),
        TAIL_WIDTH("sd_shapeTailWidth", "tail_width"),
        TAIL_HEIGHT("sd_shapeTailHeight", "tail_height"),
        TAIL_OFFSET("sd_shapeTailOffset", "tail_offset"),
        ;

        override fun provide(owner: PopoverProperties): Dimension? {
            return when (this) {
                MIN_WIDTH -> owner.width
                OFFSET -> owner.offset
                TAIL_WIDTH -> owner.tailWidth
                TAIL_HEIGHT -> owner.tailHeight
                TAIL_OFFSET -> owner.tailPadding
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Popover"
        const val DEF_STYLE_ATTR = "sd_popoverStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Popover"
    }
}
