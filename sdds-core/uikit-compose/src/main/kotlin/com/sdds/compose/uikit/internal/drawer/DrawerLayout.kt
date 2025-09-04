package com.sdds.compose.uikit.internal.drawer

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.LayoutDirection
import com.sdds.compose.uikit.DrawerState
import com.sdds.compose.uikit.isHorizontal

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun DrawerLayout(
    drawerState: DrawerState,
    modifier: Modifier = Modifier,
    gesturesEnabled: Boolean = true,
    content: @Composable BoxScope.(Constraints) -> Unit,
) {
    BoxWithConstraints(modifier.fillMaxSize()) {
        val drawerConstraints = constraints
        if (!drawerConstraints.hasBoundedWidth) {
            throw IllegalStateException("Drawer shouldn't have infinite width")
        }

        val nestedScroll = if (gesturesEnabled) {
            Modifier.nestedScroll(drawerState.nestedScrollConnection)
        } else {
            Modifier
        }
        val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

        val swipeable = Modifier
            .fillMaxSize()
            .then(nestedScroll)

        val movableContent = remember { movableContentOf(content) }

        if (drawerState.alignment.isHorizontal()) {
            val draggableHorizontal = Modifier.anchoredDraggable(
                state = drawerState.anchoredDraggableState,
                orientation = Orientation.Horizontal,
                enabled = gesturesEnabled,
                reverseDirection = isRtl,
            )
            Box(swipeable.then(draggableHorizontal)) {
                movableContent(this, drawerConstraints)
            }
        } else {
            val draggableVertical = Modifier.anchoredDraggable(
                state = drawerState.anchoredDraggableState,
                orientation = Orientation.Vertical,
                enabled = gesturesEnabled,
                reverseDirection = false,
            )
            Box(swipeable.then(draggableVertical)) {
                movableContent(this, drawerConstraints)
            }
        }
    }
}
