package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
        modifier = modifier
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
    ) {
        CompositionLocalProvider(
            LocalSegmentItemStyle provides style.segmentItemStyle,
        ) {
            val itemBoxModifier = if (stretch) {
                Modifier.weight(1f)
            } else {
                Modifier
            }
            segmentScope.content()
            segmentScope.segmentItems.forEach {
                Box(
                    modifier = itemBoxModifier,
                    propagateMinConstraints = true,
                ) {
                    it.invoke()
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
        modifier = modifier
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
    ) {
        CompositionLocalProvider(
            LocalSegmentItemStyle provides style.segmentItemStyle,
        ) {
            segmentScope.content()
            segmentScope.segmentItems.forEach {
                Box(propagateMinConstraints = true) {
                    it.invoke()
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
}

private class SegmentScopeImpl : SegmentScope {
    private val _segmentItems = mutableListOf<@Composable () -> Unit>()
    val segmentItems: List<@Composable () -> Unit>
        get() = _segmentItems

    override fun segmentItem(content: @Composable () -> Unit) {
        _segmentItems.add(content)
    }

    fun reset() {
        _segmentItems.clear()
    }
}
