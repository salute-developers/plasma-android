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

    init {
        context.obtainStyledAttributes(attrs, R.styleable.Badge, defStyleAttr, defStyleRes).use { typedArray ->
            val pStart = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingStart, 0)
            val pEnd = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingEnd, 0)
            val pTop = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingTop, 0)
            val pBottom = typedArray.getDimensionPixelSize(R.styleable.Badge_android_paddingBottom, 0)
            setPaddingsRelative(pStart, pTop, pEnd, pBottom)
        }
    }
}
