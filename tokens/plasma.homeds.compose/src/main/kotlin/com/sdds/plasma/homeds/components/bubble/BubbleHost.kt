package com.sdds.plasma.homeds.components.bubble

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.zIndex
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.plasma.homeds.motion.bubble.rememberBubbleMotion
import kotlin.math.roundToInt

/**
 * Состояние [BubbleHost] — реестр развёрнутых/анимирующихся баблов, зарегистрированных их
 * триггерами.
 */
@Stable
public class BubbleHostState internal constructor() {

    internal var rootCoordinates: LayoutCoordinates? by mutableStateOf(null)

    internal val entries = mutableStateMapOf<Any, BubbleOverlayEntry>()

    internal fun register(entry: BubbleOverlayEntry) {
        entries[entry.key] = entry
    }

    internal fun unregister(key: Any) {
        entries.remove(key)
    }
}

/**
 * Создаёт и запоминает [BubbleHostState].
 */
@Composable
public fun rememberBubbleHostState(): BubbleHostState = remember { BubbleHostState() }

/**
 * CompositionLocal с текущим [BubbleHostState]. `null`, если [BubbleHost] не смонтирован
 * выше по дереву.
 */
public val LocalBubbleHostState: ProvidableCompositionLocal<BubbleHostState?> =
    staticCompositionLocalOf { null }

/**
 * Контейнер вокруг сетки устройств, владеющий позиционированием развёрнутых апсейл-баблов.
 *
 * Монтируется один раз вокруг всей сетки. Развёрнутый бабл рисуется этим компонентом поверх
 * [content], так он не обрезается клипом отдельной карточки. Несколько триггеров регистрируются
 * независимо; Host не ограничивает количество одновременно развёрнутых баблов.
 *
 * @param modifier модификатор контейнера
 * @param state состояние-реестр, см. [rememberBubbleHostState]
 * @param content содержимое сетки устройств
 */
@Composable
public fun BubbleHost(
    modifier: Modifier = Modifier,
    state: BubbleHostState = rememberBubbleHostState(),
    content: @Composable () -> Unit,
) {
    DisposableEffect(state) {
        onDispose { state.rootCoordinates = null }
    }
    CompositionLocalProvider(LocalBubbleHostState provides state) {
        Box(
            modifier = modifier.onGloballyPositioned { state.rootCoordinates = it },
        ) {
            content()
            state.entries.values.forEach { entry ->
                key(entry.key) {
                    BubbleOverlayItem(entry)
                }
            }
        }
    }
}

/**
 * Запись реестра [BubbleHostState] — одна активная (анимирующая или развёрнутая) карточка.
 */
internal class BubbleOverlayEntry(
    val key: Any,
    val anchorPosition: () -> Offset,
    val expandProgress: () -> Float,
    val iconMorphProgress: () -> Float,
    val rotationProgress: () -> Float,
    val bounceProgress: () -> Float,
    val placement: BubblePlacement,
    val alignment: BubbleAlignment,
    val style: BubbleStyle,
    val onBodyClick: () -> Unit,
    val onCloseClick: () -> Unit,
    val content: @Composable () -> Unit,
)

@Composable
private fun BubbleOverlayItem(entry: BubbleOverlayEntry) {
    val density = LocalDensity.current
    val interactionSource = remember { MutableInteractionSource() }
    val motion = rememberBubbleMotion(motionContext = rememberMotionContext(interactionSource))
    val circleSize by entry.style.dimensions.circleSize.getDpAsState(motion.context, motion.style.circleSize)
    val circlePx = with(density) { circleSize.toPx() }
    Box(
        modifier = Modifier
            .zIndex(1f)
            .bubbleOverlayPlacement(
                anchorPosition = entry.anchorPosition,
                circlePx = circlePx,
                placement = entry.placement,
                alignment = entry.alignment,
            ),
    ) {
        BubbleBody(entry, circleSize, motion)
    }
}

/**
 * Позиционирует overlay-бокс (круг+тело+шейка целиком) так, чтобы круг-якорь внутри него совпал с
 * [anchorPosition].
 */
@Suppress("CyclomaticComplexMethod")
private fun Modifier.bubbleOverlayPlacement(
    anchorPosition: () -> Offset,
    circlePx: Float,
    placement: BubblePlacement,
    alignment: BubbleAlignment,
): Modifier = layout { measurable, constraints ->
    val placeable = measurable.measure(constraints)
    val anchor = anchorPosition()
    val (resolvedPlacement, resolvedAlignment) = resolveBubblePlacement(placement, alignment, layoutDirection)
    val x = when (resolvedPlacement) {
        BubblePlacement.Start -> anchor.x + circlePx - placeable.width
        BubblePlacement.End -> anchor.x
        BubblePlacement.Top, BubblePlacement.Bottom -> when (resolvedAlignment) {
            BubbleAlignment.Start -> anchor.x
            BubbleAlignment.Center -> anchor.x - (placeable.width - circlePx) / 2f
            BubbleAlignment.End -> anchor.x + circlePx - placeable.width
        }
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    val y = when (resolvedPlacement) {
        BubblePlacement.Top -> anchor.y + circlePx - placeable.height
        BubblePlacement.Bottom -> anchor.y
        BubblePlacement.Start, BubblePlacement.End -> when (resolvedAlignment) {
            BubbleAlignment.Start -> anchor.y
            BubbleAlignment.Center -> anchor.y - (placeable.height - circlePx) / 2f
            BubbleAlignment.End -> anchor.y + circlePx - placeable.height
        }
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    layout(placeable.width, placeable.height) {
        placeable.placeRelative(x.roundToInt(), y.roundToInt())
    }
}
