package com.sdds.compose.uikit.fixtures.testcases

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
        enabled = true,
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

/**
 * Switch On
 */
@Composable
fun SwitchOn(style: SwitchStyle) {
    Switch(
        style = style,
        active = true,
        enabled = true,
    )
}

/**
 * Switch Off
 */
@Composable
fun SwitchOff(style: SwitchStyle) {
    Switch(
        style = style,
        active = false,
        enabled = true,
    )
}

/**
 * Switch On disabled
 */
@Composable
fun SwitchOnDisabledNoText(style: SwitchStyle) {
    Switch(
        style = style,
        active = true,
        enabled = false,
    )
}

/**
 * Switch Off disabled
 */
@Composable
fun SwitchOffDisabledNoText(style: SwitchStyle) {
    Switch(
        style = style,
        active = false,
        enabled = false,
    )
}
