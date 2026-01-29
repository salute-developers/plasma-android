package com.sdds.compose.uikit.fixtures.samples.checkbox

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun CheckBox_Simple() {
    composableCodeSnippet {
        CheckBox(
            state = ToggleableState.On,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun CheckBox_Style() {
    composableCodeSnippet {
        CheckBoxStyle.builder()
            .colorValues {
                labelColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                descriptionColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                toggleColor(
                    placeholder(Color.Transparent, "/** Токен цвета */").asInteractive(
                        setOf(CheckBoxStates.Checked)
                            to placeholder(Color.Red, "/** Цвет в состоянии Checked */"),
                        setOf(CheckBoxStates.Indeterminate)
                            to placeholder(Color.Blue, "/** Цвет в состоянии Indeterminate */"),
                    ),
                )
                toggleIconColor(placeholder(Color.DarkGray, "/** Токен цвета */").asInteractive())
                toggleBorderColor(
                    placeholder(Color.Red, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                            to placeholder(Color.Red, "/** Цвет в состоянии Checked */"),
                    ),
                )
            }
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы (скругления) */"))
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensionValues {
                toggleWidth(24.0.dp)
                toggleHeight(24.0.dp)
                toggleIconHeight(
                    0.0.dp.asStatefulValue(
                        setOf(CheckBoxStates.Checked) to 6.0.dp,
                        setOf(CheckBoxStates.Indeterminate) to
                            2.0.dp,
                    ),
                )
            }
            .style()
    }
}
