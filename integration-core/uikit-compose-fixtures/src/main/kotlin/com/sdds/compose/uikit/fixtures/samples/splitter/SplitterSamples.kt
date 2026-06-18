package com.sdds.compose.uikit.fixtures.samples.splitter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Splitter
import com.sdds.compose.uikit.SplitterOrientation
import com.sdds.compose.uikit.SplitterStyle
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun Splitter_Simple() {
    composableCodeSnippet {
        Splitter(
            modifier = Modifier,
            orientation = SplitterOrientation.Horizontal,
            hasHandle = true,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Splitter_Style() {
    composableCodeSnippet {
        SplitterStyle.builder()
            .dividerShape(CircleShape)
            .handleShape(CircleShape)
            .color {
                dividerColor(placeholder(Color.Transparent, "/** Токен цвета */").asInteractive())
                handleColor(placeholder(Color.Transparent, "/** Токен цвета */").asInteractive())
            }
            .dimensions {
                dividerThickness(2.0.dp)
                handleThickness(1.0.dp)
                handleStartPadding(3.0.dp)
                handleEndPadding(3.0.dp)
                handleTopPadding(3.0.dp)
                handleBottomPadding(3.0.dp)
                handleSpacer(5.0.dp)
                gap(22.0.dp)
            }
            .style()
    }
}
