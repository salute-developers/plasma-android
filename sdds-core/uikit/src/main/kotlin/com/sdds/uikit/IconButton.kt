package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet

/**
 * Компонент "Кнопка с иконкой".
 * Умеет отображать только иконку и индикатор загрузки.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 06.12.2024
 */
open class IconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_iconButtonStyle,
) : Button(context, attrs, defStyleAttr) {

    final override var value: CharSequence?
        get() = null
        set(_) {}

    final override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(null, null)
    }
}
