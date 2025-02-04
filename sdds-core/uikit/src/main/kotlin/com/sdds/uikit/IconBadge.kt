package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet

/**
 * Компонент "Badge с иконкой".
 * Умеет отображать только иконку.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class IconBadge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_iconBadgeStyle,
    defStyleRes: Int = R.style.Sdds_Components_Badge,
) : Badge(context, attrs, defStyleAttr, defStyleRes) {

    final override var text: CharSequence?
        get() = null
        set(_) {}
}
