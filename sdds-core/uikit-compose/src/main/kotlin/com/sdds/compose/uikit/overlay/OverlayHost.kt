package com.sdds.compose.uikit.overlay

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import kotlinx.coroutines.flow.collectLatest

/**
 * Делает доступным overlayManager для [content]
 */
@Composable
fun OverlayHost(
    overlayManager: OverlayManager = rememberOverlayManager(),
    animationSpec: OverlayAnimationSpec = OverlayAnimationSpec(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalOverlayManager provides overlayManager) {
        Box(Modifier.fillMaxSize()) {
            content()
            OverlayContainer(animationSpec, overlayManager)
        }
    }
}

@Composable
private fun OverlayContainer(
    animationSpec: OverlayAnimationSpec,
    manager: OverlayManager,
) {
    val overlays by manager.overlays.collectAsState()

    val entriesByPosition = remember(overlays) {
        overlays.groupBy { it.position }
            .mapValues { entry -> entry.value.takeIf { entry.key.isTop() }?.reversed() ?: entry.value }
    }

    entriesByPosition
        .forEach { (position, entries) ->
            OverlayPopup(position) {
                entries.forEach { entry ->
                    key(entry.id) {
                        val visibilityState = remember(entry.id) { entry.visible }
                        val animSpec = entry.animationSpec ?: animationSpec
                        AnimatedVisibility(
                            visibleState = visibilityState,
                            enter = animSpec.enter,
                            exit = animSpec.exit,
                        ) {
                            entry.content(entry.id)
                        }

                        LaunchedEffect(entry.id) {
                            snapshotFlow { visibilityState.isIdle && !visibilityState.currentState }
                                .collectLatest { shouldRemove ->
                                    if (shouldRemove) {
                                        manager.remove(entry.id)
                                    }
                                }
                        }
                    }
                }
            }
        }
}

@Composable
private fun OverlayPopup(
    position: OverlayPosition,
    content: @Composable ColumnScope.() -> Unit,
) {
    var contentHeightPx by remember(position) { mutableFloatStateOf(0f) }
    val alignment = position.toAlignment()
    val density = LocalDensity.current

    Popup(
        alignment = alignment,
        properties = PopupProperties(
            focusable = false,
            excludeFromSystemGesture = false,
            dismissOnClickOutside = false,
        ),
    ) {
        Box(
            modifier = Modifier.defaultMinSize(minHeight = density.run { contentHeightPx.toDp() }),
            contentAlignment = alignment,
        ) {
            Column(
                modifier = Modifier
                    .onSizeChanged {
                        contentHeightPx = maxOf(contentHeightPx, it.height.toFloat())
                    },
                verticalArrangement = Arrangement.spacedBy(8.dp, position.toVerticalAlignment()),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                content()
            }
        }
    }
}

private fun OverlayPosition.toAlignment(): Alignment = when (this) {
    OverlayPosition.TopStart -> Alignment.TopStart
    OverlayPosition.TopCenter -> Alignment.TopCenter
    OverlayPosition.TopEnd -> Alignment.TopEnd
    OverlayPosition.CenterStart -> Alignment.CenterStart
    OverlayPosition.Center -> Alignment.Center
    OverlayPosition.CenterEnd -> Alignment.CenterEnd
    OverlayPosition.BottomStart -> Alignment.BottomStart
    OverlayPosition.BottomCenter -> Alignment.BottomCenter
    OverlayPosition.BottomEnd -> Alignment.BottomEnd
}

private fun OverlayPosition.toVerticalAlignment(): Alignment.Vertical = when (this) {
    OverlayPosition.TopStart,
    OverlayPosition.TopCenter,
    OverlayPosition.TopEnd,
    -> Alignment.Top

    OverlayPosition.CenterStart,
    OverlayPosition.Center,
    OverlayPosition.CenterEnd,
    -> Alignment.CenterVertically

    OverlayPosition.BottomStart,
    OverlayPosition.BottomCenter,
    OverlayPosition.BottomEnd,
    -> Alignment.Bottom
}
