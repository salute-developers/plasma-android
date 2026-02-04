package com.sdds.compose.uikit.fixtures.samples.switcher

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Switch_Simple() {
    composableCodeSnippet {
        Switch(
            active = true,
            label = "Label",
            description = "Description",
            enabled = true,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Switch_Style() {
    composableCodeSnippet {
        SwitchStyle.builder()
            .toggleTrackShape(CircleShape)
            .toggleThumbShape(CircleShape)
            .colorValues {
                labelColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                descriptionColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                toggleTrackColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(SwitchStates.Checked)
                            to placeholder(Color.Green, "/** Цвет в состоянии checked */"),
                    ),
                )
                toggleTrackBorderColor(placeholder(Color.Transparent, "/** Токен цвета */").asInteractive())
                toggleThumbColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
            }
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensionValues {
                toggleTrackWidth(44.0.dp)
                toggleTrackHeight(28.0.dp)
                toggleThumbWidth(24.0.dp)
                toggleThumbHeight(24.0.dp)
                textPadding(12.0.dp)
                descriptionPadding(4.0.dp)
            }
            .style()
    }
}
