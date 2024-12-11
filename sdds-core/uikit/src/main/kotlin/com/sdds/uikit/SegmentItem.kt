package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet

/**
 * Компонент "SegmentItem".
 * Умеет отображать иконку, а также два текста: основной и дополнительный.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class SegmentItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_segmentItemStyle,
) : Button(context, attrs, defStyleAttr)
