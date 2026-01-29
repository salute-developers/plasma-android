package com.sdds.compose.uikit.fixtures.samples.scrollbar

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun ScrollBar_Simple() {
    composableCodeSnippet {
        val scrollState = rememberScrollState()
        Box {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState),
            ) {
                repeat(100) {
                    Text(text = "Item $it")
                }
            }
            ScrollBar(
                modifier = Modifier.align(Alignment.CenterEnd),
                scrollState = scrollState,
                orientation = Orientation.Vertical,
                alwaysShowScrollbar = true,
                hasTrack = true,
                hoverExpand = false,
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun ScrollBarLazy_Simple() {
    composableCodeSnippet {
        val lazyState = rememberLazyListState()
        Box {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                state = lazyState,
            ) {
                items(100) {
                    Text(text = "Item $it")
                }
            }
            ScrollBar(
                modifier = Modifier.align(Alignment.CenterEnd),
                scrollState = lazyState,
                alwaysShowScrollbar = true,
                hasTrack = true,
                hoverExpand = true,
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ScrollBar_Style() {
    composableCodeSnippet {
        ScrollBarStyle.builder()
            .colors {
                trackColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                thumbColor(placeholder(Color.Green, "/** Токен цвета */").asInteractive())
            }
            .shape(CircleShape)
            .hoverExpandFactor(2.0f)
            .dimensions {
                width(4.0.dp)
            }
            .style()
    }
}
