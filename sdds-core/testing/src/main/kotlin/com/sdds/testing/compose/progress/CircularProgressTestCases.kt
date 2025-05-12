package com.sdds.testing.compose.progress

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.dp

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgress(style: CircularProgressBarStyle) {
    Box(modifier = Modifier.padding(50.dp)) {
        CircularProgressBar(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = style,
            trackEnabled = true,
        )
    }
}

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgressMax(style: CircularProgressBarStyle) {
    Box(modifier = Modifier.padding(50.dp)) {
        CircularProgressBar(
            progress = 1f,
            modifier = Modifier.width(240.dp),
            style = style,
            trackEnabled = true,
        )
    }
}

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgressNoTrack(style: CircularProgressBarStyle) {
    Box(modifier = Modifier.padding(50.dp)) {
        CircularProgressBar(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = style,
            trackEnabled = false,
        )
    }
}
