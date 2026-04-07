package com.sdds.compose.uikit.fixtures.samples.spinner

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.SpinnerStrokeCap
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Spinner_Simple() {
    composableCodeSnippet {
        Spinner(
            modifier = Modifier,
            interactionSource = remember { MutableInteractionSource() },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Spinner_Style() {
    composableCodeSnippet {
        SpinnerStyle.builder()
            .angle(360f)
            .strokeCap(SpinnerStrokeCap.Round)
            .dimensions {
                size(16.0.dp)
                strokeWidth(2.dp)
                padding(1.dp)
            }
            .colors {
                backgroundColor(Color.LightGray)
                startColor(Color.LightGray)
                endColor(Color.Black)
            }
            .style()
    }
}
