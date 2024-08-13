package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
 * Компонент Chip с поддержкой кликабельности
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатия
 * @param shape форма компонента
 * @param startContent контент вначале
 * @param textContent контент с текстом
 * @param endContent контент вконце
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param startContentColor цвет контента вначале
 * @param endContentColor цвет контента вконце
 * @param textContentStyle стиль контента с текстом
 * @param startPadding отступ в начале
 * @param endPadding отступ в конце
 * @param startContentSize
 * @param endContentSize
 * @param startContentMargin
 * @param endContentMargin
 * @param enabled включен ли компонент
 * @param indication [Indication]
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
    textContentStyle: TextStyle = TextStyle(),
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
        ChipContent(
            startContent = startContent,
            textContent = textContent,
            endContent = endContent,
            startContentColor = startContentColor,
            endContentColor = endContentColor,
            textContentStyle = textContentStyle,
            startContentSize = startContentSize,
            endContentSize = endContentSize,
            startContentMargin = startContentMargin,
            endContentMargin = endContentMargin,
        )
    }
}

/**
 * Компонент Chip с поддержкой selected состояния
 *
 * @param modifier модификатор
 * @param isSelected выбран ли chip
 * @param onSelectedChange обработчик смены состояния chip
 * @param shape форма компонента
 * @param startContent контент вначале
 * @param textContent контент с текстом
 * @param endContent контент вконце
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param startContentColor цвет контента вначале
 * @param endContentColor цвет контента вконце
 * @param textContentStyle стиль контента с текстом
 * @param startPadding отступ в начале
 * @param endPadding отступ в конце
 * @param startContentSize
 * @param endContentSize
 * @param startContentMargin
 * @param endContentMargin
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    shape: CornerBasedShape = RoundedCornerShape(25),
    startContent: (@Composable () -> Unit)? = null,
    textContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    backgroundColor: Brush = SolidColor(Color.Black),
    startContentColor: Color = Color.White,
    endContentColor: Color = Color.White,
    textContentStyle: TextStyle = TextStyle(),
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
    Row(
        modifier = modifier
            .surface(
                value = isSelected,
                onValueChange = onSelectedChange,
                shape = shape,
                indication = indication,
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
        ChipContent(
            startContent = startContent,
            textContent = textContent,
            endContent = endContent,
            startContentColor = startContentColor,
            endContentColor = endContentColor,
            textContentStyle = textContentStyle,
            startContentSize = startContentSize,
            endContentSize = endContentSize,
            startContentMargin = startContentMargin,
            endContentMargin = endContentMargin,
        )
    }
}

@Composable
private fun ChipContent(
    startContent: (@Composable () -> Unit)?,
    textContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    startContentColor: Color,
    endContentColor: Color,
    textContentStyle: TextStyle,
    startContentSize: Dp,
    endContentSize: Dp,
    startContentMargin: Dp,
    endContentMargin: Dp,
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
