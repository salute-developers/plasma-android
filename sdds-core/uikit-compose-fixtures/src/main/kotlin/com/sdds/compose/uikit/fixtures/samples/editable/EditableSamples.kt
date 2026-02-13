package com.sdds.compose.uikit.fixtures.samples.editable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.Icon
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Editable_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf(TextFieldValue("Value")) }
        Editable(
            value = text,
            onValueChange = { text = it },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Editable_AbsoluteIcon() {
    composableCodeSnippet {
        var text by remember { mutableStateOf(TextFieldValue("Value")) }
        val focusRequester = remember { FocusRequester() }
        Editable(
            modifier = Modifier
                .focusRequester(focusRequester),
            value = text,
            onValueChange = { text = it },
            icon = {
                Icon(
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            focusRequester.requestFocus()
                            text = text.copy(selection = TextRange(text.text.length))
                        },
                    painter = painterResource(R.drawable.ic_edit_fill_36),
                    contentDescription = null,
                )
            },
            iconPlacement = EditableIconPlacement.Absolute,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Editable_RelativeIcon() {
    composableCodeSnippet {
        var text by remember { mutableStateOf(TextFieldValue("Value")) }
        val focusRequester = remember { FocusRequester() }
        Editable(
            modifier = Modifier
                .focusRequester(focusRequester),
            value = text,
            onValueChange = { text = it },
            icon = {
                Icon(
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            focusRequester.requestFocus()
                            text = text.copy(selection = TextRange(text.text.length))
                        },
                    painter = painterResource(R.drawable.ic_edit_fill_36),
                    contentDescription = null,
                )
            },
            iconPlacement = EditableIconPlacement.Relative,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Editable_Style() {
    composableCodeSnippet {
        EditableStyle.builder()
            .colors {
                iconColor(placeholder(Color.DarkGray, "/** Токен цвета */"))
                textColor(placeholder(Color.Black, "/** Токен цвета */"))
                cursorColor(placeholder(Color.Green, "/** Токен цвета */"))
            }
            .dimensions {
                iconMargin(2.dp)
                iconSize(16.dp)
            }
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .style()
    }
}
