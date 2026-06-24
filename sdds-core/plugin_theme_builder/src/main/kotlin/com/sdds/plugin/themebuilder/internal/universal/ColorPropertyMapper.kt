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

    override fun map(meta: ColorPropertyMeta, tokenValue: Color, variationId: String): String =
        when {
            tokenValue is Gradient ->
                mapGradientParam(meta, tokenValue)
            tokenValue is SolidColor && meta.isInteractiveColor ->
                mapInteractiveColor(meta, tokenValue)
            tokenValue is SolidColor && meta.acceptsBrush ->
                mapSolidColorAsBrush(meta, tokenValue)
            tokenValue is SolidColor ->
                mapSolidColorAsColor(meta, tokenValue)
            else -> error("Unsupported color type ${tokenValue::class.simpleName}")
        }

    private fun mapInteractiveColor(meta: ColorPropertyMeta, color: Color): String {
        val tokenRef = buildColorTokenRef(color)
        val stateSuffix = buildInteractiveSuffix(color)
        return "${meta.methodName}($tokenRef$stateSuffix)"
    }

    private fun mapSolidColorAsBrush(meta: ColorPropertyMeta, color: SolidColor): String {
        val alphaStr = color.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        val states = color.states
        val hasGradientStates = states.orEmpty().any { it.type == "gradient" }
        val tokenRef = buildThemeRef("colors", color.default)
        val wrappedTokenRef = if (hasGradientStates) {
            "listOf(singleColor($tokenRef)).asLayered()"
        } else {
            "SolidColor($tokenRef)"
        }
        val baseRef = "$wrappedTokenRef$alphaStr"
        val hasStatefulParam = "StatefulValue" in meta.paramQualifiedType
        return if (states.isNullOrEmpty()) {
            if (hasStatefulParam) {
                "${meta.methodName}($baseRef.asStatefulValue())"
            } else {
                "${meta.methodName}($baseRef)"
            }
        } else {
            val stateParams = states.joinToString(", ") { state ->
                val effectiveType = state.type ?: "color"
                val stateRef = buildStateRef(
                    state = state,
                    effectiveType = effectiveType,
                    wrapColorAsBrush = true,
                    wrapColorAsLayered = hasGradientStates,
                )
                "setOf(${state.state.toStateEnums()}) to $stateRef"
            }
            "${meta.methodName}($baseRef.asStatefulValue($stateParams))"
        }
    }

    private fun mapSolidColorAsColor(meta: ColorPropertyMeta, color: SolidColor): String {
        val alphaStr = color.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        val baseRef = "${buildThemeRef("colors", color.default)}$alphaStr"
        val states = color.states
        return if (states.isNullOrEmpty()) {
            if (meta.isStatefulValue) {
                "${meta.methodName}($baseRef.asStatefulValue())"
            } else {
                "${meta.methodName}($baseRef)"
            }
        } else {
            val stateParams = states.joinToString(", ") { state ->
                val effectiveType = state.type ?: "color"
                val stateRef = buildStateRef(
                    state = state,
                    effectiveType = effectiveType,
                    wrapColorAsBrush = false,
                )
                "setOf(${state.state.toStateEnums()}) to $stateRef"
            }
            "${meta.methodName}($baseRef.asStatefulValue($stateParams))"
        }
    }

    private fun mapGradientParam(meta: ColorPropertyMeta, color: Gradient): String {
        val alphaArg = color.alpha?.let { "${it}f" }
        val baseRef = "${buildThemeRef(
            "gradients",
            color.default,
        )}${alphaArg?.let { ".asLayered($it)" } ?: ".asLayered()"}"
        val states = color.states
        val hasStatefulParam = "StatefulValue" in meta.paramQualifiedType
        return if (states.isNullOrEmpty()) {
            if (hasStatefulParam) {
                "${meta.methodName}($baseRef.asStatefulValue())"
            } else {
                "${meta.methodName}($baseRef)"
            }
        } else {
            val stateParams = states.joinToString(", ") { state ->
                val effectiveType = state.type ?: "gradient"
                val stateRef = buildStateRef(
                    state = state,
                    effectiveType = effectiveType,
                    wrapColorAsBrush = true,
                    wrapColorAsLayered = true,
                )
                "setOf(${state.state.toStateEnums()}) to $stateRef"
            }
            "${meta.methodName}($baseRef.asStatefulValue($stateParams))"
        }
    }

    private fun buildStateRef(
        state: ColorState,
        effectiveType: String,
        wrapColorAsBrush: Boolean,
        wrapColorAsLayered: Boolean = false,
    ): String =
        when (effectiveType) {
            "gradient" -> {
                val alphaArg = state.alpha?.let { "${it}f" }
                "${buildThemeRef("gradients", state.value)}${alphaArg?.let { ".asLayered($it)" } ?: ".asLayered()"}"
            }
            "color" -> {
                val alphaStr = state.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
                val ref = "${buildThemeRef("colors", state.value)}$alphaStr"
                when {
                    wrapColorAsLayered -> "listOf(singleColor($ref)).asLayered()"
                    wrapColorAsBrush -> "SolidColor($ref)"
                    else -> ref
                }
            }
            else -> throw ThemeBuilderException("Unknown gradient or color type $effectiveType")
        }

    private fun buildThemeRef(tokenGroup: String, tokenName: String): String {
        val tokenValue = tokenName.toCamelCase().decapitalized()
        return "$themeClassName.$tokenGroup.$tokenValue"
    }

    private fun buildColorTokenRef(color: Color): String {
        val tokenGroup = if (color is Gradient) "gradients" else "colors"
        val alphaString = when (color) {
            is Gradient -> color.alpha?.let { ".asLayered(${it}f)" } ?: ".asLayered()"
            is SolidColor -> color.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        }
        val tokenValue = color.default.toCamelCase().decapitalized()
        return "$themeClassName.$tokenGroup.$tokenValue$alphaString"
    }

    private fun buildInteractiveSuffix(color: Color): String {
        val states = color.states
        return if (states.isNullOrEmpty()) {
            ".asInteractive()"
        } else {
            val params = states.joinToString(separator = ", ") { state ->
                val alphaString = state.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
                val tokenGroup = if (color is Gradient) "gradients" else "colors"
                val tokenValue = state.value.toCamelCase().decapitalized()
                "setOf(${state.state.toStateEnums()}) to $themeClassName.$tokenGroup.$tokenValue$alphaString"
            }
            ".asInteractive($params)"
        }
    }

    private val ColorPropertyMeta.isStatefulValue: Boolean
        get() = "StatefulValue" in paramQualifiedType

    private val ColorPropertyMeta.isInteractiveColor: Boolean
        get() = valueQualifiedType == INTERACTIVE_COLOR_TYPE ||
            (valueQualifiedType.isBlank() && "InteractiveColor" in paramQualifiedType)

    private val ColorPropertyMeta.acceptsBrush: Boolean
        get() = valueQualifiedType == BRUSH_TYPE ||
            (valueQualifiedType.isBlank() && (hasBrushOverload || "Brush" in paramQualifiedType))

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
        val wrappedTokenRef = if (token is SolidColor && meta.acceptsBrush) {
            "SolidColor($tokenRef)"
        } else {
            tokenRef
        }
        return "$wrappedTokenRef$alphaString"
    }

    override fun getStateTokenRef(
        value: String,
        state: ColorState,
        token: Color,
        meta: ColorPropertyMeta,
        resSuffix: String,
    ): String {
        val effectiveType = state.type ?: when (token) {
            is Gradient -> "gradient"
            is SolidColor -> "color"
        }
        val (tokenGroup, alphaString) = resolveGroupAndAlpha(effectiveType, token)
        val tokenValue = value.toCamelCase().decapitalized()
        val tokenRef = "$themeClassName.$tokenGroup.$tokenValue"
        val wrappedTokenRef = if (effectiveType == "color" && meta.acceptsBrush) {
            "SolidColor($tokenRef)"
        } else {
            tokenRef
        }
        return "$wrappedTokenRef$alphaString"
    }

    private fun resolveGroupAndAlpha(effectiveType: String, token: Color): Pair<String, String> =
        when (effectiveType) {
            "gradient" -> "gradients" to (token.alpha?.let { ".asLayered(${it}f)" } ?: ".asLayered()")
            "color" -> "colors" to (token.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty())
            else -> throw ThemeBuilderException("Unknown gradient or color type $effectiveType")
        }

    private companion object {
        const val BRUSH_TYPE = "androidx.compose.ui.graphics.Brush"
        const val INTERACTIVE_COLOR_TYPE = "com.sdds.compose.uikit.interactions.InteractiveColor"
    }
}
