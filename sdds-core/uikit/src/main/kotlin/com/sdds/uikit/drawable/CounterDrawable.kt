package com.sdds.uikit.drawable

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.R

/**
 * [CounterDrawable] рисующий компонент Counter.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class CounterDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_counterStyle,
    defStyleRes: Int = R.style.Sdds_Components_Counter,
) : TextDrawable(context, attrs, defStyleAttr, defStyleRes) {

    private var _minWidth: Int = 0
    private var _minHeight: Int = 0

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Counter, defStyleAttr, defStyleRes)
        _minWidth = typedArray.getDimensionPixelSize(R.styleable.Counter_android_minWidth, 0)
        _minHeight = typedArray.getDimensionPixelSize(R.styleable.Counter_android_minHeight, 0)
        typedArray.recycle()
    }
    override fun getIntrinsicWidth(): Int {
        return maxOf(super.getIntrinsicWidth(), _minWidth)
    }

    override fun getIntrinsicHeight(): Int {
        return maxOf(super.getIntrinsicHeight(), _minHeight)
    }
}
