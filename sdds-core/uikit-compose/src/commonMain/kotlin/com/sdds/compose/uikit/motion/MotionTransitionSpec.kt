package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.SnapSpec
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Immutable

/**
 * Спецификация анимации для [TransitionMotionProperty].
 *
 * Содержит [FiniteAnimationSpec], который будет применён к переходу между значениями
 * `StatefulValue` при изменении набора состояний.
 */
interface MotionTransitionSpec<T> : MotionSpec<T> {
    /**
     * Спецификация анимации Compose, описывающая переход между значениями.
     */
    val animationSpec: FiniteAnimationSpec<T>
}

/**
 * Создаёт конечную transition-спецификацию на основе [animationSpec].
 */
fun <T> TransitionMotionPropertyScope<T>.finite(
    animationSpec: FiniteAnimationSpec<T>,
): MotionTransitionSpec<T> = Finite(animationSpec)

@Immutable
private class Finite<T>(
    override val animationSpec: FiniteAnimationSpec<T>,
) : MotionTransitionSpec<T>

internal fun <T> FiniteAnimationSpec<T>.toFloatAnimationSpec(): FiniteAnimationSpec<Float> = when (this) {
    is TweenSpec -> tween(
        durationMillis = durationMillis,
        delayMillis = delay,
        easing = easing,
    )
    is SpringSpec -> SpringSpec(
        dampingRatio = dampingRatio,
        stiffness = stiffness,
    )
    is SnapSpec -> snap(delayMillis = delay)
    else -> snap()
}
