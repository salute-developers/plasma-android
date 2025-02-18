package com.sdds.testing.compose.progress

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle

/**
 * Тест кейсы для ProgressBar
 */

/**
 * PLASMA-T1448
 */
@Composable
fun ProgressBarDefault(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.25f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1449
 */
@Composable
fun ProgressBarSecondary(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.25f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1450
 */
@Composable
fun ProgressBarWarning(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.25f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1493
 */
@Composable
fun ProgressBarPositive(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.5f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1494
 */
@Composable
fun ProgressBarNegative(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.99f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1495
 */
@Composable
fun ProgressBarAccent(style: ProgressBarStyle) {
    ProgressBar(
        progress = 1f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1496
 */
@Composable
fun ProgressBarGradientAccent(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.5f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}

/**
 * PLASMA-T1497
 */
@Composable
fun ProgressBarDefaultValueOne(style: ProgressBarStyle) {
    ProgressBar(
        progress = 0.01f,
        modifier = Modifier.width(240.dp),
        style = style,
    )
}
