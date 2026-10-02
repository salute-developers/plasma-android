package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.stringSource

/**
 * Текст зеленый
 */
@Composable
fun TextEllipsisFillColor() {
    Text(
        source = stringSource(LARGE_TEXT),
        modifier = Modifier.width(240.dp),
        maxLines = 5,
        overflow = TextOverflow.Ellipsis,
        brush = {
            Color(0xFF27AE60).asBrush()
        },
    )
}

/**
 * Текст градиентный
 */
@Composable
fun TextClipFillBrush() {
    Text(
        source = stringSource(LARGE_TEXT),
        modifier = Modifier.width(240.dp),
        maxLines = 5,
        overflow = TextOverflow.Clip,
        brush = {
            Brush.linearGradient(
                colors = listOf(Color(0xFF11994A), Color(0xFFff5757)),
            )
        },
    )
}

private const val LARGE_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
    "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor " +
    "in reprehenderit in voluptate velit esse cillum dolore"
