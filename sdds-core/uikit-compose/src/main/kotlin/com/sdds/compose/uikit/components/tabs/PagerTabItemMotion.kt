package com.sdds.compose.uikit.components.tabs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionChannelKey
import com.sdds.compose.uikit.motion.backwardVector
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.changesFrom
import com.sdds.compose.uikit.motion.changesTo
import com.sdds.compose.uikit.motion.colorInterpolator
import com.sdds.compose.uikit.motion.fillStyleInterpolator
import com.sdds.compose.uikit.motion.forwardVector
import com.sdds.compose.uikit.motion.interpolation
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.updateInterpolationChannel
import kotlin.math.absoluteValue

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
                updateInterpolationChannel {
                    val pagePosition = pagerState.currentPage + pagerState.currentPageOffsetFraction
                    (1f - (pagePosition - tabIndex).absoluteValue).coerceIn(0f, 1f)
                }
            }
        }
    )
}

@Composable
fun rememberTabSelectedState(tabIndex: Int, pagerState: PagerState): State<Boolean> {
    return remember {
        derivedStateOf {
            val pagePosition = pagerState.currentPage + pagerState.currentPageOffsetFraction
            val selectionFraction = (1f - (pagePosition - tabIndex).absoluteValue).coerceIn(0f, 1f)
            selectionFraction > 0f
        }
    }
}

@Immutable
private object TabInterpolationChannel : MotionChannelKey

private val PagerTabItemCounterMotionStyle = CounterMotionStyle.builder()
    .backgroundColor(
        interpolation("CounterBackgroundColor") {
            segment {
                channel(TabInterpolationChannel)
                vector { state -> state.backwardVector() }
                condition { state -> state changesFrom InteractiveState.Selected }
            } interpolatesBy { colorInterpolator() }

            segment {
                channel(TabInterpolationChannel)
                vector { state -> state.forwardVector() }
                condition { state -> state changesTo InteractiveState.Selected }
            } interpolatesBy { colorInterpolator() }

        }
    )
    .style()

private val PagerTabItemSelectInterpolationMotion = interpolation {
    segment {
        channel(TabInterpolationChannel)
        vector { state -> state.backwardVector() }
        condition { state -> state changes InteractiveState.Pressed }
    } interpolatesBy { fillStyleInterpolator() }

    segment {
        channel(TabInterpolationChannel)
        vector { state -> state.forwardVector() }
        condition { state -> state changesTo InteractiveState.Selected }
    } interpolatesBy { fillStyleInterpolator() }
}

val PagerTabItemMotionStyle = TabItemMotionStyle.builder()
    .labelFillStyle(PagerTabItemSelectInterpolationMotion)
    .backgroundFillStyle(PagerTabItemSelectInterpolationMotion)
    .valueFillStyle(PagerTabItemSelectInterpolationMotion)
    .startContentFillStyle(PagerTabItemSelectInterpolationMotion)
    .endContentFillStyle(PagerTabItemSelectInterpolationMotion)
    .actionFillStyle(PagerTabItemSelectInterpolationMotion)
    .counterMotionStyle(PagerTabItemCounterMotionStyle)
    .style()