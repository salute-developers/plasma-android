package com.sdds.compose.uikit.fixtures.samples.progress

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Progress_Simple() {
    composableCodeSnippet {
        ProgressBar(
            progress = 0.25f,
            modifier = Modifier.width(240.dp),
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Progress_Style() {
    composableCodeSnippet {
        ProgressBarStyle.builder()
            .colorValues {
                backgroundColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                indicatorColor(placeholder(Color.Green, "/** Токен цвета */").asInteractive())
            }
            .indicatorShape(CircleShape)
            .backgroundShape(CircleShape)
            .dimensionValues {
                indicatorHeight(4.0.dp)
                backgroundHeight(4.0.dp)
            }
            .style()
    }
}
