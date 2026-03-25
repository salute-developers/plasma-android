package com.sdds.compose.uikit.overlay

import android.graphics.Rect
import android.view.View
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.internal.SwipeToDismissBox
import com.sdds.compose.uikit.internal.rememberSwipeToDismissBoxState
import com.sdds.compose.uikit.overlay.OverlayDismissDirection.DismissToEnd
import com.sdds.compose.uikit.overlay.OverlayDismissDirection.DismissToStart
import kotlinx.coroutines.flow.collectLatest
import kotlin.math.abs

/**
 * Делает доступным overlayManager для [content]
 */
@Composable
@NonRestartableComposable
fun OverlayHost(
    overlayManager: OverlayManager = overlayManager(),
    animationSpec: OverlayAnimationSpec = OverlayAnimationSpec(),
    content: @Composable () -> Unit,
) {
    OverlayHost(
        dismissDirection = setOf(DismissToEnd, DismissToStart),
        overlayManager = overlayManager,
        animationSpec = animationSpec,
        content = content,
    )
}

/**
 * Делает доступным overlayManager для [content]
 */
@Composable
fun OverlayHost(
    dismissDirection: Set<OverlayDismissDirection>,
    overlayManager: OverlayManager = overlayManager(),
    animationSpec: OverlayAnimationSpec = OverlayAnimationSpec(),
    offset: DpOffset = DpOffset.Zero,
    spacing: Dp = 8.dp,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalOverlayManager provides overlayManager) {
        Box(Modifier.fillMaxSize()) {
            content()
            OverlayContainer(animationSpec, overlayManager, dismissDirection, offset, spacing)
        }
    }
}

/**
 * Направление движения жеста Swipe для отмены [OverlayEntry]
 */
enum class OverlayDismissDirection {
    /**
     * Свайп в начало отменит [OverlayEntry]
     */
    DismissToStart,

    /**
     * Свайп в конец отменит [OverlayEntry]
     */
    DismissToEnd,
}

@Composable
private fun OverlayContainer(
    animationSpec: OverlayAnimationSpec,
    manager: OverlayManager,
    dismissDirection: Set<OverlayDismissDirection>,
    offset: DpOffset,
    spacing: Dp,
) {
    val overlays by manager.overlays.collectAsState()

    val entriesByPosition = remember(overlays) {
        overlays.groupBy { it.position }
            .mapValues { entry -> entry.value.takeIf { entry.key.isTop() }?.reversed() ?: entry.value }
    }

    entriesByPosition
        .forEach { (position, entries) ->
            val anyEntryAnimating by remember(entries) {
                derivedStateOf { entries.count { !it.visible.isIdle } > 1 }
            }
            OverlayPopup(
                position = position,
                onDismissRequest = {
                    entries.forEach { it.visible.targetState = false }
                },
                isFocusable = entries.firstOrNull { it.isFocusable } != null,
                offset = offset,
                spacing = spacing,
            ) {
                entries.fastForEachIndexed { i, entry ->
                    key(entry.id) {
                        val visibilityState = remember(entry.id) { entry.visible }

                        OverlayEntryItem(
                            entry = entry,
                            manager = manager,
                            animationSpec = animationSpec,
                            visibilityState = visibilityState,
                            dismissDirection = dismissDirection,
                            anyEntryAnimating = anyEntryAnimating,
                            index = i,
                            size = entries.size,
                            spacing = spacing,
                        )

                        LaunchedEffect(entry.id) {
                            snapshotFlow {
                                visibilityState.isIdle &&
                                    !visibilityState.targetState &&
                                    !visibilityState.currentState
                            }
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
private fun OverlayEntryItem(
    entry: OverlayEntry,
    manager: OverlayManager,
    animationSpec: OverlayAnimationSpec,
    visibilityState: MutableTransitionState<Boolean>,
    dismissDirection: Set<OverlayDismissDirection>,
    anyEntryAnimating: Boolean,
    index: Int,
    size: Int,
    spacing: Dp,
) {
    val animSpec = entry.animationSpec ?: animationSpec
    val dismissState = rememberSwipeToDismissBoxState()
    var removedByDismiss by remember { mutableStateOf(false) }
    val needBoundsTransition = remember(index, size, anyEntryAnimating, entry.position) {
        if (entry.position.isBottom()) {
            !anyEntryAnimating && (index in 1 until size)
        } else {
            !anyEntryAnimating && index in 0 until size - 1
        }
    }
    val enterTransition = remember(needBoundsTransition, removedByDismiss) {
        derivedStateOf {
            val user = animSpec.enter.takeIf { !removedByDismiss }
            user?.plus(ExpandEnterAnimation) ?: ExpandEnterAnimation
        }
    }
    val exitTransition = remember(needBoundsTransition, removedByDismiss) {
        derivedStateOf {
            val user = animSpec.exit.takeIf { !removedByDismiss }
            if (needBoundsTransition) {
                user?.plus(ShrinkExitAnimation) ?: ShrinkExitAnimation
            } else {
                user ?: NoExitAnimation
            }
        }
    }

    AnimatedVisibility(
        visibleState = visibilityState,
        enter = enterTransition.value,
        exit = exitTransition.value,
    ) {
        Column {
            SwipeToDismissBox(
                state = dismissState,
                backgroundContent = {},
                enableDismissFromEndToStart = dismissDirection.contains(DismissToStart),
                enableDismissFromStartToEnd = dismissDirection.contains(DismissToEnd),
                onDismiss = {
                    removedByDismiss = true
                    manager.remove(entry.id)
                },
            ) {
                val thresholdPx = with(LocalDensity.current) { DismissAlphaThreshold.toPx() }
                val alpha = remember(dismissState, thresholdPx) {
                    derivedStateOf {
                        val offsetPx = dismissState.offset
                        ((thresholdPx - abs(offsetPx)) / thresholdPx).coerceIn(0f, 1f)
                    }
                }
                Box(Modifier.graphicsLayer { this.alpha = alpha.value }) {
                    entry.content(entry.id)
                }
            }

            Box(modifier = Modifier.height(spacing))
        }
    }
}

@Composable
private fun OverlayPopup(
    position: OverlayPosition,
    onDismissRequest: () -> Unit,
    isFocusable: Boolean,
    offset: DpOffset,
    spacing: Dp,
    content: @Composable (ColumnScope.() -> Unit),
) {
    val alignment = position.toAlignment()
    val rootView = LocalView.current.rootView

    Popup(
        alignment = alignment,
        properties = PopupProperties(
            focusable = isFocusable,
            excludeFromSystemGesture = false,
            dismissOnClickOutside = false,
        ),
        onDismissRequest = onDismissRequest,
    ) {
        val dialogView = LocalView.current.rootView
        val newOffset = remember(position, spacing, offset) {
            offset.ensureCorrectPosition(position, spacing)
        }
        LaunchedEffect(dialogView, rootView) {
            dialogView.enablePassthroughTouch(rootView)
        }

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = alignment,
        ) {
            Column(
                modifier = Modifier.offset(newOffset.x, newOffset.y),
                verticalArrangement = Arrangement.spacedBy(0.dp, position.toVerticalAlignment()),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                content()
            }
        }
    }
}

@Suppress("ClickableViewAccessibility")
private fun View.enablePassthroughTouch(decorView: View) {
    setOnTouchListener { v, event ->
        val anchorLocation = decorView.getScreenRect()
        val listLocation = v.getScreenRect()
        val offsetX = (listLocation.left - anchorLocation.left).toFloat()
        val offsetY = (listLocation.top - anchorLocation.top).toFloat()
        event.offsetLocation(offsetX, offsetY)
        decorView.dispatchTouchEvent(event)
    }
}

private fun View.getScreenRect(): Rect {
    val location = IntArray(2)
    getLocationOnScreen(location)
    return Rect(
        location[0],
        location[1],
        (location[0] + width * scaleX).toInt(),
        (location[1] + height * scaleY).toInt(),
    )
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

private fun DpOffset.ensureCorrectPosition(position: OverlayPosition, spacing: Dp): DpOffset =
    when {
        position.isCenterHorizontal() -> this + DpOffset(0.dp, spacing / 2)
        position.isBottom() -> this + DpOffset(0.dp, spacing)
        else -> this
    }

private val DismissAlphaThreshold = 100.dp
private val NoExitAnimation = ExitTransition.None
private val ExpandEnterAnimation = expandVertically(tween(OverlayAnimationSpec.ANIMATION_DURATION))
private val ShrinkExitAnimation = shrinkVertically(tween(OverlayAnimationSpec.ANIMATION_DURATION))
