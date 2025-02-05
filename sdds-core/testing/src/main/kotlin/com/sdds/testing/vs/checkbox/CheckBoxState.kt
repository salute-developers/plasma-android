package com.sdds.testing.vs.checkbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.sdds.serv.R
import com.sdds.testing.component
import com.sdds.uikit.CheckBox

/**
 * Тест кейсы для CheckBox
 */
fun checkBoxM() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        checkBoxFactory(
            context = context,
            label = "Label",
            description = "Description",
            toggleableState = CheckBox.ToggleableState.ON,
            checkBoxStyle = R.style.Serv_Sdds_Components_CheckBox_M,
            isEnabled = true,
            checkBoxId = 1,
        )
    }
}

/**
 * Тест кейсы для CheckBox
 */
fun checkBoxSUnchecked() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        checkBoxFactory(
            context = context,
            label = "Label",
            description = "Description",
            toggleableState = CheckBox.ToggleableState.OFF,
            checkBoxStyle = R.style.Serv_Sdds_Components_CheckBox_S,
            isEnabled = true,
        )
    }
}

/**
 * Тест кейсы для CheckBox
 */
fun checkBoxNoLabelAndDescription() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        checkBoxFactory(
            context = context,
            label = "",
            description = "",
            toggleableState = CheckBox.ToggleableState.ON,
            checkBoxStyle = R.style.Serv_Sdds_Components_CheckBox_M,
            isEnabled = true,
        )
    }
}

/**
 * Тест кейсы для CheckBox
 */
fun checkBoxDisabled() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        checkBoxFactory(
            context = context,
            label = "Label",
            description = "Description",
            toggleableState = CheckBox.ToggleableState.ON,
            checkBoxStyle = R.style.Serv_Sdds_Components_CheckBox_S,
            isEnabled = false,
        )
    }
}

/**
 * Тест кейсы для CheckBox
 */
fun checkBoxSizeMIndeterminate() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        checkBoxFactory(
            context = context,
            label = "Label",
            description = "Description",
            toggleableState = CheckBox.ToggleableState.INDETERMINATE,
            checkBoxStyle = R.style.Serv_Sdds_Components_CheckBox_M,
            isEnabled = true,
        )
    }
}

/**
 * Тест кейсы для CheckBox
 */
fun checkBoxGroupSizeM() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        checkBoxGroup(
            context = context,
            label = "Label",
            description = "Description",
            checkBoxStyle = R.style.Serv_Sdds_Components_CheckBoxGroup_M,
            isEnabled = true,
        )
    }
    onView(withId(1))
        .perform(click())
}
