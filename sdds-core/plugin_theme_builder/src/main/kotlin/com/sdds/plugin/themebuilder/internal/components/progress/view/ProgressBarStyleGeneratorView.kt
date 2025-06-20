package com.sdds.plugin.themebuilder.internal.components.progress.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.progress.ProgressBarProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class ProgressBarStyleGeneratorView(
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
) : ViewVariationGenerator<ProgressBarProperties>(
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
        variationNode: VariationNode<ProgressBarProperties>,
        props: ProgressBarProperties,
    ) = with(styleElement) {
        ProgressBarDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, props)
        ProgressBarColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, props: ProgressBarProperties) {
        props.backgroundShape?.let { shapeAttribute(variation, it.value) }
        props.indicatorShape?.let { shapeAttribute(variation, it.value, attrName = "indicator") }
    }

    private enum class ProgressBarDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<ProgressBarProperties, Float, Dimension> {
        MIN_HEIGHT("android:minHeight", "min_height"),
        MAX_HEIGHT("android:maxHeight", "max_height"),
        BACKGROUND_HEIGHT("sd_trackHeight", "track_height"),
        ;

        override fun provide(owner: ProgressBarProperties): Dimension? {
            return when (this) {
                MIN_HEIGHT,
                MAX_HEIGHT,
                -> owner.indicatorHeight

                BACKGROUND_HEIGHT -> owner.backgroundHeight
            }
        }
    }

    private enum class ProgressBarColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ProgressBarProperties> {
        BACKGROUND_COLOR("backgroundTint", "bg_color"),
        INDICATOR_COLOR("sd_progressColor", "progress_color"),
        ;

        override fun provide(owner: ProgressBarProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                INDICATOR_COLOR -> owner.indicatorColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "ProgressBar"
        const val DEF_STYLE_ATTR = "android:progressBarStyle"
        const val COMPONENT_PARENT = "Sdds.Components.ProgressBar"
    }
}
