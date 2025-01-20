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
open class LinkButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_linkButtonStyle,
) : Button(context, attrs, defStyleAttr)
