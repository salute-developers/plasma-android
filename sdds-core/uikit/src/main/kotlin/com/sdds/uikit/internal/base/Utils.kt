package com.sdds.uikit.internal.base

import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.graphics.drawable.InsetDrawable

/**
 * Удобный вариант [lazy] с [LazyThreadSafetyMode.NONE]
 * @author Малышев Александр on 31.05.2024
 */
internal inline fun <T> unsafeLazy(noinline initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)

/**
 * Устанавливает значения метрик шрифта [Paint.FontMetricsInt] из [fm] в текущий объект [this]
 * @param fm источник новых метрик шрифта
 */
internal fun Paint.FontMetricsInt.set(fm: Paint.FontMetricsInt) {
    this.top = fm.top
    this.bottom = fm.bottom
    this.ascent = fm.ascent
    this.descent = fm.descent
    this.leading = fm.leading
}

/**
 * Рассчитывает линейную интерполяцию между значениями [a] в [b]
 */
internal fun lerp(a: Float, b: Float, fraction: Float): Float {
    return a * (1f - fraction) + (b * fraction)
}

/**
 * Оборачивает [Drawable] в [InsetDrawable]
 * @param left отступ слева
 * @param top отступ сверху
 * @param right отступ справа
 * @param bottom отступ снизу
 */
internal fun Drawable.wrapWithInset(
    left: Int = 0,
    top: Int = 0,
    right: Int = 0,
    bottom: Int = 0,
): InsetDrawable =
    InsetDrawable(this, left, top, right, bottom)

/**
 * Функция для удобного конфигурирования и переиспользования [Paint]
 * @param style [Paint.Style]
 * @param color цвет
 * @param strokeWidth толщина линии
 * @param strokeCap [Paint.Cap]
 */
internal fun Paint.configure(
    style: Paint.Style = this.style,
    color: Int = this.color,
    strokeWidth: Float = this.strokeWidth,
    strokeCap: Paint.Cap = this.strokeCap,
): Paint = this.apply {
    if (this.style != style) this.style = style
    if (this.color != color) this.color = color
    if (this.strokeWidth != strokeWidth) this.strokeWidth = strokeWidth
    if (this.strokeCap != strokeCap) this.strokeCap = strokeCap
}
