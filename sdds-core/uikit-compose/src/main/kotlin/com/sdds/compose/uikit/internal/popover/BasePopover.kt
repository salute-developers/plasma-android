package com.sdds.compose.uikit.internal.popover

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
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
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverColors
import com.sdds.compose.uikit.PopoverDimensions
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacement.Companion.BottomFallbacks
import com.sdds.compose.uikit.PopoverPlacement.Companion.EndFallbacks
import com.sdds.compose.uikit.PopoverPlacement.Companion.StartFallbacks
import com.sdds.compose.uikit.PopoverPlacement.Companion.TopFallbacks
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.plus
import com.sdds.compose.uikit.px
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.shadow
import kotlinx.coroutines.delay
import kotlin.math.roundToInt

@Composable
@Suppress("LongMethod")
internal fun BasePopover(
    show: Boolean,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    shape: CornerBasedShape,
    shadow: ShadowAppearance,
    dimensions: PopoverDimensions,
    colors: PopoverColors,
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    triggerCentered: Boolean,
    alignment: PopoverAlignment,
    tailEnabled: Boolean,
    duration: Long?,
    popupProperties: PopupProperties,
    enterTransition: EnterTransition,
    exitTransition: ExitTransition,
    interactionSource: MutableInteractionSource,
    content: @Composable () -> Unit,
) {
    val tailHeight = dimensions.tailHeight
    val tailWidth = dimensions.tailWidth
    val tailPadding = dimensions.tailPadding
    val offset = dimensions.offset
    val backgroundColor = colors.backgroundColor.getValue(interactionSource)

    val shadowPaddingValues = shadow.getShadowSafePaddings()
    val shadowPaddingsPx = ShadowPaddings.fromPaddingValues(shadowPaddingValues)
    val positionProvider = rememberPopoverPositionProvider(
        placement = placement,
        placementMode = placementMode,
        triggerCentered = triggerCentered,
        tailAlignment = alignment,
        triggerInfo = triggerInfo,
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
            properties = popupProperties,
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
                        .defaultMinSize(minWidth = dimensions.width)
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

internal val DefaultPopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = true,
)

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
    triggerInfo: TriggerInfo,
    offset: Int,
    tailPadding: Int,
    tailWidth: Int,
    shadowPaddings: ShadowPaddings,
) = remember(
    placement,
    placementMode,
    triggerCentered,
    tailAlignment,
    triggerInfo,
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
        triggerInfo,
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
    private val triggerInfo: TriggerInfo,
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
        val triggerScaleFactor = triggerInfo.focusScaleFactor
        val triggerSize = triggerInfo.size
        val triggerPositionInRoot = triggerInfo.positionInRoot
        val scaledTriggerSize = triggerSize.calculateScaledSize(triggerScaleFactor)
        val desiredPopupPosition = calculatePopupPosition(
            triggerPositionInRoot = triggerPositionInRoot,
            popupContentSize = popupContentSize,
            triggerSize = scaledTriggerSize,
        ) + popoverOffsetWhenTriggerCentered(scaledTriggerSize)

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
                            triggerSize = scaledTriggerSize,
                        )
                } else {
                    desiredPopupPosition
                }
            }
        }

        return finalPopupPosition
    }

    private fun IntSize.calculateScaledSize(scaleFactor: Float): IntSize {
        return if (scaleFactor == 0f) {
            this
        } else {
            IntSize(
                width = (this.width * (1f + scaleFactor)).roundToInt(),
                height = (this.height * (1f + scaleFactor)).roundToInt(),
            )
        }
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
