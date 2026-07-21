package com.sdds.compose.sandbox.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.Drawer

@Composable
internal fun LargeLayout(
    navigationMode: LargeNavigationMode,
    menuItems: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    when (navigationMode) {
        LargeNavigationMode.Persistent -> PersistentLargeLayout(
            menuItems = menuItems,
            content = content,
        )

        LargeNavigationMode.FocusDriven -> FocusDrivenLargeLayout(
            menuItems = menuItems,
            content = content,
        )
    }
}

@Composable
private fun PersistentLargeLayout(
    menuItems: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(SddsSandboxTheme.colors.backgroundDefaultPrimary),
    ) {
        menuItems()
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
        ) {
            content()
        }
    }
}

@Composable
private fun FocusDrivenLargeLayout(
    menuItems: @Composable () -> Unit,
    content: @Composable () -> Unit,
    peekWidth: Dp = FocusDrivenNavigationPeekWidth,
) {
    val style = LocalNavigationViewStyle.current
    val density = LocalDensity.current
    Drawer(
        modifier = Modifier
            .width(style.menuWidth)
            .fillMaxHeight(),
        gesturesEnabled = true,
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
                    .padding(start = peekWidth + FocusDrivenContentGap)
                    .fillMaxHeight()
                    .background(SddsSandboxTheme.colors.backgroundDefaultPrimary)
                    .focusGroup(),
            ) {
                content()
            }
        }
    }
}

private val FocusDrivenNavigationPeekWidth = 30.dp
private val FocusDrivenContentGap = 2.dp
