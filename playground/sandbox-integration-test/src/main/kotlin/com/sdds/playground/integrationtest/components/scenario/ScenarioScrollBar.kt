package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.Text

/**
 * Scrollbar для сценария
 */
@Composable
internal fun ScenarioScrollBar(
    style: ScrollBarStyle,
    scrollContainerTag: String,
    scrollTargetTag: String,
    modifier: Modifier = Modifier,
    onScrolled: () -> Unit = {},
) {
    val scrollState = rememberScrollState()

    LaunchedEffect(scrollState.value) {
        if (scrollState.value > 0) {
            onScrolled()
        }
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(240.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .testTag(scrollContainerTag),
        ) {
            repeat(30) { index ->
                Text(
                    text = "Item $index",
                    modifier = if (index == 29) {
                        Modifier
                            .height(48.dp)
                            .testTag(scrollTargetTag)
                    } else {
                        Modifier.height(48.dp)
                    },
                )
            }
            Text("scroll passed")
        }
        ScrollBar(
            scrollState = scrollState,
            modifier = Modifier.align(Alignment.TopEnd),
            style = style,
            orientation = Orientation.Vertical,
            hasTrack = true,
            hoverExpand = true,
            alwaysShowScrollbar = true,
        )
    }
}
