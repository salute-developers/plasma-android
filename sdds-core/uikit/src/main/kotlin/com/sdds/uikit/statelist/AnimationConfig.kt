package com.sdds.uikit.statelist

import android.animation.TimeInterpolator
import android.content.res.TypedArray
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator

/**
 * Конфигурация анимации, определяющая временные параметры анимационного перехода.
 *
 * Используется для настройки поведения анимации, включая её продолжительность
 * и временную интерполяцию (ускорение/замедление).
 *
 * @property duration Продолжительность анимации в миллисекундах
 * @property interpolator Интерполятор времени, определяющий кривую ускорения анимации
 */
data class AnimationConfig(
    val duration: Long,
    val interpolator: TimeInterpolator,
)

/**
 * Извлекает конфигурацию анимации цвета из [TypedArray] по указанным атрибутам.
 *
 * Если атрибут продолжительности не указан, используется значение по умолчанию 200 мс.
 * @receiver TypedArray Исходный массив типизированных атрибутов
 * @param durationAttr Идентификатор атрибута продолжительности анимации (например, `R.attr.animationDuration`)
 * @return Конфигурация анимации, если присутствует атрибут,
 *         иначе `null`
 *
 * @see AnimationConfig
 * @see AccelerateInterpolator
 * @see DecelerateInterpolator
 * @see AccelerateDecelerateInterpolator
 */
fun TypedArray.getColorAnimationConfig(
    durationAttr: Int,
): AnimationConfig? {
    val hasDuration = hasValue(durationAttr)
    if (!hasDuration) return null
    val duration = getInt(durationAttr, 200).toLong()
    val defaultInterpolator = AccelerateDecelerateInterpolator()
    return AnimationConfig(duration, defaultInterpolator)
}
