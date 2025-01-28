package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.BadgeDrawable
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable

/**
 * Компонент Badge.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class Badge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_badgeStyle,
    defStyleRes: Int = R.style.Sdds_Components_Badge,
) : View(context, attrs, defStyleAttr),
    ColorStateHolder,
    TextDrawable.Delegate,
    Shapeable {

    private val _badgeDrawable: BadgeDrawable = BadgeDrawable(
        context = context,
        attrs = attrs,
        defStyleAttr = defStyleAttr,
        defStyleRes = defStyleRes,
    ).apply {
        callback = this@Badge
        setDelegate(this@Badge)
        setPaddings(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }

    /**
     * @see ShapeModel
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _badgeDrawable.shape

    /**
     * Состояние внешнего вида компонента [Badge]
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
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
        get() = _badgeDrawable.text
        set(value) {
            _badgeDrawable.text = value
        }

    /**
     * [Drawable] в начале компонента
     */
    open var drawableStart: Drawable?
        get() = _badgeDrawable.drawableStart
        set(value) {
            _badgeDrawable.drawableStart = value
            refreshDrawableState()
        }

    /**
     * [Drawable] в конце компонента
     */
    open var drawableEnd: Drawable?
        get() = _badgeDrawable.drawableEnd
        set(value) {
            _badgeDrawable.drawableEnd = value
            refreshDrawableState()
        }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        _badgeDrawable.setTextColor(colors)
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    open fun setTextAppearance(@StyleRes appearanceId: Int) {
        _badgeDrawable.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает [Drawable] в начале по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableStartRes(@DrawableRes drawableRes: Int) {
        _badgeDrawable.setDrawableStartRes(context, drawableRes)
    }

    /**
     * Устанавливает [Drawable] в конце по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableEndRes(@DrawableRes drawableRes: Int) {
        _badgeDrawable.setDrawableEndRes(context, drawableRes)
    }

    /**
     * Устанавливает цвета [Drawable] в начале
     * @param colors цвета [Drawable] в начале
     */
    open fun setDrawableStartColors(colors: ColorStateList?) {
        _badgeDrawable.setDrawableStartTint(colors)
        refreshDrawableState()
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
        _badgeDrawable.setDrawableEndTint(colors)
        refreshDrawableState()
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
        _badgeDrawable.setPaddings(left, top, right, bottom)
    }

    override fun setPaddingRelative(start: Int, top: Int, end: Int, bottom: Int) {
        super.setPaddingRelative(start, top, end, bottom)
        if (layoutDirection == LAYOUT_DIRECTION_RTL) {
            _badgeDrawable.setPaddings(end, top, start, bottom)
        } else {
            _badgeDrawable.setPaddings(start, top, end, bottom)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val intrinsicWidth = _badgeDrawable.intrinsicWidth
        val intrinsicHeight = _badgeDrawable.intrinsicHeight

        val width = when (widthMode) {
            MeasureSpec.AT_MOST -> minOf(specWidth, maxOf(minimumWidth, intrinsicWidth))
            MeasureSpec.EXACTLY -> specWidth
            else -> maxOf(minimumWidth, intrinsicWidth)
        }

        val height = when (heightMode) {
            MeasureSpec.AT_MOST -> minOf(specHeight, maxOf(minimumHeight, intrinsicHeight))
            MeasureSpec.EXACTLY -> specHeight
            else -> maxOf(minimumHeight, intrinsicHeight)
        }
        setMeasuredDimension(width, height)
        _badgeDrawable.setBounds(0, 0, measuredWidth, measuredHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        _badgeDrawable.draw(canvas)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _badgeDrawable
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _badgeDrawable.state = drawableState
    }
    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun onDrawableSizeChange() {
        requestLayout()
        invalidate()
    }
}
