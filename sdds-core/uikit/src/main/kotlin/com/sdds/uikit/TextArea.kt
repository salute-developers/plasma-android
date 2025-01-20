package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet

/**
 * Компонент TextField - многострочное текстовое поле
 * с поддержкой отображения статуса, заголовка, плейсхолдера, иконок и чипов.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 * @author Малышев Александр on 13.01.2025
 */
open class TextArea @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_textAreaStyle,
    defStyleRes: Int = R.style.Sdds_Components_TextArea,
) : TextField(context, attrs, defStyleAttr, defStyleRes)
