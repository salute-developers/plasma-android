package com.sdds.compose.uikit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.SolidColor
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.shadow
import kotlinx.coroutines.delay

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Popover(
    show: Boolean,
    triggerLayoutCoordinates: State<LayoutCoordinates?>,
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    triggerCentered: Boolean,
    tailAlignment: PopoverTailAlignment,
//    style: PopoverStyle = LocalPopoverStyle.current,
    onDismissRequest: () -> Unit,
    duration: Long? = null,
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    shadow: ShadowAppearance,
    content: @Composable () -> Unit,
) {
    val tailHeight = 8.dp //todo
    val tailWidth = 20.dp //todo
    val tailPadding = 12.dp //todo
    val offset = 0.dp //todo
    val shape = RoundedCornerShape(15) //todo
    val contentShadow = shadow //todo
    val backgroundColor = SolidColor(Color.Red.copy(0.3f)) //todo

    val visibleState = remember { MutableTransitionState(false) }
    val shadowPaddings = ShadowPaddings.fromPaddingValues(contentShadow.getShadowSafePaddings())
    val positionProvider = rememberPopoverPositionProvider(
        placement = placement,
        placementMode = placementMode,
        triggerCentered = triggerCentered,
        tailAlignment = tailAlignment,
        triggerLayoutCoordinates = triggerLayoutCoordinates,
        offset = offset.px,
        tailPadding = tailPadding.px,
        tailWidth = tailWidth.px,
        shadowPaddings = shadowPaddings
    )

    visibleState.targetState = show

    duration?.let {
        if (show) LaunchedEffect(Unit) {
            delay(duration)
            onDismissRequest.invoke()
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
                        .tailCompensationPadding(
                            positionProvider.safeTailAlignment,
                            positionProvider.safePlacement,
                            tailHeight,
                        )
                        .shadowCompensationPadding(contentShadow)
                        .drawPopover(
                            shape = shape,
                            backgroundColor = backgroundColor,
                            tailCorrection = positionProvider.tailCorrection,
                            tailAlignment = positionProvider.safeTailAlignment,
                            placement = positionProvider.safePlacement,
                            tailHeight = tailHeight,
                            tailWidth = tailWidth,
                            tailPadding = tailPadding,
                        )
                        .shadow(contentShadow)
                ) {
                    content.invoke()
                }
            }
        }
    }
}

private fun Modifier.shadowCompensationPadding(shadow: ShadowAppearance): Modifier =
    this then padding(shadow.getShadowSafePaddings())

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

private fun Modifier.tailCompensationPadding(
    tailAlignment: PopoverTailAlignment,
    placement: PopoverPlacement,
    tailHeight: Dp,
): Modifier {
    val tailCompensation = if (tailAlignment == PopoverTailAlignment.None) 0.dp else tailHeight
    return this then when (placement) {
        PopoverPlacement.Start -> padding(end = tailCompensation)
        PopoverPlacement.Top -> padding(bottom = tailCompensation)
        PopoverPlacement.End -> padding(start = tailCompensation)
        PopoverPlacement.Bottom -> padding(top = tailCompensation)
    }
}

private fun CacheDrawScope.createTailPath(
    placement: PopoverPlacement,
    tailAlignment: PopoverTailAlignment,
    tailWidthPx: Float,
    tailHeightPx: Float,
    tailPaddingPx: Float,
    tailCorrection: Int,
): Path {
    val tailPath = Path().apply {
        addArc(
            Rect(
                topLeft = Offset(-tailWidthPx, -tailHeightPx * 2f),
                bottomRight = Offset(0f, 0f)
            ),
            startAngleDegrees = 0f,
            sweepAngleDegrees = 90f,
        )
        lineTo(tailWidthPx / 2f, 0f)
        addArc(
            Rect(
                topLeft = Offset(0f, -tailHeightPx * 2f),
                bottomRight = Offset(tailWidthPx, 0f)
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
    tailAlignment: PopoverTailAlignment,
    tailCorrection: Int,
    tailWidthPx: Float,
    tailPaddingPx: Float,
): Float {
    val horizontalAlignment = if (tailCorrection == 0) {
        when (tailAlignment) {
            PopoverTailAlignment.Start -> tailPaddingPx + tailWidthPx / 2
            PopoverTailAlignment.End -> size.width - tailPaddingPx - tailWidthPx / 2
            PopoverTailAlignment.Center -> size.width / 2
            PopoverTailAlignment.None -> 0f
        }
    } else {
        size.width / 2 + tailCorrection
    }
    return when (placement) {
        PopoverPlacement.Start -> size.width
        PopoverPlacement.End -> 0f
        PopoverPlacement.Top,
        PopoverPlacement.Bottom -> horizontalAlignment
    }
}

private fun CacheDrawScope.getTailTranslationY(
    placement: PopoverPlacement,
    tailAlignment: PopoverTailAlignment,
    tailCorrection: Int,
    tailWidthPx: Float,
    tailPaddingPx: Float,
): Float {
    val verticalAlignment = if (tailCorrection == 0) {
        when (tailAlignment) {
            PopoverTailAlignment.Start -> tailPaddingPx + tailWidthPx / 2
            PopoverTailAlignment.End -> size.height - tailPaddingPx - tailWidthPx / 2
            PopoverTailAlignment.Center -> size.height / 2
            PopoverTailAlignment.None -> 0f
        }
    } else {
        size.height / 2 + tailCorrection
    }
    return when (placement) {
        PopoverPlacement.Top -> size.height
        PopoverPlacement.Bottom -> 0f
        PopoverPlacement.Start,
        PopoverPlacement.End -> verticalAlignment
    }
}

private fun Modifier.drawPopover(
    shape: RoundedCornerShape,
    backgroundColor: Brush,
    tailCorrection: Int,
    tailAlignment: PopoverTailAlignment,
    placement: PopoverPlacement,
    tailHeight: Dp,
    tailWidth: Dp,
    tailPadding: Dp,
): Modifier {
    return drawWithCache {
        val backgroundPath = Path().apply {
            addOutline(shape.createOutline(size, layoutDirection, this@drawWithCache))
        }
        val popoverPath = if (tailAlignment == PopoverTailAlignment.None) {
            backgroundPath
        } else {
            val tailHeightPx = tailHeight.toPx()
            val tailWidthPx = tailWidth.toPx()
            val tailPaddingPx = tailPadding.toPx()
            val tailPath = createTailPath(
                placement = placement,
                tailAlignment = tailAlignment,
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
    tailAlignment: PopoverTailAlignment,
    triggerLayoutCoordinates: State<LayoutCoordinates?>,
    offset: Int,
    tailPadding: Int,
    tailWidth: Int,
    shadowPaddings: ShadowPaddings,
) = remember {
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
    private val tailAlignment: PopoverTailAlignment,
    private val triggerLayoutCoordinates: State<LayoutCoordinates?>,
    private val offset: Int = 0,
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
            PopoverPlacementMode.Strict -> desiredPopupPosition
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
        val verticalTailCorrection = (popupSize.height / 2 - triggerSize.height) + triggerSize.height / 2
        val horizontalTailCorrection = (popupSize.width / 2 - triggerSize.width) + triggerSize.width / 2
        tailCorrection = when (safePlacement) {
            PopoverPlacement.Start,
            PopoverPlacement.End -> {
                when (safeTailAlignment) {
                    PopoverTailAlignment.Start -> verticalTailCorrection
                    PopoverTailAlignment.End -> -verticalTailCorrection
                    else -> 0
                }
            }

            PopoverPlacement.Top,
            PopoverPlacement.Bottom -> {
                when (safeTailAlignment) {
                    PopoverTailAlignment.Start -> -horizontalTailCorrection
                    PopoverTailAlignment.End -> horizontalTailCorrection
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
                y = triggerPositionInRoot.y + verticalAlignment - shadowPaddings.top
            )

            PopoverPlacement.End -> IntOffset(
                x = triggerPositionInRoot.x + triggerSize.width + offset - shadowPaddings.start,
                y = triggerPositionInRoot.y + verticalAlignment - shadowPaddings.top
            )

            PopoverPlacement.Top -> IntOffset(
                x = triggerPositionInRoot.x + horizontalAlignment - shadowPaddings.start,
                y = triggerPositionInRoot.y - offset - popupContentSize.height + shadowPaddings.bottom
            )

            PopoverPlacement.Bottom -> IntOffset(
                x = triggerPositionInRoot.x + horizontalAlignment - shadowPaddings.start,
                y = triggerPositionInRoot.y + triggerSize.height + offset - shadowPaddings.top
            )
        }
    }

    private fun IntOffset.verifyOrCorrectPlacement(
        popupSize: IntSize,
        windowSize: IntSize
    ): Boolean {
        val notEnoughSpaceOnTop = this.y < 0
        val notEnoughSpaceOnBottom = this.y + popupSize.height > windowSize.height
        val notEnoughSpaceOnStart = this.x < 0
        val notEnoughSpaceOnEnd = this.x + popupSize.width > windowSize.width
        val shouldRecalculatePosition = notEnoughSpaceOnStart
                || notEnoughSpaceOnEnd
                || notEnoughSpaceOnTop
                || notEnoughSpaceOnBottom

        if (!shouldRecalculatePosition) return false

        fun checkOrCorrectVerticalAlignment() {
            if (notEnoughSpaceOnTop) {
                safeTailAlignment = PopoverTailAlignment.Start
                verticalAlignmentCorrectionWasMade = true
            }
            if (notEnoughSpaceOnBottom) {
                safeTailAlignment = PopoverTailAlignment.End
                verticalAlignmentCorrectionWasMade = true
            }
        }

        fun checkOrCorrectHorizontalAlignment() {
            if (notEnoughSpaceOnStart) {
                safeTailAlignment = PopoverTailAlignment.Start
                horizontalAlignmentCorrectionWasMade = true
            }
            if (notEnoughSpaceOnEnd) {
                safeTailAlignment = PopoverTailAlignment.End
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
                PopoverTailAlignment.Start -> -tailPadding - tailWidth / 2
                PopoverTailAlignment.End -> -popupSize.height + tailPadding + tailWidth / 2
                PopoverTailAlignment.Center -> -popupSize.height / 2
                PopoverTailAlignment.None -> 0
            }
            triggerSize.height / 2 + tailOffset
        } else {
            when (safeTailAlignment) {
                PopoverTailAlignment.Start -> 0
                PopoverTailAlignment.Center -> centerAlignment
                PopoverTailAlignment.End -> -(popupSize.height - triggerSize.height)
                PopoverTailAlignment.None -> 0
            }
        }
    }

    private fun getHorizontalAlignment(
        triggerSize: IntSize,
        popupSize: IntSize,
    ): Int {
        return if (triggerCentered && !horizontalAlignmentCorrectionWasMade) {
            val tailOffset = when (tailAlignment) {
                PopoverTailAlignment.Start -> -tailPadding - tailWidth / 2
                PopoverTailAlignment.End -> -popupSize.width + tailPadding + tailWidth / 2
                PopoverTailAlignment.Center -> -popupSize.width / 2
                PopoverTailAlignment.None -> 0
            }
            triggerSize.width / 2 + tailOffset
        } else {
            when (safeTailAlignment) {
                PopoverTailAlignment.Start -> 0
                PopoverTailAlignment.Center -> -(popupSize.width - triggerSize.width) / 2
                PopoverTailAlignment.End -> -(popupSize.width - triggerSize.width)
                PopoverTailAlignment.None -> 0
            }
        }
    }
}

enum class PopoverTailAlignment {
    None, Start, Center, End
}

enum class PopoverPlacement {
    Start, Top, End, Bottom
}

enum class PopoverPlacementMode {
    Strict, Loose
}

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