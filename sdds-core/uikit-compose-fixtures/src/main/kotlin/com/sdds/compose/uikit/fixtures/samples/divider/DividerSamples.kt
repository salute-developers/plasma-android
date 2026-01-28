package com.sdds.compose.uikit.fixtures.samples.divider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DividerOrientation
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Divider_Simple() {
    composableCodeSnippet {
        Divider(
            modifier = Modifier,
            orientation = DividerOrientation.Horizontal,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Divider_Style() {
    composableCodeSnippet {
        DividerStyle.builder()
            .shape(CircleShape)
            .color {
                backgroundColor(
                    placeholder(Color.Transparent, "/** Токен цвета */").asInteractive(),
                )
            }
            .dimensions {
                thickness(1.0.dp)
            }
            .style()
    }
}
