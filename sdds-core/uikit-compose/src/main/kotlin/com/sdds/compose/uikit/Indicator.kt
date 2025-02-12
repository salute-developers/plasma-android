package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Компонент [Indicator]
 * @param modifier модификатор
 * @param style стиль компонента
 */
@Composable
fun Indicator(
    modifier: Modifier = Modifier,
    style: IndicatorStyle = LocalIndicatorStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Box(
        modifier = modifier.indicator(style, interactionSource),
    )
}

/**
 * Модификатор, который декорирует компонент как Indicator.
 * @param style стиль компонента
 * @param interactionSource
 */

@Suppress("ComposableModifierFactory")
@Composable
fun Modifier.indicator(
    style: IndicatorStyle = LocalIndicatorStyle.current,
    interactionSource: MutableInteractionSource,
): Modifier = composed {
    val backgroundColor = style.color.backgroundColor.colorForInteraction(interactionSource)
    val dimensions = style.dimensions
    this then Modifier
        .height(dimensions.height)
        .width(dimensions.width)
        .background(
            backgroundColor,
            style.shape,
        )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object Indicator {

    /**
     * Размеры [Indicator].
     * @property height высота Indicator
     * @property width ширина Indicator
     */
    @Immutable
    data class Dimensions(
        val height: Dp = 12.dp,
        val width: Dp = 12.dp,
    )
}
