package com.sdds.compose.uikit.internal.popover

import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import androidx.core.view.updateLayoutParams
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
import com.sdds.compose.uikit.shadow.getShadowSafePaddings
import com.sdds.compose.uikit.shadow.shadow
import kotlinx.coroutines.delay
import kotlin.math.abs
import kotlin.math.roundToInt

@Composable
@Suppress("LongMethod", "CyclomaticComplexMethod")
internal fun BasePopover(
    show: Boolean,
    onDismissRequest: () -> Unit,
    clipHeight: Boolean = false,
    clipWidth: Boolean = false,
    triggerInfo: () -> TriggerInfo,
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
    val rootView = LocalView.current.rootView
    val tailHeight = dimensions.tailHeight
    val tailWidth = dimensions.tailWidth
    val tailPadding = dimensions.tailPadding
    val offset = dimensions.offset
    val backgroundColor = colors.backgroundColor.getValue(interactionSource)

    val visibleState = remember { MutableTransitionState(false) }
    visibleState.targetState = show
    val popoverVisible = visibleState.currentState || visibleState.targetState || !visibleState.isIdle

    var recalculatedConstraints by remember { mutableStateOf<IntSize?>(null) }
    var popoverContentSize by remember { mutableStateOf(IntSize.Zero) }
    var maxPopupContentSize by remember { mutableStateOf(IntSize.Zero) }

    val shadowPaddingValues = shadow.getShadowSafePaddings()
    val shadowPaddingsPx = ShadowPaddings.fromPaddingValues(shadowPaddingValues)
    val triggerInfoValue = triggerInfo()
    val positionProvider = rememberPopoverPositionProvider(
        placement = placement,
        placementMode = placementMode,
        triggerCentered = triggerCentered,
        tailAlignment = alignment,
        offset = offset.px,
        tailPadding = tailPadding.px,
        tailWidth = tailWidth.px,
        shadowPaddings = shadowPaddingsPx,
        triggerInfo = triggerInfoValue,
        triggerInfoProvider = triggerInfo,
        keyboardHeight = getKeyboardHeightPx(),
        rootViewHeight = rootView.height,
        clipHeight = clipHeight,
        clipWidth = clipWidth,
        popoverContentSize = { popoverContentSize },
        maxPopupContentSize = { maxPopupContentSize },
        clippedConstraints = { recalculatedConstraints },
        onPopupContentSizeChanged = { contentSize ->
            val updatedContentSize = maxPopupContentSize.maxOf(contentSize)
            if (updatedContentSize != maxPopupContentSize) {
                maxPopupContentSize = updatedContentSize
            }
        },
        onContentSizeChanged = { constraints ->
            if (clipHeight && constraints.height == 0) {
                return@rememberPopoverPositionProvider
            }
            if (recalculatedConstraints != constraints) {
                recalculatedConstraints = constraints
            }
        },
    )
    val tailPaddings = tailCompensationPaddings(
        tailEnabled = tailEnabled,
        tailHeight = tailHeight,
        placement = positionProvider.innerPlacement,
    )

    LaunchedEffect(popoverVisible) {
        if (!popoverVisible) {
            recalculatedConstraints = null
            popoverContentSize = IntSize.Zero
            maxPopupContentSize = IntSize.Zero
        }
    }

    duration?.let {
        if (show) {
            LaunchedEffect(Unit) {
                delay(duration)
                onDismissRequest.invoke()
            }
        }
    }

    if (popoverVisible) {
        val constraints = recalculatedConstraints
        val resizeModifier = if (constraints != null && (clipHeight || clipWidth)) {
            with(LocalDensity.current) {
                Modifier.widthIn(max = constraints.width.toDp())
                Modifier.heightIn(max = constraints.height.toDp())
            }
        } else {
            Modifier
        }
        val ignoreContentTapModifier = Modifier
            .pointerInput(Unit) {
                detectTapGestures(
                    onTap = {},
                )
            }
        val clickableForShadowZoneModifier =
            if (popupProperties.dismissOnClickOutside && popupProperties.focusable) {
                Modifier.pointerInput(Unit) {
                    detectTapGestures(
                        onTap = { onDismissRequest.invoke() },
                    )
                }
            } else {
                Modifier
            }
        Popup(
            popupPositionProvider = positionProvider,
            properties = popupProperties,
            onDismissRequest = onDismissRequest,
        ) {
            val dialogView = LocalView.current.rootView
            if (!popupProperties.focusable) {
                LaunchedEffect(dialogView, rootView) {
                    dialogView.enablePassthroughTouch(rootView)
                }
            }
            AnimatedVisibility(
                modifier = clickableForShadowZoneModifier,
                visibleState = visibleState,
                enter = enterTransition,
                exit = exitTransition,
            ) {
                Box {
                    Box(
                        modifier = Modifier
                            .onGloballyPositioned { popoverContentSize = it.size }
                            .padding(shadowPaddingValues + tailPaddings)
                            .then(ignoreContentTapModifier)
                            .then(resizeModifier)
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
                    if (popupProperties.usePlatformDefaultWidth) {
                        val contentView = LocalView.current.rootView
                        SideEffect {
                            contentView.updateLayoutParams {
                                width = ViewGroup.LayoutParams.MATCH_PARENT
                            }
                        }
                    }
                }
            }
        }
    }
}

private fun IntSize.maxOf(other: IntSize): IntSize {
    return IntSize(
        width = maxOf(width, other.width),
        height = maxOf(height, other.height),
    )
}

@Suppress("ClickableViewAccessibility")
private fun View.enablePassthroughTouch(decorView: View) {
    setOnTouchListener { v, event ->
        val anchorRect = decorView.getScreenRect()
        val popupRect = v.getScreenRect()
        val offsetX = (popupRect.left - anchorRect.left).toFloat()
        val offsetY = (popupRect.top - anchorRect.top).toFloat()

        val transformedEvent = MotionEvent.obtain(event)
        transformedEvent.offsetLocation(offsetX, offsetY)
        val result = decorView.dispatchTouchEvent(transformedEvent)
        transformedEvent.recycle()

        result
    }
}

private fun View.getScreenRect(): android.graphics.Rect {
    val location = IntArray(2)
    getLocationOnScreen(location)
    return android.graphics.Rect(
        location[0],
        location[1],
        (location[0] + width * scaleX).toInt(),
        (location[1] + height * scaleY).toInt(),
    )
}

@Composable
private fun getKeyboardHeightPx(): Int {
    val windowInsets = WindowInsets.ime
    return windowInsets.getBottom(LocalDensity.current)
}

internal val DefaultPopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = true,
    usePlatformDefaultWidth = true,
)

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
    shape: CornerBasedShape,
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
    val trueSideWidthPx = sideWidthWithoutCorners(placement, shape)
    val tailTranslationY =
        getTailTranslationY(placement, tailAlignment, tailWidthPx, tailPaddingPx, trueSideWidthPx)
    val tailTranslationX =
        getTailTranslationX(placement, tailAlignment, tailWidthPx, tailPaddingPx, trueSideWidthPx)
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
    trueSideWidthPx: Float,
): Float {
    val horizontalAlignment =
        if (canApplyAlignToTail(tailPaddingPx, tailWidthPx, trueSideWidthPx)) {
            when (tailAlignment) {
                PopoverAlignment.Start -> tailPaddingPx + tailWidthPx / 2
                PopoverAlignment.End -> size.width - tailPaddingPx - tailWidthPx / 2
                PopoverAlignment.Center -> size.width / 2
            }
        } else {
            size.width / 2
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
    trueSideWidthPx: Float,
): Float {
    val verticalAlignment = if (canApplyAlignToTail(tailPaddingPx, tailWidthPx, trueSideWidthPx)) {
        when (tailAlignment) {
            PopoverAlignment.Start -> tailPaddingPx + tailWidthPx / 2
            PopoverAlignment.End -> size.height - tailPaddingPx - tailWidthPx / 2
            PopoverAlignment.Center -> size.height / 2
        }
    } else {
        size.height / 2
    }
    return when (placement) {
        PopoverPlacement.Top -> size.height
        PopoverPlacement.Bottom -> 0f
        PopoverPlacement.Start,
        PopoverPlacement.End,
        -> verticalAlignment
    }
}

private fun CacheDrawScope.sideWidthWithoutCorners(
    placement: PopoverPlacement,
    shape: CornerBasedShape,
): Float {
    val topStart = shape.topStart.toPx(size, this)
    val topEnd = shape.topEnd.toPx(size, this)
    val bottomStart = shape.bottomStart.toPx(size, this)
    val bottomEnd = shape.bottomEnd.toPx(size, this)
    return when (placement) {
        PopoverPlacement.Start -> size.height - topEnd - bottomEnd
        PopoverPlacement.Top -> size.width - bottomStart - bottomEnd
        PopoverPlacement.End -> size.height - topStart - bottomStart
        PopoverPlacement.Bottom -> size.width - topStart - topEnd
    }
}

private fun canApplyAlignToTail(
    tailOffset: Float,
    tailWidth: Float,
    total: Float,
) = if (tailOffset + tailWidth >= total) false else true

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
                shape = shape,
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
    triggerInfoProvider: () -> TriggerInfo,
    offset: Int,
    tailPadding: Int,
    tailWidth: Int,
    shadowPaddings: ShadowPaddings,
    keyboardHeight: Int,
    rootViewHeight: Int,
    clipHeight: Boolean,
    clipWidth: Boolean,
    popoverContentSize: () -> IntSize,
    maxPopupContentSize: () -> IntSize,
    clippedConstraints: () -> IntSize?,
    onPopupContentSizeChanged: (IntSize) -> Unit,
    onContentSizeChanged: (IntSize) -> Unit,
): PopoverPositionProvider = remember(
    placement,
    placementMode,
    triggerCentered,
    tailAlignment,
    triggerInfo,
    triggerInfoProvider,
    offset,
    tailPadding,
    tailWidth,
    shadowPaddings,
    keyboardHeight,
    rootViewHeight,
    clipHeight,
    clipWidth,
) {
    PopoverPositionProvider(
        placement,
        placementMode,
        triggerCentered,
        tailAlignment,
        triggerInfoProvider,
        offset,
        tailPadding,
        tailWidth,
        shadowPaddings,
        keyboardHeight,
        rootViewHeight,
        clipHeight,
        clipWidth,
        popoverContentSize,
        maxPopupContentSize,
        clippedConstraints,
        onPopupContentSizeChanged,
        onContentSizeChanged,
    )
}

private class PopoverPositionProvider(
    private val placement: PopoverPlacement,
    private val placementMode: PopoverPlacementMode,
    private val triggerCentered: Boolean,
    private val tailAlignment: PopoverAlignment,
    private val triggerInfoProvider: () -> TriggerInfo,
    private val offset: Int,
    private val tailPadding: Int,
    private val tailWidth: Int,
    private val shadowPaddings: ShadowPaddings,
    private val keyboardHeight: Int,
    private val rootViewHeight: Int,
    private val clipHeight: Boolean,
    private val clipWidth: Boolean,
    private val popoverContentSize: () -> IntSize,
    private val maxPopupContentSize: () -> IntSize,
    private val clippedConstraints: () -> IntSize?,
    private val onPopupContentSizeChanged: (IntSize) -> Unit,
    private val onContentSizeChanged: (IntSize) -> Unit,
) : PopupPositionProvider {

    private var popoverOffsetWhenTriggerCentered: Offset = Offset.Zero
    var innerPlacement = placement
        private set
    var innerTailAlignment = tailAlignment
        private set

    private fun reset() {
        innerPlacement = placement
        innerTailAlignment = tailAlignment
        popoverOffsetWhenTriggerCentered = Offset.Zero
    }

    private fun alignmentLineOffset(): Int {
        val triggerInfo = triggerInfoProvider()
        val triggerWidth = triggerInfo.size.width
        val triggerHeight = triggerInfo.size.height
        val startCompensation = triggerInfo.startAlignmentLine.zeroIfUnspecified()
        val endCompensation =
            (triggerWidth - triggerInfo.endAlignmentLine.ifUnspecified(triggerWidth))
        val topCompensation = triggerInfo.topAlignmentLine.zeroIfUnspecified()
        val bottomCompensation =
            (triggerHeight - triggerInfo.bottomAlignmentLine.ifUnspecified(triggerHeight))

        return when (innerPlacement) {
            PopoverPlacement.Start -> +startCompensation
            PopoverPlacement.Top -> +topCompensation
            PopoverPlacement.End -> -endCompensation
            PopoverPlacement.Bottom -> -bottomCompensation
        }
    }

    private fun Int.zeroIfUnspecified(): Int {
        return if (this == AlignmentLine.Unspecified) 0 else this
    }

    private fun Int.ifUnspecified(offset: Int): Int {
        return if (this == AlignmentLine.Unspecified) offset else this
    }

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize,
    ): IntOffset {
        reset()
        val triggerInfo = triggerInfoProvider()
        val triggerScaleFactor = triggerInfo.focusScaleFactor
        val isAnchorBoundsTrigger = anchorBounds.isSameSizeAs(triggerInfo.size)
        val triggerSize = if (isAnchorBoundsTrigger) {
            IntSize(anchorBounds.width, anchorBounds.height)
        } else {
            triggerInfo.size
        }
        val triggerPositionInRoot = if (isAnchorBoundsTrigger) {
            IntOffset(anchorBounds.left, anchorBounds.top)
        } else {
            triggerInfo.positionInRoot
        }
        val measuredContentSize = popoverContentSize().takeIf { it != IntSize.Zero } ?: popupContentSize
        val clippedConstraints = clippedConstraints()
        val contentSize = measuredContentSize.withClippedAxes(
            maxSize = maxPopupContentSize(),
            clippedConstraints = clippedConstraints,
            clipHeight = clipHeight,
        )
        onPopupContentSizeChanged(measuredContentSize)
        val scaledTriggerSize = triggerSize.calculateScaledSize(triggerScaleFactor)
        val desiredPopupPosition = calculatePopupPosition(
            triggerPositionInRoot = triggerPositionInRoot,
            popupContentSize = contentSize,
            triggerSize = scaledTriggerSize,
        ) + popoverOffsetWhenTriggerCentered(scaledTriggerSize)

        val availableWindowSize = getAvailableWindowSize(windowSize)
        val finalPopupPosition = when (placementMode) {
            PopoverPlacementMode.Strict -> desiredPopupPosition

            PopoverPlacementMode.Loose -> {
                val shouldRecalculatePosition =
                    !desiredPopupPosition.hasEnoughSpace(contentSize, availableWindowSize)
                if (shouldRecalculatePosition) {
                    desiredPopupPosition
                        .tryToCorrectPlacement(
                            popupSize = contentSize,
                            windowSize = availableWindowSize,
                            triggerPositionInRoot = triggerPositionInRoot,
                            triggerSize = scaledTriggerSize,
                        )
                } else {
                    desiredPopupPosition
                }
            }
        }

        val actualPopupPosition = finalPopupPosition.takeUnless {
            measuredContentSize.shouldAnchorToActualSize(
                clippedSize = contentSize,
                clippedConstraints = clippedConstraints,
                clipHeight = clipHeight,
            )
        } ?: (
            calculatePopupPosition(
                triggerPositionInRoot = triggerPositionInRoot,
                popupContentSize = measuredContentSize,
                triggerSize = scaledTriggerSize,
            ) + popoverOffsetWhenTriggerCentered(scaledTriggerSize)
            )

        recalculatePopupSizeIfNeed(
            contentSize,
            actualPopupPosition,
            availableWindowSize,
            triggerPositionInRoot,
        )

        return actualPopupPosition
    }

    private fun IntRect.isSameSizeAs(size: IntSize): Boolean {
        return abs(width - size.width) <= 1 && abs(height - size.height) <= 1
    }

    private fun IntSize.withClippedAxes(
        maxSize: IntSize,
        clippedConstraints: IntSize?,
        clipHeight: Boolean,
    ): IntSize {
        val shouldUseMaxHeight = clipHeight &&
            clippedConstraints != null &&
            clippedConstraints.height > 0 &&
            height >= clippedConstraints.height

        return IntSize(
            width = width,
            height = if (shouldUseMaxHeight) maxOf(height, maxSize.height) else height,
        )
    }

    private fun IntSize.shouldAnchorToActualSize(
        clippedSize: IntSize,
        clippedConstraints: IntSize?,
        clipHeight: Boolean,
    ): Boolean {
        return clipHeight &&
            clippedConstraints != null &&
            clippedConstraints.height > 0 &&
            height >= clippedConstraints.height &&
            height < clippedSize.height
    }

    private fun getAvailableWindowSize(windowSize: IntSize): IntSize {
        val imeWindowSize = if (shouldSubtractKeyboard(windowSize)) {
            IntSize(windowSize.width, maxOf(0, windowSize.height - keyboardHeight))
        } else {
            windowSize
        }
        return imeWindowSize
    }

    private fun shouldSubtractKeyboard(windowSize: IntSize): Boolean {
        if (keyboardHeight <= 0) return false
        if (rootViewHeight <= 0) return true
        val imeAdjustedRootHeight = rootViewHeight - keyboardHeight
        return windowSize.height > imeAdjustedRootHeight
    }

    private fun recalculatePopupSizeIfNeed(
        popupContentSize: IntSize,
        finalPopupPosition: IntOffset,
        availableWindowSize: IntSize,
        triggerPositionInRoot: IntOffset,
    ) {
        val availablePopupHeight = getAvailableHeight(
            popupContentSize,
            finalPopupPosition,
            availableWindowSize,
            triggerPositionInRoot,
        )

        val availablePopupWidth = getAvailableWidth(
            popupContentSize,
            finalPopupPosition,
            availableWindowSize,
            triggerPositionInRoot,
        )

        if (clipWidth || clipHeight) {
            onContentSizeChanged.invoke(IntSize(availablePopupWidth, availablePopupHeight))
        }
    }

    private fun getAvailableHeight(
        popupContentSize: IntSize,
        finalPopupPosition: IntOffset,
        availableWindowSize: IntSize,
        triggerPositionInRoot: IntOffset,
    ): Int {
        val alignedOffset = alignmentLineOffset()
        val availableHeight = if (clipHeight) {
            when (innerPlacement) {
                PopoverPlacement.Start -> availableWindowSize.height - finalPopupPosition.y - alignedOffset
                PopoverPlacement.End -> availableWindowSize.height - finalPopupPosition.y - alignedOffset
                PopoverPlacement.Top -> triggerPositionInRoot.y - alignedOffset - offset
                PopoverPlacement.Bottom -> availableWindowSize.height - finalPopupPosition.y - alignedOffset
            }
        } else {
            popupContentSize.height
        }
        return maxOf(0, availableHeight)
    }

    private fun getAvailableWidth(
        popupContentSize: IntSize,
        finalPopupPosition: IntOffset,
        availableWindowSize: IntSize,
        triggerPositionInRoot: IntOffset,
    ): Int {
        val alignedOffset = alignmentLineOffset()
        val availableWidth = if (clipWidth) {
            when (innerPlacement) {
                PopoverPlacement.Start -> triggerPositionInRoot.x - alignedOffset - offset
                PopoverPlacement.End -> availableWindowSize.width - finalPopupPosition.x - alignedOffset
                PopoverPlacement.Top -> availableWindowSize.width - finalPopupPosition.x - alignedOffset
                PopoverPlacement.Bottom -> availableWindowSize.width - finalPopupPosition.x - alignedOffset
            }
        } else {
            popupContentSize.width
        }
        return maxOf(0, availableWidth)
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
        return tryToFitInLargestAvailableSpace(
            originalPosition = this,
            popupSize = popupSize,
            windowSize = windowSize,
            triggerPositionInRoot = triggerPositionInRoot,
            triggerSize = triggerSize,
        )
    }

    @Suppress("SpreadOperator")
    private fun tryToFitInLargestAvailableSpace(
        originalPosition: IntOffset,
        popupSize: IntSize,
        windowSize: IntSize,
        triggerPositionInRoot: IntOffset,
        triggerSize: IntSize,
    ): IntOffset {
        var bestPlacement = placement
        var bestTailAlignment = tailAlignment
        var bestPosition = originalPosition
        var bestAvailableSpace = -1
        val placements = arrayOf(placement, *placement.fallbacks)
        placements.forEach { candidatePlacement ->
            innerPlacement = candidatePlacement
            innerTailAlignment = tailAlignment
            val candidatePosition = calculatePopupPosition(
                triggerPositionInRoot = triggerPositionInRoot,
                popupContentSize = popupSize,
                triggerSize = triggerSize,
            ) + popoverOffsetWhenTriggerCentered(triggerSize)
            val correctedPosition = candidatePosition.tryToCorrectAlignment(
                popupSize = popupSize,
                windowSize = windowSize,
                triggerPositionInRoot = triggerPositionInRoot,
                triggerSize = triggerSize,
            ).keepWithinClippedBounds()
            val candidateTailAlignment = innerTailAlignment
            val candidateAvailableSpace = when (candidatePlacement) {
                PopoverPlacement.Start,
                PopoverPlacement.End,
                -> getAvailableWidth(
                    popupContentSize = popupSize,
                    finalPopupPosition = correctedPosition,
                    availableWindowSize = windowSize,
                    triggerPositionInRoot = triggerPositionInRoot,
                )

                PopoverPlacement.Top,
                PopoverPlacement.Bottom,
                -> getAvailableHeight(
                    popupContentSize = popupSize,
                    finalPopupPosition = correctedPosition,
                    availableWindowSize = windowSize,
                    triggerPositionInRoot = triggerPositionInRoot,
                )
            }
            if (candidateAvailableSpace > bestAvailableSpace) {
                bestAvailableSpace = candidateAvailableSpace
                bestPlacement = candidatePlacement
                bestTailAlignment = candidateTailAlignment
                bestPosition = correctedPosition
            }
        }
        innerPlacement = bestPlacement
        innerTailAlignment = bestTailAlignment
        return bestPosition
    }

    private fun IntOffset.keepWithinClippedBounds(): IntOffset {
        if (!clipHeight && !clipWidth) return this
        return IntOffset(
            x = if (clipWidth) {
                x.coerceAtLeast(-shadowPaddings.start)
            } else {
                x
            },
            y = if (clipHeight) {
                y.coerceAtLeast(-shadowPaddings.top)
            } else {
                y
            },
        )
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
                x = triggerPositionInRoot.x - offset -
                    alignmentLineOffset() - popupContentSize.width + shadowPaddings.end,
                y = triggerPositionInRoot.y + verticalAlignment,
            )

            PopoverPlacement.End -> IntOffset(
                x = triggerPositionInRoot.x + triggerSize.width + offset +
                    alignmentLineOffset() - shadowPaddings.start,
                y = triggerPositionInRoot.y + verticalAlignment,
            )

            PopoverPlacement.Top -> IntOffset(
                x = triggerPositionInRoot.x + horizontalAlignment,
                y = triggerPositionInRoot.y - offset -
                    alignmentLineOffset() - popupContentSize.height + shadowPaddings.bottom,
            )

            PopoverPlacement.Bottom -> IntOffset(
                x = triggerPositionInRoot.x + horizontalAlignment,
                y = triggerPositionInRoot.y + triggerSize.height + offset +
                    alignmentLineOffset() - shadowPaddings.top,
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

    private fun IntOffset.notEnoughSpaceOnTop(): Boolean = this.y + shadowPaddings.top < 0

    private fun IntOffset.notEnoughSpaceOnBottom(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean = this.y + popupSize.height - shadowPaddings.bottom > windowSize.height

    private fun IntOffset.notEnoughSpaceOnStart(): Boolean = this.x + shadowPaddings.start < 0

    private fun IntOffset.notEnoughSpaceOnEnd(
        popupSize: IntSize,
        windowSize: IntSize,
    ): Boolean = this.x + popupSize.width - shadowPaddings.end > windowSize.width
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
