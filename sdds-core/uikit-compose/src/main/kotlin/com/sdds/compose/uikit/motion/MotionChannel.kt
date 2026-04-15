package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.Transition
import androidx.compose.animation.core.updateTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.interactions.ValueStateSet

/**
 * Маркерный интерфейс канала motion.
 *
 * Канал инкапсулирует источник прогресса анимации. Разные motion-свойства могут
 * использовать один и тот же канал, если должны синхронно изменяться.
 */
@Stable
interface MotionChannel

/**
 * Канал transition-анимации на основе Compose [Transition].
 */
interface TransitionMotionChannel : MotionChannel {
    /**
     * Transition для текущего набора состояний.
     */
    val transition: Transition<ValueStateSet>
}

/**
 * Канал интерполяции, который предоставляет текущий прогресс в виде `fraction`.
 */
interface InterpolationMotionChannel : MotionChannel {
    /**
     * Возвращает прогресс интерполяции в диапазоне от `0f` до `1f`.
     */
    val fractionProvider: () -> Float
}

/**
 * Ключ, по которому [MotionContext] находит канал интерполяции.
 */
@Stable
interface MotionChannelKey

/**
 * Создаёт и запоминает канал интерполяции.
 *
 * @param key дополнительный ключ для контроля `remember`.
 * @param fractionProvider провайдер прогресса интерполяции.
 */
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
