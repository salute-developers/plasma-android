package com.sdds.testing.compose.toolbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ToolBar
import com.sdds.compose.uikit.ToolBarOrientation
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.icons.R

/**
 * Тест-кейсы для [ToolBar]
 */

/**
 * ToolBar Horizontal Divider
 */
@Composable
fun ToolBarHorizontalDivider(
    style: ToolBarStyle,
    buttonStyle: ButtonStyle,
    iconButtonStyle: ButtonStyle,
) {
    ToolBarCommon(
        style = style,
        buttonStyle = buttonStyle,
        iconButtonStyle = iconButtonStyle,
        hasDivider = true,
        orientation = ToolBarOrientation.Horizontal,
    )
}

/**
 * ToolBar Vertical
 */
@Composable
fun ToolBarVertical(
    style: ToolBarStyle,
    buttonStyle: ButtonStyle,
    iconButtonStyle: ButtonStyle,
) {
    ToolBarCommon(
        style = style,
        buttonStyle = buttonStyle,
        iconButtonStyle = iconButtonStyle,
        orientation = ToolBarOrientation.Vertical,
    )
}

/**
 * ToolBar Horizontal
 */
@Composable
fun ToolBarHorizontal(
    style: ToolBarStyle,
    buttonStyle: ButtonStyle,
    iconButtonStyle: ButtonStyle,
) {
    ToolBarCommon(
        style = style,
        buttonStyle = buttonStyle,
        iconButtonStyle = iconButtonStyle,
        orientation = ToolBarOrientation.Horizontal,
    )
}

/**
 * ToolBar Common тест-кейс
 */
@Composable
fun ToolBarCommon(
    style: ToolBarStyle,
    buttonStyle: ButtonStyle,
    iconButtonStyle: ButtonStyle,
    hasDivider: Boolean = false,
    orientation: ToolBarOrientation,
) {
    ToolBar(
        style = style,
        hasDivider = hasDivider,
        orientation = orientation,
        content = {
            for (section in 0 until 3) {
                section {
                    if (section % 2 == 0) {
                        ContainerAccordingOrientation(orientation = orientation) {
                            IconButton(
                                style = iconButtonStyle,
                                iconRes = R.drawable.ic_plasma_24,
                            ) { }
                            Spacer(modifier = Modifier.size(4.dp))
                            IconButton(
                                style = iconButtonStyle,
                                iconRes = R.drawable.ic_salute_outline_24,
                            ) { }
                        }
                    } else {
                        Button(
                            style = buttonStyle,
                            label = "Label",
                            onClick = {},
                        )
                    }
                }
            }
        },
    )
}

/**
 * Контейнер в зависимости от ориентации
 */
@Composable
private fun ContainerAccordingOrientation(
    orientation: ToolBarOrientation,
    content: @Composable () -> Unit,
) {
    if (orientation == ToolBarOrientation.Horizontal) {
        Row { content() }
    } else {
        Column { content() }
    }
}
