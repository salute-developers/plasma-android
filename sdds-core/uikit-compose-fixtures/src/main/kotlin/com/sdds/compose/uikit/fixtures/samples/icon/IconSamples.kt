package com.sdds.compose.uikit.fixtures.samples.icon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTint
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Icon_Simple() {
    composableCodeSnippet {
        Icon(
            painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
            contentDescription = "Будильник",
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Icon_Image() {
    composableCodeSnippet {
        Image(
            painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
            contentDescription = null,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Icon_Bitmap() {
    composableCodeSnippet {
        val bitmap = ImageBitmap.imageResource(com.sdds.icons.R.drawable.ic_accessibility_36)
        Image(
            bitmap = bitmap,
            contentDescription = "Avatar",
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun IconTint_Simple() {
    composableCodeSnippet {
        Icon(
            painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
            contentDescription = null,
            tint = Color.Red,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun IconCompositionLocal_Simple() {
    composableCodeSnippet {
        CompositionLocalProvider(LocalTint provides Color.Blue) {
            Image(
                painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
                contentDescription = null,
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun IconCompositionLocalSize_Simple() {
    composableCodeSnippet {
        CompositionLocalProvider(LocalIconDefaultSize provides DpSize(24.dp, 24.dp)) {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
                contentDescription = null,
            )
        }
    }
}
