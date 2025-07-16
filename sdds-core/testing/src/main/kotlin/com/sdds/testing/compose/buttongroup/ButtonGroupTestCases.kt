package com.sdds.testing.compose.buttongroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R

/**
 * Тест кейсы для ButtonGroup
 */

/**
 * ButtonGroupHorizontal
 */
@Composable
fun ButtonGroupHorizontal(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
        content = {
            repeat(3) {
                buttonContent()
            }
        },
    )
}

/**
 * ButtonGroupHorizontalMaxAmount
 */
@Composable
fun ButtonGroupHorizontalMaxAmount(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
        content = {
            repeat(10) {
                buttonContent()
            }
        },
    )
}

/**
 * ButtonGroupVertical
 */
@Composable
fun ButtonGroupVertical(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Vertical,
        content = {
            repeat(3) {
                buttonContent()
            }
        },
    )
}

/**
 * Компонент Button для ButtonGroup
 */
fun ButtonGroupScope.buttonContent() {
    button {
        Button(
            label = "Label",
            onClick = {},
        )
    }
}

/**
 * IconButtonGroupHorizontal
 */
@Composable
fun IconButtonGroupHorizontal(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
        content = {
            repeat(3) {
                iconButtonContent()
            }
        },
    )
}

/**
 * IconButtonGroupVertical
 */
@Composable
fun IconButtonGroupVertical(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Vertical,
        content = {
            repeat(3) {
                iconButtonContent()
            }
        },
    )
}

/**
 * IconButtonGroupHorizontalMaxAmount
 */
@Composable
fun IconButtonGroupHorizontalMaxAmount(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
        content = {
            repeat(10) {
                iconButtonContent()
            }
        },
    )
}

/**
 * IconButton для ButtonGroup
 */
fun ButtonGroupScope.iconButtonContent() {
    button { IconButton(painterResource(R.drawable.ic_plasma_24), {}) }
}
