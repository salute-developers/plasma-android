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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.DpSize
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.ButtonText
import com.sdds.compose.uikit.internal.segment.getSegmentDpAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.counter.rememberCounterMotion
import com.sdds.compose.uikit.motion.components.segment.SegmentItemMotionStyle
import com.sdds.compose.uikit.motion.components.segment.rememberSegmentItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент SegmentItem
 *
 * @param label основной текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param value дополнительный текст
 * @param isSelected выбран ли компонент
 * @param startIcon иконка в начале
 * @param endIcon иконка в конце
 * @param counter значение счетчика
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 * @param semanticStateSource источник семантических состояний
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
    semanticStateSource: MutableSemanticStateSource = remember { MutableSemanticStateSource() },
) {
    SegmentItem(
        motion = rememberSegmentItemMotion(
            motionContext = rememberMotionContext(semanticStateSource, interactionSource),
        ),
        label = label,
        modifier = modifier,
        style = style,
        isSelected = isSelected,
        value = value,
        startIcon = startIcon,
        endIcon = endIcon,
        counter = counter,
        enabled = enabled,
    )
}

/**
 * Компонент SegmentItem
 *
 * @param label основной текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param value дополнительный текст
 * @param isSelected выбран ли компонент
 * @param startIcon иконка в начале
 * @param endIcon иконка в конце
 * @param counter значение счетчика
 * @param enabled включен ли компонент
 * @param motion контекст состояний и стиль переходов; форма переключается без интерполяции
 */
@Composable
fun SegmentItem(
    motion: Motion<SegmentItemMotionStyle>,
    label: String,
    modifier: Modifier = Modifier,
    style: SegmentItemStyle = LocalSegmentItemStyle.current,
    isSelected: Boolean = false,
    value: String? = null,
    startIcon: Painter? = null,
    endIcon: Painter? = null,
    counter: String? = null,
    enabled: Boolean = true,
) {
    SegmentItem(
        motion = motion,
        label = label,
        modifier = modifier,
        isSelected = isSelected,
        style = style,
        value = value,
        startContent = if (startIcon != null) {
            @Composable {
                val startContentSize by style.dimensions.startContentSizeValues.getSegmentDpAsState(
                    motion.context,
                    motion.style.startContentSize,
                )
                Icon(
                    modifier = Modifier
                        .size(startContentSize)
                        .defaultMinSize(
                            minHeight = startContentSize,
                            minWidth = startContentSize,
                        ),
                    painter = startIcon,
                    contentDescription = "",
                )
            }
        } else {
            null
        },
        endContent = endIconOrCounter(
            isSelected = isSelected,
            endIcon = endIcon,
            counter = counter,
            style = style,
            motion = motion,
        ),
        enabled = enabled,
    )
}

/**
 * Компонент SegmentItem
 *
 * @param label основной текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param value дополнительный текст
 * @param isSelected выбран ли компонент
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 * @param semanticStateSource источник семантических состояний
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
    semanticStateSource: MutableSemanticStateSource = remember { MutableSemanticStateSource() },
) {
    SegmentItem(
        motion = rememberSegmentItemMotion(
            motionContext = rememberMotionContext(semanticStateSource, interactionSource),
        ),
        label = label,
        modifier = modifier,
        isSelected = isSelected,
        style = style,
        value = value,
        startContent = startContent,
        endContent = endContent,
        enabled = enabled,
    )
}

/**
 * Компонент SegmentItem
 *
 * @param label основной текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param value дополнительный текст
 * @param isSelected выбран ли компонент
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param motion контекст состояний и стиль переходов; форма переключается без интерполяции
 */
@Composable
fun SegmentItem(
    motion: Motion<SegmentItemMotionStyle>,
    label: String,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    style: SegmentItemStyle = LocalSegmentItemStyle.current,
    value: String? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
) {
    SegmentItem(
        motion = motion,
        labelContent = { Text(label, maxLines = 1, overflow = TextOverflow.Ellipsis) },
        modifier = modifier,
        isSelected = isSelected,
        style = style,
        valueContent = if (value != null) {
            { Text(value, maxLines = 1, overflow = TextOverflow.Ellipsis) }
        } else {
            null
        },
        startContent = startContent,
        endContent = endContent,
        enabled = enabled,
    )
}

/**
 * Компонент SegmentItem
 *
 * @param labelContent контент основного текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли компонент
 * @param valueContent контент допольнительного текста
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 * @param semanticStateSource источник семантических состояний
 */
@Composable
fun SegmentItem(
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    style: SegmentItemStyle = LocalSegmentItemStyle.current,
    valueContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    semanticStateSource: MutableSemanticStateSource = remember { MutableSemanticStateSource() },
) {
    SegmentItem(
        motion = rememberSegmentItemMotion(
            motionContext = rememberMotionContext(semanticStateSource, interactionSource),
        ),
        labelContent = labelContent,
        modifier = modifier,
        isSelected = isSelected,
        style = style,
        valueContent = valueContent,
        startContent = startContent,
        endContent = endContent,
        enabled = enabled,
    )
}

/**
 * Компонент SegmentItem
 *
 * @param labelContent контент основного текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли компонент
 * @param valueContent контент допольнительного текста
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param motion контекст состояний и стиль переходов; форма переключается без интерполяции
 */
@Composable
fun SegmentItem(
    motion: Motion<SegmentItemMotionStyle>,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    style: SegmentItemStyle = LocalSegmentItemStyle.current,
    valueContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
) {
    val backgroundBrush = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val shape by style.shapes.getValueAsState(motion.context)
    val minHeight by style.dimensions.minHeightValues.getSegmentDpAsState(motion.context, motion.style.minHeight)
    val minWidth by style.dimensions.minWidthValues.getSegmentDpAsState(motion.context, motion.style.minWidth)
    val paddingStart by style.dimensions.paddingStartValues.getSegmentDpAsState(
        motion.context,
        motion.style.paddingStart,
    )
    val paddingEnd by style.dimensions.paddingEndValues.getSegmentDpAsState(motion.context, motion.style.paddingEnd)
    val valueMargin by style.dimensions.valueMarginValues.getSegmentDpAsState(motion.context, motion.style.valueMargin)
    val isFocused by motion.context.interactionSource.collectIsFocusedAsState()
    Row(
        modifier = modifier
            .defaultMinSize(minHeight = minHeight, minWidth = minWidth)
            .focusSelector(LocalFocusSelectorSettings.current, shape) { isFocused }
            .selection(isSelected, motion.context.semanticStateSource)
            .graphicsLayer { this.alpha = if (enabled) 1f else style.disabledAlpha }
            .background(brush = backgroundBrush.value, shape = shape)
            .padding(start = paddingStart, end = paddingEnd),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        startContent?.let { content -> StartContent(style, motion, content) }
        ButtonText(
            labelContent = labelContent,
            labelColor = style.colors.labelBrush,
            labelTextStyle = style.labelStyles,
            valueContent = valueContent,
            valueTextStyle = style.valueStyles,
            valueColor = style.colors.valueBrush,
            valueMargin = valueMargin,
            motion = motion,
        )
        endContent?.let { content -> EndContent(style, motion, content) }
    }
}

private fun endIconOrCounter(
    isSelected: Boolean,
    endIcon: Painter?,
    counter: String?,
    style: SegmentItemStyle,
    motion: Motion<SegmentItemMotionStyle>,
): @Composable (() -> Unit)? {
    return if (endIcon != null) {
        @Composable {
            val endContentSize by style.dimensions.endContentSizeValues.getSegmentDpAsState(
                motion.context,
                motion.style.endContentSize,
            )
            Icon(
                modifier = Modifier
                    .size(endContentSize)
                    .defaultMinSize(minHeight = endContentSize, minWidth = endContentSize),
                painter = endIcon,
                contentDescription = "",
            )
        }
    } else if (!counter.isNullOrEmpty()) {
        @Composable {
            Counter(
                modifier = Modifier.selection(isSelected, motion.context.semanticStateSource),
                count = AnnotatedString(counter),
                style = style.counterStyle,
                interactionSource = motion.context.interactionSource,
                motion = rememberCounterMotion(motionContext = motion.context),
            )
        }
    } else {
        null
    }
}

@Composable
private fun StartContent(
    style: SegmentItemStyle,
    motion: Motion<SegmentItemMotionStyle>,
    content: @Composable () -> Unit,
) {
    val brush = style.colors.startContentBrush.getBrushAsState(motion.context, motion.style.startContentColor)
    val size by style.dimensions.startContentSizeValues.getSegmentDpAsState(
        motion.context,
        motion.style.startContentSize,
    )
    val padding by style.dimensions.startContentPaddingValues.getSegmentDpAsState(
        motion.context,
        motion.style.startContentPadding,
    )
    CompositionLocalProvider(
        LocalTintBrushProducer provides { brush.value },
        LocalCounterStyle provides style.counterStyle,
        LocalIconDefaultSize provides DpSize(size, size),
    ) {
        Box(
            modifier = Modifier.padding(end = padding),
            contentAlignment = Alignment.Center,
        ) { content() }
    }
}

@Composable
private fun EndContent(
    style: SegmentItemStyle,
    motion: Motion<SegmentItemMotionStyle>,
    content: @Composable () -> Unit,
) {
    val brush = style.colors.endContentBrush.getBrushAsState(motion.context, motion.style.endContentColor)
    val size by style.dimensions.endContentSizeValues.getSegmentDpAsState(
        motion.context,
        motion.style.endContentSize,
    )
    val padding by style.dimensions.endContentPaddingValues.getSegmentDpAsState(
        motion.context,
        motion.style.endContentPadding,
    )
    CompositionLocalProvider(
        LocalTintBrushProducer provides { brush.value },
        LocalCounterStyle provides style.counterStyle,
        LocalIconDefaultSize provides DpSize(size, size),
    ) {
        Box(
            modifier = Modifier.padding(start = padding),
            contentAlignment = Alignment.Center,
        ) { content() }
    }
}
