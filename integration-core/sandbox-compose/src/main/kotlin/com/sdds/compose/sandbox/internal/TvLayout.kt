package com.sdds.compose.sandbox.internal

import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Drawer

@Composable
internal fun TvLayout(
    peekWidth: Dp = 30.dp,
    menuItems: @Composable () -> Unit,
    mainContent: @Composable () -> Unit,
) {
    val style = LocalNavigationViewStyle.current
    val density = LocalDensity.current
    Drawer(
        modifier = Modifier
            .width(style.menuWidth)
            .fillMaxHeight(),
        moveContentEnabled = true,
        openOnFocus = true,
        overlayEnabled = false,
        peekOffset = peekWidth,
        drawerContent = menuItems,
    ) {
        BoxWithConstraints {
            val screenWidth = constraints.maxWidth.toFloat()
            Box(
                modifier = Modifier
                    .width(with(density) { screenWidth.toDp() - peekWidth })
                    .padding(start = peekWidth + 2.dp)
                    .fillMaxHeight()
                    .focusGroup(),
            ) { mainContent() }
        }
    }
}
