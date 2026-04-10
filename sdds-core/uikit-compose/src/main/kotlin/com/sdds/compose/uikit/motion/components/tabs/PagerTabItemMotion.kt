package com.sdds.compose.uikit.motion.components.tabs

import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionChannelKey
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.genericBrushEvaluator
import com.sdds.compose.uikit.motion.has
import com.sdds.compose.uikit.motion.interpolation
import com.sdds.compose.uikit.motion.pointTo
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.transition
import com.sdds.compose.uikit.motion.updateInterpolationChannel
import kotlin.math.absoluteValue

/**
 * Анимация [Motion] для [TabItem] с [PagerState]
 * @param tabIndex индекс таба
 * @param pagerState состояние pager
 * @param motionStyle стиль анимации [TabItem]
 * @param interactionSource источник взаимодействий с [TabItem]
 */
@Composable
fun rememberTabItemPagerMotion(
    tabIndex: Int,
    pagerState: PagerState,
    motionStyle: TabItemMotionStyle = PagerTabItemMotionStyle,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
): Motion<TabItemMotionStyle> {
    return rememberMotion(
        style = motionStyle,
        context = rememberMotionContext(interactionSource, "Tab$tabIndex") {
            interpolationChannel(TabInterpolationChannel) {
                updateInterpolationChannel(tabIndex) {
                    calculateSelectionFraction(pagerState, tabIndex)
                }
            }
        },
    )
}

/**
 * Возвращает флаг выбран ли таб с индексом [tabIndex] на основе [pagerState]
 */
@Composable
fun rememberTabSelectedState(tabIndex: Int, pagerState: PagerState): State<Boolean> {
    return remember(tabIndex, pagerState) {
        derivedStateOf { calculateSelectionFraction(pagerState, tabIndex) > 0f }
    }
}

@Immutable
private object TabInterpolationChannel : MotionChannelKey

private val PagerTabItemCounterInterpolation = interpolation(TabInterpolationChannel) {
    segment {
        vector { state -> state pointTo InteractiveState.Selected }
        condition { state -> state has InteractiveState.Selected }
    } evaluatesBy { genericBrushEvaluator() }
}

private val PagerTabItemCounterMotionStyle = CounterMotionStyle.builder()
    .backgroundBrush(PagerTabItemCounterInterpolation)
    .textBrush(PagerTabItemCounterInterpolation)
    .style()

private val PagerTabItemInterpolationMotion = interpolation(TabInterpolationChannel, label = "PagerTabItem") {
    segment {
        vector { state -> state pointTo InteractiveState.Selected }
        condition { state -> state has InteractiveState.Selected }
    } evaluatesBy { genericBrushEvaluator() }
}

private val PagerTabItemTransitionMotion = transition<Brush> (label = "PagerTabItemTransition") {
    segment {
        condition { state -> state changes InteractiveState.Pressed }
    } changesWith { finite(tween(200)) }

    segment {} changesWith { finite(snap()) }
}

private val PagerTabItemMotionStyle = TabItemMotionStyle.builder()
    .labelColor(PagerTabItemInterpolationMotion)
    .backgroundColor(PagerTabItemTransitionMotion)
    .valueColor(PagerTabItemInterpolationMotion)
    .startContentColor(PagerTabItemInterpolationMotion)
    .endContentColor(PagerTabItemInterpolationMotion)
    .actionColor(PagerTabItemInterpolationMotion)
    .counterMotionStyle(PagerTabItemCounterMotionStyle)
    .style()

private fun calculateSelectionFraction(pagerState: PagerState, tabIndex: Int): Float {
    val pagePosition = pagerState.currentPage + pagerState.currentPageOffsetFraction
    val selectionFraction = (1f - (pagePosition - tabIndex).absoluteValue).coerceIn(0f, 1f)
    return selectionFraction
}
