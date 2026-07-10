package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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
    val segmentScope = remember { SegmentScopeImpl() }
    val stretchModifier = if (stretch) Modifier.fillMaxWidth() else Modifier
    Row(
        modifier = Modifier
            .height(IntrinsicSize.Min)
            .then(modifier)
            .background(
                color = if (hasBackground) {
                    style.colors.backgroundColor.colorForInteraction(interactionSource)
                } else {
                    Color.Transparent
                },
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            )
            .then(stretchModifier),
        horizontalArrangement = Arrangement.spacedBy(style.dimensions.gap),
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
                                top = style.dimensions.dividerPaddingStart,
                                bottom = style.dimensions.dividerPaddingEnd,
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
    val segmentScope = remember { SegmentScopeImpl() }
    Column(
        modifier = Modifier
            .width(IntrinsicSize.Min)
            .then(modifier)
            .background(
                color = if (hasBackground) {
                    style.colors.backgroundColor.colorForInteraction(interactionSource)
                } else {
                    Color.Transparent
                },
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            ),
        verticalArrangement = Arrangement.spacedBy(style.dimensions.gap),
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
                                start = style.dimensions.dividerPaddingStart,
                                end = style.dimensions.dividerPaddingEnd,
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
