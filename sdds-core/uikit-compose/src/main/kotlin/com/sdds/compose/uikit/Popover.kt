package com.sdds.compose.uikit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.round
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.PopoverPlacement.Companion.BottomFallbacks
import com.sdds.compose.uikit.PopoverPlacement.Companion.EndFallbacks
import com.sdds.compose.uikit.PopoverPlacement.Companion.StartFallbacks
import com.sdds.compose.uikit.PopoverPlacement.Companion.TopFallbacks
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.plus
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.shadow
import kotlinx.coroutines.delay

/**
 * Компонент Popover.
 * Представляет из себя всплывающее окно, привязанное к какому-либо тригеру.
 *
 * @param show будет ли показан Popover
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне Popover либо по истечении [duration]
 * @param triggerLayoutCoordinates информация о размерах и размещении триггера
 * @param style стиль компонента
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param triggerCentered если true, то компонент будет выравнен относительно триггера таким образом,
 * что указатель будет смотреть на центр триггера
 * @param alignment выравнивание компонента относительно триггера
 * @param tailEnabled включен ли указатель
 * @param duration время, в течение которого будет показан Popover.
 * Если null, то компонент будет показываться до принудительного закрытия.
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
 * @param interactionSource источник взаимодействий
 * @param content содержимое Popover
 */
@Composable
@Suppress("LongMethod")
fun Popover(
    show: Boolean,
    onDismissRequest: () -> Unit,
    triggerLayoutCoordinates: State<LayoutCoordinates?>,
    style: PopoverStyle = LocalPopoverStyle.current,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    triggerCentered: Boolean = false,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    tailEnabled: Boolean = true,
    duration: Long? = null,
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    val tailHeight = style.dimensions.tailHeight
    val tailWidth = style.dimensions.tailWidth
    val tailPadding = style.dimensions.tailPadding
    val offset = style.dimensions.offset
    val shape = style.shape
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource)
    val shadow = style.shadow

    val shadowPaddingValues = shadow.getShadowSafePaddings()
    val shadowPaddingsPx = ShadowPaddings.fromPaddingValues(shadowPaddingValues)
    val positionProvider = rememberPopoverPositionProvider(
        placement = placement,
        placementMode = placementMode,
        triggerCentered = triggerCentered,
        tailAlignment = alignment,
        triggerLayoutCoordinates = triggerLayoutCoordinates,
        offset = offset.px,
        tailPadding = tailPadding.px,
        tailWidth = tailWidth.px,
        shadowPaddings = shadowPaddingsPx,
    )
    val tailPaddings = tailCompensationPaddings(
        tailEnabled = tailEnabled,
        tailHeight = tailHeight,
        placement = positionProvider.innerPlacement,
    )

    val visibleState = remember { MutableTransitionState(false) }
    visibleState.targetState = show

    duration?.let {
        if (show) {
            LaunchedEffect(Unit) {
                delay(duration)
                onDismissRequest.invoke()
            }
        }
    }

    if (visibleState.currentState || visibleState.targetState || !visibleState.isIdle) {
        Popup(
            popupPositionProvider = positionProvider,
            properties = PopupProperties(
                clippingEnabled = false,
            ),
            onDismissRequest = onDismissRequest,
        ) {
            AnimatedVisibility(
                visibleState = visibleState,
                enter = enterTransition,
                exit = exitTransition,
            ) {
                Box(
                    modifier = Modifier
                        .padding(shadowPaddingValues + tailPaddings)
                        .defaultMinSize(minWidth = style.dimensions.width)
                        .shadow(shadow, shape)
                        .drawPopover(
                            shape = shape,
                            backgroundColor = backgroundColor,
                            popoverAlignment = positionProvider.innerTailAlignment,
                            placement = positionProvider.innerPlacement,
                            tailEnabled = tailEnabled,
                            tailHeight = tailHeight,
                            tailWidth = tailWidth,
                            tailPadding = tailPadding,
                        ),
                ) {
                    content.invoke()
                }
            }
        }
    }
}

private fun ShadowAppearance.getShadowSafePaddings(): PaddingValues {
    val shadow = this
    if (shadow.layers.isEmpty()) return PaddingValues()
    val biggestLayer = shadow.layers.maxBy { it.spreadRadius }
    val radius = biggestLayer.spreadRadius + biggestLayer.blurRadius
    val left = radius - biggestLayer.offset.x
    val right = radius + biggestLayer.offset.x
    val top = radius - biggestLayer.offset.y
    val bottom = radius + biggestLayer.offset.y
    return PaddingValues(
        start = left,
        end = right,
        top = top,
        bottom = bottom,
    )
}

private fun tailCompensationPaddings(
    tailEnabled: Boolean,
    tailHeight: Dp,
    placement: PopoverPlacement,
): PaddingValues {
    if (!tailEnabled) return PaddingValues()
    return when (placement) {
        PopoverPlacement.Start -> PaddingValues(end = tailHeight)
        PopoverPlacement.Top -> PaddingValues(bottom = tailHeight)
        PopoverPlacement.End -> PaddingValues(start = tailHeight)
        PopoverPlacement.Bottom -> PaddingValues(top = tailHeight)
    }
}

private fun CacheDrawScope.createTailPath(
    placement: PopoverPlacement,
    tailAlignment: PopoverAlignment,
    tailWidthPx: Float,
    tailHeightPx: Float,
    tailPaddingPx: Float,
): Path {
    val tailPath = Path().apply {
        addArc(
            Rect(
                topLeft = Offset(-tailWidthPx, -tailHeightPx * 2f),
                bottomRight = Offset(0f, 0f),
            ),
            startAngleDegrees = 0f,
            sweepAngleDegrees = 90f,
        )
        lineTo(tailWidthPx / 2f, 0f)
        addArc(
            Rect(
                topLeft = Offset(0f, -tailHeightPx * 2f),
                bottomRight = Offset(tailWidthPx, 0f),
            ),
            startAngleDegrees = 90f,
            sweepAngleDegrees = 90f,
        )
        close()
    }

    val tailTranslationY =
        getTailTranslationY(placement, tailAlignment, tailWidthPx, tailPaddingPx)
    val tailTranslationX =
        getTailTranslationX(placement, tailAlignment, tailWidthPx, tailPaddingPx)
    val rotation = getTailRotationAngle(placement)
    val tailMatrix = Matrix().apply {
        translate(x = tailTranslationX, y = tailTranslationY)
        rotateZ(rotation)
    }
    return tailPath.apply { transform(tailMatrix) }
}

private fun CacheDrawScope.getTailTranslationX(
    placement: PopoverPlacement,
    tailAlignment: PopoverAlignment,
    tailWidthPx: Float,
    tailPaddingPx: Float,
): Float {
    val horizontalAlignment = when (tailAlignment) {
        PopoverAlignment.Start -> tailPaddingPx + tailWidthPx / 2
        PopoverAlignment.End -> size.width - tailPaddingPx - tailWidthPx / 2
        PopoverAlignment.Center -> size.width / 2
    }
    return when (placement) {
        PopoverPlacement.Start -> size.width
        PopoverPlacement.End -> 0f
        PopoverPlacement.Top,
        PopoverPlacement.Bottom,
        -> horizontalAlignment
    }
}

private fun CacheDrawScope.getTailTranslationY(
    placement: PopoverPlacement,
    tailAlignment: PopoverAlignment,
    tailWidthPx: Float,
    tailPaddingPx: Float,
): Float {
    val verticalAlignment = when (tailAlignment) {
        PopoverAlignment.Start -> tailPaddingPx + tailWidthPx / 2
        PopoverAlignment.End -> size.height - tailPaddingPx - tailWidthPx / 2
        PopoverAlignment.Center -> size.height / 2
    }
    return when (placement) {
        PopoverPlacement.Top -> size.height
        PopoverPlacement.Bottom -> 0f
        PopoverPlacement.Start,
        PopoverPlacement.End,
        -> verticalAlignment
    }
}

private fun Modifier.drawPopover(
    shape: CornerBasedShape,
    backgroundColor: Brush,
    tailEnabled: Boolean,
    popoverAlignment: PopoverAlignment,
    placement: PopoverPlacement,
    tailHeight: Dp,
    tailWidth: Dp,
    tailPadding: Dp,
): Modifier {
    return drawWithCache {
        val backgroundPath = Path().apply {
            addOutline(shape.createOutline(size, layoutDirection, this@drawWithCache))
        }
        val popoverPath = if (!tailEnabled) {
            backgroundPath
        } else {
            val tailHeightPx = tailHeight.toPx()
            val tailWidthPx = tailWidth.toPx()
            val tailPaddingPx = tailPadding.toPx()
            val tailPath = createTailPath(
                placement = placement,
                tailAlignment = popoverAlignment,
                tailWidthPx = tailWidthPx,
                tailHeightPx = tailHeightPx,
                tailPaddingPx = tailPaddingPx,
            )
            Path().apply { op(backgroundPath, tailPath, PathOperation.Union) }
        }

        onDrawWithContent {
            drawPath(popoverPath, backgroundColor)
            drawContent()
        }
    }
}

private fun getTailRotationAngle(placement: PopoverPlacement): Float {
    return when (placement) {
        PopoverPlacement.Start -> 90f
        PopoverPlacement.Top -> 180f
        PopoverPlacement.End -> 270f
        PopoverPlacement.Bottom -> 0f
    }
}

@Composable
private fun rememberPopoverPositionProvider(
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    triggerCentered: Boolean,
    tailAlignment: PopoverAlignment,
    triggerLayoutCoordinates: State<LayoutCoordinates?>,
    offset: Int,
    tailPadding: Int,
    tailWidth: Int,
    shadowPaddings: ShadowPaddings,
) = remember(
    placement,
    placementMode,
    triggerCentered,
    tailAlignment,
    triggerLayoutCoordinates,
    offset,
    tailPadding,
    tailWidth,
    shadowPaddings,
) {
    PopoverPositionProvider(
        placement,
        placementMode,
        triggerCentered,
        tailAlignment,
        triggerLayoutCoordinates,
        offset,
        tailPadding,
        tailWidth,
        shadowPaddings,
    )
}

private class PopoverPositionProvider(
    private val placement: PopoverPlacement,
    private val placementMode: PopoverPlacementMode,
    private val triggerCentered: Boolean,
    private val tailAlignment: PopoverAlignment,
    private val triggerLayoutCoordinates: State<LayoutCoordinates?>,
    private val offset: Int,
    private val tailPadding: Int,
    private val tailWidth: Int,
    private val shadowPaddings: ShadowPaddings,
) : PopupPositionProvider {

    private var popoverOffsetWhenTriggerCentered: Offset = Offset.Zero
    var innerPlacement = placement
    var innerTailAlignment = tailAlignment

    private fun reset() {
        innerPlacement = placement
        innerTailAlignment = tailAlignment
        popoverOffsetWhenTriggerCentered = Offset.Zero
    }

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize,
    ): IntOffset {
        reset()
        val triggerLC = triggerLayoutCoordinates.value ?: return IntOffset.Zero
        val triggerSize = triggerLC.size
        val triggerPositionInRoot = triggerLC.positionInRoot().round()
        val desiredPopupPosition = calculatePopupPosition(
            triggerPositionInRoot = triggerPositionInRoot,
            popupContentSize = popupContentSize,
            triggerSize = triggerSize,
        ) + popoverOffsetWhenTriggerCentered(triggerSize)

        val finalPopupPosition = when (placementMode) {
            PopoverPlacementMode.Strict -> desiredPopupPosition

            PopoverPlacementMode.Loose -> {
                val shouldRecalculatePosition =
                    !desiredPopupPosition.hasEnoughSpace(popupContentSize, windowSize)
                if (shouldRecalculatePosition) {
                    desiredPopupPosition
                        .tryToCorrectPlacement(
                            popupSize = popupContentSize,
                            windowSize = windowSize,
                            triggerPositionInRoot = triggerPositionInRoot,
                            triggerSize = triggerSize,
                        )
                } else {
                    desiredPopupPosition
                }
            }
        }

        return finalPopupPosition
    }

    private fun IntOffset.tryToCorrectAlignment(
        popupSize: IntSize,
        windowSize: IntSize,
        triggerPositionInRoot: IntOffset,
        triggerSize: IntSize,
    ): IntOffset {
        fun checkOrCorrectVerticalAlignment() {
            if (notEnoughSpaceOnTop()) {
                innerTailAlignment = PopoverAlignment.Start
            }
            if (notEnoughSpaceOnBottom(popupSize, windowSize)) {
                innerTailAlignment = PopoverAlignment.End
            }
        }

        fun checkOrCorrectHorizontalAlignment() {
            if (notEnoughSpaceOnStart()) {
                innerTailAlignment = PopoverAlignment.Start
            }
            if (notEnoughSpaceOnEnd(popupSize, windowSize)) {
                innerTailAlignment = PopoverAlignment.End
            }
        }

        when (innerPlacement) {
            PopoverPlacement.Start -> checkOrCorrectVerticalAlignment()
            PopoverPlacement.End -> checkOrCorrectVerticalAlignment()
            PopoverPlacement.Top -> checkOrCorrectHorizontalAlignment()
            PopoverPlacement.Bottom -> checkOrCorrectHorizontalAlignment()
        }

        return calculatePopupPosition(
            triggerPositionInRoot = triggerPositionInRoot,
            popupContentSize = popupSize,
            triggerSize = triggerSize,
        ) + popoverOffsetWhenTriggerCentered(triggerSize)
    }

    @Suppress("ReturnCount")
    private fun IntOffset.tryToCorrectPlacement(
        popupSize: IntSize,
        windowSize: IntSize,
        triggerPositionInRoot: IntOffset,
        triggerSize: IntSize,
    ): IntOffset {
        if (hasEnoughSpaceForPlacement(popupSize, windowSize)) {
            return tryToCorrectAlignment(
                popupSize = popupSize,
                windowSize = windowSize,
                triggerPositionInRoot = triggerPositionInRoot,
                triggerSize = triggerSize,
            )
        }
        for (i in 0 until placement.fallbacks.size) {
            innerPlacement = placement.fallbacks[i]
            val newPosition = calculatePopupPosition(
                triggerPositionInRoot = triggerPositionInRoot,
                popupContentSize = popupSize,
                triggerSize = triggerSize,
            ) + popoverOffsetWhenTriggerCentered(triggerSize)
            if (newPosition.hasEnoughSpace(popupSize, windowSize)) {
                return newPosition
            } else {
                val positionWithNewAlignment = newPosition
                    .tryToCorrectAlignment(
                        popupSize = popupSize,
                        windowSize = windowSize,
                        triggerPositionInRoot = triggerPositionInRoot,
                        triggerSize = triggerSize,
                    )

                if (positionWithNewAlignment.hasEnoughSpace(popupSize, windowSize)) {
                    return positionWithNewAlignment
                }
            }
        }
        innerPlacement = placement
        innerTailAlignment = tailAlignment
        return this
    }

    private val PopoverPlacement.fallbacks: Array<PopoverPlacement>
        get() = when (this) {
            PopoverPlacement.Start -> StartFallbacks
            PopoverPlacement.Top -> TopFallbacks
            PopoverPlacement.End -> EndFallbacks
            PopoverPlacement.Bottom -> BottomFallbacks
        }

    private fun popoverOffsetWhenTriggerCentered(triggerSize: IntSize): IntOffset {
        if (!triggerCentered) return IntOffset.Zero
        return when (innerPlacement) {
            PopoverPlacement.Start,
            PopoverPlacement.End,
            -> when (innerTailAlignment) {
                PopoverAlignment.Start -> IntOffset(
                    0,
                    triggerSize.height / 2 - tailPadding - tailWidth / 2,
                )

                PopoverAlignment.End -> IntOffset(
                    0,
                    -triggerSize.height / 2 + tailPadding + tailWidth / 2,
                )

                else -> IntOffset.Zero
            }

            PopoverPlacement.Top,
            PopoverPlacement.Bottom,
            -> when (innerTailAlignment) {
                PopoverAlignment.Start -> IntOffset(
                    triggerSize.width / 2 - tailPadding - tailWidth / 2,
                    0,
                )

                PopoverAlignment.End -> IntOffset(
                    -triggerSize.width / 2 + tailPadding + tailWidth / 2,
                    0,
                )

                else -> IntOffset.Zero
            }
        }
    }

    private fun calculatePopupPosition(
        triggerPositionInRoot: IntOffset,
        popupContentSize: IntSize,
        triggerSize: IntSize,
    ): IntOffset {
        val horizontalAlignment = getHorizontalAlignment(triggerSize, popupContentSize)
        val verticalAlignment = getVerticalAlignment(triggerSize, popupContentSize)

        return when (innerPlacement) {
            PopoverPlacement.Start -> IntOffset(
                x = triggerPositionInRoot.x - offset - popupContentSize.width + shadowPaddings.end,
                y = triggerPositionInRoot.y + verticalAlignment,
            )

            PopoverPlacement.End -> IntOffset(
                x = triggerPositionInRoot.x + triggerSize.width + offset - shadowPaddings.start,
                y = triggerPositionInRoot.y + verticalAlignment,
            )

            PopoverPlacement.Top -> IntOffset(
                x = triggerPositionInRoot.x + horizontalAlignment,
                y = triggerPositionInRoot.y - offset - popupContentSize.height + shadowPaddings.bottom,
            )

            PopoverPlacement.Bottom -> IntOffset(
                x = triggerPositionInRoot.x + horizontalAlignment,
                y = triggerPositionInRoot.y + triggerSize.height + offset - shadowPaddings.top,
            )
        }
    }

    private fun getVerticalAlignment(
        triggerSize: IntSize,
        popupSize: IntSize,
    ): Int {
        val centerAlignment = -(popupSize.height - triggerSize.height) / 2
        return when (innerTailAlignment) {
            PopoverAlignment.Start -> -shadowPaddings.top
            PopoverAlignment.Center -> centerAlignment - (shadowPaddings.top - shadowPaddings.bottom) / 2
            PopoverAlignment.End -> -(popupSize.height - triggerSize.height) + shadowPaddings.bottom
        }
    }

    private fun getHorizontalAlignment(
        triggerSize: IntSize,
        popupSize: IntSize,
    ): Int {
        val centerAlignment = -(popupSize.width - triggerSize.width) / 2
        return when (innerTailAlignment) {
            PopoverAlignment.Start -> -shadowPaddings.start
            PopoverAlignment.Center -> centerAlignment - (shadowPaddings.start - shadowPaddings.end) / 2
            PopoverAlignment.End -> -(popupSize.width - triggerSize.width) + shadowPaddings.end
        }
    }

    private fun IntOffset.hasEnoughSpace(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean {
        return !(
            notEnoughSpaceOnStart() ||
                notEnoughSpaceOnEnd(popupSize, windowSize) ||
                notEnoughSpaceOnTop() ||
                notEnoughSpaceOnBottom(popupSize, windowSize)
            )
    }

    private fun IntOffset.hasEnoughSpaceForPlacement(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean {
        return when (innerPlacement) {
            PopoverPlacement.Start -> !notEnoughSpaceOnStart()
            PopoverPlacement.Top -> !notEnoughSpaceOnTop()
            PopoverPlacement.End -> !notEnoughSpaceOnEnd(popupSize, windowSize)
            PopoverPlacement.Bottom -> !notEnoughSpaceOnBottom(popupSize, windowSize)
        }
    }

    private fun IntOffset.notEnoughSpaceOnTop(): Boolean = this.y < 0

    private fun IntOffset.notEnoughSpaceOnBottom(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean = this.y + popupSize.height > windowSize.height

    private fun IntOffset.notEnoughSpaceOnStart(): Boolean = this.x < 0

    private fun IntOffset.notEnoughSpaceOnEnd(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean = this.x + popupSize.width > windowSize.width
}

/**
 * Режим выравнивания компонента и указателя относительно триггера
 */
enum class PopoverAlignment {

    /**
     * Компонент и указатель выравниваются по началу триггера
     */
    Start,

    /**
     * Компонент и указатель выравниваются по центру триггера
     */
    Center,

    /**
     * Компонент и указатель выравниваются по концу триггера
     */
    End,
}

/**
 * Ориентация компонента относительно триггера
 */
enum class PopoverPlacement {
    /**
     * В начале триггера
     */
    Start,

    /**
     * Cверху от триггера
     */
    Top,

    /**
     * В конце триггера
     */
    End,

    /**
     * Снизу от триггера
     */
    Bottom,

    ;

    internal companion object {
        val StartFallbacks = arrayOf(End, Top, Bottom)
        val EndFallbacks = arrayOf(Start, Top, Bottom)
        val TopFallbacks = arrayOf(Bottom, Start, End)
        val BottomFallbacks = arrayOf(Top, Start, End)
    }
}

/**
 * Режим расположения компонента
 */
enum class PopoverPlacementMode {
    /**
     * Компонент будет размещен строго в соответствии с [PopoverPlacement] даже при отсутствии свободного места
     */
    Strict,

    /**
     * Компонент может изменять ориентацию [PopoverPlacement] при отсутствии свободного места
     */
    Loose,
}

/**
 * Модификатор, позволяющий получать информацию о размещении триггера,
 * необходимую для корректной работы [Popover]
 */
fun Modifier.popoverTrigger(triggerLayoutCoordinates: MutableState<LayoutCoordinates?>): Modifier {
    return this then onGloballyPositioned {
        triggerLayoutCoordinates.value = it
    }
}

@Immutable
private data class ShadowPaddings(
    val start: Int,
    val end: Int,
    val top: Int,
    val bottom: Int,
) {
    companion object {
        @Composable
        fun fromPaddingValues(paddings: PaddingValues): ShadowPaddings =
            with(LocalLayoutDirection.current) {
                ShadowPaddings(
                    start = paddings.calculateStartPadding(this).px,
                    end = paddings.calculateEndPadding(this).px,
                    top = paddings.calculateTopPadding().px,
                    bottom = paddings.calculateBottomPadding().px,
                )
            }
    }
}
