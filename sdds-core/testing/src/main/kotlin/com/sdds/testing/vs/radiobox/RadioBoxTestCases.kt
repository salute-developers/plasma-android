package com.sdds.testing.vs.radiobox

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.RadioBox
import com.sdds.uikit.RadioBoxGroup

/**
 * Тест-кейсы для [RadioBox] и [RadioBoxGroup]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class RadioBoxTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testRadioBoxSizeM()

    abstract fun testRadioBoxSizeS()

    abstract fun testRadioBoxSizeMNoDescription()

    abstract fun testRadioBoxDisabled()

    abstract fun testRadioBoxGroupSizeM()

    abstract fun testRadioBoxGroupSizeS()

    abstract fun testRadioBoxGroupSizeMDescription()

    abstract fun testRadioBoxGroupSizeSLabel()

    fun ComponentScope.radioBoxSizeM(style: Int): RadioBox =
        radioBox(
            context,
            style,
            RadioBoxUiState(
                checked = true,
                label = "label",
                description = "description",
                enabled = true,
            ),
        )

    fun ComponentScope.radioBoxSizeS(style: Int): RadioBox =
        radioBox(
            context,
            style,
            RadioBoxUiState(
                checked = false,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.radioBoxSizeMNoDescription(style: Int): RadioBox =
        radioBox(
            context,
            style,
            RadioBoxUiState(
                checked = true,
                label = "Label",
                description = "",
                enabled = true,
            ),
        )

    fun ComponentScope.radioBoxDisabled(style: Int): RadioBox =
        radioBox(
            context,
            style,
            RadioBoxUiState(
                checked = true,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )

    fun ComponentScope.radioBoxGroupSizeM(style: Int): RadioBoxGroup =
        radioBoxGroup(
            context,
            style,
            RadioBoxUiState(
                checked = false,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.radioBoxGroupSizeS(style: Int): RadioBoxGroup =
        radioBoxGroup(
            context,
            style,
            RadioBoxUiState(
                checked = true,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.radioBoxGroupSizeMDescription(style: Int): RadioBoxGroup =
        radioBoxGroup(
            context,
            style,
            RadioBoxUiState(
                checked = false,
                label = "",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.radioBoxGroupSizeSLabel(style: Int): RadioBoxGroup =
        radioBoxGroup(
            context,
            style,
            RadioBoxUiState(
                checked = false,
                label = "Label",
                description = "",
                enabled = true,
            ),
        )
}
