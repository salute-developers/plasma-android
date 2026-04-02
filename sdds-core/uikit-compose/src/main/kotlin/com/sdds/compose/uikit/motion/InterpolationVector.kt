package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.sdds.compose.uikit.interactions.ValueStateSet

@Immutable
interface InterpolationVector {

    val from: ValueStateSet

    val to: ValueStateSet
}

@Stable
fun interface InterpolationVectorProvider {

    fun provide(stateSnapshot: MotionStateSnapshot): InterpolationVector
}

fun MotionStateSnapshot.forwardVector(): InterpolationVector = InterpolationVectorImpl(initial, target)

fun MotionStateSnapshot.backwardVector(): InterpolationVector = InterpolationVectorImpl(target, initial)

@Immutable
private class InterpolationVectorImpl(
    override val from: ValueStateSet,
    override val to: ValueStateSet
): InterpolationVector
