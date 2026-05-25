package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.utils.decapitalized

internal class ColorPropertyMapper(
    stateEnum: StateEnum?,
    private val themeClassName: String,
) : PropertyMapper<String, ColorPropertyMeta, ColorState, Color>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Color,
        meta: ColorPropertyMeta,
        resSuffix: String,
    ): String {
        val alphaString = when (token) {
            is Gradient -> token.alpha?.let { ".asLayered(${it}f)" } ?: ".asLayered()"
            is SolidColor -> token.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        }
        val tokenGroup = when (token) {
            is Gradient -> "gradients"
            is SolidColor -> "colors"
        }

        val tokenValue = value.toCamelCase().decapitalized()
        val tokenRef = "$themeClassName.$tokenGroup.$tokenValue"
        val wrappedTokenRef = if (token is SolidColor) {
            "SolidColor($tokenRef)"
        } else {
            tokenRef
        }
        val colorValue = "$wrappedTokenRef$alphaString"
        return colorValue
    }

    override fun getStateTokenRef(
        value: String,
        state: ColorState,
        token: Color,
        meta: ColorPropertyMeta,
        resSuffix: String,
    ): String {
        val alphaString = when (state.type) {
            "gradient" -> token.alpha?.let { ".asLayered(${it}f)" } ?: ".asLayered()"
            "color" -> token.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
            else -> throw ThemeBuilderException("Unknown gradient or color type ${state.type}")
        }
        val tokenGroup = when (state.type) {
            "gradient" -> "gradients"
            "color" -> "colors"
            else -> throw ThemeBuilderException("Unknown gradient or color type ${state.type}")
        }

        val tokenValue = value.toCamelCase().decapitalized()
        val tokenRef = "$themeClassName.$tokenGroup.$tokenValue"
        val wrappedTokenRef = if (state.type == "color") {
            "SolidColor($tokenRef)"
        } else {
            tokenRef
        }
        val colorValue = "$wrappedTokenRef$alphaString"
        return colorValue
    }
}
