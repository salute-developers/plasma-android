package com.sdds.compose.uikit.fixtures.samples.indicator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorMode
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.indicator
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Indicator_Simple() {
    composableCodeSnippet {
        Indicator()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Indicator_Style() {
    composableCodeSnippet {
        IndicatorStyle.builder(this)
            .color {
                backgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(),
                )
            }
            .dimensions {
                height(12.0.dp)
                width(12.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AvatarIndicator_Simple() {
    composableCodeSnippet {
        Avatar(
            modifier = Modifier
                .indicator(
                    alignment = Alignment.TopEnd,
                    horizontalPadding = 2.dp,
                    verticalPadding = 2.dp,
                    horizontalMode = IndicatorMode.Inner,
                    verticalMode = IndicatorMode.Inner,
                ),
            status = AvatarStatus.None,
            actionEnabled = false,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
        )
    }
}
