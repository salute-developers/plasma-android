package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.Transition
import androidx.compose.animation.core.updateTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import com.sdds.compose.uikit.interactions.ValueStateSet

@Stable
interface MotionChannel

interface TransitionMotionChannel: MotionChannel {
    val transition: Transition<ValueStateSet>
}

interface InterpolationMotionChannel: MotionChannel {
    val fractionProvider: () -> Float
}

@Stable
interface MotionChannelKey

@Composable
fun updateInterpolationChannel(
    key: Any? = null,
    fractionProvider: () -> Float,
): InterpolationMotionChannel {
    return remember(key) {
        DefaultInterpolationMotionChannel(fractionProvider)
    }
}

internal object DefaultInterpolationChannelKey : MotionChannelKey

@Immutable
internal class DefaultTransitionMotionChannel(
    override val transition: Transition<ValueStateSet>,
) : TransitionMotionChannel

@Immutable
internal class DefaultInterpolationMotionChannel(
    override val fractionProvider: () -> Float,
) : InterpolationMotionChannel

@Composable
internal fun updateTransitionChannel(
    stateSet: ValueStateSet,
    label: String? = null,
): TransitionMotionChannel {
    val transition = updateTransition(stateSet, label)
    return remember(transition) {
        DefaultTransitionMotionChannel(transition)
    }
}

