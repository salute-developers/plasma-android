package com.sdds.testing.compose.scrollbar

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.Text

/**
 * Тест кейсы для [ScrollBar]
 */

/**
 * PLASMA-T2124
 */
@Composable
fun ScrollBarM(style: ScrollBarStyle) {
    Box(modifier = Modifier.width(80.dp)) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState),
        ) {
            repeat(30) {
                Text(text = "Item $it", modifier = Modifier.height(48.dp))
            }
        }
        ScrollBar(
            scrollState = scrollState,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .testTag("scrollBar"),
            style = style,
            orientation = Orientation.Vertical,
            hasTrack = true,
            hoverExpand = true,
            alwaysShowScrollbar = true,
        )
    }
}

/**
 * PLASMA-T2125
 */
@Composable
fun ScrollBarS(style: ScrollBarStyle) {
    Box(modifier = Modifier.width(80.dp)) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState),
        ) {
            repeat(30) {
                Text(text = "Item $it", modifier = Modifier.height(48.dp))
            }
        }
        ScrollBar(
            scrollState = scrollState,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .testTag("scrollBar"),
            style = style,
            orientation = Orientation.Vertical,
            hasTrack = false,
            hoverExpand = true,
            alwaysShowScrollbar = true,
        )
    }
}
