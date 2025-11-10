package com.sdds.plugin.themebuilder.internal.components.paginationdots.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.paginationdots.PaginationDotsProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента PaginationDots
 */
internal open class PaginationDotsViewStyleGenerator(
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
) : ViewVariationGenerator<PaginationDotsProperties>(
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
        variationNode: VariationNode<PaginationDotsProperties>,
        props: PaginationDotsProperties,
    ) = with(styleElement) {
        addProps(props)
        PaginationDotsDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        PaginationDotsColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(props: PaginationDotsProperties) {
        props.orientation?.let { valueAttribute("android:orientation", it.value) }
        props.edgeCount?.let { valueAttribute("sd_edgeIndicatorCount", it.value) }
        props.edgeShrinkFactor?.let { valueAttribute("sd_edgeIndicatorShrinkFactor", it.value.toString()) }
    }

    internal enum class PaginationDotsColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<PaginationDotsProperties> {
        DOT_BACKGROUND_COLOR("sd_dotBackground", "dot_bg_color"),
        ;

        override fun provide(owner: PaginationDotsProperties): Color? {
            return when (this) {
                DOT_BACKGROUND_COLOR -> owner.dotBackgroundColor
            }
        }
    }

    internal enum class PaginationDotsDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<PaginationDotsProperties, Float, Dimension> {
        DOT_WIDTH("sd_dotWidth", "dot_width"),
        DOT_HEIGHT("sd_dotHeight", "dot_height"),
        GAP("sd_gap", "gap"),
        ;

        override fun provide(owner: PaginationDotsProperties): Dimension? {
            return when (this) {
                DOT_WIDTH -> owner.dotWidth
                DOT_HEIGHT -> owner.dotHeight
                GAP -> owner.gap
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "PaginationDots"
        const val DEF_STYLE_ATTR = "sd_paginationDotsStyle"
        const val COMPONENT_PARENT = "Sdds.Components.PaginationDots"
    }
}
