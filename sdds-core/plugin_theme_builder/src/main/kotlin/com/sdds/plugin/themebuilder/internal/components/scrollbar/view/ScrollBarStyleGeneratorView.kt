package com.sdds.plugin.themebuilder.internal.components.scrollbar.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.scrollbar.ScrollBarProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class ScrollBarStyleGeneratorView(
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
) : ViewVariationGenerator<ScrollBarProperties>(
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
        variationNode: VariationNode<ScrollBarProperties>,
        props: ScrollBarProperties,
    ) = with(styleElement) {
        ScrollBarDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, props)
        ScrollBarColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, props: ScrollBarProperties) {
        props.shape?.let { shapeAttribute(variation, it.value) }
        props.hoverExpandFactor?.let { valueAttribute("sd_expandFactor", it.value.toString()) }
    }

    private enum class ScrollBarDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<ScrollBarProperties, Float, Dimension> {
        THICKNESS("sd_thickness", "thickness"),
        ;

        override fun provide(owner: ScrollBarProperties): Dimension? {
            return when (this) {
                THICKNESS,
                -> owner.width
            }
        }
    }

    private enum class ScrollBarColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ScrollBarProperties> {
        THUMB_COLOR("sd_thumbColor", "thumb_color"),
        TRACK_COLOR("sd_trackColor", "track_color"),
        ;

        override fun provide(owner: ScrollBarProperties): Color? {
            return when (this) {
                THUMB_COLOR -> owner.thumbColor
                TRACK_COLOR -> owner.trackColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "ScrollBar"
        const val DEF_STYLE_ATTR = "sd_scrollBarStyle"
        const val COMPONENT_PARENT = "Sdds.Components.ScrollBar"
    }
}
