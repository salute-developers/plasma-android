package com.sdds.plasma.homeds.components.numberpanel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.plasma.homeds.motion.numberpanel.NumberPanelMotionStyle
import com.sdds.plasma.homeds.motion.numberpanel.rememberNumberPanelMotion
import kotlin.math.abs

/**
 * Компонент для отображения числовых значений, в частности тепературы или влажности.
 *
 * @param value числовое значение
 * @param modifier модификатор
 * @param style стиль компонента
 * @param icon иконка
 * @param mode режим отображения числа
 * @see NumberPanelMode
 * @param motion объект анимаций
 */
@Composable
fun NumberPanel(
    value: Float,
    modifier: Modifier = Modifier,
    style: NumberPanelStyle = LocalNumberPanelStyle.current,
    icon: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    mode: NumberPanelMode = style.mode,
    motion: Motion<NumberPanelMotionStyle> = rememberNumberPanelMotion(),
) {
    val parsed = remember(value) { value.parseValue() }
    Row(
        modifier = modifier
            .alpha(if (enabled) 1f else style.disableAlpha)
            .height(IntrinsicSize.Min),
        verticalAlignment = Alignment.Bottom,
    ) {
        val valueStyle by style.valueStyle.getTextStyleAsState(motion.context, motion.style.valueStyle)
        val valueColor = style.colors.valueBrush.getBrushAsState(motion.context, motion.style.valueColor)
        parsed.sign?.let {
            val padding by style.dimensions.valueStartPadding.getValueAsState(motion.context)
            Text(
                modifier = Modifier.padding(end = padding),
                text = it,
                style = valueStyle,
                brush = { valueColor.value },
            )
        }
        Text(
            text = parsed.value,
            style = valueStyle,
            brush = { valueColor.value },
        )
        if (parsed.fraction != null) {
            val fracStyle by style.fractionStyle.getTextStyleAsState(motion.context, motion.style.fractionStyle)
            val sepStyle by style.separatorStyle.getTextStyleAsState(motion.context, motion.style.separatorStyle)
            val fracColor = style.colors.fractionBrush.getBrushAsState(motion.context, motion.style.fractionColor)
            val valuePadding by style.dimensions.valueEndPadding.getValueAsState(motion.context)
            Text(
                modifier = Modifier.padding(start = valuePadding),
                text = ".",
                style = sepStyle,
                brush = { fracColor.value },
            )
            val fracPadding by style.dimensions.fractionStartPadding.getValueAsState(motion.context)
            Text(
                modifier = Modifier.padding(start = fracPadding),
                text = parsed.fraction,
                style = fracStyle,
                brush = { fracColor.value },
            )
        }
        PanelIcon(style = style, mode = mode, motion = motion, icon = icon)
    }
}

@Composable
private fun PanelIcon(
    style: NumberPanelStyle,
    mode: NumberPanelMode,
    motion: Motion<NumberPanelMotionStyle>,
    icon: (@Composable () -> Unit)?,
) {
    val iconPadding by style.dimensions.fractionEndPadding.getValueAsState(motion.context)
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .padding(start = iconPadding),
        contentAlignment = if (mode == NumberPanelMode.Temperature) {
            Alignment.TopCenter
        } else {
            Alignment.BottomCenter
        },
    ) {
        val currentIconColor = style.colors.iconBrush.getBrushAsState(
            motion.context,
            motion.style.iconColor,
        )
        style.icon?.let {
            Icon(
                source = resourceImageSource(it),
                brush = { currentIconColor.value },
                contentDescription = null,
            )
        }
        if (style.icon == null) {
            CompositionLocalProvider(LocalTintBrushProducer provides { currentIconColor.value }) {
                icon?.invoke()
            }
        }
    }
}

private fun Float.parseValue(): ParsedValue {
    val sign = if (this < 0) "-" else null
    val text = abs(this).toString()
    val dotIndex = text.indexOf(".")
    return if (dotIndex >= 0) {
        ParsedValue(
            sign = sign,
            value = text.substring(0, dotIndex),
            fraction = text.substring(dotIndex + 1),
        )
    } else {
        ParsedValue(
            sign = sign,
            value = text,
            fraction = null,
        )
    }
}

/**
 * Режим отображения значений на панели
 */
enum class NumberPanelMode {

    /**
     * Значение отображается в градусах
     */
    Temperature,

    /**
     * Значение отображается в процентах
     */
    Humidity,
}

@Immutable
private data class ParsedValue(
    val sign: String?,
    val value: String,
    val fraction: String?,
)
