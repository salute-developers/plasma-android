package com.sdds.testing.vs.checkbox

import android.content.Context
import android.view.ContextThemeWrapper
import com.sdds.uikit.CheckBox
import com.sdds.uikit.CheckBoxGroup

/**
 * Фабрика для создания CheckBox
 */
fun checkBoxFactory(
    context: Context,
    toggleableState: CheckBox.ToggleableState = CheckBox.ToggleableState.ON,
    checkBoxStyle: Int = 0,
    label: String = "Label",
    description: String = "Description",
    isEnabled: Boolean = true,
    checkBoxId: Int = 0,
): CheckBox {
    return CheckBox(ContextThemeWrapper(context, checkBoxStyle)).apply {
        this.toggleState = toggleableState
        this.isChecked = isChecked
        this.text = label
        this.description = description
        this.isEnabled = isEnabled
        id = checkBoxId
    }
        .also { checkBox = it }
}

private var checkBox: CheckBox? = null
private var checkBoxGroup: CheckBoxGroup? = null

/**
 * Фабрика для создания CheckBoxGroup
 */
fun checkBoxGroup(
    context: Context,
    checkBoxStyle: Int = 0,
    label: String = "Label",
    description: String = "Description",
    isEnabled: Boolean = true,
    checkBoxGroupId: Int = 0,
): CheckBoxGroup {
    return CheckBoxGroup(ContextThemeWrapper(context, checkBoxStyle)).apply {
        this.isEnabled = isEnabled
        id = checkBoxGroupId
        populate(
            label,
            description,
            isEnabled,
            checkBoxStyle,
        )
    }
        .also { checkBoxGroup = it }
}

/**
 * Создание CheckBoxGroup
 */
fun CheckBoxGroup.populate(
    label: String = "Label",
    description: String = "Description",
    isEnabled: Boolean = true,
    checkBoxStyle: Int = 0,
    checkBoxId: Int = 0,
) {
    removeAllViews()
    repeat(3) {
        addView(
            checkBoxFactory(
                toggleableState = CheckBox.ToggleableState.OFF,
                context = context,
                label = label,
                description = description,
                isEnabled = isEnabled,
                checkBoxStyle = checkBoxStyle,
                checkBoxId = it,
            ),
        )
    }
}
