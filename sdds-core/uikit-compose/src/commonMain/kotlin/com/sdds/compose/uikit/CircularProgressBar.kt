package com.sdds.compose.uikit

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.progressbar.CircularProgressBarMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import kotlin.math.roundToInt

/**
 * Компонент CircularProgressBar.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param style стиль компонента
 * @param value текст надписи
 * @param valueSuffix суффикс текста
 * @param trackEnabled включен ли трек
 * @param interactionSource источник взаимодействий
 */
@Composable
fun CircularProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    style: CircularProgressBarStyle = LocalCircularProgressBarStyle.current,
    value: String = "${(progress * 100).roundToInt()}",
    valueSuffix: String = "%",
    trackEnabled: Boolean? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val valueColor = style.colors.valueColor.getValueAsState(interactionSource)
    val valueSuffixColor = style.colors.valueSuffixColor.getValueAsState(interactionSource)

    CircularProgressBar(
        progress = progress,
        modifier = modifier,
        valueContent = {
            if (style.valueEnabled) {
                val valueStyle = style.valueStyleValues.getValue(interactionSource)
                Row {
                    Text(
                        text = value,
                        style = valueStyle,
                        brush = { valueColor.value },
                    )
                    Text(
                        text = valueSuffix,
                        style = valueStyle,
                        brush = { valueSuffixColor.value },
                    )
                }
            }
        },
        style = style,
        trackEnabled = trackEnabled,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент CircularProgressBar.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param style стиль компонента
 * @param valueContent центральный контент
 * @param trackEnabled включен ли трек
 * @param interactionSource источник взаимодействий
 */
@Composable
fun CircularProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    style: CircularProgressBarStyle = LocalCircularProgressBarStyle.current,
    valueContent: (@Composable () -> Unit)?,
    trackEnabled: Boolean? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val height = style.dimensions.heightValues.getValue(interactionSource)
    val width = style.dimensions.widthValues.getValue(interactionSource)
    Box(
        modifier = modifier
            .requiredHeight(height)
            .requiredWidth(width),
        contentAlignment = Alignment.Center,
    ) {
        val trackBrush = style.colors.trackColor.getValueAsState(interactionSource)
        val indicatorBrush = style.colors.indicatorColor.getValueAsState(interactionSource)
        val isTrackEnabled = trackEnabled ?: style.trackEnabled
        val trackThickness = style.dimensions.trackThicknessValues.getValueAsState(interactionSource)
        val progressThickness = style.dimensions.progressThicknessValues.getValueAsState(interactionSource)
        Canvas(
            modifier = Modifier.fillMaxSize(),
        ) {
            if (isTrackEnabled) {
                drawTrack(
                    brush = { trackBrush.value },
                    trackThickness = trackThickness.value,
                    indicatorThickness = progressThickness.value,
                )
            }
            drawIndicator(
                brush = { indicatorBrush.value },
                progress = progress,
                indicatorThickness = progressThickness.value,
                trackThickness = trackThickness.value,
            )
        }

        if (valueContent != null) {
            val valueColor = style.colors.valueColor.getValueAsState(interactionSource)
            val valueStyle = style.valueStyleValues.getValueAsState(interactionSource)
            val iconSize by style.dimensions.iconSizeValues.getValueAsState(interactionSource)
            CompositionLocalProvider(
                LocalIconDefaultSize provides DpSize(
                    width = iconSize,
                    height = iconSize,
                ),
            ) {
                ProvideTextStyle(
                    value = valueStyle.value,
                    brush = { valueColor.value },
                    content = valueContent,
                )
            }
        }
    }
}

/**
 * Компонент CircularProgressBar.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param style стиль компонента
 * @param value текст надписи
 * @param valueSuffix суффикс текста
 * @param trackEnabled включен ли трек
 */
@Composable
fun CircularProgressBar(
    progress: Float,
    motion: Motion<CircularProgressBarMotionStyle>,
    modifier: Modifier = Modifier,
    style: CircularProgressBarStyle = LocalCircularProgressBarStyle.current,
    value: String = "${(progress * 100).roundToInt()}",
    valueSuffix: String = "%",
    trackEnabled: Boolean = style.trackEnabled,
) {
    val valueColor = style.colors.valueColor.getBrushAsState(motion.context, motion.style.valueColor)
    val valueSuffixColor = style.colors.valueSuffixColor.getBrushAsState(motion.context, motion.style.valueSuffixColor)

    CircularProgressBar(
        progress = progress,
        modifier = modifier,
        valueContent = {
            if (style.valueEnabled) {
                val valueStyle by style.valueStyleValues.getTextStyleAsState(motion.context, motion.style.valueStyle)
                Row {
                    Text(
                        text = value,
                        style = valueStyle,
                        brush = { valueColor.value },
                    )
                    Text(
                        text = valueSuffix,
                        style = valueStyle,
                        brush = { valueSuffixColor.value },
                    )
                }
            }
        },
        style = style,
        trackEnabled = trackEnabled,
        motion = motion,
    )
}

/**
 * Компонент CircularProgressBar.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param motion объект анимаций
 * @param modifier модификатор
 * @param style стиль компонента
 * @param valueContent центральный контент
 * @param trackEnabled включен ли трек
 */
@Composable
fun CircularProgressBar(
    progress: Float,
    motion: Motion<CircularProgressBarMotionStyle>,
    modifier: Modifier = Modifier,
    style: CircularProgressBarStyle = LocalCircularProgressBarStyle.current,
    valueContent: (@Composable () -> Unit)?,
    trackEnabled: Boolean = style.trackEnabled,
) {
    val height by style.dimensions.heightValues.getValueAsState(motion.context)
    val width by style.dimensions.widthValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .requiredHeight(height)
            .requiredWidth(width),
        contentAlignment = Alignment.Center,
    ) {
        val trackThickness = style.dimensions.trackThicknessValues.getValueAsState(motion.context)
        val progressThickness = style.dimensions.progressThicknessValues.getValueAsState(motion.context)
        val trackBrush = style.colors.trackColor.getBrushAsState(motion.context, motion.style.trackColor)
        val indicatorBrush = style.colors.indicatorColor.getBrushAsState(motion.context, motion.style.indicatorColor)
        Canvas(
            modifier = Modifier.fillMaxSize(),
        ) {
            if (trackEnabled) {
                drawTrack(
                    brush = { trackBrush.value },
                    trackThickness = trackThickness.value,
                    indicatorThickness = progressThickness.value,
                )
            }
            drawIndicator(
                brush = { indicatorBrush.value },
                progress = progress,
                indicatorThickness = progressThickness.value,
                trackThickness = trackThickness.value,
            )
        }

        if (valueContent != null) {
            val valueColor = style.colors.valueColor.getBrushAsState(motion.context, motion.style.valueColor)
            val valueStyle = style.valueStyleValues.getTextStyleAsState(motion.context, motion.style.valueStyle)
            val iconSize by style.dimensions.iconSizeValues.getValueAsState(motion.context)
            CompositionLocalProvider(
                LocalIconDefaultSize provides DpSize(
                    width = iconSize,
                    height = iconSize,
                ),
            ) {
                ProvideTextStyle(
                    value = valueStyle.value,
                    brush = { valueColor.value },
                    content = valueContent,
                )
            }
        }
    }
}

private fun DrawScope.drawTrack(
    brush: BrushProducer,
    trackThickness: Dp,
    indicatorThickness: Dp,
) {
    val trackThicknessPx = trackThickness.toPx()
    val indicatorThicknessPx = indicatorThickness.toPx()
    val maxThickness = maxOf(trackThicknessPx, indicatorThicknessPx)
    drawArc(
        brush = brush(),
        startAngle = 0f,
        sweepAngle = 360f,
        useCenter = false,
        topLeft = Offset(maxThickness / 2f, maxThickness / 2f),
        size = Size(
            size.width - maxThickness,
            size.height - maxThickness,
        ),
        style = Stroke(
            width = trackThicknessPx,
            cap = StrokeCap.Round,
        ),
    )
}

private fun DrawScope.drawIndicator(
    brush: BrushProducer,
    progress: Float,
    indicatorThickness: Dp,
    trackThickness: Dp,
) {
    if (progress == 0f) return
    val trackThicknessPx = trackThickness.toPx()
    val indicatorThicknessPx = indicatorThickness.toPx()
    val maxThickness = maxOf(trackThicknessPx, indicatorThicknessPx)
    drawArc(
        brush = brush(),
        startAngle = -90f,
        sweepAngle = 360f * progress,
        useCenter = false,
        topLeft = Offset(maxThickness / 2f, maxThickness / 2f),
        size = Size(
            size.width - maxThickness,
            size.height - maxThickness,
        ),
        style = Stroke(
            width = indicatorThicknessPx,
            cap = StrokeCap.Round,
        ),
    )
}
