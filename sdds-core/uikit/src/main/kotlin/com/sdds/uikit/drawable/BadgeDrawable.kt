package com.sdds.uikit.drawable

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
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
) : TextDrawable(context, attrs, defStyleAttr, defStyleRes)
