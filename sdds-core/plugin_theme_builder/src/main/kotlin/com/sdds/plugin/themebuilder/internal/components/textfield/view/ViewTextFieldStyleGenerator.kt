package com.sdds.plugin.themebuilder.internal.components.textfield.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.AndroidState
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseName
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Генератор стилей для компонента TextField для ViewSystem
 * @author Малышев Александр on 10.12.2024
 */
internal open class ViewTextFieldStyleGenerator(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<TextFieldProperties>(
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
        variationNode: VariationNode<TextFieldProperties>,
    ) =
        with(styleElement) {
            addProps(variation, variationNode)
            addChipStyle(rootDocument, variationNode)
            TextFieldColorProp.values().forEach {
                addColorProperties(it, variation, variationNode)
            }
        }

    @Suppress("CyclomaticComplexMethod", "LongMethod")
    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<TextFieldProperties>,
    ) {
        val props = variationNode.value.props
        props.fieldType?.let { valueAttribute("sd_requirementMode", it.asRequirementModeEnum()) }
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }

        props.labelPlacement?.let { valueAttribute("sd_labelPlacement", it.value) }
        props.counterPlacement?.let { valueAttribute("sd_counterPlacement", it.value) }
        props.captionPlacement?.let { valueAttribute("sd_captionPlacement", it.value) }

        props.boxPaddingStart?.let {
            dimenAttribute(
                variation,
                "sd_boxPaddingStart",
                "box_padding_start",
                it.value,
            )
        }
        props.boxPaddingEnd?.let { dimenAttribute(variation, "sd_boxPaddingEnd", "box_padding_end", it.value) }
        props.boxPaddingTop?.let { dimenAttribute(variation, "sd_boxPaddingTop", "box_padding_top", it.value) }
        props.boxPaddingBottom?.let {
            dimenAttribute(
                variation,
                "sd_boxPaddingBottom",
                "box_padding_bottom",
                it.value,
            )
        }
        props.labelPadding?.let { dimenAttribute(variation, "sd_labelPadding", "label_padding", it.value) }
        props.helperTextPadding?.let {
            dimenAttribute(
                variation,
                "sd_helperTextPadding",
                "helper_padding",
                it.value,
            )
        }
        props.startContentPadding?.let { dimenAttribute(variation, "sd_iconPadding", "icon_padding", it.value) }
        props.endContentPadding?.let {
            dimenAttribute(
                variation,
                "sd_actionPadding",
                "action_padding",
                it.value,
            )
        }
        props.chipsPadding?.let { dimenAttribute(variation, "sd_chipsPadding", "chips_padding", it.value) }
        props.boxMinHeight?.let { dimenAttribute(variation, "sd_boxMinHeight", "box_min_height", it.value) }
        props.alignmentMinHeight?.let {
            dimenAttribute(
                variation,
                "sd_alignmentLineHeight",
                "alignment_height",
                it.value,
            )
        }
        props.startContentSize?.let { dimenAttribute(variation, "sd_iconSize", "icon_size", it.value) }
        props.endContentSize?.let { dimenAttribute(variation, "sd_actionSize", "action_size", it.value) }
        props.indicatorSize?.let { dimenAttribute(variation, "sd_indicatorSize", "indicator_size", it.value) }
        props.indicatorOffsetX?.let {
            dimenAttribute(
                variation,
                "sd_indicatorOffsetX",
                "indicator_offset_x",
                it.value,
            )
        }
        props.indicatorOffsetY?.let {
            dimenAttribute(
                variation,
                "sd_indicatorOffsetY",
                "indicator_offset_y",
                it.value,
            )
        }

        props.labelStyle?.let { typographyAttribute("sd_labelAppearance", it.value) }
        props.valueStyle?.let { typographyAttribute("sd_valueAppearance", it.value) }
        props.captionStyle?.let { typographyAttribute("sd_captionAppearance", it.value) }
        props.counterStyle?.let { typographyAttribute("sd_counterAppearance", it.value) }
        props.placeholderStyle?.let { typographyAttribute("sd_placeholderAppearance", it.value) }
        props.prefixPadding?.let { dimenAttribute(variation, "sd_prefixTextPadding", "prefix_padding", it.value) }
        props.suffixPadding?.let { dimenAttribute(variation, "sd_suffixTextPadding", "suffix_padding", it.value) }
    }

    private fun Element.addChipStyle(
        rootDocument: XmlResourcesDocumentBuilder,
        variationNode: VariationNode<TextFieldProperties>,
    ) {
        val chipGroupStyle = getProperty(variationNode) { it.chipGroupStyle }
        if (chipGroupStyle.isNullOrInherited) {
            return
        }
        val overlayStyleName = buildString {
            append(variationNode.camelCaseName(""))
            append("Chips")
        }
        componentOverlayAttribute(
            "sd_chipGroupStyleOverlay",
            "$CORE_COMPONENT_NAME$overlayStyleName",
        )

        // Добавляем overlay стиль для чипов
        rootDocument.overlayStyle(overlayStyleName) {
            chipGroupStyle?.value?.let {
                componentStyleAttribute(
                    "sd_chipGroupStyle",
                    it.camelCaseValue(),
                )
            }
        }
    }

    private fun Element.addColorProperties(
        colorProperty: TextFieldColorProp,
        variation: String,
        variationNode: VariationNode<TextFieldProperties>,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        val readonlyValue = colorProperty.getReadOnly()?.let { getColorProperty(it, variationNode) }

        if (colorValue.isNullOrInherited && readonlyValue.isNullOrInherited) {
            return
        }

        when (readonlyValue) {
            is ColorValue.SimpleValue ->
                addToStateList(colorProperty, readonlyValue.color, variation, extraAttrs = ReadOnlyAttrs)

            is ColorValue.ViewValue -> readonlyValue.colors.forEach { (colorStateName, color) ->
                addToStateList(colorProperty, color, variation, colorStateName, ReadOnlyAttrs)
            }
            else -> Unit
        }

        when (colorValue) {
            is ColorValue.SimpleValue ->
                addToStateList(colorProperty, colorValue.color, variation)

            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(colorProperty, color, variation, colorStateName)
            }
            else -> Unit
        }

        colorAttribute(colorProperty, variation)
    }

    override fun addToStateList(
        property: ColorProperty,
        color: Color,
        variation: String?,
        colorStateName: String?,
        extraAttrs: Set<StateListAttribute>,
        extraStateAttrsBuilder: ((ColorState) -> Set<StateListAttribute>)?,
    ) {
        super.addToStateList(property, color, variation, colorStateName, extraAttrs) {
            // Состояния FOCUSED должно иметь эффект только, если ACTIVATED = false
            if (it.state.contains(AndroidState.FOCUSED.key)) {
                setOf(AndroidState.ACTIVATED.toStateListAttribute(false))
            } else {
                emptySet()
            }
        }
    }

    private fun Value.asRequirementModeEnum(): String =
        when (this.value) {
            "requiredStart" -> "start"
            "requiredEnd" -> "end"
            else -> "optional"
        }

    private fun TextFieldColorProp.getReadOnly(): TextFieldReadOnlyColorProps? =
        when (this) {
            TextFieldColorProp.VALUE -> TextFieldReadOnlyColorProps.VALUE_READ_ONLY
            TextFieldColorProp.LABEL -> TextFieldReadOnlyColorProps.LABEL_READ_ONLY
            TextFieldColorProp.CAPTION -> TextFieldReadOnlyColorProps.CAPTION_READ_ONLY
            TextFieldColorProp.PLACEHOLDER -> TextFieldReadOnlyColorProps.PLACEHOLDER_READ_ONLY
            TextFieldColorProp.BACKGROUND -> TextFieldReadOnlyColorProps.BACKGROUND_READ_ONLY
            TextFieldColorProp.START_CONTENT -> TextFieldReadOnlyColorProps.START_CONTENT_READ_ONLY
            TextFieldColorProp.END_CONTENT -> TextFieldReadOnlyColorProps.END_CONTENT_READ_ONLY
            TextFieldColorProp.COUNTER -> TextFieldReadOnlyColorProps.COUNTER_READ_ONLY
            TextFieldColorProp.SCROLL_TRACK -> TextFieldReadOnlyColorProps.SCROLL_TRACK_READ_ONLY
            TextFieldColorProp.SCROLL_THUMB -> TextFieldReadOnlyColorProps.SCROLL_THUMB_READ_ONLY
        }

    private enum class TextFieldReadOnlyColorProps(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<TextFieldProperties> {
        VALUE_READ_ONLY("sd_valueColor", "value_color"),
        LABEL_READ_ONLY("sd_labelColor", "label_color"),
        CAPTION_READ_ONLY("sd_captionColor", "caption_color"),
        START_CONTENT_READ_ONLY("sd_iconTint", "icon_color"),
        END_CONTENT_READ_ONLY("sd_actionTint", "action_color"),
        COUNTER_READ_ONLY("sd_counterColor", "counter_color"),
        PLACEHOLDER_READ_ONLY("sd_placeholderColor", "placeholder_color"),
        BACKGROUND_READ_ONLY("sd_boxTint", "bg_color"),
        SCROLL_TRACK_READ_ONLY("sd_scrollBarTrackColor", "scroll_track_color"),
        SCROLL_THUMB_READ_ONLY("sd_scrollBarThumbColor", "scroll_thumb_color"),
        ;

        override fun provide(owner: TextFieldProperties): Color? {
            return when (this) {
                LABEL_READ_ONLY -> owner.labelColorReadOnly
                VALUE_READ_ONLY -> owner.valueColorReadOnly
                CAPTION_READ_ONLY -> owner.captionColorReadOnly
                PLACEHOLDER_READ_ONLY -> owner.placeholderColorReadOnly
                BACKGROUND_READ_ONLY -> owner.backgroundColorReadOnly
                START_CONTENT_READ_ONLY -> owner.startContentColorReadOnly
                END_CONTENT_READ_ONLY -> owner.endContentColorReadOnly
                COUNTER_READ_ONLY -> owner.counterColorReadOnly
                SCROLL_TRACK_READ_ONLY -> owner.scrollBarTrackColorReadOnly
                SCROLL_THUMB_READ_ONLY -> owner.scrollBarThumbColorReadOnly
            }
        }
    }

    private enum class TextFieldColorProp(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<TextFieldProperties> {
        VALUE("sd_valueColor", "value_color"),
        LABEL("sd_labelColor", "label_color"),
        CAPTION("sd_captionColor", "caption_color"),
        START_CONTENT("sd_iconTint", "icon_color"),
        END_CONTENT("sd_actionTint", "action_color"),
        COUNTER("sd_counterColor", "counter_color"),
        PLACEHOLDER("sd_placeholderColor", "placeholder_color"),
        BACKGROUND("sd_boxTint", "bg_color"),
        SCROLL_TRACK("sd_scrollBarTrackColor", "scroll_track_color"),
        SCROLL_THUMB("sd_scrollBarThumbColor", "scroll_thumb_color"),
        ;

        override fun provide(owner: TextFieldProperties): Color? {
            return when (this) {
                VALUE -> owner.valueColor
                LABEL -> owner.labelColor
                CAPTION -> owner.captionColor
                START_CONTENT -> owner.startContentColor
                END_CONTENT -> owner.endContentColor
                COUNTER -> owner.counterColor
                PLACEHOLDER -> owner.placeholderColor
                BACKGROUND -> owner.backgroundColor
                SCROLL_TRACK -> owner.scrollBarTrackColor
                SCROLL_THUMB -> owner.scrollBarThumbColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "TextField"
        const val DEF_STYLE_ATTR = "sd_textFieldStyle"
        const val COMPONENT_PARENT = "Sdds.Components.TextField"
        val ReadOnlyAttrs = setOf(StateListAttribute("app:sd_state_readonly", "true"))
    }
}
