package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.ButtonText

/**
 * Компонент SegmentItem
 *
 * @param label основной текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли компонент
 * @param startIcon иконка в начале
 * @param endIcon иконка в конце
 * @param counter значение счетчика
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 */
@Composable
fun SegmentItem(
    label: String,
    modifier: Modifier = Modifier,
    style: SegmentItemStyle = LocalSegmentItemStyle.current,
    isSelected: Boolean = false,
    value: String? = null,
    startIcon: Painter? = null,
    endIcon: Painter? = null,
    counter: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    SegmentItem(
        label = label,
        modifier = modifier,
        isSelected = isSelected,
        style = style,
        value = value,
        startContent = if (startIcon != null) {
            @Composable {
                Icon(
                    modifier = Modifier
                        .size(style.dimensions.startContentSize)
                        .defaultMinSize(
                            minHeight = style.dimensions.startContentSize,
                            minWidth = style.dimensions.startContentSize,
                        ),
                    painter = startIcon,
                    contentDescription = "",
                )
            }
        } else {
            null
        },
        endContent = endIconOrCounter(isSelected, endIcon, counter, style, interactionSource),
        enabled = enabled,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент SegmentItem
 *
 * @param label основной текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли компонент
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 */
@Composable
fun SegmentItem(
    label: String,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    style: SegmentItemStyle = LocalSegmentItemStyle.current,
    value: String? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val labelColor = style.colors.labelColor.colorForInteraction(interactionSource)
    val valueColor = style.colors.valueColor.colorForInteraction(interactionSource)
    val startContentColor = style.colors.startContentColor.colorForInteraction(interactionSource)
    val endContentColor = style.colors.endContentColor.colorForInteraction(interactionSource)
    val isFocused by interactionSource.collectIsFocusedAsState()
    Row(
        modifier = modifier
            .defaultMinSize(
                minHeight = style.dimensions.minHeight,
                minWidth = style.dimensions.minWidth,
            )
            .focusSelector(LocalFocusSelectorSettings.current, style.shape) { isFocused }
            .selection(
                selected = isSelected,
                interactionSource = interactionSource,
            )
            .graphicsLayer { this.alpha = if (enabled) 1f else style.disabledAlpha }
            .background(
                color = backgroundColor,
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        startContent?.let { content ->
            StartContent(style, startContentColor, content)
        }
        ButtonText(
            label = label,
            labelColor = labelColor,
            labelTextStyle = style.labelStyle,
            value = value,
            valueTextStyle = style.valueStyle,
            valueColor = valueColor,
            valueMargin = style.dimensions.valueMargin,
            spacing = ButtonSpacing.Packed,
        )
        endContent?.let { content ->
            EndContent(style, endContentColor, content)
        }
    }
}

private fun endIconOrCounter(
    isSelected: Boolean,
    endIcon: Painter?,
    counter: String?,
    style: SegmentItemStyle,
    interactionSource: MutableInteractionSource,
): @Composable (() -> Unit)? {
    return if (endIcon != null) {
        @Composable {
            Icon(
                modifier = Modifier
                    .size(style.dimensions.endContentSize)
                    .defaultMinSize(
                        minHeight = style.dimensions.endContentSize,
                        minWidth = style.dimensions.endContentSize,
                    ),
                painter = endIcon,
                contentDescription = "",
            )
        }
    } else if (!counter.isNullOrEmpty()) {
        @Composable {
            Counter(
                modifier = Modifier
                    .selection(
                        selected = isSelected,
                        interactionSource = interactionSource,
                    ),
                count = AnnotatedString(counter),
                style = style.counterStyle,
                interactionSource = interactionSource,
            )
        }
    } else {
        null
    }
}

@Composable
private fun StartContent(
    style: SegmentItemStyle,
    startContentColor: Color,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTint provides startContentColor,
        LocalCounterStyle provides style.counterStyle,
    ) {
        Box(
            modifier = Modifier
                .padding(end = style.dimensions.startContentPadding),
            contentAlignment = Alignment.Center,
        ) { content.invoke() }
    }
}

@Composable
private fun EndContent(
    style: SegmentItemStyle,
    endContentColor: Color,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTint provides endContentColor,
        LocalCounterStyle provides style.counterStyle,
    ) {
        Box(
            modifier = Modifier
                .padding(start = style.dimensions.endContentPadding),
            contentAlignment = Alignment.Center,
        ) { content.invoke() }
    }
}
