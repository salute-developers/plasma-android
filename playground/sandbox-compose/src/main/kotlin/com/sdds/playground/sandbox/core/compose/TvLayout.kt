package com.sdds.playground.sandbox.core.compose

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp

@Composable
internal fun TvLayout(
    peekWidth: Dp = 30.dp,
//    menuItems: @Composable (onFocusChanged: (Boolean) -> Unit) -> Unit,
    menuItems: @Composable () -> Unit,
    mainContent: @Composable () -> Unit,
) {
    val style = LocalNavigationViewStyle.current
    val density = LocalDensity.current
    val menuWidthPx = with(density) { style.menuWidth.toPx() }
    val peekWidthPx = with(density) { peekWidth.toPx() }
    var isMenuItemFocused by remember { mutableStateOf(false) }
    val animatedOffset by animateFloatAsState(
        targetValue = if (isMenuItemFocused) 0f else menuWidthPx - peekWidthPx,
        animationSpec = tween(200),
    )
    BoxWithConstraints {
        val screenWidth = constraints.maxWidth.toFloat()
        Box(
            Modifier
                .fillMaxSize()
                .graphicsLayer { translationX = -animatedOffset },
        ) {
            Box(
                modifier = Modifier
                    .width(style.menuWidth)
                    .fillMaxHeight()
                    .focusGroup()
                    .onFocusChanged { isMenuItemFocused = it.isFocused || it.hasFocus },
            ) {
                menuItems()
            }
            Box(
                modifier = Modifier
                    .offset { IntOffset(x = menuWidthPx.toInt(), y = 0) }
                    .width(with(density) { screenWidth.toDp() - peekWidth })
                    .padding(start = 2.dp)
                    .fillMaxHeight(),
            ) { mainContent() }
        }
    }
}
