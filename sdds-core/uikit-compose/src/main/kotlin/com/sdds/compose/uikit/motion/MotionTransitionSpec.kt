package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.runtime.Immutable

interface MotionTransitionSpec<T> : MotionSpec<T> {
    val animationSpec: FiniteAnimationSpec<T>
}

fun <T> TransitionMotionPropertyScope<T>.finite(
    animationSpec: FiniteAnimationSpec<T>
): MotionTransitionSpec<T> = Finite(animationSpec)


@Immutable
private class Finite<T>(
    override val animationSpec: FiniteAnimationSpec<T>,
) : MotionTransitionSpec<T>