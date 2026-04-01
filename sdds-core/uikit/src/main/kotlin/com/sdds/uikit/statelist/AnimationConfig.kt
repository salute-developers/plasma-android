package com.sdds.uikit.statelist

import android.animation.TimeInterpolator
import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnimationUtils
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
 * Функция анализирует атрибуты продолжительности и интерполятора в TypedArray
 * и создает соответствующую конфигурацию анимации. Если ни один из атрибутов
 * не присутствует в TypedArray, возвращается `null`.
 *
 * Если атрибут продолжительности не указан, используется значение по умолчанию 200 мс.
 * Если атрибут интерполятора не указан, используется интерполятор по умолчанию [AccelerateDecelerateInterpolator].
 *
 * @receiver TypedArray Исходный массив типизированных атрибутов (обычно из XML-разметки)
 * @param durationAttr Идентификатор атрибута продолжительности анимации (например, `R.attr.animationDuration`)
 * @param interpolatorAttr Идентификатор атрибута интерполятора анимации (например, `R.attr.animationInterpolator`).
 *                         По умолчанию `0`, что означает отсутствие атрибута
 * @return Конфигурация анимации, если присутствует хотя бы один из атрибутов,
 *         иначе `null`
 *
 * @see AnimationConfig
 * @see AccelerateInterpolator
 * @see DecelerateInterpolator
 * @see AccelerateDecelerateInterpolator
 */
fun TypedArray.getColorAnimationConfig(
    durationAttr: Int,
    interpolatorAttr: Int = 0,
    context: Context,
): AnimationConfig? {
    val hasDuration = hasValue(durationAttr)
    val hasInterpolator = hasValue(interpolatorAttr)
    if (!hasDuration && !hasInterpolator) return null
    val duration = getInt(durationAttr, 200).toLong()
    val interpolator = try {
        AnimationUtils.loadInterpolator(context, getResourceId(interpolatorAttr, 0))
    } catch (e: Resources.NotFoundException) {
        AccelerateDecelerateInterpolator()
    }
    return AnimationConfig(duration, interpolator)
}
