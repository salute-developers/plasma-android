package com.sdds.compose.uikit.fixtures.samples.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun IconButton_IconButtonStyle() {
    composableCodeSnippet {
        ButtonStyle.iconButtonBuilder()
            .shape(placeholder(RoundedCornerShape(16.dp), "/** Токен формы (скругления) */"))
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
            }
            .dimensions {
                height(64.0.dp)
                paddingStart(28.0.dp)
                paddingEnd(28.0.dp)
                minWidth(106.0.dp)
                iconSize(24.0.dp)
                spinnerSize(24.0.dp)
                spinnerStrokeWidth(2.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample
fun IconButton_Simple() {
    composableCodeSnippet {
        IconButton(
            iconRes = com.sdds.icons.R.drawable.ic_alarm_done_fill_36,
            onClick = { },
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@DocSample
fun IconButton_IconContent() {
    composableCodeSnippet {
        IconButton(
            icon = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
                    contentDescription = "Будильник",
                )
            },
            onClick = { },
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@DocSample
fun IconButton_isLoading() {
    composableCodeSnippet {
        IconButton(
            iconRes = com.sdds.icons.R.drawable.ic_alarm_done_fill_36,
            onClick = { },
            enabled = true,
            loading = true,
        )
    }
}
