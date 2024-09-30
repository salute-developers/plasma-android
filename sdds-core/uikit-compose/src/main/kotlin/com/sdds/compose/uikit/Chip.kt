package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
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
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.surface

/**
 * Компонент Chip с поддержкой кликабельности
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатий
 * @param label текст
 * @param labelStyle стиль текста
 * @param shape форма компонента
 * @param contentStart контент в начале
 * @param contentEnd контент в конце
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param pressedBackgroundColor цвет бэкграунда в нажатом состоянии
 * @param startContentColor цвет контента в начале
 * @param endContentColor цвет контента в конце
 * @param startContentSize размер контента в начале
 * @param endContentSize размер контента в конце
 * @param startContentMargin отступ от [contentStart]
 * @param endContentMargin отступ от [contentEnd]
 * @param startPadding отступ компонента в начале
 * @param endPadding отступ компонента в конце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    label: String = "",
    labelStyle: TextStyle = TextStyle(),
    shape: CornerBasedShape = RoundedCornerShape(25),
    contentStart: (@Composable () -> Unit)? = null,
    contentEnd: (@Composable () -> Unit)? = null,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    backgroundColor: Brush = SolidColor(Color.Black),
    pressedBackgroundColor: Brush = SolidColor(Color.Gray),
    startContentColor: Color = Color.White,
    endContentColor: Color = Color.White,
    startContentSize: Dp = 24.dp,
    endContentSize: Dp = 24.dp,
    startContentMargin: Dp = 12.dp,
    endContentMargin: Dp = 12.dp,
    startPadding: Dp = 12.dp,
    endPadding: Dp = 12.dp,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isPressed by interactionSource.collectIsPressedAsState()
    val measurePolicy = remember { ChipMeasurePolicy() }
    Layout(
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
        measurePolicy = measurePolicy,
        content = {
            ChipContent(
                startContent = contentStart,
                endContent = contentEnd,
                startContentColor = startContentColor,
                endContentColor = endContentColor,
                label = label,
                labelStyle = labelStyle,
                startContentSize = startContentSize,
                endContentSize = endContentSize,
                startContentMargin = startContentMargin,
                endContentMargin = endContentMargin,
            )
        },
    )
}

/**
 * Компонент Chip с поддержкой selected состояния
 *
 * @param modifier модификатор
 * @param isSelected выбран ли chip
 * @param onSelectedChange обработчик смены состояния chip
 * @param shape форма компонента
 * @param startContent контент вначале
 * @param label текст
 * @param labelStyle стиль текста
 * @param endContent контент вконце
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param startContentColor цвет контента вначале
 * @param endContentColor цвет контента вконце
 * @param startPadding отступ в начале
 * @param endPadding отступ в конце
 * @param startContentSize размер контента в начале
 * @param endContentSize размер контента в конце
 * @param startContentMargin отступ от [startContent]
 * @param endContentMargin отступ от [endContent]
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    label: String = "",
    labelStyle: TextStyle = TextStyle(),
    shape: CornerBasedShape = RoundedCornerShape(25),
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    backgroundColor: Brush = SolidColor(Color.Black),
    startContentColor: Color = Color.White,
    endContentColor: Color = Color.White,
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
    val measurePolicy = remember { ChipMeasurePolicy() }

    Layout(
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
        measurePolicy = measurePolicy,
        content = {
            ChipContent(
                startContent = startContent,
                endContent = endContent,
                startContentColor = startContentColor,
                endContentColor = endContentColor,
                label = label,
                labelStyle = labelStyle,
                startContentSize = startContentSize,
                endContentSize = endContentSize,
                startContentMargin = startContentMargin,
                endContentMargin = endContentMargin,
            )
        },
    )
}

@Composable
private fun ChipContent(
    startContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    startContentColor: Color,
    endContentColor: Color,
    label: String,
    labelStyle: TextStyle,
    startContentSize: Dp,
    endContentSize: Dp,
    startContentMargin: Dp,
    endContentMargin: Dp,
) {
    startContent?.let {
        CompositionLocalProvider(
            LocalTint provides startContentColor,
        ) {
            Box(
                modifier = Modifier
                    .layoutId(START_CONTENT)
                    .padding(end = startContentMargin)
                    .requiredSize(startContentSize),
            ) {
                startContent()
            }
        }
    }
    if (label.isNotEmpty()) {
        Text(
            modifier = Modifier.layoutId(TEXT_CONTENT),
            text = label,
            style = labelStyle,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
    endContent?.let {
        CompositionLocalProvider(
            LocalTint provides endContentColor,
        ) {
            Box(
                modifier = Modifier
                    .layoutId(END_CONTENT)
                    .padding(start = endContentMargin)
                    .requiredSize(endContentSize),
            ) {
                endContent()
            }
        }
    }
}

private class ChipMeasurePolicy : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)

        val startMeasurable = measurables.find { it.layoutId == START_CONTENT }
        val endMeasurable = measurables.find { it.layoutId == END_CONTENT }
        val textMeasurable = measurables.find { it.layoutId == TEXT_CONTENT }

        val startPlaceable = startMeasurable?.measure(looseConstraints)
        val endPlaceable = endMeasurable?.measure(looseConstraints)

        val startContentWidth = startPlaceable.widthOrZero()
        val startContentHeight = startPlaceable.heightOrZero()
        val endContentWidth = endPlaceable.widthOrZero()
        val endContentHeight = endPlaceable.heightOrZero()

        val textConstraints =
            if (looseConstraints.hasBoundedWidth || looseConstraints.hasFixedWidth) {
                looseConstraints.copy(
                    maxWidth = constraints.maxWidth - startContentWidth - endContentWidth,
                )
            } else {
                looseConstraints
            }
        val textPlaceable = textMeasurable?.measure(textConstraints)
        val textContentWidth = textPlaceable.widthOrZero()
        val textContentHeight = textPlaceable.heightOrZero()

        val textVerticalPosition =
            Alignment.CenterVertically.align(textContentHeight, constraints.maxHeight)
        val startVerticalPosition =
            Alignment.CenterVertically.align(startContentHeight, constraints.maxHeight)
        val endVerticalPosition =
            Alignment.CenterVertically.align(endContentHeight, constraints.maxHeight)
        val desiredWidth = startContentWidth + textContentWidth + endContentWidth

        return layout(
            width = constraints.constrainWidth(desiredWidth),
            height = constraints.constrainHeight(constraints.maxHeight),
        ) {
            startPlaceable?.placeRelative(0, startVerticalPosition)
            textPlaceable?.placeRelative(startContentWidth, textVerticalPosition)
            endPlaceable?.placeRelative(startContentWidth + textContentWidth, endVerticalPosition)
        }
    }
}

private fun Placeable?.widthOrZero(): Int {
    return this?.measuredWidth ?: 0
}

private fun Placeable?.heightOrZero(): Int {
    return this?.measuredHeight ?: 0
}

private const val START_CONTENT = "StartChipContent"
private const val END_CONTENT = "EndChipContent"
private const val TEXT_CONTENT = "TextChipContent"
