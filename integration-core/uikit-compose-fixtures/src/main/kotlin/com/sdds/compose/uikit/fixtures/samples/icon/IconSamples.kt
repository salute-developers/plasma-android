package com.sdds.compose.uikit.fixtures.samples.icon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.bitmapSource
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Icon_Simple() {
    composableCodeSnippet {
        Icon(
            source = resourceImageSource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
            contentDescription = "Будильник",
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Icon_Painter() {
    composableCodeSnippet {
        Icon(
            source = { painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36) },
            contentDescription = "Иконка из Painter",
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Icon_ImageVector() {
    val yourImageVector = ImageVector.vectorResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36)
    composableCodeSnippet {
        Icon(
            source = imageVectorSource(yourImageVector),
            contentDescription = "Иконка из ImageVector",
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Icon_Bitmap() {
    val yourBitmap = ImageBitmap.imageResource(com.sdds.icons.R.drawable.ic_accessibility_36)
    composableCodeSnippet {
        Icon(
            source = bitmapSource(yourBitmap),
            contentDescription = "Иконка из ImageBitmap",
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Icon_Brush() {
    composableCodeSnippet {
        Icon(
            source = resourceImageSource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
            contentDescription = "Иконка с brush",
            brush = {
                Brush.linearGradient(
                    colors = listOf(Color(0xFFF2994A), Color(0xFFEB5757)),
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Icon_LocalTint() {
    composableCodeSnippet {
        CompositionLocalProvider(LocalTintBrushProducer provides { Color.Red.asBrush() }) {
            Icon(
                source = resourceImageSource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
                contentDescription = null,
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Icon_DefaultSize() {
    composableCodeSnippet {
        CompositionLocalProvider(LocalIconDefaultSize provides DpSize(24.dp, 24.dp)) {
            Icon(
                source = resourceImageSource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
                contentDescription = null,
            )
        }
    }
}
