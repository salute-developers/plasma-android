package com.sdds.plugin.themebuilder.internal.components.circularprogress.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.circularprogress.CircularProgressProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class CircularProgressStyleGeneratorView(
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
) : ViewVariationGenerator<CircularProgressProperties>(
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
        variationNode: VariationNode<CircularProgressProperties>,
    ) = with(styleElement) {
        CircularProgressDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, variationNode)
        CircularProgressColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<CircularProgressProperties>) {
        val props = variationNode.value.props

        props.valueStyle?.let { typographyAttribute("sd_progressValueAppearance", it.value) }
        props.valueEnabled?.let { valueAttribute("sd_progressValueEnabled", it.value.toString()) }
        props.trackEnabled?.let { valueAttribute("sd_trackEnabled", it.value.toString()) }
    }

    private enum class CircularProgressDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<CircularProgressProperties, Float, Dimension> {
        MIN_WIDTH("android:minWidth", "min_width"),
        MIN_HEIGHT("android:minHeight", "min_height"),
        TRACK_THICKNESS("sd_trackThickness", "track_thickness"),
        PROGRESS_THICKNESS("sd_progressThickness", "progress_thickness"),
        ;

        override fun provide(owner: CircularProgressProperties): Dimension? {
            return when (this) {
                MIN_WIDTH -> owner.width
                MIN_HEIGHT -> owner.height
                TRACK_THICKNESS -> owner.trackThickness
                PROGRESS_THICKNESS -> owner.progressThickness
            }
        }
    }

    private enum class CircularProgressColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CircularProgressProperties> {
        INDICATOR_COLOR("sd_progressColor", "progress_color"),
        TRACK_COLOR("sd_trackColor", "track_color"),
        VALUE_COLOR("sd_progressValueColor", "value_color"),
        VALUE_SUFFIX_COLOR("sd_progressValueSuffixColor", "value_suffix_color"),
        ;

        override fun provide(owner: CircularProgressProperties): Color? {
            return when (this) {
                INDICATOR_COLOR -> owner.indicatorColor
                TRACK_COLOR -> owner.trackColor
                VALUE_COLOR -> owner.valueColor
                VALUE_SUFFIX_COLOR -> owner.valueSuffixColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "CircularProgressBar"
        const val DEF_STYLE_ATTR = "sd_circularProgressBarStyle"
        const val COMPONENT_PARENT = "Sdds.Components.CircularProgressBar"
    }
}
