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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.common.StyledText
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
                Row {
                    StyledText(
                        text = value,
                        textStyle = style.valueStyle,
                        textColor = valueColor.value,
                    )
                    StyledText(
                        text = valueSuffix,
                        textStyle = style.valueStyle,
                        textColor = valueSuffixColor.value,
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
    Box(
        modifier = modifier
            .requiredHeight(style.dimensions.height)
            .requiredWidth(style.dimensions.width),
        contentAlignment = Alignment.Center,
    ) {
        val trackBrush = style.colors.trackColor.getValueAsState(interactionSource)
        val indicatorBrush = style.colors.indicatorColor.getValueAsState(interactionSource)
        val valueColor = style.colors.valueColor.getValueAsState(interactionSource)
        val isTrackEnabled = trackEnabled ?: style.trackEnabled
        Canvas(
            modifier = Modifier.fillMaxSize(),
        ) {
            if (isTrackEnabled) {
                drawTrack(
                    brush = trackBrush.value,
                    trackThickness = style.dimensions.trackThickness,
                    indicatorThickness = style.dimensions.progressThickness,
                )
            }
            drawIndicator(
                brush = indicatorBrush.value,
                progress = progress,
                indicatorThickness = style.dimensions.progressThickness,
                trackThickness = style.dimensions.trackThickness,
            )
        }

        if (valueContent != null) {
            CompositionLocalProvider(
                LocalTextStyle provides style.valueStyle.copy(
                    brush = valueColor.value,
                ),
            ) {
                valueContent.invoke()
            }
        }
    }
}

private fun DrawScope.drawTrack(
    brush: Brush,
    trackThickness: Dp,
    indicatorThickness: Dp,
) {
    val trackThicknessPx = trackThickness.toPx()
    val indicatorThicknessPx = indicatorThickness.toPx()
    val maxThickness = maxOf(trackThicknessPx, indicatorThicknessPx)
    drawArc(
        brush = brush,
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
    brush: Brush,
    progress: Float,
    indicatorThickness: Dp,
    trackThickness: Dp,
) {
    if (progress == 0f) return
    val trackThicknessPx = trackThickness.toPx()
    val indicatorThicknessPx = indicatorThickness.toPx()
    val maxThickness = maxOf(trackThicknessPx, indicatorThicknessPx)
    drawArc(
        brush = brush,
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

@Composable
@Preview
private fun CircularProgressBarPreview() {
    CircularProgressBar(
        progress = 0.5f,
        style = CircularProgressBarStyle
            .builder()
            .colors {
                indicatorColor(Brush.linearGradient(listOf(Color.Red, Color.Green)))
                trackColor(Brush.linearGradient(listOf(Color.Cyan, Color.LightGray)))
                valueColor(SolidColor(Color.Magenta))
                valueSuffixColor(SolidColor(Color.Black))
            }
            .dimensions {
                trackThickness(4.dp)
                progressThickness(2.dp)
            }
            .valueEnabled(true)
            .trackEnabled(true)
            .style(),
        valueContent = {
            Text("100%")
        },
    )
}
