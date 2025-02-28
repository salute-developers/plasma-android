package com.sdds.uikit.drawable

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import com.sdds.uikit.R
import com.sdds.uikit.shape.ShapeDrawable

/**
 * [Drawable] рисующий компонент Indicator.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class IndicatorDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_indicatorStyle,
    defStyleRes: Int = R.style.Sdds_Components_Indicator,
) : ShapeDrawable(
    context,
    attrs,
    defStyleAttr,
    defStyleRes,
) {

    private var _width: Int = 0
    private var _height: Int = 0

    init {
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.Indicator, defStyleAttr, defStyleRes)
        _width = typedArray.getDimensionPixelSize(R.styleable.Indicator_android_maxWidth, 0)
        _height = typedArray.getDimensionPixelSize(R.styleable.Indicator_android_maxHeight, 0)
        setTintList(
            typedArray.getColorStateList(R.styleable.Indicator_android_backgroundTint)
                ?: typedArray.getColorStateList(R.styleable.Indicator_backgroundTint),
        )
        typedArray.recycle()
    }

    override fun getIntrinsicWidth(): Int {
        return _width
    }

    override fun getIntrinsicHeight(): Int {
        return _height
    }
}
