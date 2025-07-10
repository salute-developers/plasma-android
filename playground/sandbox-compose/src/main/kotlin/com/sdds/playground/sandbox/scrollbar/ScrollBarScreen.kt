package com.sdds.playground.sandbox.scrollbar

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.Text
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [ScrollBar]
 */
@Composable
internal fun ScrollBarScreen(componentKey: ComponentKey = ComponentKey.ScrollBar) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ScrollBarViewModel>(
            factory = ScrollBarViewModelFactory(
                defaultState = ScrollBarUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { scrollBarUiState, style ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
            ) {
                if (scrollBarUiState.lazy) {
                    val lazyState = rememberLazyListState()
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        state = lazyState,
                    ) {
                        items(scrollBarUiState.itemCount) {
                            Text(text = "Item $it", modifier = Modifier.height(48.dp))
                        }
                    }
                    ScrollBar(
                        modifier = Modifier.align(Alignment.CenterEnd),
                        style = style,
                        scrollState = lazyState,
                        alwaysShowScrollbar = scrollBarUiState.alwaysShowScrollbar,
                        hasTrack = scrollBarUiState.hasTrack,
                        hoverExpand = scrollBarUiState.hoverExpand,
                    )
                } else {
                    val state = rememberScrollState()
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(state),
                    ) {
                        repeat(scrollBarUiState.itemCount) {
                            Text(text = "Item $it", modifier = Modifier.height(48.dp))
                        }
                    }
                    ScrollBar(
                        modifier = Modifier.align(Alignment.CenterEnd),
                        style = style,
                        scrollState = state,
                        alwaysShowScrollbar = scrollBarUiState.alwaysShowScrollbar,
                        hasTrack = scrollBarUiState.hasTrack,
                        hoverExpand = scrollBarUiState.hoverExpand,
                    )
                }
            }
        },
    )
}

@Composable
internal fun ScrollBarPreview(style: ScrollBarStyle) {
    SandboxTheme {
        Box(
            modifier = Modifier.height(40.dp),
        ) {
            val scrollState = rememberScrollState()
            Row(
                horizontalArrangement = Arrangement.spacedBy(2.dp),
                modifier = Modifier
                    .horizontalScroll(scrollState),
            ) {
                repeat(20) {
                    Icon(
                        painter = painterResource(R.drawable.ic_animal_fill_24),
                        contentDescription = "",
                    )
                }
            }
            ScrollBar(
                scrollState = scrollState,
                modifier = Modifier.align(Alignment.BottomCenter),
                style = style,
                orientation = Orientation.Horizontal,
                hasTrack = true,
                hoverExpand = false,
                alwaysShowScrollbar = true,
            )
        }
    }
}
