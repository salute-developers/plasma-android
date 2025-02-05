package com.sdds.testing.vs.chip

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.ContextThemeWrapper
import com.sdds.uikit.Chip

/**
 * Фабрика для создания Chip
 */
fun chip(
    context: Context,
    label: String = "Label",
    chipId: Int = 0,
    drawableStart: Drawable? = null,
    drawableEnd: Drawable? = null,
    isCheckable: Boolean = true,
    isEnabled: Boolean = true,
    isWrapped: Boolean = true,
    quantity: Int = 3,
    chipStyle: Int = 0,
): Chip {
    return Chip(ContextThemeWrapper(context, chipStyle)).apply {
        this.text = label
        this.isCheckable = isCheckable
        this.drawableStart = drawableStart
        this.drawableEnd = drawableEnd
        this.isEnabled = isEnabled
        this.id = chipId
    }
}
