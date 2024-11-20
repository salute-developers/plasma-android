package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.applyFocusSelector

/**
 * Компонент Chip с поддержкой кликабельности
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick обработчик нажатий
 * @param label текст
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    style: ChipStyle = LocalChipStyle.current,
    onClick: (() -> Unit)? = null,
    label: String = "",
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val measurePolicy = remember { ChipMeasurePolicy() }
    val dimensions = remember(style) { style.dimensions }
    val colors = remember(style) { style.colors }
    val backgroundColor = colors.backgroundColor.colorForInteractionAsState(interactionSource)
    val isFocused by interactionSource.collectIsFocusedAsState()
    Layout(
        modifier = modifier
            .height(dimensions.height)
            .applyFocusSelector(
                focusSelectorMode = LocalFocusSelectorMode.current,
                originalShape = style.shape,
            ) { isFocused }
            .surface(
                shape = style.shape,
                onClick = onClick,
                backgroundColor = { SolidColor(backgroundColor.value) },
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            )
            .padding(start = dimensions.startPadding, end = dimensions.endPadding),
        measurePolicy = measurePolicy,
        content = {
            val startContentColor = colors.startContentColor.colorForInteraction(interactionSource)
            val endContentColor = colors.endContentColor.colorForInteraction(interactionSource)
            val labelColor = colors.labelColor.colorForInteraction(interactionSource)
            ChipContent(
                startContent = startContent,
                endContent = endContent,
                label = label,
                labelStyle = style.labelStyle,
                dimensions = dimensions,
                labelColor = labelColor,
                startContentColor = startContentColor,
                endContentColor = endContentColor,
            )
        },
    )
}

/**
 * Компонент Chip с поддержкой selected состояния
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли chip
 * @param onSelectedChange обработчик смены состояния chip
 * @param startContent контент вначале
 * @param label текст
 * @param endContent контент вконце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    style: ChipStyle = LocalChipStyle.current,
    isSelected: Boolean = false,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    label: String = "",
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val measurePolicy = remember { ChipMeasurePolicy() }
    val dimensions = remember(style) { style.dimensions }
    val colors = remember(style) { style.colors }
    val backgroundColor = colors.backgroundColor.colorForInteractionAsState(interactionSource)
    val isFocused by interactionSource.collectIsFocusedAsState()
    Layout(
        modifier = modifier
            .height(dimensions.height)
            .applyFocusSelector(
                focusSelectorMode = LocalFocusSelectorMode.current,
                originalShape = style.shape,
            ) { isFocused }
            .surface(
                value = isSelected,
                onValueChange = onSelectedChange,
                shape = style.shape,
                indication = indication,
                backgroundColor = { SolidColor(backgroundColor.value) },
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                enabled = enabled,
                interactionSource = interactionSource,
            )
            .padding(start = dimensions.startPadding, end = dimensions.endPadding),
        measurePolicy = measurePolicy,
        content = {
            val startContentColor = colors.startContentColor.colorForInteraction(interactionSource)
            val endContentColor = colors.endContentColor.colorForInteraction(interactionSource)
            val labelColor = colors.labelColor.colorForInteraction(interactionSource)
            ChipContent(
                startContent = startContent,
                endContent = endContent,
                label = label,
                labelStyle = style.labelStyle,
                labelColor = labelColor,
                dimensions = dimensions,
                startContentColor = startContentColor,
                endContentColor = endContentColor,
            )
        },
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object Chip {

    /**
     * Размеры и отступы компонента [Chip]
     * @property height высота компонента
     * @property startPadding отступ в начале
     * @property endPadding отступ в конце
     * @property startContentSize размер контента в начале
     * @property endContentSize размер контента в конце
     * @property startContentMargin отступ от контента в начале
     * @property endContentMargin отступ от контента в конце
     */
    @Immutable
    data class Dimensions(
        val height: Dp = 48.dp,
        val startContentSize: Dp = 24.dp,
        val endContentSize: Dp = 24.dp,
        val startContentMargin: Dp = 12.dp,
        val endContentMargin: Dp = 12.dp,
        val startPadding: Dp = 12.dp,
        val endPadding: Dp = 12.dp,
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object EmbeddedChip

@Composable
private fun ChipContent(
    startContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    startContentColor: Color,
    endContentColor: Color,
    labelColor: Color,
    label: String,
    labelStyle: TextStyle,
    dimensions: Chip.Dimensions,
) {
    startContent?.let {
        CompositionLocalProvider(
            LocalTint provides startContentColor,
        ) {
            Box(
                modifier = Modifier
                    .layoutId(START_CONTENT)
                    .padding(end = dimensions.startContentMargin)
                    .requiredSize(dimensions.startContentSize),
            ) {
                startContent()
            }
        }
    }
    if (label.isNotEmpty()) {
        Text(
            modifier = Modifier.layoutId(TEXT_CONTENT),
            text = label,
            style = labelStyle.copy(color = labelColor),
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
                    .padding(start = dimensions.endContentMargin)
                    .requiredSize(dimensions.endContentSize),
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

private const val ENABLED_CHIP_ALPHA = 1f
private const val START_CONTENT = "StartChipContent"
private const val END_CONTENT = "EndChipContent"
private const val TEXT_CONTENT = "TextChipContent"
