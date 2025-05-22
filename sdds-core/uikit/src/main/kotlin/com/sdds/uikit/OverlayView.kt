package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet

/**
 * Контейнер-подложка для всплывающих компонентов (Modal, Toast и т.д.).
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 * @author Малышев Александр on 21.05.2025
 */
open class OverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_overlayViewStyle,
    defStyleRes: Int = R.style.Sdds_Components_OverlayView,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes)
