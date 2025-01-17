package com.sdds.plugin.themebuilder.internal.components.button.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Button
 * @author Малышев Александр on 05.12.2024
 */
internal abstract class BaseButtonStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String,
    styleComponentName: String = coreComponentName,
    componentParent: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String,
) : ViewVariationGenerator<ButtonProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    styleComponentName = styleComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {

    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<ButtonProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        ButtonColorProperty.values().forEach {
            addColorProperties(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<ButtonProperties>) {
        val props = variationNode.value.props

        props.height?.let { dimenAttribute(variation, "android:minHeight", "min_height", it.value) }
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }
        props.minWidth?.let { dimenAttribute(variation, "android:minWidth", "min_width", it.value) }
        props.paddingStart?.let { dimenAttribute(variation, "android:paddingStart", "padding_start", it.value) }
        props.paddingEnd?.let { dimenAttribute(variation, "android:paddingEnd", "padding_end", it.value) }
        props.iconSize?.let { dimenAttribute(variation, "sd_iconSize", "icon_size", it.value) }
        props.spinnerSize?.let { dimenAttribute(variation, "sd_spinnerSize", "spinner_size", it.value) }
        props.spinnerStrokeWidth?.let {
            dimenAttribute(
                variation,
                "sd_spinnerStrokeWidth",
                "spinner_stroke_width",
                it.value,
            )
        }
        props.iconMargin?.let {
            dimenAttribute(variation, "sd_iconPadding", "icon_padding", it.value)
        }
        props.valueMargin?.let {
            dimenAttribute(variation, "sd_valuePadding", "value_padding", it.value)
        }
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
    }

    protected fun Element.addColorProperties(
        colorProperty: ButtonColorProperty,
        variation: String,
        variationNode: VariationNode<ButtonProperties>,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        val loadingColorProperty = colorProperty.getLoadingColor()
        val loadingColorValue = loadingColorProperty?.let { getColorProperty(it, variationNode) }

        // Если для colorProperty применим loadingAlpha, но значение не задано во view вариации
        // Попробуем найти loadingAlpha в props
        val loadingAlpha = if (loadingColorProperty != null && loadingColorValue == null) {
            (getProperty(variationNode) { it.loadingAlpha })?.value?.value
        } else {
            null
        }

        if (colorValue.isNullOrInherited) {
            return
        }

        when (loadingColorValue) {
            is ColorValue.SimpleValue -> {
                addToStateList(
                    colorProperty,
                    loadingColorValue.color,
                    variation,
                    extraAttrs = LoadingAttrs,
                )
            }

            is ColorValue.ViewValue -> loadingColorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(
                    colorProperty,
                    color,
                    variation,
                    colorStateName,
                    LoadingAttrs,
                )
            }
        }

        when (colorValue) {
            is ColorValue.SimpleValue -> {
                if (loadingAlpha != null) {
                    addToStateList(
                        colorProperty,
                        colorValue.color.copy(alpha = loadingAlpha),
                        variation,
                        extraAttrs = LoadingAttrs,
                    )
                }
                addToStateList(colorProperty, colorValue.color, variation)
            }

            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                if (loadingAlpha != null) {
                    addToStateList(
                        colorProperty,
                        color.copy(alpha = loadingAlpha),
                        variation,
                        colorStateName,
                        LoadingAttrs,
                    )
                }
                addToStateList(colorProperty, color, variation, colorStateName)
            }
        }

        colorAttribute(colorProperty, variation)
    }

    private fun ButtonColorProperty.getLoadingColor(): ButtonLoadingColorProperty? {
        return when (this) {
            ButtonColorProperty.TEXT_COLOR -> ButtonLoadingColorProperty.TEXT_COLOR
            ButtonColorProperty.VALUE_COLOR -> ButtonLoadingColorProperty.VALUE_COLOR
            ButtonColorProperty.ICON_COLOR -> ButtonLoadingColorProperty.ICON_COLOR
            else -> null
        }
    }

    internal enum class ButtonColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ButtonProperties> {
        BACKGROUND_COLOR("backgroundTint", "bg_color"),
        TEXT_COLOR("android:textColor", "text_color"),
        VALUE_COLOR("sd_valueTextColor", "value_color"),
        SPINNER_COLOR("sd_spinnerTint", "spinner_tint"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        ;

        override fun provide(owner: ButtonProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                TEXT_COLOR -> owner.labelColor
                VALUE_COLOR -> owner.valueColor
                SPINNER_COLOR -> owner.spinnerColor
                ICON_COLOR -> owner.iconColor
            }
        }
    }

    internal enum class ButtonLoadingColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ButtonProperties> {
        TEXT_COLOR("android:textColor", "text_color"),
        VALUE_COLOR("sd_valueTextColor", "value_color"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        ;

        override fun provide(owner: ButtonProperties): Color? {
            val loadingAlpha = owner.loadingAlpha?.value
            val color = when (this) {
                TEXT_COLOR -> owner.labelColor
                VALUE_COLOR -> owner.valueColor
                ICON_COLOR -> owner.iconColor
            }
            return loadingAlpha?.let { color?.copy(alpha = loadingAlpha) }
        }
    }

    private companion object {
        val LoadingAttrs = setOf(StateListAttribute("app:sd_state_loading", "true"))
    }
}
