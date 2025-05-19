package com.sdds.testing.compose.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.CircularProgressBarStyle

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgress(style: CircularProgressBarStyle) {
    CircularProgressBar(
        progress = 0.5f,
        style = style,
        trackEnabled = true,
    )
}

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgressMax(style: CircularProgressBarStyle) {
    CircularProgressBar(
        progress = 1f,
        style = style,
        trackEnabled = true,
    )
}

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgressNoTrack(style: CircularProgressBarStyle) {
    CircularProgressBar(
        progress = 0.5f,
        style = style,
        trackEnabled = false,
    )
}
