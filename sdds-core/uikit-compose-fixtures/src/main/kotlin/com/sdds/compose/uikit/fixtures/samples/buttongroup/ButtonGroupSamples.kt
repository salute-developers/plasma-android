package com.sdds.compose.uikit.fixtures.samples.buttongroup

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun ButtonGroup_Simple() {
    composableCodeSnippet {
        ButtonGroup(
            orientation = ButtonGroupOrientation.Horizontal,
        ) {
            button { Button(label = "label", onClick = {}) }
            button { Button(label = "label", onClick = {}) }
            button { Button(label = "label", onClick = {}) }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun IconButtonGroup_Simple() {
    composableCodeSnippet {
        ButtonGroup(
            orientation = ButtonGroupOrientation.Horizontal,
        ) {
            button {
                IconButton(
                    iconRes = R.drawable.ic_plasma_24,
                    onClick = {},
                )
            }
            button {
                IconButton(
                    iconRes = R.drawable.ic_plasma_24,
                    onClick = {},
                )
            }
            button {
                IconButton(
                    iconRes = R.drawable.ic_plasma_24,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ButtonGroup_Style() {
    composableCodeSnippet {
        ButtonGroupStyle.builder()
            .externalShape(CircleShape)
            .internalShape(RoundedCornerShape(5))
            .buttonStyle(
                placeholder(ButtonStyle.basicButtonBuilder().style(), "/** Стиль компонента */"),
            )
            .dimensions {
                spacing(2.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun IconButtonGroup_Style() {
    composableCodeSnippet {
        ButtonGroupStyle.builder()
            .externalShape(CircleShape)
            .internalShape(RoundedCornerShape(5))
            .buttonStyle(
                placeholder(ButtonStyle.iconButtonBuilder().style(), "/** Стиль компонента */"),
            )
            .dimensions {
                spacing(2.dp)
            }
            .style()
    }
}
