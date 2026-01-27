package com.sdds.plasma.homeds.docs.samples

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.NavigationBar
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.floatPx
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun NavigationBar_WithOverlay() {
    val exampleScrollThresholdPx = 100.dp.floatPx

    composableCodeSnippet {
        val listState = rememberLazyListState()
        val scrollThresholdPx = placeholder(exampleScrollThresholdPx, "// Ваше значение предела скролла в px")
        val overlayAlpha by remember {
            derivedStateOf {
                val visibleItemSize = listState.layoutInfo.visibleItemsInfo.firstOrNull()?.size ?: 0
                val offset = listState.firstVisibleItemIndex * visibleItemSize + listState.firstVisibleItemScrollOffset
                (offset / scrollThresholdPx).coerceIn(0f, 1f)
            }
        }

        Overlay(alpha = { overlayAlpha }) {
            NavigationBar()
        }
    }
}
