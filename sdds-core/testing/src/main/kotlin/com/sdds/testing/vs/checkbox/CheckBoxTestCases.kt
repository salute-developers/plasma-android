package com.sdds.testing.vs.checkbox

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.CheckBox
import com.sdds.uikit.CheckBoxGroup

/**
 * Тест-кейсы для [CheckBox] и [CheckBoxGroup]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class CheckBoxTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testCheckBoxSizeM()

    abstract fun testCheckBoxSizeSUnchecked()

    abstract fun testCheckBoxNoLabelAndDesc()

    abstract fun testCheckBoxDisabled()

    abstract fun testCheckBoxSizeMIndeterminate()

    abstract fun testCheckBoxGroupSizeM()

    abstract fun testCheckBoxGroupSizeS()

    abstract fun testCheckBoxGroupMDisabled()

    fun ComponentScope.checkBoxSizeM(style: Int): CheckBox =
        checkBox(
            context,
            style,
            CheckBoxUiState(
                state = CheckBox.ToggleableState.ON,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.checkBoxSizeSUnchecked(style: Int): CheckBox =
        checkBox(
            context,
            style,
            CheckBoxUiState(
                state = CheckBox.ToggleableState.OFF,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.checkBoxNoLabelAndDesc(style: Int): CheckBox =
        checkBox(
            context,
            style,
            CheckBoxUiState(
                state = CheckBox.ToggleableState.ON,
                label = "",
                description = "",
                enabled = true,
            ),
        )

    fun ComponentScope.checkBoxDisabled(style: Int): CheckBox =
        checkBox(
            context,
            style,
            CheckBoxUiState(
                state = CheckBox.ToggleableState.ON,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )

    fun ComponentScope.checkBoxSizeMIndeterminate(style: Int): CheckBox =
        checkBox(
            context,
            style,
            CheckBoxUiState(
                state = CheckBox.ToggleableState.INDETERMINATE,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.checkBoxGroupSizeM(style: Int): CheckBoxGroup =
        checkBoxGroup(
            context,
            style,
            CheckBoxUiState(
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.checkBoxGroupSizeS(style: Int): CheckBoxGroup =
        checkBoxGroup(
            context,
            style,
            CheckBoxUiState(
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.checkBoxGroupMDisabled(style: Int): CheckBoxGroup =
        checkBoxGroup(
            context,
            style,
            CheckBoxUiState(
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )
}
