package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
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
        @Deprecated(
            "Use Divider.asItemDecoration()",
            replaceWith = ReplaceWith("Divider.asItemDecoration()"),
        )
        fun recyclerViewDecoration(context: Context, orientation: Int): DividerItemDecoration {
            return DividerDecoration(context, orientation)
        }

        /**
         * Возвращает [RecyclerView.ItemDecoration] с [DividerDrawable]
         */
        fun asItemDecoration(context: Context, orientation: Int): RecyclerView.ItemDecoration {
            return SkipLastDividerItemDecoration(context, orientation)
        }
    }
}

private class DividerDecoration(context: Context, orientation: Int) : DividerItemDecoration(context, orientation) {

    init {
        setDrawable(DividerDrawable(context))
    }
}

private class SkipLastDividerItemDecoration(
    context: Context,
    @RecyclerView.Orientation private val orientation: Int,
) : RecyclerView.ItemDecoration() {

    private val divider: Drawable = DividerDrawable(context)

    init {
        require(orientation == RecyclerView.VERTICAL || orientation == RecyclerView.HORIZONTAL) {
            "Invalid orientation. It should be either RecyclerView.VERTICAL or RecyclerView.HORIZONTAL"
        }
    }

    override fun onDraw(canvas: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val itemCount = parent.adapter?.itemCount ?: return

        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            val position = parent.getChildAdapterPosition(child)

            if (position == RecyclerView.NO_POSITION || position >= itemCount - 1) continue

            if (orientation == RecyclerView.VERTICAL) {
                drawDividerVertical(canvas, child, parent)
            } else { // HORIZONTAL
                drawDividerHorizontal(canvas, child, parent)
            }
        }
    }

    private fun drawDividerVertical(canvas: Canvas, child: View, parent: RecyclerView) {
        val params = child.layoutParams as RecyclerView.LayoutParams
        val clipBottom = parent.height - parent.paddingBottom

        val top = child.bottom + params.bottomMargin
        val bottom = top + divider.intrinsicHeight

        if (bottom >= clipBottom || top <= 0) return // не рисуем, выходит за границу

        val left = parent.paddingLeft
        val right = parent.width - parent.paddingRight
        divider.setBounds(left, top, right, bottom)
        divider.draw(canvas)
    }

    private fun drawDividerHorizontal(canvas: Canvas, child: View, parent: RecyclerView) {
        val params = child.layoutParams as RecyclerView.LayoutParams
        val clipRight = parent.width - parent.paddingRight
        val left = child.right + params.rightMargin
        val right = left + divider.intrinsicWidth

        if (right >= clipRight || left <= 0) return // не рисуем, выходит за границу

        val top = parent.paddingTop
        val bottom = parent.height - parent.paddingBottom
        divider.setBounds(left, top, right, bottom)
        divider.draw(canvas)
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildAdapterPosition(view)
        val itemCount = parent.adapter?.itemCount ?: return

        if (position >= itemCount - 1) {
            outRect.set(0, 0, 0, 0)
        } else {
            if (orientation == RecyclerView.VERTICAL) {
                outRect.set(0, 0, 0, divider.intrinsicHeight)
            } else {
                outRect.set(0, 0, divider.intrinsicWidth, 0)
            }
        }
    }
}
