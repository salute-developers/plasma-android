package com.sdds.uikit.drawable

import android.content.Context
import android.util.AttributeSet
import android.util.LayoutDirection
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
        val pStart = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingStart, 0)
        val pEnd = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingEnd, 0)
        val defaultPaddingLeft = if (layoutDirection == LayoutDirection.LTR) pStart else pEnd
        val defaultPaddingRight = if (layoutDirection == LayoutDirection.LTR) pEnd else pStart
        val pLeft = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingLeft, defaultPaddingLeft)
        val pRight = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingRight, defaultPaddingRight)
        val pTop = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingTop, 0)
        val pBottom = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingBottom, 0)
        setPaddings(pLeft, pTop, pRight, pBottom)
        typedArray.recycle()
    }
    override fun getIntrinsicWidth(): Int {
        return maxOf(super.getIntrinsicWidth(), _minWidth)
    }

    override fun getIntrinsicHeight(): Int {
        return maxOf(super.getIntrinsicHeight(), _minHeight)
    }
}
