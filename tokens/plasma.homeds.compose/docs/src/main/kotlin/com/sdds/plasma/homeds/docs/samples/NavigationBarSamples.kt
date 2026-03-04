package com.sdds.plasma.homeds.docs.samples

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationBar
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.floatPx
import com.sdds.compose.uikit.style.style
import com.sdds.docs.DocSample
import com.sdds.plasma.homeds.styles.navigationbar.Default
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarInternalPage
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarMainPage
import com.sdds.plasma.homeds.styles.overlay.DirectionTop
import com.sdds.plasma.homeds.styles.overlay.Overlay

@Composable
@DocSample(needScreenshot = false)
fun NavigationBar_MainPage() {
    composableCodeSnippet {
        NavigationBar(
            style = NavigationBarMainPage.Default.style(),
            textPlacement = NavigationBarTextPlacement.Inline,
            titleContent = { Text("Title") },
            descriptionContent = { Text("Description") },
            actionEnd = {
                Icon(
                    modifier = Modifier.clickable { /* действие */ },
                    painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                    contentDescription = "",
                )
            },
            onBackPressed = {
                /* действие по кнопке назад */
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun NavigationBar_InternalPage() {
    composableCodeSnippet {
        NavigationBar(
            style = NavigationBarInternalPage.Default.style(),
            textPlacement = NavigationBarTextPlacement.Inline,
            titleContent = { Text("Title") },
            descriptionContent = { Text("Description") },
            actionEnd = {
                Icon(
                    modifier = Modifier.clickable { /* действие */ },
                    painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                    contentDescription = "",
                )
            },
            onBackPressed = {
                /* действие по кнопке назад */
            },
        )
    }
}

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

        Overlay(
            style = Overlay.DirectionTop.style(),
            alpha = { overlayAlpha },
        ) {
            NavigationBar(
                style = NavigationBarMainPage.Default.style(),
            )
        }
    }
}
