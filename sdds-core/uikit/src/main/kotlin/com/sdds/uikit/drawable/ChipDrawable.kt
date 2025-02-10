package com.sdds.uikit.drawable

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import com.sdds.uikit.R

/**
 * [Drawable] рисующий компонент Chip.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 29.07.2024
 */
open class ChipDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_chipStyle,
    defStyleRes: Int = R.style.Sdds_Components_Chip,
) : TextDrawable(context, attrs, defStyleAttr, defStyleRes)
