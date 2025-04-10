package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.common.background
import com.sdds.compose.uikit.internal.common.drawOutline

/**
 * Компонент [Indicator]
 * @param modifier модификатор
 * @param style стиль компонента
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun Indicator(
    modifier: Modifier = Modifier,
    style: IndicatorStyle = LocalIndicatorStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    stateSet: Set<ValueState> = emptySet(),
) {
    Box(
        modifier = modifier.indicator(style, interactionSource, stateSet),
    )
}

/**
 * Модификатор, который декорирует компонент как Indicator.
 * @param style стиль компонента
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */

@Suppress("ComposableModifierFactory")
@Composable
fun Modifier.indicator(
    style: IndicatorStyle = LocalIndicatorStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    stateSet: Set<ValueState> = emptySet(),
): Modifier = composed {
    val brush = style.color.backgroundBrush?.getValue(interactionSource, stateSet)
    val color = style.color.backgroundColor.takeIf { brush == null }?.colorForInteraction(interactionSource, stateSet)
    val dimensions = style.dimensions
    this then Modifier
        .height(dimensions.height)
        .width(dimensions.width)
        .background(brush, color, style.shape)
}

/**
 * Модификатор, который декорирует компонент как Indicator,
 *  с возможностью отрисовки Indicator как внутри,
 *  так и снаружи декорируемого компонента.
 * @param alignment положение Indicator относительно сторон компонента
 * @param style стиль компонента
 * @param horizontalPadding отступ по горизонтали
 * @param verticalPadding отступ по вертикали
 * @param horizontalMode размещение относительно границ
 * @see IndicatorMode
 * @param verticalMode размещение относительно границ
 * @see IndicatorMode
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Suppress("ComposableModifierFactory")
@Composable
fun Modifier.indicator(
    alignment: Alignment,
    style: IndicatorStyle = LocalIndicatorStyle.current,
    horizontalPadding: Dp = 0.dp,
    verticalPadding: Dp = 0.dp,
    horizontalMode: IndicatorMode = IndicatorMode.Inner,
    verticalMode: IndicatorMode = IndicatorMode.Inner,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    stateSet: Set<ValueState> = emptySet(),
): Modifier = composed {
    val brush = style.color.backgroundBrush?.getValue(interactionSource, stateSet)
    val color = style.color.backgroundColor.takeIf { brush == null }?.colorForInteraction(interactionSource, stateSet)
    val shape = style.shape
    this then Modifier
        .drawWithCache {
            val horizontalOffset = horizontalPadding.roundToPx()
            val verticalOffset = verticalPadding.roundToPx()
            val indicatorWidthPx = style.dimensions.width.roundToPx()
            val indicatorHeightPx = style.dimensions.height.roundToPx()
            val deltaSpace = IntOffset(
                x = when (horizontalMode) {
                    IndicatorMode.Inner -> -horizontalOffset * 2
                    IndicatorMode.Outer -> horizontalOffset * 2 + indicatorWidthPx * 2
                },
                y = when (verticalMode) {
                    IndicatorMode.Inner -> -verticalOffset * 2
                    IndicatorMode.Outer -> verticalOffset * 2 + indicatorHeightPx * 2
                },
            )

            val offset = alignment.align(
                IntSize(
                    indicatorWidthPx,
                    indicatorHeightPx,
                ),
                IntSize(
                    (size.width + deltaSpace.x).toInt(),
                    (size.height + deltaSpace.y).toInt(),
                ),
                layoutDirection = layoutDirection,
            )
            val outline = shape.createOutline(
                Size(indicatorWidthPx.toFloat(), indicatorHeightPx.toFloat()),
                layoutDirection = layoutDirection,
                density = this,
            )

            val resultOffset = offset - deltaSpace / 2f
            onDrawWithContent {
                drawContent()
                translate(resultOffset.x.toFloat(), resultOffset.y.toFloat()) {
                    drawOutline(outline, brush, color)
                }
            }
        }
}

/**
 * Режим размещения indicator относительно границ composable
 */
enum class IndicatorMode {

    /**
     * Размещение внутри границ
     */
    Inner,

    /**
     * Размещение снаружи границ
     */
    Outer,
}
