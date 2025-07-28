package com.sdds.uikit.drawable

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import com.sdds.uikit.R

/**
 * [Drawable] рисующий компонент IconBadge.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class IconBadgeDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_iconBadgeStyle,
    defStyleRes: Int = R.style.Sdds_Components_IconBadge,
) : BadgeDrawable(context, attrs, defStyleAttr, defStyleRes) {

    override var text: CharSequence
        get() = ""
        set(_) {}
}
