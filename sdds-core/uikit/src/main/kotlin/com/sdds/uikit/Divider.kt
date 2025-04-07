package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.DividerDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable

/**
 * Компонент Divider.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class Divider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_dividerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Indicator,
) : View(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder, Shapeable {

    private val _dividerDrawable: DividerDrawable = DividerDrawable(
        context = context,
        attrs = attrs,
        defStyleAttr = defStyleAttr,
        defStyleRes = defStyleRes,
    ).apply {
        callback = this@Divider
    }

    /**
     * Состояние внешнего вида Divider
     * @see ColorState
     */
    override var colorState: ColorState? =
        ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
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
        get() = _dividerDrawable.shape

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val intrinsicWidth = _dividerDrawable.intrinsicWidth
        val intrinsicHeight = _dividerDrawable.intrinsicHeight

        val width = when (widthMode) {
            MeasureSpec.AT_MOST -> minOf(specWidth, intrinsicWidth)
            MeasureSpec.EXACTLY -> specWidth
            else -> intrinsicWidth
        }

        val height = when (heightMode) {
            MeasureSpec.AT_MOST -> minOf(specHeight, intrinsicHeight)
            MeasureSpec.EXACTLY -> specHeight
            else -> intrinsicHeight
        }
        setMeasuredDimension(width, height)
        _dividerDrawable.setBounds(0, 0, measuredWidth, measuredHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        _dividerDrawable.draw(canvas)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _dividerDrawable
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _dividerDrawable.state = drawableState
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    companion object {

        /**
         * Возвращает [DividerItemDecoration] с [DividerDrawable]
         */
        fun recyclerViewDecoration(context: Context, orientation: Int): DividerItemDecoration {
            return DividerDecoration(context, orientation)
        }
    }
}

private class DividerDecoration(context: Context, orientation: Int) : DividerItemDecoration(context, orientation) {

    init {
        setDrawable(DividerDrawable(context))
    }
}
