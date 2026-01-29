package com.sdds.compose.uikit.fixtures.samples.progress

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.LocalCircularProgressBarStyle
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample
import kotlin.math.roundToInt

@Composable
@DocSample(needScreenshot = true)
fun CircularProgress_Simple() {
    composableCodeSnippet {
        CircularProgressBar(
            progress = 0.5f,
            trackEnabled = true,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun CircularProgress_Style() {
    composableCodeSnippet {
        CircularProgressBarStyle.builder()
            .colors {
                indicatorColor(
                    SolidColor(placeholder(Color.Red, "/** Токен цвета */")).asStatefulValue(),
                )
                trackColor(
                    SolidColor(placeholder(Color.Gray, "/** Токен цвета */")).asStatefulValue(),
                )
                valueColor(
                    SolidColor(placeholder(Color.Black, "/** Токен цвета */")).asStatefulValue(),
                )
            }
            .valueStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                width(128.0.dp)
                height(128.0.dp)
                trackThickness(4.0.dp)
                progressThickness(4.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun CircularProgressSuffix_Simple() {
    composableCodeSnippet {
        val progress = 0.5f
        CircularProgressBar(
            progress = progress,
            style = LocalCircularProgressBarStyle.current,
            value = "${(progress * 100).roundToInt()}",
            valueSuffix = "%",
        )
    }
}
