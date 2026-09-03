package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.segment.getSegmentDpAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.segment.SegmentMotionStyle
import com.sdds.compose.uikit.motion.components.segment.rememberSegmentMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент Segment с горизонтальной ориентацией
 *
 * @param modifier модификатор
 * @param style стиль компонента [SegmentStyle]
 * @param stretch может ли компонент растягиваться по ширине
 * @param hasBackground включает фон
 * @param interactionSource источник взаимодействий
 * @param content контент
 */
@Composable
fun SegmentHorizontal(
    modifier: Modifier = Modifier,
    style: SegmentStyle = LocalSegmentStyle.current,
    stretch: Boolean = true,
    hasBackground: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable SegmentScope.() -> Unit,
) {
    SegmentHorizontal(
        motion = rememberSegmentMotion(motionContext = rememberMotionContext(interactionSource)),
        modifier = modifier,
        style = style,
        stretch = stretch,
        hasBackground = hasBackground,
        content = content,
    )
}

/**
 * Компонент Segment с горизонтальной ориентацией
 *
 * @param modifier модификатор
 * @param style стиль компонента [SegmentStyle]
 * @param stretch может ли компонент растягиваться по ширине
 * @param hasBackground включает фон
 * @param motion контекст состояний и стиль переходов; форма переключается без интерполяции
 * @param content контент
 */
@Composable
fun SegmentHorizontal(
    motion: Motion<SegmentMotionStyle>,
    modifier: Modifier = Modifier,
    style: SegmentStyle = LocalSegmentStyle.current,
    stretch: Boolean = true,
    hasBackground: Boolean = true,
    content: @Composable SegmentScope.() -> Unit,
) {
    val backgroundBrush = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val shape by style.shapes.getValueAsState(motion.context)
    val paddingStart by style.dimensions.paddingStartValues.getSegmentDpAsState(
        motion.context,
        motion.style.paddingStart,
    )
    val paddingEnd by style.dimensions.paddingEndValues.getSegmentDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop by style.dimensions.paddingTopValues.getSegmentDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom by style.dimensions.paddingBottomValues.getSegmentDpAsState(
        motion.context,
        motion.style.paddingBottom,
    )
    val gap by style.dimensions.gapValues.getSegmentDpAsState(motion.context, motion.style.gap)
    val dividerPaddingStart by style.dimensions.dividerPaddingStartValues.getSegmentDpAsState(
        motion.context,
        motion.style.dividerPaddingStart,
    )
    val dividerPaddingEnd by style.dimensions.dividerPaddingEndValues.getSegmentDpAsState(
        motion.context,
        motion.style.dividerPaddingEnd,
    )
    val segmentScope = remember { SegmentScopeImpl() }
    val stretchModifier = if (stretch) Modifier.fillMaxWidth() else Modifier
    Row(
        modifier = Modifier
            .then(modifier)
            .background(
                brush = if (hasBackground) {
                    backgroundBrush.value
                } else {
                    Color.Transparent.asBrush()
                },
                shape = shape,
            )
            .padding(
                start = paddingStart,
                end = paddingEnd,
                top = paddingTop,
                bottom = paddingBottom,
            )
            .then(stretchModifier),
        horizontalArrangement = Arrangement.spacedBy(gap.toArrangementSpacing()),
    ) {
        CompositionLocalProvider(
            LocalSegmentItemStyle provides style.segmentItemStyle,
            LocalDividerStyle provides style.dividerStyle,
            LocalDividerOrientation provides DividerOrientation.Vertical,
        ) {
            val itemBoxModifier = if (stretch) Modifier.weight(1f) else Modifier
            segmentScope.content()
            segmentScope.segmentItems.forEach { item ->
                when (item) {
                    is SegmentItem.Divider -> {
                        Box(
                            Modifier.padding(
                                top = dividerPaddingStart,
                                bottom = dividerPaddingEnd,
                            ),
                        ) {
                            item.content.invoke()
                        }
                    }
                    is SegmentItem.Item -> {
                        Box(
                            modifier = itemBoxModifier,
                            propagateMinConstraints = true,
                        ) {
                            item.content.invoke()
                        }
                    }
                }
            }
            segmentScope.reset()
        }
    }
}

/**
 * Компонент Segment с вертикальной ориентацией
 *
 * @param modifier модификатор
 * @param style стиль компонента [SegmentStyle]
 * @param hasBackground включает фон
 * @param interactionSource источник взаимодействий
 * @param content контент
 */
@Composable
fun SegmentVertical(
    modifier: Modifier = Modifier,
    style: SegmentStyle = LocalSegmentStyle.current,
    hasBackground: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable SegmentScope.() -> Unit,
) {
    SegmentVertical(
        motion = rememberSegmentMotion(motionContext = rememberMotionContext(interactionSource)),
        modifier = modifier,
        style = style,
        hasBackground = hasBackground,
        content = content,
    )
}

/**
 * Компонент Segment с вертикальной ориентацией
 *
 * @param modifier модификатор
 * @param style стиль компонента [SegmentStyle]
 * @param hasBackground включает фон
 * @param motion контекст состояний и стиль переходов; форма переключается без интерполяции
 * @param content контент
 */
@Composable
fun SegmentVertical(
    motion: Motion<SegmentMotionStyle>,
    modifier: Modifier = Modifier,
    style: SegmentStyle = LocalSegmentStyle.current,
    hasBackground: Boolean = true,
    content: @Composable SegmentScope.() -> Unit,
) {
    val backgroundBrush = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val shape by style.shapes.getValueAsState(motion.context)
    val paddingStart by style.dimensions.paddingStartValues.getSegmentDpAsState(
        motion.context,
        motion.style.paddingStart,
    )
    val paddingEnd by style.dimensions.paddingEndValues.getSegmentDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop by style.dimensions.paddingTopValues.getSegmentDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom by style.dimensions.paddingBottomValues.getSegmentDpAsState(
        motion.context,
        motion.style.paddingBottom,
    )
    val gap by style.dimensions.gapValues.getSegmentDpAsState(motion.context, motion.style.gap)
    val dividerPaddingStart by style.dimensions.dividerPaddingStartValues.getSegmentDpAsState(
        motion.context,
        motion.style.dividerPaddingStart,
    )
    val dividerPaddingEnd by style.dimensions.dividerPaddingEndValues.getSegmentDpAsState(
        motion.context,
        motion.style.dividerPaddingEnd,
    )
    val segmentScope = remember { SegmentScopeImpl() }
    Column(
        modifier = Modifier
            .then(modifier)
            .background(
                brush = if (hasBackground) {
                    backgroundBrush.value
                } else {
                    Color.Transparent.asBrush()
                },
                shape = shape,
            )
            .padding(
                start = paddingStart,
                end = paddingEnd,
                top = paddingTop,
                bottom = paddingBottom,
            ),
        verticalArrangement = Arrangement.spacedBy(gap.toArrangementSpacing()),
    ) {
        CompositionLocalProvider(
            LocalSegmentItemStyle provides style.segmentItemStyle,
            LocalDividerStyle provides style.dividerStyle,
            LocalDividerOrientation provides DividerOrientation.Horizontal,
        ) {
            segmentScope.content()
            segmentScope.segmentItems.forEach { item ->
                when (item) {
                    is SegmentItem.Divider -> {
                        Box(
                            Modifier.padding(
                                start = dividerPaddingStart,
                                end = dividerPaddingEnd,
                            ),
                        ) {
                            item.content.invoke()
                        }
                    }
                    is SegmentItem.Item -> item.content.invoke()
                }
            }
            segmentScope.reset()
        }
    }
}

/**
 * Скоуп контента [Segment]
 */
interface SegmentScope {

    /**
     * Добавляет [content] в скоуп [Segment]
     */
    fun segmentItem(content: @Composable () -> Unit)

    /**
     * Добавляет [content] в скоуп [Segment]
     */
    fun divider(content: @Composable () -> Unit)
}

private class SegmentScopeImpl : SegmentScope {
    private val _segmentItems = mutableListOf<SegmentItem>()

    val segmentItems: List<SegmentItem>
        get() = _segmentItems

    override fun segmentItem(content: @Composable () -> Unit) {
        _segmentItems.add(SegmentItem.Item(content))
    }

    override fun divider(content: @Composable () -> Unit) {
        _segmentItems.add(SegmentItem.Divider(content))
    }

    fun reset() {
        _segmentItems.clear()
    }
}

private sealed class SegmentItem {

    abstract val content: @Composable () -> Unit

    data class Item(override val content: @Composable () -> Unit) : SegmentItem()

    data class Divider(override val content: @Composable () -> Unit) : SegmentItem()
}

private fun Dp.toArrangementSpacing(): Dp {
    return if (value.isFinite()) this else 0.dp
}
