package com.sdds.compose.sandbox.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.Text

internal val PersistentDesktopNavigationBreakpoint = 1200.dp

/**
 * Pointer-oriented desktop navigation. A persistent navigation panel is used
 * on wide windows; narrower windows open the same panel from an explicit menu
 * button and never from focus.
 */
@Composable
internal fun DesktopLayout(
    menuItems: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val persistentNavigation = isPersistentDesktopNavigation(maxWidth)
        var isNavigationMenuOpen by remember { mutableStateOf(false) }

        LaunchedEffect(persistentNavigation) {
            if (persistentNavigation) isNavigationMenuOpen = false
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(SddsSandboxTheme.colors.backgroundDefaultPrimary),
        ) {
            // Keep the screen content in the same composition slot for both layouts.
            // Reparenting NavHost through Drawer recreates it in a subcomposition and
            // breaks Navigation's ViewModelStore on Kotlin/Native.
            Box(
                modifier = if (persistentNavigation) {
                    Modifier.fillMaxHeight()
                } else {
                    Modifier
                        .width(0.dp)
                        .fillMaxHeight()
                },
            ) {
                if (persistentNavigation) {
                    menuItems()
                }
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(if (persistentNavigation) 0.dp else 48.dp),
                ) {
                    if (!persistentNavigation) {
                        Text(
                            text = "Menu",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable { isNavigationMenuOpen = true }
                                .padding(12.dp),
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                ) {
                    content()
                }
            }
        }

        if (!persistentNavigation && isNavigationMenuOpen) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .align(Alignment.CenterStart),
            ) {
                menuItems()
                Text(
                    text = "Close",
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .clickable { isNavigationMenuOpen = false }
                        .padding(12.dp),
                )
            }
        }
    }
}

internal fun isPersistentDesktopNavigation(width: androidx.compose.ui.unit.Dp): Boolean {
    return width >= PersistentDesktopNavigationBreakpoint
}
