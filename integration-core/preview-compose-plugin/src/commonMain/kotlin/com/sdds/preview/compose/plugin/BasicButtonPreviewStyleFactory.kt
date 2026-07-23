package com.sdds.preview.compose.plugin

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
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
    resolveStates({ (it as? JsonPrimitive)?.content?.toComposeColorOrNull() }, theme::color)

private fun PreviewPropertyValue.brushValue(theme: PreparedComposeTheme): StatefulValue<Brush>? =
    colorValue(theme)?.let { resolved ->
        ResolvedProperty<Brush>(
            SolidColor(resolved.base),
            resolved.states.mapValues { SolidColor(it.value) },
        ).toStateful()
    }

private fun <T> ResolvedProperty<T>.toStateful(): StatefulValue<T> = StatefulValue.from(
    states = states.mapNotNull { (name, _) -> name.toInteractiveState()?.let { setOf(it) } },
    values = states.mapNotNull { (name, value) -> name.toInteractiveState()?.let { value } },
    defaultValue = base,
)

private fun String.toInteractiveState(): InteractiveState? = when (lowercase()) {
    "pressed" -> InteractiveState.Pressed
    "hovered" -> InteractiveState.Hovered
    "focused" -> InteractiveState.Focused
    "activated" -> InteractiveState.Activated
    "selected" -> InteractiveState.Selected
    else -> null
}
