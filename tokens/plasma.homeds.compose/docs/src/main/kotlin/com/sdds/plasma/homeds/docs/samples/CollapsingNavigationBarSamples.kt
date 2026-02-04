package com.sdds.plasma.homeds.docs.samples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CollapsingNavigationBar
import com.sdds.compose.uikit.CollapsingNavigationBarDefaults
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.floatPx
import com.sdds.compose.uikit.rememberCollapsingNavigationBarState
import com.sdds.compose.uikit.style.style
import com.sdds.docs.DocSample
import com.sdds.plasma.homeds.styles.overlay.DirectionTop
import com.sdds.plasma.homeds.styles.overlay.Overlay

@Composable
@DocSample(needScreenshot = false)
fun CollapsingNavigationBar_WithOverlayAndScrollThreshold() {
    val exampleScrollThresholdPx = 100.dp.floatPx

    composableCodeSnippet {
        val listState = rememberLazyListState()
        val scrollThresholdPx =
            placeholder(exampleScrollThresholdPx, "// Ваше значение предела скролла в px")
        val overlayAlpha by remember {
            derivedStateOf {
                val visibleItemSize = listState.layoutInfo.visibleItemsInfo.firstOrNull()?.size ?: 0
                val offset =
                    listState.firstVisibleItemIndex * visibleItemSize + listState.firstVisibleItemScrollOffset
                (offset / scrollThresholdPx).coerceIn(0f, 1f)
            }
        }

        val scrollBehavior = CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior(
            state = rememberCollapsingNavigationBarState(),
        )
        Column(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        ) {
            Overlay(
                style = Overlay.DirectionTop.style(),
                alpha = { overlayAlpha },
            ) {
                CollapsingNavigationBar(
                    scrollBehavior = scrollBehavior,
                    collapsedTitle = { Text("Title") },
                    expandedTitle = { Text("Title") },
                    collapsedDescription = { Text("Description") },
                    expandedDescription = { Text("Description") },
                    content = { Text("Content") },
                    actionStart = {
                        Icon(
                            painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                            contentDescription = "",
                        )
                    },
                    actionEnd = {
                        Icon(
                            painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                            contentDescription = "",
                        )
                    },
                    onBackPressed = {
                        println("Back button was pressed")
                    },
                )
            }
            LazyColumn(
                state = listState,
            ) {
                items(100) {
                    Text(modifier = Modifier.padding(32.dp), text = "Label text $it")
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun CollapsingNavigationBar_WithOverlayAndAlphaByScrollBehavior() {
    composableCodeSnippet {
        val scrollBehavior =
            CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior(
                rememberCollapsingNavigationBarState(),
            )

        Column(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        ) {
            Overlay(
                style = Overlay.DirectionTop.style(),
                alpha = { scrollBehavior.state.collapsedFraction },
            ) {
                CollapsingNavigationBar(
                    scrollBehavior = scrollBehavior,
                    collapsedTitle = { Text("Title") },
                    expandedTitle = { Text("Title") },
                    collapsedDescription = { Text("Description") },
                    expandedDescription = { Text("Description") },
                    content = { Text("Content") },
                    actionStart = {
                        Icon(
                            painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                            contentDescription = "",
                        )
                    },
                    actionEnd = {
                        Icon(
                            painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                            contentDescription = "",
                        )
                    },
                    onBackPressed = {
                        println("Back button was pressed")
                    },
                )
            }
            LazyColumn {
                items(100) {
                    Text(modifier = Modifier.padding(32.dp), text = "Label text $it")
                }
            }
        }
    }
}
