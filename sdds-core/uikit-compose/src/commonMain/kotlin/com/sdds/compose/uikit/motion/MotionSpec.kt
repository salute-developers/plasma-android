package com.sdds.compose.uikit.motion

/**
 * Базовый интерфейс спецификации motion.
 *
 * Спецификация определяет, как именно вычисляется значение внутри конкретного сегмента.
 * Для transition-свойств это [MotionTransitionSpec], для interpolation-свойств -
 * [MotionInterpolationSpec].
 */
interface MotionSpec<T> {

    companion object
}
