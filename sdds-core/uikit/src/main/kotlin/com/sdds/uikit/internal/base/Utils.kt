package com.sdds.uikit.internal.base

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.Rect
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.InsetDrawable
import android.text.TextPaint
import android.util.Size
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isGone

/**
 * Удобный вариант [lazy] с [LazyThreadSafetyMode.NONE]
 * @author Малышев Александр on 31.05.2024
 */
internal inline fun <T> unsafeLazy(noinline initializer: () -> T) =
    lazy(LazyThreadSafetyMode.NONE, initializer)

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
): Drawable {
    val allEmpty = left == 0 && top == 0 && right == 0 && bottom == 0
    return if (allEmpty) this else InsetDrawable(this, left, top, right, bottom)
}

/**
 * Функция для удобного конфигурирования и переиспользования [Paint]
 * @param style [Paint.Style]
 * @param color цвет
 * @param strokeWidth толщина линии
 * @param strokeCap [Paint.Cap]
 * @param isAntiAlias включено ли сглаживание
 */
internal fun <T : Paint> T.configure(
    style: Paint.Style = (this.style ?: Paint.Style.STROKE),
    color: Int = this.color,
    strokeWidth: Float = this.strokeWidth,
    strokeCap: Paint.Cap = (this.strokeCap ?: Paint.Cap.SQUARE),
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
    tCallback: ((TextAppearance) -> Unit)? = null,
    applyFont: CancelableFontCallback.ApplyFont? = null,
): CancelableFontCallback {
    val callback = CancelableFontCallback(
        applyFont = {
            typeface = it
            applyFont?.apply(it)
        },
        fallbackFont = Typeface.DEFAULT,
    )
    TextAppearance(context, styleId).also {
        tCallback?.invoke(it)
    }.updateDrawState(context, this, callback)
    return callback
}

internal fun View.fullWidth(): Int {
    if (isGone) return 0
    val lp = layoutParams as ViewGroup.MarginLayoutParams
    return measuredWidth + lp.leftMargin + lp.rightMargin
}

internal fun View.fullHeight(): Int {
    if (isGone) return 0
    val lp = layoutParams as ViewGroup.MarginLayoutParams
    return measuredHeight + lp.topMargin + lp.bottomMargin
}

internal fun View.fullSize(): Size {
    if (isGone) return ZeroSize
    val lp = layoutParams as ViewGroup.MarginLayoutParams
    return Size(
        measuredWidth + lp.leftMargin + lp.rightMargin,
        measuredHeight + lp.topMargin + lp.bottomMargin,
    )
}

internal fun Context.findDecorView(): View? {
    val activity = findActivity<Activity>() ?: return null
    return activity.window?.decorView?.rootView
}

internal inline fun <reified T : Activity> Context.findActivity(): T? {
    if (this is T) return this

    var ctx = this
    while (ctx is ContextWrapper) {
        if (ctx is T) return ctx
        ctx = ctx.baseContext
    }
    return null
}

internal fun View.getScreenRect(): Rect {
    val location = IntArray(2)
    getLocationOnScreen(location)
    return Rect(
        location[0],
        location[1],
        (location[0] + width * scaleX).toInt(),
        (location[1] + height * scaleY).toInt(),
    )
}

internal fun View.getVisibleDisplayFrame(): Rect {
    return Rect().apply {
        val insets = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets)
            .getInsets(WindowInsetsCompat.Type.systemBars())
        rootView.getWindowVisibleDisplayFrame(this)
        left += insets.left
        top += insets.top
        right -= insets.right
        bottom -= insets.bottom
    }
}

internal val ZeroSize = Size(0, 0)

internal val Int.sp: Int
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        this.toFloat(),
        Resources.getSystem().displayMetrics,
    ).toInt()

internal val Int.dp: Int
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics,
    ).toInt()

internal fun getXfermode(mode: Int): PorterDuff.Mode {
    return when (mode) {
        1 -> PorterDuff.Mode.SRC_OVER
        2 -> PorterDuff.Mode.SRC_IN
        3 -> PorterDuff.Mode.SRC_ATOP
        4 -> PorterDuff.Mode.MULTIPLY
        5 -> PorterDuff.Mode.SCREEN
        else -> PorterDuff.Mode.ADD
    }
}

internal fun ViewGroup.isParentOf(v: View?): Boolean {
    var cur: View? = v
    while (cur != null) {
        if (cur === this) return true
        cur = (cur.parent as? View)
    }
    return false
}
