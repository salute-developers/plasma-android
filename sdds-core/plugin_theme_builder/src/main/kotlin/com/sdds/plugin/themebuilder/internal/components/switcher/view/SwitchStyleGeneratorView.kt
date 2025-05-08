package com.sdds.plugin.themebuilder.internal.components.switcher.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.switcher.SwitchProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Switch
 */
internal open class SwitchStyleGeneratorView(
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
) : ViewVariationGenerator<SwitchProperties>(
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
        variationNode: VariationNode<SwitchProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        SwitchColorProperty.values().forEach { checkBoxColorProperty ->
            addColorProperty(checkBoxColorProperty, variation, variationNode)
        }
    }

    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<SwitchProperties>,
    ) {
        val props = variationNode.value.props
        props.toggleTrackShape?.let { shapeAttribute(variation, it.value) }
        props.toggleThumbShape?.let { shapeAttribute(variation, it.value, attrName = "thumb") }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.descriptionStyle?.let {
            typographyAttribute(
                "sd_descriptionTextAppearance",
                it.value,
            )
        }
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }

        props.togglePadding?.let {
            dimenAttribute(variation, "sd_buttonPadding", "button_padding", it.value)
        }
        props.textPadding?.let {
            dimenAttribute(variation, "android:drawablePadding", "drawable_padding", it.value)
        }
        props.descriptionPadding?.let {
            dimenAttribute(variation, "sd_descriptionPadding", "description_padding", it.value)
        }
        props.toggleTrackWidth?.let {
            dimenAttribute(variation, "sd_switchWidth", "switch_width", it.value)
        }
        props.toggleTrackHeight?.let {
            dimenAttribute(variation, "sd_switchHeight", "switch_height", it.value)
        }
        props.toggleThumbWidth?.let {
            dimenAttribute(variation, "sd_thumbWidth", "thumb_width", it.value)
        }
        props.toggleThumbHeight?.let {
            dimenAttribute(variation, "sd_thumbHeight", "thumb_height", it.value)
        }
    }

    internal enum class SwitchColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<SwitchProperties> {
        LABEL_COLOR("android:textColor", "text_color"),
        DESCRIPTION_COLOR("sd_descriptionTextColor", "description_text_color"),
        TOGGLE_TRACK_COLOR("sd_buttonTrackColor", "button_track_color"),
        TOGGLE_TRACK_BORDER_COLOR("sd_buttonTrackBorderColor", "button_track_border_color"),
        TOGGLE_THUMB_COLOR("sd_buttonThumbColor", "button_thumb_color"),
        ;

        override fun provide(owner: SwitchProperties): Color? {
            return when (this) {
                LABEL_COLOR -> owner.labelColor
                DESCRIPTION_COLOR -> owner.descriptionColor
                TOGGLE_TRACK_COLOR -> owner.toggleTrackColor
                TOGGLE_TRACK_BORDER_COLOR -> owner.toggleTrackBorderColor
                TOGGLE_THUMB_COLOR -> owner.toggleThumbColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Switch"
        const val DEF_STYLE_ATTR = "sd_switchStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Switch"
    }
}
