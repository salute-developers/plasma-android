package com.sdds.testing.vs.button

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.ContextThemeWrapper
import android.view.ViewGroup
import com.sdds.uikit.Button

/**
 * Фабрика для создания кнопки
 */
fun basicButton(
    context: Context,
    buttonId: Int = 0,
    buttonStyle: Int = 0,
    label: String = "Label",
    value: String? = null,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    fixedSize: Boolean = false,
    spacing: Button.Spacing = Button.Spacing.Packed,
    icon: Drawable? = null,
    iconPosition: Button.IconPosition = Button.IconPosition.TextStart,
): Button {
    val lp = if (fixedSize) {
        ViewGroup.LayoutParams(
            context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    } else {
        null
    }
    return Button(ContextThemeWrapper(context, buttonStyle)).apply {
        this.text = label
        this.value = value
        this.isEnabled = isEnabled
        this.isLoading = isLoading
        this.spacing = spacing
        this.icon = icon
        this.id = buttonId
        this.iconPosition = iconPosition
        this.iconPadding = iconPadding
        if (lp != null) {
            this.layoutParams = lp
        }
    }
}
