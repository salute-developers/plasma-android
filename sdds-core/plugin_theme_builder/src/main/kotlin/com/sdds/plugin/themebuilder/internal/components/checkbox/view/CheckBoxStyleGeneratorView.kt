package com.sdds.plugin.themebuilder.internal.components.checkbox.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.checkbox.CheckBoxProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента CheckBox
 */
internal open class CheckBoxStyleGeneratorView(
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
) : ViewVariationGenerator<CheckBoxProperties>(
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
        variationNode: VariationNode<CheckBoxProperties>,
    ) = with(styleElement) {
        CheckBoxDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode) {
                if (it.state.contains("indeterminate")) {
                    setOf(StateListAttribute("app:sd_state_indeterminate", "true"))
                } else {
                    emptySet()
                }
            }
        }
        addProps(variation, variationNode)
        CheckBoxColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode) {
                if (it.state.contains("indeterminate")) {
                    setOf(StateListAttribute("app:sd_state_indeterminate", "true"))
                } else {
                    emptySet()
                }
            }
        }
    }

    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<CheckBoxProperties>,
    ) {
        val props = variationNode.value.props
        props.shape?.let { shapeAttribute(variation, it.value) }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.descriptionStyle?.let {
            typographyAttribute(
                "sd_descriptionTextAppearance",
                it.value,
            )
        }
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }

        props.togglePadding?.let {
            dimenAttribute(
                variation,
                "sd_buttonPadding",
                "button_padding",
                it.value,
            )
        }
        props.textPadding?.let {
            dimenAttribute(
                variation,
                "android:drawablePadding",
                "drawable_padding",
                it.value,
            )
        }
        props.descriptionPadding?.let {
            dimenAttribute(
                variation,
                "sd_descriptionPadding",
                "description_padding",
                it.value,
            )
        }

        props.toggleWidth?.let {
            dimenAttribute(
                variation,
                "sd_toggleWidth",
                "toggle_width",
                it.value,
            )
        }
        props.toggleHeight?.let {
            dimenAttribute(
                variation,
                "sd_toggleHeight",
                "toggle_height",
                it.value,
            )
        }
    }

    private fun Element.addColorProperties(
        colorProperty: CheckBoxColorProperty,
        variation: String,
        variationNode: VariationNode<CheckBoxProperties>,
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

    private enum class CheckBoxDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<CheckBoxProperties, Float, Dimension> {
        TOGGLE_BORDER_WIDTH("sd_toggleBorderWidth", "toggle_border_width"),
        TOGGLE_BORDER_OFFSET("sd_toggleBorderOffset", "toggle_border_offset"),
        TOGGLE_ICON_WIDTH("sd_toggleIconWidth", "toggle_icon_width"),
        TOGGLE_ICON_HEIGHT("sd_toggleIconHeight", "toggle_icon_height"),
        ;

        override fun provide(owner: CheckBoxProperties): Dimension? {
            return when (this) {
                TOGGLE_BORDER_WIDTH -> owner.toggleBorderWidth
                TOGGLE_BORDER_OFFSET -> owner.toggleBorderOffset
                TOGGLE_ICON_WIDTH -> owner.toggleIconWidth
                TOGGLE_ICON_HEIGHT -> owner.toggleIconHeight
            }
        }
    }

    internal enum class CheckBoxColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CheckBoxProperties> {
        LABEL_COLOR("android:textColor", "text_color"),
        DESCRIPTION_COLOR("sd_descriptionTextColor", "description_text_color"),
        TOGGLE_BORDER_COLOR("sd_buttonBorderColor", "button_border_color"),
        TOGGLE_COLOR("sd_buttonBoxColor", "button_box_color"),
        TOGGLE_ICON_COLOR("sd_buttonMarkColor", "button_mark_color"),
        ;

        override fun provide(owner: CheckBoxProperties): Color? {
            return when (this) {
                LABEL_COLOR -> owner.labelColor
                DESCRIPTION_COLOR -> owner.descriptionColor
                TOGGLE_ICON_COLOR -> owner.toggleIconColor
                TOGGLE_BORDER_COLOR -> owner.toggleBorderColor
                TOGGLE_COLOR -> owner.toggleColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "CheckBox"
        const val DEF_STYLE_ATTR = "android:checkboxStyle"
        const val COMPONENT_PARENT = "Sdds.Components.CheckBox"
    }
}
