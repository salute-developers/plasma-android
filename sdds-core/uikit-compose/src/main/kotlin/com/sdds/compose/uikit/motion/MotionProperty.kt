package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable

/**
 * Базовый контракт motion-свойства.
 *
 * Реализация свойства определяет, каким способом должно меняться значение:
 * через [TransitionMotionProperty], [InterpolationMotionProperty] или без анимации.
 */
@Immutable
interface MotionProperty<T> {
    /**
     * Признак пустого свойства, которое не содержит настроенных сегментов.
     *
     * В этом случае используется целевое значение без дополнительной анимации.
     */
    val isEmpty: Boolean

    /**
     * Человекочитаемая метка свойства для отладки и инструментов Compose Animation.
     */
    val label: String?

    companion object {
        /**
         * Возвращает motion-свойство без анимации.
         */
        fun <T> default() = noMotion<T>()
    }
}

/**
 * Создаёт motion-свойство, которое всегда отдаёт целевое значение без анимации.
 */
fun <T> noMotion() = object : MotionProperty<T> {
    override val isEmpty: Boolean = true
    override val label: String? = null
}
