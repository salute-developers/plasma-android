package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.Stable

/**
 * Маркерный интерфейс для набора motion-свойств компонента.
 *
 * Обычно конкретный стиль содержит несколько [MotionProperty], описывающих поведение
 * разных визуальных параметров компонента при смене состояния.
 */
@Stable
interface MotionStyle

/**
 * Билдер для сборки конкретной реализации [MotionStyle].
 */
interface MotionStyleBuilder<S : MotionStyle> {
    /**
     * Создаёт итоговый стиль.
     */
    fun style(): S
}

/**
 * Возвращает [ProvidedValue] для `CompositionLocal`, используя переданный [style],
 * либо текущее значение, если [style] равен `null`.
 *
 * Полезно в публичных API компонентов, где локальный motion-стиль может быть опциональным.
 */
@Composable
infix fun <S : MotionStyle> ProvidableCompositionLocal<S>.tryProvide(style: S?): ProvidedValue<S> {
    return if (style != null) {
        provides(style)
    } else {
        provides(current)
    }
}
