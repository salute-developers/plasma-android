package com.sdds.testing.vs.switcher

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Switch

/**
 * Тест-кейсы для [Switch]
 * @author Малышев Александр on 14.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class SwitchTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testSwitchSizeL()

    abstract fun testSwitchSizeM()

    abstract fun testSwitchSizeS()

    abstract fun testSwitchDisabled()

    abstract fun testSwitchSizeLToggleS()

    abstract fun testSwitchSizeSToggleS()

    fun ComponentScope.switchSizeL(style: Int): Switch =
        switch(
            context,
            style,
            SwitchUiState(
                active = true,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )

    fun ComponentScope.switchSizeM(style: Int): Switch =
        switch(
            context,
            style,
            SwitchUiState(
                active = false,
                label = "Label",
                description = "",
                enabled = true,
            ),
        )

    fun ComponentScope.switchSizeS(style: Int): Switch =
        switch(
            context,
            style,
            SwitchUiState(
                active = true,
                label = "",
                description = "",
                enabled = true,
            ),
        )

    fun ComponentScope.switchDisabled(style: Int): Switch =
        switch(
            context,
            style,
            SwitchUiState(
                active = true,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )

    fun ComponentScope.switchToggleOff(style: Int): Switch =
        switch(
            context,
            style,
            SwitchUiState(
                active = false,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
}
