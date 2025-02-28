package com.sdds.uikit.internal.base

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import com.sdds.uikit.R

/**
 * Делегат для изменения прозрачности компонентов в состояниях enabled/disabled.
 * Запоминает изначальную прозрачность компонента и восстанавливает ее в состоянии enabled.
 * @param context контекст
 * @param attributeSet аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 09.08.2024
 */
internal class ViewAlphaHelper(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
) {
    private var initialAlpha: Float
    private var disabledAlpha: Float

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.SdAlphaHelper, defStyleAttr, -1)
        initialAlpha = typedArray.getFloat(R.styleable.SdAlphaHelper_android_alpha, ENABLED_ALPHA)
        disabledAlpha = typedArray.getFloat(R.styleable.SdAlphaHelper_sd_disabledAlpha, ENABLED_ALPHA)
        typedArray.recycle()
    }

    /**
     * Изменяет прозрачность [view] в зависимости от состояния [View.isEnabled]
     */
    fun updateAlphaByEnabledState(view: View) {
        if (initialAlpha == disabledAlpha) return
        view.alpha = getAlphaByState(view.isEnabled)
    }

    /**
     * Изменяет прозрачность [drawable] в зависимости от состояния [isEnabled]
     */
    fun updateDrawableAlpha(drawable: Drawable, isEnabled: Boolean) {
        drawable.alpha = (getAlphaByState(isEnabled) * 255).toInt()
    }

    private fun getAlphaByState(isEnabled: Boolean): Float {
        return if (isEnabled) initialAlpha else disabledAlpha
    }

    private companion object {
        const val ENABLED_ALPHA = 1f
    }
}
