package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
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
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Row(
        modifier = modifier
            .surface(
                onClick = onClick,
                shape = shape,
                indication = rememberRipple(),
                enabledAlpha = enabledAlpha,
                disabledAlpha = disabledAlpha,
                backgroundColor = backgroundColor,
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
                Box(modifier = Modifier.size(startContentSize)) {
                    startContent()
                }
                Spacer(modifier = Modifier.size(startContentMargin))
            }
        }
        textContent?.let {
            CompositionLocalProvider(
                LocalTextStyle provides textContentStyle,
            ) {
                textContent()
            }
        }
        endContent?.let {
            CompositionLocalProvider(
                LocalTint provides endContentColor,
            ) {
                Spacer(modifier = Modifier.size(endContentMargin))
                Box(modifier = Modifier.size(endContentSize)) {
                    endContent()
                }
            }
        }
    }
}
