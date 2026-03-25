package com.sdds.compose.uikit.fixtures.stories.scrollbar

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
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
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.ScrollBarUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ScrollBarUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента ScrollBar
 */
@StoryUiState
data class ScrollBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val lazy: Boolean = true,
    val itemCount: Int = 30,
    val hoverExpand: Boolean = true,
    val hasTrack: Boolean = true,
    val alwaysShowScrollbar: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ScrollBarStory : ComposeBaseStory<ScrollBarUiState, ScrollBarStyle>(
    ComponentKey.ScrollBar,
    ScrollBarUiState(),
    ScrollBarUiStatePropertiesProducer,
    ScrollBarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ScrollBarStyle,
        state: ScrollBarUiState,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
        ) {
            if (state.lazy) {
                val lazyState = rememberLazyListState()
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = lazyState,
                ) {
                    items(state.itemCount) {
                        Text(text = "Item $it", modifier = Modifier.height(48.dp))
                    }
                }
                ScrollBar(
                    modifier = Modifier.align(Alignment.CenterEnd),
                    style = style,
                    scrollState = lazyState,
                    alwaysShowScrollbar = state.alwaysShowScrollbar,
                    hasTrack = state.hasTrack,
                    hoverExpand = state.hoverExpand,
                )
            } else {
                val scrollState = rememberScrollState()
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    repeat(state.itemCount) {
                        Text(text = "Item $it", modifier = Modifier.height(48.dp))
                    }
                }
                ScrollBar(
                    modifier = Modifier.align(Alignment.CenterEnd),
                    style = style,
                    scrollState = scrollState,
                    alwaysShowScrollbar = state.alwaysShowScrollbar,
                    hasTrack = state.hasTrack,
                    hoverExpand = state.hoverExpand,
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: ScrollBarStyle,
        key: ComponentKey,
    ) {
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
                        painter = painterResource(R.drawable.ic_clown_24),
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
