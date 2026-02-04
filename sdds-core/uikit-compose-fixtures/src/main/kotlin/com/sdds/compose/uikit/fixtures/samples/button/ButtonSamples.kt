package com.sdds.compose.uikit.fixtures.samples.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun BasicButton_BasicButtonStyle() {
    composableCodeSnippet {
        ButtonStyle.basicButtonBuilder()
            .shape(placeholder(RoundedCornerShape(16.dp), "/** Токен формы (скругления) */"))
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .valueStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .colors {
                backgroundColor(
                    Color.White.asInteractive(
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии hovered */"),
                    ),
                )
                spinnerColor(placeholder(Color.Black, "/** Токен цвета */"))
                iconColor(placeholder(Color.Black, "/** Токен цвета */"))
                labelColor(placeholder(Color.Black, "/** Токен цвета */"))
                valueColor(placeholder(Color.Gray, "/** Токен цвета */"))
            }
            .dimensions {
                height(64.0.dp)
                paddingStart(28.0.dp)
                paddingEnd(28.0.dp)
                minWidth(106.0.dp)
                iconSize(24.0.dp)
                spinnerSize(24.0.dp)
                spinnerStrokeWidth(2.0.dp)
                iconMargin(8.0.dp)
                valueMargin(4.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample
fun BasicButton_Simple() {
    composableCodeSnippet {
        Button(
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@DocSample
fun BasicButton_LabelValue_Packed() {
    composableCodeSnippet {
        Button(
            label = "Label",
            value = "Value",
            spacing = ButtonSpacing.Packed,
            onClick = {},
        )
    }
}

@Composable
@DocSample
fun BasicButton_LabelValue_SpaceBetween() {
    composableCodeSnippet {
        Button(
            label = "Label",
            value = "Value",
            spacing = ButtonSpacing.SpaceBetween,
            onClick = {},
        )
    }
}

@Composable
@DocSample
fun BasicButton_isLoading() {
    composableCodeSnippet {
        Button(
            label = "Label",
            value = "",
            enabled = true,
            loading = true,
            onClick = {},
        )
    }
}
