package com.sdds.compose.uikit.fixtures.samples.chip

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Chip_Simple() {
    composableCodeSnippet {
        Chip(
            label = "label",
            isSelected = true,
            startContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_accessibility_24),
                    contentDescription = "",
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Chip_Style() {
    composableCodeSnippet {
        ChipStyle.builder()
            .colors {
                backgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Red, "/** Токен цвета */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Blue, "/** Токен цвета */"),
                    ),
                )
                    .contentStartColor(placeholder(Color.White, "/** Токен цвета */"))
                    .contentEndColor(placeholder(Color.White, "/** Токен цвета */"))
                    .labelColor(placeholder(Color.Green, "/** Токен цвета */"))
            }
            .shape(
                placeholder(
                    RoundedCornerShape(8.dp),
                    "/** Токен формы (скругления) */",
                ),
            )
            .labelStyle(placeholder(TextStyle.Default, "/** Токен стиля текста */"))
            .dimensions {
                height(48.0.dp)
                paddingStart(16.0.dp)
                paddingEnd(16.0.dp)
                contentStartPadding(8.0.dp)
                contentEndPadding(8.0.dp)
                contentStartSize(24.0.dp)
                contentEndSize(24.0.dp)
            }
            .style()
    }
}
