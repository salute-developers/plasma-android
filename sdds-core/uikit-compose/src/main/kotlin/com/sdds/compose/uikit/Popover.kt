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
    alignment: PopoverAlignment = PopoverAlignment.Center,
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
        placement = positionProvider.safePlacement,
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
                            tailCorrection = positionProvider.tailCorrection,
                            popoverAlignment = positionProvider.safeTailAlignment,
                            placement = positionProvider.safePlacement,
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
    tailCorrection: Int,
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
        getTailTranslationY(placement, tailAlignment, tailCorrection, tailWidthPx, tailPaddingPx)
    val tailTranslationX =
        getTailTranslationX(placement, tailAlignment, tailCorrection, tailWidthPx, tailPaddingPx)
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
    tailCorrection: Int,
    tailWidthPx: Float,
    tailPaddingPx: Float,
): Float {
    val horizontalAlignment = if (tailCorrection == 0) {
        when (tailAlignment) {
            PopoverAlignment.Start -> tailPaddingPx + tailWidthPx / 2
            PopoverAlignment.End -> size.width - tailPaddingPx - tailWidthPx / 2
            PopoverAlignment.Center -> size.width / 2
        }
    } else {
        size.width / 2 + tailCorrection
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
    tailCorrection: Int,
    tailWidthPx: Float,
    tailPaddingPx: Float,
): Float {
    val verticalAlignment = if (tailCorrection == 0) {
        when (tailAlignment) {
            PopoverAlignment.Start -> tailPaddingPx + tailWidthPx / 2
            PopoverAlignment.End -> size.height - tailPaddingPx - tailWidthPx / 2
            PopoverAlignment.Center -> size.height / 2
        }
    } else {
        size.height / 2 + tailCorrection
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
    tailCorrection: Int,
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
                tailCorrection = tailCorrection,
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

    var tailCorrection: Int = 0
    private var horizontalAlignmentCorrectionWasMade = false
    private var verticalAlignmentCorrectionWasMade = false
    var safePlacement = placement
    var safeTailAlignment = tailAlignment

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize,
    ): IntOffset {
        val triggerLC = triggerLayoutCoordinates.value ?: return IntOffset.Zero
        val triggerSize = triggerLC.size
        val triggerPositionInRoot = triggerLC.positionInRoot().round()
        val desiredPopupPosition = calculatePopupPosition(
            triggerPositionInRoot = triggerPositionInRoot,
            popupContentSize = popupContentSize,
            triggerSize = triggerSize,
        )

        val finalPopupPosition = when (placementMode) {
            PopoverPlacementMode.Strict ->
                desiredPopupPosition
                    .also {
                        safePlacement = placement
                        safeTailAlignment = tailAlignment
                    }

            PopoverPlacementMode.Loose -> {
                val shouldRecalculatePosition = desiredPopupPosition
                    .verifyOrCorrectPlacement(popupContentSize, windowSize)
                if (shouldRecalculatePosition) {
                    centerTailIfNeed(popupContentSize, triggerSize)
                    calculatePopupPosition(
                        triggerPositionInRoot = triggerPositionInRoot,
                        popupContentSize = popupContentSize,
                        triggerSize = triggerSize,
                    )
                } else {
                    desiredPopupPosition
                }
            }
        }

        return finalPopupPosition
    }

    private fun centerTailIfNeed(popupSize: IntSize, triggerSize: IntSize) {
        val shouldCenterTail = triggerCentered &&
            (horizontalAlignmentCorrectionWasMade || verticalAlignmentCorrectionWasMade)
        if (!shouldCenterTail) return
        val verticalTailCorrection =
            (popupSize.height / 2 - triggerSize.height) + triggerSize.height / 2
        val horizontalTailCorrection =
            (popupSize.width / 2 - triggerSize.width) + triggerSize.width / 2
        tailCorrection = when (safePlacement) {
            PopoverPlacement.Start,
            PopoverPlacement.End,
            -> {
                when (safeTailAlignment) {
                    PopoverAlignment.Start -> verticalTailCorrection
                    PopoverAlignment.End -> -verticalTailCorrection
                    else -> 0
                }
            }

            PopoverPlacement.Top,
            PopoverPlacement.Bottom,
            -> {
                when (safeTailAlignment) {
                    PopoverAlignment.Start -> -horizontalTailCorrection
                    PopoverAlignment.End -> horizontalTailCorrection
                    else -> 0
                }
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

        return when (safePlacement) {
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

    @Suppress("CyclomaticComplexMethod")
    private fun IntOffset.verifyOrCorrectPlacement(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean {
        val notEnoughSpaceOnTop = this.y < 0
        val notEnoughSpaceOnBottom = this.y + popupSize.height > windowSize.height
        val notEnoughSpaceOnStart = this.x < 0
        val notEnoughSpaceOnEnd = this.x + popupSize.width > windowSize.width
        val shouldRecalculatePosition = notEnoughSpaceOnStart ||
            notEnoughSpaceOnEnd ||
            notEnoughSpaceOnTop ||
            notEnoughSpaceOnBottom

        if (!shouldRecalculatePosition) return false

        fun checkOrCorrectVerticalAlignment() {
            if (notEnoughSpaceOnTop) {
                safeTailAlignment = PopoverAlignment.Start
                verticalAlignmentCorrectionWasMade = true
            }
            if (notEnoughSpaceOnBottom) {
                safeTailAlignment = PopoverAlignment.End
                verticalAlignmentCorrectionWasMade = true
            }
        }

        fun checkOrCorrectHorizontalAlignment() {
            if (notEnoughSpaceOnStart) {
                safeTailAlignment = PopoverAlignment.Start
                horizontalAlignmentCorrectionWasMade = true
            }
            if (notEnoughSpaceOnEnd) {
                safeTailAlignment = PopoverAlignment.End
                horizontalAlignmentCorrectionWasMade = true
            }
        }

        when (placement) {
            PopoverPlacement.Start -> {
                if (notEnoughSpaceOnStart) safePlacement = PopoverPlacement.End
                checkOrCorrectVerticalAlignment()
            }

            PopoverPlacement.End -> {
                if (notEnoughSpaceOnEnd) safePlacement = PopoverPlacement.Start
                checkOrCorrectVerticalAlignment()
            }

            PopoverPlacement.Top -> {
                if (notEnoughSpaceOnTop) safePlacement = PopoverPlacement.Bottom
                checkOrCorrectHorizontalAlignment()
            }

            PopoverPlacement.Bottom -> {
                if (notEnoughSpaceOnBottom) safePlacement = PopoverPlacement.Top
                checkOrCorrectHorizontalAlignment()
            }
        }

        return true
    }

    private fun getVerticalAlignment(
        triggerSize: IntSize,
        popupSize: IntSize,
    ): Int {
        val centerAlignment = -(popupSize.height - triggerSize.height) / 2
        return if (triggerCentered && !verticalAlignmentCorrectionWasMade) {
            val tailOffset = when (tailAlignment) {
                PopoverAlignment.Start -> -tailPadding - tailWidth / 2 - shadowPaddings.top
                PopoverAlignment.Center -> -popupSize.height / 2 - (shadowPaddings.top - shadowPaddings.bottom) / 2
                PopoverAlignment.End -> -popupSize.height + tailPadding + tailWidth / 2 + shadowPaddings.bottom
            }
            triggerSize.height / 2 + tailOffset
        } else {
            when (safeTailAlignment) {
                PopoverAlignment.Start -> -shadowPaddings.top
                PopoverAlignment.Center -> centerAlignment - (shadowPaddings.top - shadowPaddings.bottom) / 2
                PopoverAlignment.End -> -(popupSize.height - triggerSize.height) + shadowPaddings.bottom
            }
        }
    }

    private fun getHorizontalAlignment(
        triggerSize: IntSize,
        popupSize: IntSize,
    ): Int {
        val centerAlignment = -(popupSize.width - triggerSize.width) / 2
        return if (triggerCentered && !horizontalAlignmentCorrectionWasMade) {
            val tailOffset = when (tailAlignment) {
                PopoverAlignment.Start -> -tailPadding - tailWidth / 2 - shadowPaddings.start
                PopoverAlignment.Center -> -popupSize.width / 2 - (shadowPaddings.start - shadowPaddings.end) / 2
                PopoverAlignment.End -> -popupSize.width + tailPadding + tailWidth / 2 + shadowPaddings.end
            }
            triggerSize.width / 2 + tailOffset
        } else {
            when (safeTailAlignment) {
                PopoverAlignment.Start -> -shadowPaddings.start
                PopoverAlignment.Center -> centerAlignment - (shadowPaddings.start - shadowPaddings.end) / 2
                PopoverAlignment.End -> -(popupSize.width - triggerSize.width) + shadowPaddings.end
            }
        }
    }
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
