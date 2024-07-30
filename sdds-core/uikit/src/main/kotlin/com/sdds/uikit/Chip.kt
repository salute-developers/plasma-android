package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import com.sdds.uikit.drawable.ChipDrawable
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Компонент Chip.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 29.07.2024
 */
open class Chip @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_chipStyle,
    defStyleRes: Int = R.style.Sdds_Components_Chip,
) : View(context, attrs, defStyleAttr), ViewStateHolder {

    private val chipDrawable: ChipDrawable = ChipDrawable(
        context = context,
        attrs = attrs,
        defStyleAttr = defStyleAttr,
        defStyleRes = defStyleRes,
    ).apply {
        callback = this@Chip
        setPaddings(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }

    /**
     * Состояние внешнего вида компонента [Chip]
     * @see ViewState
     */
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Текст
     */
    open var text: CharSequence
        get() = chipDrawable.text
        set(value) {
            chipDrawable.text = value
        }

    /**
     * [Drawable] в начале компонента
     */
    open var drawableStart: Drawable?
        get() = chipDrawable.drawableStart
        set(value) {
            chipDrawable.drawableStart = value
        }

    /**
     * [Drawable] в конце компонента
     */
    open var drawableEnd: Drawable?
        get() = chipDrawable.drawableEnd
        set(value) {
            chipDrawable.drawableEnd = value
        }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        chipDrawable.setTextColor(colors)
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    open fun setTextAppearance(@StyleRes appearanceId: Int) {
        chipDrawable.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает [Drawable] в начале по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableStartRes(@DrawableRes drawableRes: Int) {
        chipDrawable.setDrawableStartRes(context, drawableRes)
    }

    /**
     * Устанавливает [Drawable] в конце по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableEndRes(context: Context, @DrawableRes drawableRes: Int) {
        chipDrawable.setDrawableEndRes(context, drawableRes)
    }

    /**
     * Устанавливает цвета [Drawable] в начале
     * @param colors цвета [Drawable] в начале
     */
    open fun setDrawableStartColors(colors: ColorStateList?) {
        chipDrawable.setDrawableStartTint(colors)
    }

    /**
     * Устанавливает цвет [Drawable] в начале
     * @param color цвет [Drawable] в начале
     */
    fun setDrawableStartColor(@ColorInt color: Int) {
        setDrawableStartColors(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета [Drawable] в конце
     * @param colors цвета [Drawable] в конце
     */
    open fun setDrawableEndColors(colors: ColorStateList?) {
        chipDrawable.setDrawableEndTint(colors)
    }

    /**
     * Устанавливает цвет [Drawable] в конце
     * @param color цвет [Drawable] в конце
     */
    fun setDrawableEndColor(@ColorInt color: Int) {
        setDrawableEndColors(ColorStateList.valueOf(color))
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        super.setPadding(left, top, right, bottom)
        chipDrawable.setPaddings(left, top, right, bottom)
    }

    override fun setPaddingRelative(start: Int, top: Int, end: Int, bottom: Int) {
        super.setPaddingRelative(start, top, end, bottom)
        if (layoutDirection == LAYOUT_DIRECTION_RTL) {
            chipDrawable.setPaddings(end, top, start, bottom)
        } else {
            chipDrawable.setPaddings(start, top, end, bottom)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val width = when (widthMode) {
            MeasureSpec.AT_MOST -> minOf(specWidth, maxOf(minimumWidth, chipDrawable.intrinsicWidth))
            MeasureSpec.EXACTLY -> specWidth
            else -> chipDrawable.intrinsicWidth
        }

        val height = when (heightMode) {
            MeasureSpec.AT_MOST -> minOf(specHeight, maxOf(minimumHeight, chipDrawable.intrinsicHeight))
            MeasureSpec.EXACTLY -> specHeight
            else -> chipDrawable.intrinsicHeight
        }
        setMeasuredDimension(width, height)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        chipDrawable.bounds = Rect(0, 0, w, h)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        chipDrawable.draw(canvas)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == chipDrawable
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        chipDrawable.state = drawableState
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        return drawableState
    }
}
