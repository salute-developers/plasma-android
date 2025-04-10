package com.sdds.compose.uikit.internal.icontext

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.internal.common.surface

/**
 * Базовый компонент для отрисовки
 * Текста в центральной части и Кастомного контента (Иконки)
 * в начале и в конце компонента
 */
@Composable
internal fun BaseIconText(
    modifier: Modifier = Modifier,
    dimensionsSet: BaseIconText.Dimensions,
    colorsSet: BaseIconText.Colors,
    shape: CornerBasedShape,
    labelContent: String = "",
    labelStyle: TextStyle,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val measurePolicy = remember { IconTextMeasurePolicy() }
    val background = colorsSet.backgroundColor.colorForInteractionAsState(interactionSource)
    Layout(
        modifier = modifier
            .height(dimensionsSet.height)
            .surface(
                shape = shape,
                backgroundColor = { SolidColor(background.value) },
                interactionSource = interactionSource,
            )
            .padding(start = dimensionsSet.startPadding, end = dimensionsSet.endPadding),
        measurePolicy = measurePolicy,
        content = {
            val startContentColor =
                colorsSet.startContentColor.colorForInteraction(interactionSource)
            val endContentColor =
                colorsSet.endContentColor.colorForInteraction(interactionSource)
            val labelColor =
                colorsSet.labelColor.colorForInteraction(interactionSource)
            IconTextContent(
                dimensions = dimensionsSet,
                startContent = startContent,
                endContent = endContent,
                startContentColor = startContentColor,
                endContentColor = endContentColor,
                labelColor = labelColor,
                label = labelContent,
                labelStyle = labelStyle,
            )
        },
    )
}

/**
 * Базовый компонент для отрисовки
 * Кастомного контента в центральной части и
 * Кастомного контента (Иконки) в начале и в конце компонента
 */
@Composable
internal fun BaseIconText(
    modifier: Modifier = Modifier,
    dimensionsSet: BaseIconText.Dimensions,
    colorsSet: BaseIconText.Colors,
    shape: CornerBasedShape,
    labelContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val measurePolicy = remember { IconTextMeasurePolicy() }
    val background = colorsSet.backgroundColor.colorForInteractionAsState(interactionSource)
    Layout(
        modifier = modifier
            .height(dimensionsSet.height)
            .surface(
                shape = shape,
                backgroundColor = { SolidColor(background.value) },
                interactionSource = interactionSource,
            )
            .padding(start = dimensionsSet.startPadding, end = dimensionsSet.endPadding),
        measurePolicy = measurePolicy,
        content = {
            val startContentColor =
                colorsSet.startContentColor.colorForInteraction(interactionSource)
            val endContentColor =
                colorsSet.endContentColor.colorForInteraction(interactionSource)
            val labelColor =
                colorsSet.labelColor.colorForInteraction(interactionSource)
            IconTextContent(
                dimensions = dimensionsSet,
                startContent = startContent,
                endContent = endContent,
                startContentColor = startContentColor,
                endContentColor = endContentColor,
                labelColor = labelColor,
                labelContent = labelContent,
            )
        },
    )
}

private class IconTextMeasurePolicy : MeasurePolicy {
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
        val desiredWidth = startContentWidth + textContentWidth + endContentWidth
        val desireHeight = maxOf(startContentHeight, textContentHeight, endContentHeight)
        val finalHeight = constraints.constrainHeight(desireHeight)

        return layout(
            width = constraints.constrainWidth(desiredWidth),
            height = finalHeight,
        ) {
            startPlaceable?.let {
                it.placeRelative(
                    0,
                    Alignment.CenterVertically.align(it.height, finalHeight),
                )
            }
            textPlaceable?.let {
                it.placeRelative(
                    startContentWidth,
                    Alignment.CenterVertically.align(it.height, finalHeight),
                )
            }
            endPlaceable?.let {
                it.placeRelative(
                    startContentWidth + textContentWidth,
                    Alignment.CenterVertically.align(it.height, finalHeight),
                )
            }
        }
    }
}

@Composable
private fun IconTextContent(
    startContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    startContentColor: Color,
    endContentColor: Color,
    labelColor: Color,
    label: String,
    labelStyle: TextStyle,
    dimensions: BaseIconText.Dimensions,
) {
    startContent?.let {
        CompositionLocalProvider(
            LocalTint provides startContentColor,
        ) {
            val startSpacing = remember(label, dimensions) {
                dimensions.startContentMargin.takeIf { label.isNotEmpty() } ?: 0.dp
            }
            Box(
                modifier = Modifier
                    .layoutId(START_CONTENT)
                    .padding(end = startSpacing)
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
            val endSpacing = remember(label, dimensions) {
                dimensions.endContentMargin.takeIf { label.isNotEmpty() } ?: 0.dp
            }
            Box(
                modifier = Modifier
                    .layoutId(END_CONTENT)
                    .padding(start = endSpacing)
                    .requiredSize(dimensions.endContentSize),
            ) {
                endContent()
            }
        }
    }
}

@Composable
private fun IconTextContent(
    startContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    startContentColor: Color,
    endContentColor: Color,
    labelColor: Color,
    labelContent: (@Composable () -> Unit)?,
    dimensions: BaseIconText.Dimensions,
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
    labelContent?.let {
        CompositionLocalProvider(LocalTint provides labelColor) {
            Box(
                modifier = Modifier
                    .layoutId(TEXT_CONTENT),
            ) { labelContent() }
        }
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

/**
 * Содержит сущности для конфигурирования BaseIconText
 */
internal object BaseIconText {

    /**
     * Размеры и отступы, которые используются внутри компонента.
     *
     * @property height высота кнопки
     * @property startContentSize размер контента (иконки) в начале
     * @property endContentSize размер контента (иконки) в конце
     * @property startContentMargin отступы от контента в начале
     * @property endContentMargin отступы от контента в конце
     * @property startPadding отступ в начале компонента
     * @property endPadding отступ в конце компонента
     */
    @Immutable
    data class Dimensions(
        val height: Dp,
        val startContentSize: Dp,
        val endContentSize: Dp,
        val startContentMargin: Dp,
        val endContentMargin: Dp,
        val startPadding: Dp,
        val endPadding: Dp,
    )

    /**
     * Цвета, которые используются внутри компонента.
     *
     * @property contentColor цвет контента
     * @property backgroundColor цвет фона компонента
     * @property labelColor цвет текста
     * @property startContentColor цвет контента в начале компонента
     * @property endContentColor цвет контента в конце компонента
     */
    @Immutable
    data class Colors(
        val contentColor: InteractiveColor,
        val backgroundColor: InteractiveColor,
        val labelColor: InteractiveColor,
        val startContentColor: InteractiveColor,
        val endContentColor: InteractiveColor,
    )
}

private fun Placeable?.widthOrZero(): Int {
    return this?.measuredWidth ?: 0
}

private fun Placeable?.heightOrZero(): Int {
    return this?.measuredHeight ?: 0
}

private const val START_CONTENT = "StartContent"
private const val END_CONTENT = "EndContent"
private const val TEXT_CONTENT = "TextContent"
