package com.sdds.compose.uikit.fixtures.samples.counter

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Counter_Simple() {
    composableCodeSnippet {
        Counter(
            count = "1",
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Counter_Style() {
    composableCodeSnippet {
        CounterStyle.builder()
            .colors {
                backgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                    ),
                )
                textColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Gray, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.DarkGray, "/** Цвет в состоянии hovered */"),
                    ),
                )
            }
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                minHeight(28.0.dp)
                minWidth(28.0.dp)
                paddingStart(10.0.dp)
                paddingEnd(10.0.dp)
            }
            .style()
    }
}
