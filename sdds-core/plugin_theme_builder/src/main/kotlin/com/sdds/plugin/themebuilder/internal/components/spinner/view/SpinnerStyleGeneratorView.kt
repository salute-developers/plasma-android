package com.sdds.plugin.themebuilder.internal.components.spinner.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Spinner
 */
internal open class SpinnerStyleGeneratorView(
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
) : ViewVariationGenerator<SpinnerProperties>(
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
        variationNode: VariationNode<SpinnerProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        SpinnerDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        SpinnerColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<SpinnerProperties>) {
        val props = variationNode.value.props
        props.angle?.let { valueAttribute("sd_sweepAngle", it.value.toInt().toString()) }
        props.strokeCap?.let { valueAttribute("sd_strokeCap", it.value) }
    }

    private enum class SpinnerDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<SpinnerProperties, Float, Dimension> {
        MIN_WIDTH("android:minWidth", "min_width"),
        MAX_WIDTH("android:maxWidth", "max_width"),
        MIN_HEIGHT("android:minHeight", "min_height"),
        MAX_HEIGHT("android:maxHeight", "max_height"),
        PADDING("android:padding", "padding"),
        STROKE_WIDTH("sd_strokeWidth", "stroke_width"),
        ;

        override fun provide(owner: SpinnerProperties): Dimension? {
            return when (this) {
                MIN_WIDTH,
                MAX_WIDTH,
                MIN_HEIGHT,
                MAX_HEIGHT,
                -> owner.size
                PADDING -> owner.padding
                STROKE_WIDTH -> owner.strokeWidth
            }
        }
    }

    internal enum class SpinnerColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<SpinnerProperties> {
        START_COLOR("sd_startColor", "start_color"),
        END_COLOR("sd_endColor", "end_color"),
        ;

        override fun provide(owner: SpinnerProperties): Color? {
            return when (this) {
                START_COLOR -> owner.startColor
                END_COLOR -> owner.endColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Spinner"
        const val DEF_STYLE_ATTR = "sd_spinnerStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Spinner"
    }
}
