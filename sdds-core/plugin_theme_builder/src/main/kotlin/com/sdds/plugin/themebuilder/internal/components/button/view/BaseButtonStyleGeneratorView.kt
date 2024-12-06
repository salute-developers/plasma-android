package com.sdds.plugin.themebuilder.internal.components.button.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.view.AndroidState.Companion.asAndroidStates
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorStateAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.toStateListAttribute
import com.sdds.plugin.themebuilder.internal.components.button.ButtonComponentConfig
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized
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
) : ViewComponentStyleGenerator<ButtonComponentConfig>(
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
    private val colorStateAttrs = mutableMapOf<String, ColorStateAttribute>()

    protected fun XmlResourcesDocumentBuilder.addColor(
        base: String,
        variation: String,
    ) {
        val variationEnumValue = colorStateAttrs[variation]?.enum ?: return
        variationStyle("$base.${variation.capitalized()}", true) {
            colorStateAttribute(variationEnumValue)
        }
    }

    override fun registerColorState(name: String): ColorStateAttribute {
        return super.registerColorState(name).also {
            colorStateAttrs[name] = it
        }
    }

    protected fun ButtonComponentConfig.Color?.addToStateList(
        property: ColorProperty,
        colorStateAttribute: ColorStateAttribute,
        loadingAlpha: Float? = null,
    ) {
        if (this == null || this.states.isNullOrEmpty()) return
        val loadingAttr = loadingAlpha?.let { StateListAttribute("app:sd_state_loading", "true") }
        val colorStateListAttribute = colorStateAttribute.toStateListAttribute()
        addToStateList(property) {
            addColor(default, states = setOf(colorStateListAttribute))
            if (loadingAttr != null) {
                addColor(default, states = setOf(colorStateListAttribute, loadingAttr), alpha = loadingAlpha)
            }
            states.forEach { colorState ->
                addColor(
                    colorState.value,
                    setOf(colorStateListAttribute) + colorState.state.asAndroidStates()
                        .map { it.toStateListAttribute(true) },
                )
                if (loadingAttr != null) {
                    addColor(
                        default,
                        states = setOf(colorStateListAttribute, loadingAttr),
                        alpha = loadingAlpha,
                    )
                }
            }
        }
    }

    internal enum class ButtonColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ColorProperty {
        BACKGROUND_COLOR("backgroundTint", "bg_color"),
        TEXT_COLOR("android:textColor", "text_color"),
        VALUE_COLOR("sd_valueTextColor", "value_color"),
        SPINNER_COLOR("sd_spinnerTint", "spinner_tint"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
    }
}
