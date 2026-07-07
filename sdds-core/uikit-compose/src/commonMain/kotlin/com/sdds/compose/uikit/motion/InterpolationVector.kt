package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.ValueStateSet

/**
 * Вектор интерполяции.
 *
 * Определяет, из какого набора состояний брать начальное значение [from] и в какой
 * набор состояний интерполировать [to].
 */
@Immutable
interface InterpolationVector {
    /**
     * Набор состояний для начального значения.
     */
    val from: ValueStateSet

    /**
     * Набор состояний для конечного значения.
     */
    val to: ValueStateSet
}

/**
 * Провайдер вектора интерполяции [InterpolationVector]
 */
@Stable
fun interface InterpolationVectorProvider {

    /**
     * Создаёт [InterpolationVector] на основе текущего снимка состояний [stateSnapshot].
     */
    fun provide(stateSnapshot: MotionStateSnapshot): InterpolationVector
}

/**
 * Смещает конечную точку интерполяции так, как будто [state] уже присутствует в `target`
 * и отсутствует в `initial`.
 */
infix fun MotionStateSnapshot.pointTo(state: ValueState): InterpolationVector {
    return InterpolationVectorImpl(initial - state, target + state)
}

/**
 * Смещает начальную точку интерполяции так, как будто [state] присутствует в `initial`
 * и отсутствует в `target`.
 */
infix fun MotionStateSnapshot.pointFrom(state: ValueState): InterpolationVector {
    return InterpolationVectorImpl(initial + state, target - state)
}

internal fun MotionStateSnapshot.defaultVector(): InterpolationVector =
    InterpolationVectorImpl(initial, target)

@Immutable
private data class InterpolationVectorImpl(
    override val from: ValueStateSet,
    override val to: ValueStateSet,
) : InterpolationVector
