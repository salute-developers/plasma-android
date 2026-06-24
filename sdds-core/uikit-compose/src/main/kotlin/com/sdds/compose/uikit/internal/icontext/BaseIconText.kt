package com.sdds.compose.uikit.internal.icontext

import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.common.IconTextMotionStyle
import com.sdds.compose.uikit.motion.components.common.rememberIconTextMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Базовый компонент для отрисовки
 * Текста в центральной части и Кастомного контента (Иконки)
 * в начале и в конце компонента
 */
@Composable
internal fun BaseIconText(
    modifier: Modifier = Modifier,
    dimensionsSet: BaseIconText.Dimensions,
    brushesSet: BaseIconText.Brushes,
    labelContent: String = "",
    labelStyle: StatefulValue<TextStyle>,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<IconTextMotionStyle> = rememberIconTextMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val measurePolicy = remember { IconTextMeasurePolicy() }
    val height = dimensionsSet.height?.getValue(interactionSource)
    val startPadding = dimensionsSet.startPadding.getValue(interactionSource)
    val endPadding = dimensionsSet.endPadding.getValue(interactionSource)
    Layout(
        modifier = modifier
            .then(height?.let { Modifier.height(it) } ?: Modifier)
            .padding(
                start = startPadding,
                end = endPadding,
            ),
        measurePolicy = measurePolicy,
        content = {
            IconTextContent(
                dimensions = dimensionsSet,
                startContent = startContent,
                endContent = endContent,
                brushSet = brushesSet,
                label = labelContent,
                labelStyle = labelStyle,
                motion = motion,
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
    brushesSet: BaseIconText.Brushes,
    labelStyle: StatefulValue<TextStyle> = TextStyle.Default.asStatefulValue(),
    labelContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<IconTextMotionStyle> = rememberIconTextMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val height = dimensionsSet.height?.getValue(interactionSource)
    val startPadding = dimensionsSet.startPadding.getValue(interactionSource)
    val endPadding = dimensionsSet.endPadding.getValue(interactionSource)
    val measurePolicy = remember { IconTextMeasurePolicy() }
    Layout(
        modifier = modifier
            .then(height?.let { Modifier.height(it) } ?: Modifier)
            .padding(
                start = startPadding,
                end = endPadding,
            ),
        measurePolicy = measurePolicy,
        content = {
            IconTextContent(
                dimensions = dimensionsSet,
                startContent = startContent,
                endContent = endContent,
                labelStyle = labelStyle,
                brushSet = brushesSet,
                labelContent = labelContent,
                motion = motion,
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

        val maxTextWidth = (constraints.maxWidth - startContentWidth - endContentWidth)
            .coerceAtLeast(0)
        val textConstraints = if (looseConstraints.hasBoundedWidth) {
            looseConstraints.copy(maxWidth = maxTextWidth)
        } else {
            looseConstraints
        }
        val textPlaceable = textMeasurable?.measure(textConstraints)
        val textContentWidth = textPlaceable.widthOrZero()
        val textContentHeight = textPlaceable.heightOrZero()
        val desiredWidth = startContentWidth + textContentWidth + endContentWidth
        val desireHeight = maxOf(startContentHeight, textContentHeight, endContentHeight)
        val finalWidth = constraints.constrainWidth(desiredWidth)
        val finalHeight = constraints.constrainHeight(desireHeight)
        val endContentX = (finalWidth - endContentWidth).coerceAtLeast(0)

        return layout(
            width = finalWidth,
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
                    endContentX,
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
    label: String,
    labelStyle: StatefulValue<TextStyle>,
    brushSet: BaseIconText.Brushes,
    dimensions: BaseIconText.Dimensions,
    motion: Motion<IconTextMotionStyle>,
) {
    startContent?.let {
        val startStates = brushSet.startContentBrush ?: brushSet.contentBrush
        val startBrush = startStates.getBrushAsState(motion.context, motion.style.startContentColor)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { startBrush.value },
        ) {
            val startSpacing = if (label.isNotEmpty()) {
                dimensions.startContentMargin.getValue(motion.context.interactionSource)
            } else {
                0.dp
            }
            val size = dimensions.startContentSize.getValue(motion.context.interactionSource)
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .layoutId(START_CONTENT)
                    .padding(end = startSpacing)
                    .requiredSize(size),
            ) {
                startContent()
            }
        }
    }
    if (label.isNotEmpty()) {
        val style by labelStyle.getTextStyleAsState(motion.context, motion.style.labelStyle)
        val labelStates = brushSet.labelBrush ?: brushSet.contentBrush
        val labelBrush = labelStates.getBrushAsState(motion.context, motion.style.labelColor)
        Text(
            modifier = Modifier.layoutId(TEXT_CONTENT),
            text = label,
            style = style,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            brush = { labelBrush.value },
        )
    }
    endContent?.let {
        val endStates = brushSet.endContentBrush ?: brushSet.contentBrush
        val endBrush = endStates.getBrushAsState(motion.context, motion.style.endContentColor)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { endBrush.value },
        ) {
            val endSpacing = if (label.isNotEmpty()) {
                dimensions.endContentMargin.getValue(motion.context.interactionSource)
            } else {
                0.dp
            }
            val size = dimensions.startContentSize.getValue(motion.context.interactionSource)
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .layoutId(END_CONTENT)
                    .padding(start = endSpacing)
                    .requiredSize(size),
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
    brushSet: BaseIconText.Brushes,
    labelStyle: StatefulValue<TextStyle>,
    labelContent: (@Composable () -> Unit)?,
    dimensions: BaseIconText.Dimensions,
    motion: Motion<IconTextMotionStyle>,
) {
    val interactionSource = motion.context.interactionSource
    startContent?.let {
        val startStates = brushSet.startContentBrush ?: brushSet.contentBrush
        val startBrush = startStates.getBrushAsState(motion.context, motion.style.startContentColor)
        val size = dimensions.startContentSize.getValue(interactionSource)
        val margin = dimensions.startContentMargin.getValue(interactionSource)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { startBrush.value },
            LocalIconDefaultSize provides DpSize(size, size),
        ) {
            Box(
                modifier = Modifier
                    .layoutId(START_CONTENT)
                    .padding(end = margin),
            ) {
                startContent()
            }
        }
    }
    labelContent?.let {
        val style by labelStyle.getTextStyleAsState(motion.context, motion.style.labelStyle)
        val labelStates = brushSet.labelBrush ?: brushSet.contentBrush
        val labelBrush = labelStates.getBrushAsState(motion.context, motion.style.labelColor)
        ProvideTextStyle(style, brush = { labelBrush.value }) {
            Box(
                modifier = Modifier
                    .layoutId(TEXT_CONTENT),
            ) { labelContent() }
        }
    }
    endContent?.let {
        val endStates = brushSet.endContentBrush ?: brushSet.contentBrush
        val endBrush = endStates.getBrushAsState(motion.context, motion.style.endContentColor)
        val size = dimensions.endContentSize.getValue(interactionSource)
        val margin = dimensions.endContentMargin.getValue(interactionSource)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { endBrush.value },
            LocalIconDefaultSize provides DpSize(size, size),
        ) {
            Box(
                modifier = Modifier
                    .layoutId(END_CONTENT)
                    .padding(start = margin),
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
        val height: StatefulValue<Dp>? = null,
        val startContentSize: StatefulValue<Dp>,
        val endContentSize: StatefulValue<Dp>,
        val startContentMargin: StatefulValue<Dp>,
        val endContentMargin: StatefulValue<Dp>,
        val startPadding: StatefulValue<Dp>,
        val endPadding: StatefulValue<Dp>,
    ) {

        constructor(
            height: Dp? = null,
            startContentSize: Dp = 16.dp,
            endContentSize: Dp = 16.dp,
            startContentMargin: Dp = 0.dp,
            endContentMargin: Dp = 0.dp,
            startPadding: Dp = 0.dp,
            endPadding: Dp = 0.dp,
        ) : this(
            height?.asStatefulValue(),
            startContentSize.asStatefulValue(),
            endContentSize.asStatefulValue(),
            startContentMargin.asStatefulValue(),
            endContentMargin.asStatefulValue(),
            startPadding.asStatefulValue(),
            endPadding.asStatefulValue(),
        )

        constructor(
            height: Dp? = null,
            startContentSize: Dp = 16.dp,
            endContentSize: Dp = 16.dp,
            startContentMargin: Dp = 0.dp,
            endContentMargin: Dp = 0.dp,
            startPadding: StatefulValue<Dp>,
            endPadding: StatefulValue<Dp>,
        ) : this(
            height?.asStatefulValue(),
            startContentSize.asStatefulValue(),
            endContentSize.asStatefulValue(),
            startContentMargin.asStatefulValue(),
            endContentMargin.asStatefulValue(),
            startPadding,
            endPadding,
        )
    }

    /**
     * Кисти, которые используются внутри компонента.
     *
     * @property contentBrush кисть контента
     * @property labelBrush кисть текста
     * @property startContentBrush кисть контента в начале компонента
     * @property endContentBrush кисть контента в конце компонента
     */
    @Immutable
    data class Brushes(
        val contentBrush: StatefulValue<Brush> = Color.Black.asStatefulBrush(),
        val labelBrush: StatefulValue<Brush>? = contentBrush,
        val startContentBrush: StatefulValue<Brush>? = contentBrush,
        val endContentBrush: StatefulValue<Brush>? = contentBrush,
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
