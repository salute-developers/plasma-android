package com.sdds.testing.vs.radiobox

import android.content.Context
import android.view.ContextThemeWrapper
import com.sdds.uikit.RadioBox
import com.sdds.uikit.RadioBoxGroup

/**
 * Фабрика для создания RadioBox
 */
fun radioBoxFactory(
    context: Context,
    radioBoxStyle: Int = 0,
    label: String = "Label",
    description: String = "Description",
    isChecked: Boolean = true,
    isEnabled: Boolean = true,
    radioBoxId: Int = 0,
): RadioBox {
    return RadioBox(ContextThemeWrapper(context, radioBoxStyle)).apply {
        this.text = label
        this.description = description
        this.isChecked = isChecked
        this.isEnabled = isEnabled
        this.id = radioBoxId
    }
}

private var radioBox: RadioBox? = null
private var radioBoxGroup: RadioBoxGroup? = null

/**
 * Фабрика для создания RadioBoxGroup
 */
fun radioBoxGroup(
    context: Context,
    radioBoxGroupStyle: Int = 0,
    label: String = "Label",
    description: String = "Description",
    checked: Boolean = false,
    isEnabled: Boolean = true,
    radioBoxGroupId: Int = 0,
): RadioBoxGroup {
    return RadioBoxGroup(ContextThemeWrapper(context, radioBoxGroupStyle)).apply {
        this.isEnabled = isEnabled
        this.id = radioBoxGroupId
        populate(label, description, checked, isEnabled, radioBoxGroupStyle)
    }
}

/**
 * Создание RadioBoxGroup
 */
fun RadioBoxGroup.populate(
    label: String = "Label",
    description: String = "Description",
    checked: Boolean = true,
    isEnabled: Boolean = true,
    radioBoxGroupStyle: Int = 0,
) {
    removeAllViews()
    repeat(3) {
        addView(
            radioBoxFactory(
                context = context,
                label = label,
                description = description,
                isChecked = checked,
                isEnabled = isEnabled,
                radioBoxStyle = radioBoxGroupStyle,
                radioBoxId = it,
            ),
        )
    }
}
