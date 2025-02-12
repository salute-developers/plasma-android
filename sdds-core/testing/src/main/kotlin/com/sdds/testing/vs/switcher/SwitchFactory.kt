package com.sdds.testing.vs.switcher

import android.content.Context
import android.view.ContextThemeWrapper
import com.sdds.uikit.Switch

/**
 * Фабрика для создания Switch
 */
fun switchFactory(
    context: Context,
    switchStyle: Int = 0,
    switchId: Int = 0,
    label: String = "Label",
    description: String = "Description",
    isEnabled: Boolean = true,
    isChecked: Boolean = true,
): Switch {
    return Switch(ContextThemeWrapper(context, switchStyle)).apply {
        this.id = switchId
        this.text = label
        this.description = description
        this.isEnabled = isEnabled
        this.isChecked = isChecked
    }
}
