package com.sdds.uikit.drawable

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.core.content.res.use
import com.sdds.uikit.R

/**
 * [Drawable] рисующий компонент Badge.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
class BadgeDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_badgeStyle,
    defStyleRes: Int = R.style.Sdds_Components_Badge,
) : TextDrawable(context, attrs, defStyleAttr, defStyleRes) {

    private var _minWidth: Int = 0
    private var _minHeight: Int = 0

    init {
        context.obtainStyledAttributes(attrs, R.styleable.Badge, defStyleAttr, defStyleRes).use { typedArray ->
            _minWidth = typedArray.getDimensionPixelSize(R.styleable.Badge_android_minWidth, 0)
            _minHeight = typedArray.getDimensionPixelSize(R.styleable.Badge_android_minHeight, 0)
            val pStart = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingStart, 0)
            val pEnd = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingEnd, 0)
            val pTop = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingTop, 0)
            val pBottom = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingBottom, 0)
            setPaddingsRelative(pStart, pTop, pEnd, pBottom)
        }
    }

    override fun getIntrinsicWidth(): Int {
        return maxOf(super.getIntrinsicWidth(), _minWidth)
    }

    override fun getIntrinsicHeight(): Int {
        return maxOf(super.getIntrinsicHeight(), _minHeight)
    }
}
