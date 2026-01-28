package com.sdds.compose.uikit.fixtures.samples.radiobox

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun RadioBox_Simple() {
    composableCodeSnippet {
        RadioBox(
            checked = true,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun RadioBox_Style() {
    composableCodeSnippet {
        RadioBoxStyle.builder()
            .colorValues {
                labelColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(),
                )
                descriptionColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(),
                )
                toggleColor(
                    placeholder(Color.Transparent, "/** Токен цвета */").asInteractive(
                        setOf(RadioBoxStates.Checked)
                            to placeholder(Color.Blue, "/** Токен цвета */"),
                    ),
                )
                toggleIconColor(
                    placeholder(
                        Color.Black,
                        "/** Токен цвета */",
                    ).asInteractive(),
                )
                toggleBorderColor(
                    placeholder(
                        Color.Black,
                        "/** Токен цвета */",
                    ).asInteractive(),
                )
            }
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токе формы(скругления) */"))
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensionValues {
                toggleBorderOffset(
                    0.0.dp.asStatefulValue(
                        setOf(InteractiveState.Focused) to 3.0.dp,
                        setOf(
                            InteractiveState.Focused,
                            RadioBoxStates.Checked,
                        ) to 3.0.dp,
                    ),
                )
                toggleWidth(24.0.dp)
                toggleHeight(24.0.dp)
                toggleIconHeight(10.0.dp)
                toggleIconWidth(10.0.dp)
                toggleBorderWidth(
                    2.0.dp.asStatefulValue(
                        setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.0.dp,
                    ),
                )
                togglePadding(1.0.dp)
                textPadding(12.0.dp)
                descriptionPadding(2.0.dp)
            }
            .style()
    }
}
