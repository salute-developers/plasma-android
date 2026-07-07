package com.sdds.compose.uikit.motion

/**
 * Спецификация вычисления промежуточного значения для [InterpolationMotionProperty].
 */
interface MotionInterpolationSpec<T> : MotionSpec<T> {
    /**
     * Вычислитель промежуточного значения между начальным и конечным состоянием.
     */
    val evaluator: MotionEvaluator<T>
}

internal class NoInterpolation<T> : MotionInterpolationSpec<T> {

    override val evaluator: MotionEvaluator<T>
        get() = MotionEvaluator { _, to, _ -> to }
}

internal class MotionInterpolationSpecImpl<T>(
    override val evaluator: MotionEvaluator<T>,
) : MotionInterpolationSpec<T>
