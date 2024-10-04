package com.sdds.uikit.internal.base

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.InsetDrawable
import android.text.TextPaint
import androidx.annotation.StyleRes

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
 * @param isAntiAlias включено ли сглаживание
 */
internal fun <T : Paint> T.configure(
    style: Paint.Style = this.style,
    color: Int = this.color,
    strokeWidth: Float = this.strokeWidth,
    strokeCap: Paint.Cap = this.strokeCap,
    isAntiAlias: Boolean = this.isAntiAlias,
): T = this.apply {
    if (this.style != style) this.style = style
    if (this.color != color) this.color = color
    if (this.strokeWidth != strokeWidth) this.strokeWidth = strokeWidth
    if (this.strokeCap != strokeCap) this.strokeCap = strokeCap
    if (this.isAntiAlias != isAntiAlias) this.isAntiAlias = isAntiAlias
}

/**
 * Возвращает цвет из [ColorStateList] для указанного [drawableState] или 0
 */
internal fun ColorStateList?.colorForState(drawableState: IntArray?, defaultColor: Int = 0): Int {
    return this?.getColorForState(drawableState, defaultColor) ?: defaultColor
}

/**
 * Применяет стиль текста к объекту [TextPaint]
 * @param context контекст
 * @param styleId идентификатор стиля
 * @param applyFont колбэк применения шрифта в объекту [TextPaint]
 * @return [CancelableFontCallback]
 */
internal fun TextPaint.applyTextAppearance(
    context: Context,
    @StyleRes styleId: Int,
    applyFont: CancelableFontCallback.ApplyFont? = null,
): CancelableFontCallback {
    val callback = CancelableFontCallback(
        applyFont = {
            typeface = it
            applyFont?.apply(it)
        },
        fallbackFont = Typeface.DEFAULT,
    )
    TextAppearance(context, styleId).updateDrawState(context, this, callback)
    return callback
}
