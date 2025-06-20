package com.sdds.plugin.themebuilder.internal.components.segment.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.segment.SegmentProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class SegmentStyleGeneratorView(
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
) : ViewVariationGenerator<SegmentProperties>(
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
        variationNode: VariationNode<SegmentProperties>,
        props: SegmentProperties,
    ) = with(styleElement) {
        addProps(variation, props)
        SegmentColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
        SegmentDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(
        variation: String,
        props: SegmentProperties,
    ) {
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.segmentItemStyle?.let {
            componentOverlayAttribute("sd_segmentItemStyleOverlay", it.camelCaseValue(""))
        }
    }

    private enum class SegmentDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<SegmentProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        ;

        override fun provide(owner: SegmentProperties): Dimension? {
            return when (this) {
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
            }
        }
    }

    internal enum class SegmentColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<SegmentProperties> {
        BACKGROUND_COLOR("android:backgroundTint", "background_color"),
        ;

        override fun provide(owner: SegmentProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Segment"
        const val DEF_STYLE_ATTR = "sd_segmentStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Segment"
    }
}
