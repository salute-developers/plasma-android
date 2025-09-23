package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup

/**
 * Компонент CodeInput
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @see ViewGroup
 */
open class CodeInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_codeInputStyle,
    defStyleRes: Int = R.style.Sdds_Components_CodeInput,
) : CodeField(context, attrs, defStyleAttr, defStyleRes) {

    override var hasCursor: Boolean
        get() = false
        set(_) {}
}
