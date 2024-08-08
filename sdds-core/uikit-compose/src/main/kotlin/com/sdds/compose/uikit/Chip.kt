package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.surface

/**
 * Компонент Chip
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатий
 * @param shape форма компонента
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param startPadding отступ в начале
 * @param endPadding отступ в конце
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 */
@Composable
@NonRestartableComposable
fun Chip(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    shape: CornerBasedShape = RoundedCornerShape(25),
    startContent: (@Composable () -> Unit)? = null,
    textContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    backgroundColor: Color = Color.Black,
    pressedBackgroundColor: Color = Color.Gray,
    startContentColor: Color = Color.White,
    endContentColor: Color = Color.White,
    textContentStyle: TextStyle,
    startPadding: Dp = 12.dp,
    endPadding: Dp = 12.dp,
    startContentSize: Dp = 24.dp,
    endContentSize: Dp = 24.dp,
    startContentMargin: Dp = 12.dp,
    endContentMargin: Dp = 12.dp,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Chip(
        modifier = modifier,
        onClick = onClick,
        shape = shape,
        startContent = startContent,
        textContent = textContent,
        endContent = endContent,
        enabledAlpha = enabledAlpha,
        disabledAlpha = disabledAlpha,
        backgroundColor = SolidColor(backgroundColor),
        pressedBackgroundColor = SolidColor(pressedBackgroundColor),
        startContentColor = startContentColor,
        endContentColor = endContentColor,
        textContentStyle = textContentStyle,
        startPadding = startPadding,
        endPadding = endPadding,
        startContentSize = startContentSize,
        endContentSize = endContentSize,
        startContentMargin = startContentMargin,
        endContentMargin = endContentMargin,
        enabled = enabled,
        indication = indication,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Chip с поддержкой градиента
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатий
 * @param shape форма компонента
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param startPadding отступ в начале
 * @param endPadding отступ в конце
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    shape: CornerBasedShape = RoundedCornerShape(25),
    startContent: (@Composable () -> Unit)? = null,
    textContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    backgroundColor: Brush = SolidColor(Color.Black),
    pressedBackgroundColor: Brush = SolidColor(Color.Gray),
    startContentColor: Color = Color.White,
    endContentColor: Color = Color.White,
    textContentStyle: TextStyle,
    startPadding: Dp = 12.dp,
    endPadding: Dp = 12.dp,
    startContentSize: Dp = 24.dp,
    endContentSize: Dp = 24.dp,
    startContentMargin: Dp = 12.dp,
    endContentMargin: Dp = 12.dp,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isPressed by interactionSource.collectIsPressedAsState()
    Row(
        modifier = modifier
            .wrapContentWidth()
            .surface(
                onClick = onClick,
                shape = shape,
                indication = indication,
                enabledAlpha = enabledAlpha,
                disabledAlpha = disabledAlpha,
                backgroundColor = if (isPressed) pressedBackgroundColor else backgroundColor,
                enabled = enabled,
                interactionSource = interactionSource,
            )
            .padding(start = startPadding, end = endPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        startContent?.let {
            CompositionLocalProvider(
                LocalTint provides startContentColor,
            ) {
                Box(
                    modifier = Modifier
                        .padding(end = startContentMargin)
                        .requiredSize(startContentSize)
                ) {
                    startContent()
                }
            }
        }
        textContent?.let {
            CompositionLocalProvider(
                LocalTextStyle provides textContentStyle,
            ) {
                Box(
                    modifier = Modifier
                        .weight(weight = 1f, fill = false)
                ) {
                    textContent()
                }
            }
        }
        endContent?.let {
            CompositionLocalProvider(
                LocalTint provides endContentColor,
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = endContentMargin)
                        .requiredSize(endContentSize)
                ) {
                    endContent()
                }
            }
        }
    }
}
