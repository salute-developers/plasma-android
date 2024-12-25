package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.StyleRes
import com.sdds.uikit.drawable.CounterDrawable
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Компонент Counter.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class Counter @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_counterStyle,
    defStyleRes: Int = R.style.Sdds_Components_Counter,
) : View(context, attrs, defStyleAttr),
    Shapeable,
    ViewStateHolder,
    CounterDrawable.Delegate {

    private val _counterDrawable: CounterDrawable = CounterDrawable(
        context = context,
        attrs = attrs,
        defStyleAttr = defStyleAttr,
        defStyleRes = defStyleRes,
    ).apply {
        callback = this@Counter
        setDelegate(this@Counter)
        setPaddings(paddingStart, paddingTop, paddingEnd, paddingBottom)
    }

    private val _viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)

    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * @see ShapeModel
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _counterDrawable.shape

    /**
     * Текст
     */
    open var text: CharSequence
        get() = _counterDrawable.text
        set(value) {
            _counterDrawable.text = value
        }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        _counterDrawable.setTextColor(colors)
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    open fun setTextAppearance(@StyleRes appearanceId: Int) {
        _counterDrawable.setTextAppearance(context, appearanceId)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _viewAlphaHelper.updateAlphaByEnabledState(this)
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        super.setPadding(left, top, right, bottom)
        _counterDrawable.setPaddings(left, top, right, bottom)
    }

    override fun setPaddingRelative(start: Int, top: Int, end: Int, bottom: Int) {
        super.setPaddingRelative(start, top, end, bottom)
        if (layoutDirection == LAYOUT_DIRECTION_RTL) {
            _counterDrawable.setPaddings(end, top, start, bottom)
        } else {
            _counterDrawable.setPaddings(start, top, end, bottom)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val intrinsicWidth = _counterDrawable.intrinsicWidth
        val intrinsicHeight = _counterDrawable.intrinsicHeight

        val width = when (widthMode) {
            MeasureSpec.AT_MOST -> minOf(specWidth, maxOf(minimumWidth, intrinsicWidth))
            MeasureSpec.EXACTLY -> specWidth
            else -> maxOf(minimumWidth, intrinsicWidth)
        }

        val height = minimumHeight
        setMeasuredDimension(width, height)
        _counterDrawable.setBounds(0, 0, measuredWidth, measuredHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        _counterDrawable.draw(canvas)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _counterDrawable
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _counterDrawable.state = drawableState
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        return drawableState
    }

    override fun onCounterDrawableSizeChange() {
        requestLayout()
        invalidateOutline()
    }
}
