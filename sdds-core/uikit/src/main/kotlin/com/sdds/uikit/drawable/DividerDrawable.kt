package com.sdds.uikit.drawable

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.shape.ShapeDrawable

/**
 * [Drawable] для отрисовки разделителя
 */
open class DividerDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_dividerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Divider,
) : ShapeDrawable(
    context,
    attrs,
    defStyleAttr,
    defStyleRes,
) {

    private var _thickness: Int
    private var _orientation: Int = ORIENTATION_HORIZONTAL

    /**
     * Ориентация разделителя
     */
    var orientation: Int
        get() = _orientation
        set(value) {
            if (_orientation != value) {
                _orientation = value
                invalidateSelf()
            }
        }

    /**
     * Толщина разделителя
     */
    var thickness: Int
        get() = _thickness
        set(value) {
            if (_thickness != value) {
                _thickness = value
                invalidateSelf()
            }
        }

    init {

        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.Divider, defStyleAttr, defStyleRes)
        _thickness = typedArray.getDimensionPixelSize(R.styleable.Divider_sd_thickness, DefaultThickness)
        orientation = typedArray.getInt(R.styleable.Divider_android_orientation, ORIENTATION_HORIZONTAL)
        setTintList(
            typedArray.getColorStateList(R.styleable.Divider_android_backgroundTint)
                ?: typedArray.getColorStateList(R.styleable.Divider_backgroundTint),
        )
        typedArray.recycle()
    }

    override fun getIntrinsicHeight(): Int {
        return if (orientation == ORIENTATION_HORIZONTAL) _thickness else 0
    }

    override fun getIntrinsicWidth(): Int {
        return if (orientation == ORIENTATION_VERTICAL) _thickness else 0
    }

    companion object {
        private val DefaultThickness = 1.dp

        /**
         * Горизонтальная ориентация
         */
        const val ORIENTATION_HORIZONTAL = 0

        /**
         * Вертикальная ориентация
         */
        const val ORIENTATION_VERTICAL = 1
    }
}
