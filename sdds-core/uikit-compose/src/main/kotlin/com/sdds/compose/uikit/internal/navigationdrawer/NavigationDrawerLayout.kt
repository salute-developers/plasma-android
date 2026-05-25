package com.sdds.compose.uikit.internal.navigationdrawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.NavigationDrawerStyle
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.valueStateSetOf
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStateSnapshot
import com.sdds.compose.uikit.motion.components.navigationdrawer.NavigationDrawerMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getRectAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

internal val LocalNavigationDrawerValue = compositionLocalOf { NavigationDrawerValue.Expanded }

internal val LocalNavigationDrawerSelectionRegistry =
    compositionLocalOf<NavigationDrawerSelectionRegistry?> { null }

@Immutable
internal class NavigationDrawerSelectionRegistry {
    var selectorMotionState: NavigationDrawerSelectorMotionState? by mutableStateOf(null)
        private set
    var selectorBounds: Rect? by mutableStateOf(null)
        private set
    private var selectedKey: Any? = null
    private var rootBounds: Rect? = null
    private var hasSelectedOnce = false
    private val boundsInWindow = mutableMapOf<Any, Rect>()

    fun select(key: Any, selected: Boolean) {
        if (selected) select(key)
    }

    private fun select(key: Any) {
        val previousKey = selectedKey
        selectedKey = key
        val targetBounds = boundsInWindow[key]?.toRootBounds()
        selectorBounds = targetBounds
        val previousBounds = selectorMotionState?.targetBounds
        val shouldAnimate = hasSelectedOnce && previousKey != key && previousBounds != null
        hasSelectedOnce = true
        targetBounds?.let { updateSelectorMotionState(it, shouldAnimate) }
    }

    fun updateRootBounds(bounds: Rect) {
        rootBounds = bounds
        updateSelectedBounds()
    }

    fun updateBounds(key: Any, boundsInWindow: Rect) {
        this.boundsInWindow[key] = boundsInWindow
        if (selectedKey == key) {
            updateSelectedBounds()
        }
    }

    fun removeBounds(key: Any) {
        boundsInWindow.remove(key)
        if (selectedKey == key) {
            selectedKey = null
            selectorBounds = null
            selectorMotionState = null
        }
    }

    private fun updateSelectedBounds() {
        val key = selectedKey ?: return
        selectorBounds = boundsInWindow[key]?.toRootBounds()?.takeIf { it.isVisibleInRoot() }
    }

    private fun updateSelectorMotionState(bounds: Rect, animate: Boolean) {
        val currentState = selectorMotionState
        if (currentState?.targetBounds == bounds) return
        selectorMotionState = when {
            currentState == null -> NavigationDrawerSelectorMotionState.snap(bounds)
            animate -> currentState.next(bounds)
            else -> currentState.snap(bounds)
        }
    }

    private fun Rect.toRootBounds(): Rect? {
        val rootBounds = rootBounds ?: return null
        return Rect(
            left = left - rootBounds.left,
            top = top - rootBounds.top,
            right = right - rootBounds.left,
            bottom = bottom - rootBounds.top,
        )
    }

    private fun Rect.isVisibleInRoot(): Boolean {
        val rootBounds = rootBounds ?: return false
        return bottom > 0f &&
            top < rootBounds.height &&
            right > 0f &&
            left < rootBounds.width
    }
}

@Composable
internal fun NavigationDrawerLayout(
    modifier: Modifier,
    motion: Motion<NavigationDrawerMotionStyle>,
    style: NavigationDrawerStyle,
    header: (@Composable ColumnScope.() -> Unit)?,
    footer: (@Composable ColumnScope.() -> Unit)?,
    content: @Composable ColumnScope.() -> Unit,
) {
    val registry = remember { NavigationDrawerSelectionRegistry() }
    val selectorPaddingStart = style.dimensions.selectorPaddingStart.getValueAsState(motion.context)
    val selectorPaddingEnd = style.dimensions.selectorPaddingEnd.getValueAsState(motion.context)
    val itemSpacing = style.dimensions.itemSpacing.getValueAsState(motion.context)
    val headerSpacing = style.dimensions.headerSpacing.getValueAsState(motion.context)
    val footerSpacing = style.dimensions.footerSpacing.getValueAsState(motion.context)
    val selectorShape = style.shape.getValueAsState(motion.context)
    val selector = style.colors.selector.getBrushAsState(motion.context, motion.style.selectorColor)
    val selectorBounds = selectorBoundsAsState(
        selectorMotionStateProvider = { registry.selectorMotionState },
        selectorBoundsMotion = motion.style.selectorBounds,
    )
    Box(
        modifier = modifier
            .onGloballyPositioned {
                registry.updateRootBounds(it.boundsInWindow())
            }
            .navigationDrawerSelector(
                bounds = {
                    val drawBounds = registry.selectorBounds ?: return@navigationDrawerSelector null
                    val animatedBounds = selectorBounds?.value
                    if (animatedBounds != null && registry.selectorMotionState?.targetBounds == drawBounds) {
                        animatedBounds
                    } else {
                        drawBounds
                    }
                },
                selector = { selector.value },
                shape = { selectorShape.value },
                selectorPaddingStart = { selectorPaddingStart.value },
                selectorPaddingEnd = { selectorPaddingEnd.value },
            ),
    ) {
        CompositionLocalProvider(
            LocalNavigationDrawerSelectionRegistry provides registry,
        ) {
            Column(Modifier.fillMaxSize()) {
                header?.let { headerContent ->
                    headerContent()
                    Spacer(Modifier.height(headerSpacing.value))
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(itemSpacing.value),
                    content = content,
                )
                footer?.let { footerContent ->
                    Spacer(Modifier.height(footerSpacing.value))
                    footerContent()
                }
            }
        }
    }
}

@Composable
private fun selectorBoundsAsState(
    selectorMotionStateProvider: () -> NavigationDrawerSelectorMotionState?,
    selectorBoundsMotion: MotionProperty<Rect>,
): State<Rect>? {
    val motionState = selectorMotionStateProvider() ?: return null
    val currentMotionState = rememberUpdatedState(motionState)
    val selectorMotionContext = rememberMotionContext(label = "NavigationDrawerSelector") {
        stateSnapshotProvider {
            val state = currentMotionState.value
            MotionStateSnapshot(
                initial = valueStateSetOf(state.initialState),
                target = valueStateSetOf(state.targetState),
            )
        }
    }
    val selectorBounds = remember(motionState) {
        StatefulValue.from(
            states = listOf(
                valueStateSetOf(motionState.initialState),
                valueStateSetOf(motionState.targetState),
            ),
            values = listOf(motionState.initialBounds, motionState.targetBounds),
            defaultValue = motionState.targetBounds,
        )
    }
    val animatedBounds = selectorBounds.getRectAsState(
        context = selectorMotionContext,
        motionProperty = selectorBoundsMotion,
        defaultValue = motionState.targetBounds,
    )
    return if (motionState.animate) animatedBounds else rememberUpdatedState(motionState.targetBounds)
}

private fun Modifier.navigationDrawerSelector(
    bounds: () -> Rect?,
    selector: () -> Brush,
    shape: () -> Shape,
    selectorPaddingStart: () -> Dp,
    selectorPaddingEnd: () -> Dp,
): Modifier = drawWithCache {
    val selectorBounds = bounds()
    if (selectorBounds == null) {
        onDrawWithContent {
            drawContent()
        }
    } else {
        val left = selectorPaddingStart().toPx()
        val right = size.width - selectorPaddingEnd().toPx()
        val outline = shape().createOutline(
            size = Size(
                width = (right - left).coerceAtLeast(0f),
                height = selectorBounds.height.coerceAtLeast(0f),
            ),
            layoutDirection = layoutDirection,
            density = this,
        )
        val selector = selector()
        onDrawWithContent {
            translate(left = left, top = bounds()?.top ?: 0f) {
                drawOutline(outline, brush = selector)
            }
            drawContent()
        }
    }
}

@Composable
internal fun Modifier.navigationDrawerItemBounds(
    key: Any,
    registry: NavigationDrawerSelectionRegistry?,
): Modifier {
    DisposableEffect(key, registry) {
        onDispose {
            registry?.removeBounds(key)
        }
    }
    return this.onGloballyPositioned {
        registry?.updateBounds(key, it.boundsInWindow())
    }
}

internal enum class NavigationDrawerSelectorValue : ValueState {
    From,
    To,
}

@Immutable
internal data class NavigationDrawerSelectorMotionState(
    val initialBounds: Rect,
    val targetBounds: Rect,
    val initialState: NavigationDrawerSelectorValue,
    val targetState: NavigationDrawerSelectorValue,
    val animate: Boolean,
) {
    fun next(bounds: Rect): NavigationDrawerSelectorMotionState {
        return NavigationDrawerSelectorMotionState(
            initialBounds = targetBounds,
            targetBounds = bounds,
            initialState = targetState,
            targetState = if (targetState == NavigationDrawerSelectorValue.From) {
                NavigationDrawerSelectorValue.To
            } else {
                NavigationDrawerSelectorValue.From
            },
            animate = true,
        )
    }

    fun snap(bounds: Rect): NavigationDrawerSelectorMotionState {
        return NavigationDrawerSelectorMotionState(
            initialBounds = bounds,
            targetBounds = bounds,
            initialState = initialState,
            targetState = targetState,
            animate = false,
        )
    }

    companion object {
        fun snap(bounds: Rect): NavigationDrawerSelectorMotionState {
            return NavigationDrawerSelectorMotionState(
                initialBounds = bounds,
                targetBounds = bounds,
                initialState = NavigationDrawerSelectorValue.From,
                targetState = NavigationDrawerSelectorValue.From,
                animate = false,
            )
        }
    }
}
