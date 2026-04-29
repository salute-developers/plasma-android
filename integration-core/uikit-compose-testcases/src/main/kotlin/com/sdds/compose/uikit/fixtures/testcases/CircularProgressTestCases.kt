package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.Icon

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

/**
 * Тест-кейсы для [CircularProgressBar]
 */
@Composable
fun CircularProgressWithIcon(style: CircularProgressBarStyle) {
    CircularProgressBar(
        progress = 0.5f,
        style = style,
        trackEnabled = false,
        valueContent = {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                contentDescription = "",
            )
        },
    )
}
