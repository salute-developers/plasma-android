package com.sdds.plugin.themebuilder.internal.components.counter.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Counter
 */
internal open class CounterStyleGeneratorView(
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
) : ViewVariationGenerator<CounterProperties>(
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
        variationNode: VariationNode<CounterProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        CounterColorProperty.values().forEach {
            addColorProperties(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<CounterProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value) }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.minHeight?.let { dimenAttribute(variation, "android:minHeight", "min_height", it.value) }
        props.minWidth?.let { dimenAttribute(variation, "android:minWidth", "min_width", it.value) }
        props.paddingLeft?.let { dimenAttribute(variation, "android:paddingLeft", "padding_left", it.value) }
        props.paddingRight?.let { dimenAttribute(variation, "android:paddingRight", "padding_right", it.value) }
    }

    private fun Element.addColorProperties(
        colorProperty: CounterColorProperty,
        variation: String,
        variationNode: VariationNode<CounterProperties>,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        if (colorValue.isNullOrInherited) {
            return
        }

        when (colorValue) {
            is ColorValue.SimpleValue -> addToStateList(colorProperty, colorValue.color, variation)
            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(colorProperty, color, variation, colorStateName)
            }
            else -> Unit
        }

        colorAttribute(colorProperty, variation)
    }

    internal enum class CounterColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CounterProperties> {
        BACKGROUND_COLOR("android:backgroundTint", "bg_color"),
        TEXT_COLOR("android:textColor", "text_color"),
        ;

        override fun provide(owner: CounterProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                TEXT_COLOR -> owner.textColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Counter"
        const val DEF_STYLE_ATTR = "sd_counterStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Counter"
    }
}
