package com.sdds.compose.uikit.fixtures.samples.image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.ImageStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Image_Simple() {
    composableCodeSnippet {
        Image(
            modifier = Modifier
                .width(100.dp)
                .background(Color.Gray),
            painter = painterResource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
            contentDescription = "image",
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Image_Style() {
    composableCodeSnippet {
        ImageStyle.builder()
            .ratio(2f)
            .style()
    }
}
