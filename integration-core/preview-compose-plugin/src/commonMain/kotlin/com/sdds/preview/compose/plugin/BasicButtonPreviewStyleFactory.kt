package com.sdds.preview.compose.plugin

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.preview.compose.ComposePreviewStyleFactory
import com.sdds.preview.compose.PreparedComposeTheme
import com.sdds.preview.compose.ResolvedProperty
import com.sdds.preview.compose.resolve
import com.sdds.preview.compose.resolveStates
import com.sdds.preview.compose.toComposeColorOrNull
import com.sdds.preview.compose.withAlphaFactor
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewPropertyValue
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.floatOrNull

/** Ручная MVP factory для BasicButton, сверенная с `uikit-api-meta.json`. */
public object BasicButtonPreviewStyleFactory : ComposePreviewStyleFactory<ButtonStyle> {
    /** Поддержанные effective property IDs. */
    public val supportedPropertyIds: Set<String> = setOf(
        "shape", "labelStyle", "valueStyle", "disableAlpha", "loadingAlpha",
        "contentColor", "backgroundColor", "labelColor", "valueColor", "iconColor", "spinnerColor",
        "height", "paddingStart", "paddingEnd", "minWidth", "iconSize", "spinnerSize",
        "spinnerStrokeWidth", "iconMargin", "valueMargin",
    )

    override val supportedStates: Set<String> = INTERACTIVE_STATES.keys

    @Composable
    override fun create(component: PreviewComponent, theme: PreparedComposeTheme): ButtonStyle {
        val properties = component.properties
        val builder = ButtonStyle.basicButtonBuilder()
        properties["shape"]?.resolveStates<CornerBasedShape>({ _: JsonElement -> null }, theme::shape)
            ?.let { builder.shape(it.toStateful()) }
        properties["labelStyle"]?.resolveStates(
            { null },
            theme::typography,
        )?.let { builder.labelStyle(it.toStateful()) }
        properties["valueStyle"]?.resolveStates(
            { null },
            theme::typography,
        )?.let { builder.valueStyle(it.toStateful()) }
        properties["disableAlpha"]?.floatValue()?.let(builder::disableAlpha)
        properties["loadingAlpha"]?.floatValue()?.let(builder::loadingAlpha)
        builder.colors {
            properties["contentColor"]?.brushValue(theme)?.let(::contentColor)
            properties["backgroundColor"]?.brushValue(theme)?.let(::backgroundColor)
            properties["labelColor"]?.brushValue(theme)?.let(::labelColor)
            properties["valueColor"]?.brushValue(theme)?.let(::valueColor)
            properties["iconColor"]?.brushValue(theme)?.let(::iconColor)
            properties["spinnerColor"]?.colorValue(theme)?.base?.let(::spinnerColor)
        }
        builder.dimensions {
            properties["height"]?.dpValue(theme)?.let(::height)
            properties["paddingStart"]?.dpValue(theme)?.let(::paddingStart)
            properties["paddingEnd"]?.dpValue(theme)?.let(::paddingEnd)
            properties["minWidth"]?.dpValue(theme)?.let(::minWidth)
            properties["iconSize"]?.dpValue(theme)?.let(::iconSize)
            properties["spinnerSize"]?.dpValue(theme)?.let(::spinnerSize)
            properties["spinnerStrokeWidth"]?.dpValue(theme)?.let(::spinnerStrokeWidth)
            properties["iconMargin"]?.dpValue(theme)?.let(::iconMargin)
            properties["valueMargin"]?.dpValue(theme)?.let(::valueMargin)
        }
        return builder.style()
    }
}

private fun PreviewPropertyValue.floatValue(): Float? =
    base.resolve({ (it as? JsonPrimitive)?.floatOrNull }, { null })

private fun PreviewPropertyValue.dpValue(theme: PreparedComposeTheme): StatefulValue<Dp>? =
    resolveStates({ (it as? JsonPrimitive)?.doubleOrNull?.toFloat()?.let(::Dp) }, theme::dimension)?.toStateful()

private fun PreviewPropertyValue.colorValue(theme: PreparedComposeTheme) =
    resolveStates(
        literal = { (it as? JsonPrimitive)?.content?.toComposeColorOrNull() },
        token = theme::color,
        applyAlpha = Color::withAlphaFactor,
    )

private fun PreviewPropertyValue.brushValue(theme: PreparedComposeTheme): StatefulValue<Brush>? =
    resolveStates<Brush>(
        literal = { element -> (element as? JsonPrimitive)?.content?.toComposeColorOrNull()?.let(::SolidColor) },
        token = { id -> theme.gradient(id) ?: theme.color(id)?.let(::SolidColor) },
        applyAlpha = { brush, alpha ->
            if (brush is SolidColor) SolidColor(brush.value.withAlphaFactor(alpha)) else brush
        },
    )?.toStateful()

/**
 * Преобразует записи состояний в [StatefulValue]. UIKit при равном числе состояний выбирает первую
 * подходящую запись, а протокол — последнюю, поэтому порядок записей разворачивается.
 */
internal fun <T> ResolvedProperty<T>.toStateful(): StatefulValue<T> {
    val entries = states.reversed().mapNotNull { state ->
        val interactive = state.names.map { INTERACTIVE_STATES[it] ?: return@mapNotNull null }.toSet()
        interactive to state.value
    }
    return StatefulValue.from(
        states = entries.map { it.first },
        values = entries.map { it.second },
        defaultValue = base,
    )
}

/** Единственный источник имён состояний, которые factory сопоставляет с UIKit; регистр имён значим. */
private val INTERACTIVE_STATES: Map<String, InteractiveState> = mapOf(
    "pressed" to InteractiveState.Pressed,
    "hovered" to InteractiveState.Hovered,
    "focused" to InteractiveState.Focused,
    "activated" to InteractiveState.Activated,
    "selected" to InteractiveState.Selected,
)
