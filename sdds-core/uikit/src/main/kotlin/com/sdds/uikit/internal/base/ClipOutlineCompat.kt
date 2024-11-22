package com.sdds.uikit.internal.base

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.R

/**
 * Возвращает значение [R.styleable.SdView_sd_clipToOutline] из атрибутов [attrs]
 * @author Малышев Александр on 15.11.2024
 */
internal fun Context.isClippedToOutline(
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
): Boolean {
    val typedArray = this.obtainStyledAttributes(attrs, R.styleable.SdView, defStyleAttr, defStyleRes)
    val isClippedToOutline = typedArray.getBoolean(R.styleable.SdView_sd_clipToOutline, false)
    typedArray.recycle()
    return isClippedToOutline
}
