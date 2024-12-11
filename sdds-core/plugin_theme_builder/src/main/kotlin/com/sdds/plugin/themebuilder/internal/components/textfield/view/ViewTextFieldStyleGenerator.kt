package com.sdds.plugin.themebuilder.internal.components.textfield.view

import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.view.AndroidState.Companion.asAndroidStates
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorStateAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.toStateListAttribute
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 *
 * @author Малышев Александр on 10.12.2024
 */
internal class ViewTextFieldStyleGenerator(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
) : ViewVariationGenerator<TextFieldProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = CORE_COMPONENT_NAME,
    componentParent = COMPONENT_PARENT,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = DEF_STYLE_ATTR,
) {
    override fun onCreateStyle(variation: String, styleElement: Element, props: TextFieldProperties): Unit =
        with(styleElement) {
            props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }

            props.boxPaddingStart?.let {
                dimenAttribute(
                    variation,
                    "sd_boxPaddingStart",
                    "box_padding_start",
                    it.value
                )
            }
            props.boxPaddingEnd?.let { dimenAttribute(variation, "sd_boxPaddingEnd", "", it.value) }
            props.boxPaddingTop?.let { dimenAttribute(variation, "sd_boxPaddingTop", "", it.value) }
            props.boxPaddingBottom?.let { dimenAttribute(variation, "sd_boxPaddingBottom", "", it.value) }
            props.labelPadding?.let { dimenAttribute(variation, "sd_labelPadding", "", it.value) }
            // props.optionalPadding?.let { dimenAttribute(variation, "", "", it.value) }
            props.helperTextPadding?.let { dimenAttribute(variation, "sd_helperTextPadding", "", it.value) }
            props.startContentEndPadding?.let { dimenAttribute(variation, "sd_iconPadding", "", it.value) }
            props.endContentStartPadding?.let { dimenAttribute(variation, "sd_actionPadding", "", it.value) }
            props.chipsPadding?.let { dimenAttribute(variation, "sd_chipsPadding", "", it.value) }
            props.boxMinHeight?.let { dimenAttribute(variation, "sd_boxMinHeight", "", it.value) }
            props.alignmentMinHeight?.let { dimenAttribute(variation, "sd_alignmentLineHeight", "", it.value) }
            props.startContentSize?.let { dimenAttribute(variation, "sd_iconSize", "", it.value) }
            props.endContentSize?.let { dimenAttribute(variation, "sd_actionSize", "", it.value) }
            props.indicatorSize?.let { dimenAttribute(variation, "sd_indicatorSize", "", it.value) }
            props.indicatorOffsetX?.let { dimenAttribute(variation, "sd_indicatorOffsetX", "", it.value) }
            props.indicatorOffsetY?.let { dimenAttribute(variation, "sd_indicatorOffsetY", "", it.value) }

            props.labelStyle?.let { typographyAttribute("sd_labelAppearance", it.value) }
            props.valueStyle?.let { typographyAttribute("sd_valueAppearance", it.value) }
            props.captionStyle?.let { typographyAttribute("sd_captionAppearance", it.value) }
            props.counterStyle?.let { typographyAttribute("sd_captionAppearance", it.value) }
            props.placeholderStyle?.let { typographyAttribute("sd_captionAppearance", it.value) }

            props.valueColor?.addToStateList(TextFieldColorProp.VALUE)
            props.valueColorReadOnly?.addToStateList(TextFieldColorProp.VALUE, readOnly = true)
            props.labelColor?.addToStateList(TextFieldColorProp.LABEL)
            props.labelColorReadOnly?.addToStateList(TextFieldColorProp.LABEL, readOnly = true)
            props.captionColor?.addToStateList(TextFieldColorProp.CAPTION)
            props.captionColorReadOnly?.addToStateList(TextFieldColorProp.CAPTION, readOnly = true)
            props.counterColor?.addToStateList(TextFieldColorProp.COUNTER)
            props.placeholderColor?.addToStateList(TextFieldColorProp.PLACEHOLDER)
            props.startContentColor?.addToStateList(TextFieldColorProp.START_CONTENT)
            props.endContentColor?.addToStateList(TextFieldColorProp.END_CONTENT)
            props.backgroundColor?.addToStateList(TextFieldColorProp.BACKGROUND)
            props.backgroundColorReadOnly?.addToStateList(TextFieldColorProp.BACKGROUND, readOnly = true)
            props.indicatorColor?.addToStateList(TextFieldColorProp.INDICATOR)
        }

    override fun onCreateColorState(props: TextFieldProperties, colorStateAttribute: ColorStateAttribute) {
        props.valueColor?.addToStateList(TextFieldColorProp.VALUE, colorStateAttribute)
        props.valueColorReadOnly?.addToStateList(TextFieldColorProp.VALUE, colorStateAttribute, true)
        props.labelColor?.addToStateList(TextFieldColorProp.LABEL, colorStateAttribute)
        props.labelColorReadOnly?.addToStateList(TextFieldColorProp.LABEL, colorStateAttribute, true)
        props.captionColor?.addToStateList(TextFieldColorProp.CAPTION, colorStateAttribute)
        props.captionColorReadOnly?.addToStateList(TextFieldColorProp.CAPTION, colorStateAttribute, true)
        props.counterColor?.addToStateList(TextFieldColorProp.COUNTER, colorStateAttribute)
        props.placeholderColor?.addToStateList(TextFieldColorProp.PLACEHOLDER, colorStateAttribute)
        props.startContentColor?.addToStateList(TextFieldColorProp.START_CONTENT, colorStateAttribute)
        props.endContentColor?.addToStateList(TextFieldColorProp.END_CONTENT, colorStateAttribute)
        props.backgroundColor?.addToStateList(TextFieldColorProp.BACKGROUND, colorStateAttribute)
        props.backgroundColorReadOnly?.addToStateList(
            TextFieldColorProp.BACKGROUND,
            colorStateAttribute,
            readOnly = true
        )
        props.indicatorColor?.addToStateList(TextFieldColorProp.INDICATOR, colorStateAttribute)
    }

    override fun onOverrideColorState(
        variationName: String,
        props: TextFieldProperties,
        colorStateAttribute: ColorStateAttribute
    ) {
        props.valueColor?.overrideInStateList(variationName, TextFieldColorProp.VALUE, colorStateAttribute)
        props.valueColorReadOnly?.overrideInStateList(
            variationName,
            TextFieldColorProp.VALUE,
            colorStateAttribute,
            true
        )
        props.labelColor?.overrideInStateList(variationName, TextFieldColorProp.LABEL, colorStateAttribute)
        props.labelColorReadOnly?.overrideInStateList(
            variationName,
            TextFieldColorProp.LABEL,
            colorStateAttribute,
            true
        )
        props.captionColor?.overrideInStateList(variationName, TextFieldColorProp.CAPTION, colorStateAttribute)
        props.captionColorReadOnly?.overrideInStateList(
            variationName,
            TextFieldColorProp.CAPTION,
            colorStateAttribute,
            true
        )
        props.counterColor?.overrideInStateList(variationName, TextFieldColorProp.COUNTER, colorStateAttribute)
        props.placeholderColor?.overrideInStateList(variationName, TextFieldColorProp.PLACEHOLDER, colorStateAttribute)
        props.startContentColor?.overrideInStateList(
            variationName,
            TextFieldColorProp.START_CONTENT,
            colorStateAttribute
        )
        props.endContentColor?.overrideInStateList(variationName, TextFieldColorProp.END_CONTENT, colorStateAttribute)
        props.backgroundColor?.overrideInStateList(variationName, TextFieldColorProp.BACKGROUND, colorStateAttribute)
        props.backgroundColorReadOnly?.overrideInStateList(
            variationName,
            TextFieldColorProp.BACKGROUND,
            colorStateAttribute,
            readOnly = true
        )
        props.indicatorColor?.overrideInStateList(variationName, TextFieldColorProp.INDICATOR, colorStateAttribute)
    }

    private fun Element.colorProperty(prop: TextFieldColorProp, color: Color?) {
        if (color == null || !color.states.isNullOrEmpty()) return

        colorRefAttribute(prop.attribute, color.default)
    }

    private fun Color.addToStateList(
        prop: TextFieldColorProp,
        colorStateAttribute: ColorStateAttribute? = null,
        readOnly: Boolean = false
    ) {
        if (states.isNullOrEmpty()) return
        addToStateList(prop) {
            val colorStateAttr = colorStateAttribute?.toStateListAttribute()
            val readOnlyAttr = if (readOnly) StateListAttribute("sd_state_readonly", "true") else null
            addColor(default, setOfNotNull(colorStateAttr, readOnlyAttr))
            states.forEach { colorState ->
                val androidStateAttrs = colorState.state.asAndroidStates()
                    .map { it.toStateListAttribute() }
                addColor(colorState.value, setOfNotNull(colorStateAttr, readOnlyAttr) + androidStateAttrs)
            }
        }
    }

    private fun Color.overrideInStateList(
        variation: String,
        prop: TextFieldColorProp,
        colorStateAttribute: ColorStateAttribute,
        readOnly: Boolean = false
    ) {
        overrideInStateList(variation, prop) {
            val colorStateAttr = colorStateAttribute.toStateListAttribute()
            val readOnlyAttr = if (readOnly) StateListAttribute("sd_state_readonly", "true") else null
            addColor(default, setOfNotNull(colorStateAttr, readOnlyAttr))
            states?.forEach { colorState ->
                val androidStateAttrs = colorState.state.asAndroidStates()
                    .map { it.toStateListAttribute() }
                addColor(colorState.value, setOfNotNull(colorStateAttr, readOnlyAttr) + androidStateAttrs)
            }
        }
    }

    private enum class TextFieldColorProp(
        override val attribute: String,
        override val colorFileSuffix: String
    ) : ColorProperty {
        VALUE("", "value_color"),
        LABEL("", "label_color"),
        CAPTION("", "caption_color"),
        START_CONTENT("", "icon_color"),
        END_CONTENT("", "action_color"),
        COUNTER("", "counter_color"),
        PLACEHOLDER("", "placeholder_color"),
        BACKGROUND("", "bg_color"),
        INDICATOR("", "indicator_color"),
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "TextField"
        const val DEF_STYLE_ATTR = "sd_textFieldStyle"
        const val COMPONENT_PARENT = "Sdds.Components.TextField"
    }
}