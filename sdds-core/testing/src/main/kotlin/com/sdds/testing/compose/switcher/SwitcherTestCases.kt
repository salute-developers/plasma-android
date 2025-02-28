package com.sdds.testing.compose.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle

/**
 * Тест кейсы для Switcher
 */

/**
 * PLASMA-T1425
 */
@Composable
fun SwitchLOn(style: SwitchStyle) {
    Switch(
        style = style,
        active = true,
        label = "Label",
        description = "Description",
        enabled = true,
    )
}

/**
 * PLASMA-T1426
 */
@Composable
fun SwitchMOff(style: SwitchStyle) {
    Switch(
        style = style,
        active = false,
        label = "Label",
        description = "Description",
        enabled = false,
    )
}

/**
 * PLASMA-T1500
 */
@Composable
fun SwitchS(style: SwitchStyle) {
    Switch(
        style = style,
        active = true,
        label = "",
        description = "",
        enabled = true,
    )
}

/**
 * PLASMA-T1505
 */
@Composable
fun SwitchOnDisabled(style: SwitchStyle) {
    Switch(
        style = style,
        active = true,
        label = "Label",
        description = "Description",
        enabled = false,
    )
}

/**
 * PLASMA-T1923
 */
@Composable
fun SwitchOffDisabled(style: SwitchStyle) {
    Switch(
        style = style,
        active = false,
        label = "Label",
        description = "Description",
        enabled = false,
    )
}
