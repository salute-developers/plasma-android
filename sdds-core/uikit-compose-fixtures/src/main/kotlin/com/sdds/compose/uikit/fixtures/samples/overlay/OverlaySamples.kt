package com.sdds.compose.uikit.fixtures.samples.overlay

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Overlay_Simple() {
    composableCodeSnippet {
        Overlay(
            modifier = Modifier.fillMaxSize(),
        ) {
            IconButton(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 8.dp, top = 8.dp),
                iconRes = com.sdds.icons.R.drawable.ic_close_24,
                onClick = {},
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Overlay_Style() {
    composableCodeSnippet {
        OverlayStyle.builder()
            .color {
                backgroundColor(SolidColor(Color.Gray))
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun OverlayList_Simple() {
    composableCodeSnippet {
        val listState = rememberLazyListState()
        val scrollOffset by remember {
            derivedStateOf {
                listState.firstVisibleItemIndex * (
                    listState.layoutInfo.visibleItemsInfo.firstOrNull()?.size
                        ?: 0
                    ) +
                    listState.firstVisibleItemScrollOffset
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun OverlayVerticalScroll_Simple() {
    composableCodeSnippet {
        val scrollState = rememberScrollState()
        val scrollOffset by remember {
            derivedStateOf {
                scrollState.value.toFloat()
            }
        }
    }
}
