package com.sdds.plugin.themebuilder.internal.components.carousel.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.carousel.CarouselProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Carousel
 */
internal open class CarouselStyleGeneratorView(
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
) : ViewVariationGenerator<CarouselProperties>(
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
        variationNode: VariationNode<CarouselProperties>,
        props: CarouselProperties,
    ) = with(styleElement) {
        addProps(props)
        CarouselDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(props: CarouselProperties) {
        props.nextButtonStyle?.let {
            componentOverlayAttribute(
                "sd_nextButtonStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.prevButtonStyle?.let {
            componentOverlayAttribute(
                "sd_prevButtonStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.indicatorStyle?.let {
            componentOverlayAttribute(
                "sd_paginationDotsStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.nextButtonIcon?.let {
            iconAttribute(
                "sd_nextButtonIcon",
                it.value,
            )
        }
        props.prevButtonIcon?.let {
            iconAttribute(
                "sd_prevButtonIcon",
                it.value,
            )
        }
    }

    internal enum class CarouselDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<CarouselProperties, Float, Dimension> {
        INDICATOR_PADDING("sd_indicatorPadding", "indicator_padding"),
        NEXT_BUTTON_PADDING("sd_nextButtonPadding", "next_padding"),
        PREV_BUTTON_PADDING("sd_prevButtonPadding", "prev_padding"),
        GAP("sd_gap", "gap"),
        ;

        override fun provide(owner: CarouselProperties): Dimension? {
            return when (this) {
                INDICATOR_PADDING -> owner.indicatorPadding
                NEXT_BUTTON_PADDING -> owner.nextButtonPadding
                PREV_BUTTON_PADDING -> owner.prevButtonPadding
                GAP -> owner.gap
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Carousel"
        const val DEF_STYLE_ATTR = "sd_carouselStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Carousel"
    }
}
