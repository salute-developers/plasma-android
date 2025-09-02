package com.sdds.compose.uikit.internal.drawer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.dismiss
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified
import com.sdds.compose.uikit.CellDimensions
import com.sdds.compose.uikit.CellGravity
import com.sdds.compose.uikit.CloseIconAlignment
import com.sdds.compose.uikit.CloseIconPlacement
import com.sdds.compose.uikit.CloseIconPlacement.Inner
import com.sdds.compose.uikit.CloseIconPlacement.Outer
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.compose.uikit.DrawerAlignment.Bottom
import com.sdds.compose.uikit.DrawerAlignment.End
import com.sdds.compose.uikit.DrawerAlignment.Start
import com.sdds.compose.uikit.DrawerAlignment.Top
import com.sdds.compose.uikit.DrawerState
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.cell.BaseCell
import com.sdds.compose.uikit.internal.common.background
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.isHorizontal
import com.sdds.compose.uikit.shadow.shadow
import kotlin.math.roundToInt

@Suppress("LongMethod")
@Composable
internal fun DrawerContent(
    drawerConstraints: Constraints,
    drawerState: DrawerState,
    style: DrawerStyle,
    onClose: () -> Unit,
    interactionSource: InteractionSource,
    peekOffset: Dp,
    closeIconAlignment: CloseIconAlignment,
    closeIconPlacement: CloseIconPlacement,
    modifier: Modifier = Modifier,
    openOnFocus: Boolean = false,
    closeIconAbsolute: Boolean = false,
    header: (@Composable () -> Unit)? = null,
    closeIcon: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit,
) {
    val movableCloseIcon = remember(closeIconPlacement, closeIconAlignment, closeIcon) {
        closeIcon?.takeIf { closeIconPlacement != CloseIconPlacement.None }?.let {
            val offsetModifier = when (closeIconAlignment) {
                CloseIconAlignment.Start -> Modifier.padding(
                    end = style.dimensions.closeIconOffsetX,
                    top = style.dimensions.closeIconOffsetY,
                )
                CloseIconAlignment.End -> Modifier.padding(
                    start = style.dimensions.closeIconOffsetX,
                    top = style.dimensions.closeIconOffsetY,
                )
            }
            movableContentOf {
                Box(
                    modifier = offsetModifier,
                    propagateMinConstraints = false,
                    content = { it.invoke() },
                )
            }
        }
    }
    DraggableContainer(
        modifier = modifier,
        drawerConstraints = drawerConstraints,
        drawerState = drawerState,
        onClose = onClose,
        closeIcon = movableCloseIcon,
        closeIconPlacement = closeIconPlacement,
        closeIconAlignment = closeIconAlignment,
        peekOffset = peekOffset,
    ) {
        DrawerSurface(
            modifier = if (drawerState.alignment.isHorizontal()) Modifier.fillMaxHeight() else Modifier.fillMaxWidth(),
            style = style,
            interactionSource = interactionSource,
            headerOverlap = closeIconAbsolute && closeIconPlacement == Inner && header == null && closeIcon != null,
            content = {
                var hasFocus by remember { mutableStateOf(false) }
                val focusModifier = if (openOnFocus) {
                    LaunchedEffect(hasFocus) {
                        if (hasFocus) drawerState.open() else drawerState.close()
                    }
                    Modifier
                        .focusGroup()
                        .onFocusChanged { hasFocus = it.hasFocus }
                } else {
                    Modifier
                }

                DrawerContentHeader(
                    closeIcon = movableCloseIcon,
                    closeIconPlacement = closeIconPlacement,
                    closeIconAlignment = closeIconAlignment,
                    closeIconPadding = style.dimensions.closeIconHeaderPadding,
                    modifier = Modifier
                        .layoutId(HEADER)
                        .fillMaxWidth()
                        .then(focusModifier),
                    content = header,
                )

                Box(
                    Modifier
                        .layoutId(BODY)
                        .fillMaxWidth()
                        .then(focusModifier),
                ) {
                    content()
                }

                if (footer != null) {
                    Box(
                        Modifier
                            .layoutId(FOOTER)
                            .fillMaxWidth()
                            .then(focusModifier),
                    ) {
                        footer.invoke()
                    }
                }
            },
        )
    }
}

@Composable
private fun DrawerSurface(
    modifier: Modifier = Modifier,
    style: DrawerStyle,
    headerOverlap: Boolean,
    interactionSource: InteractionSource,
    content: @Composable () -> Unit,
) {
    val background by style.colors.background.getValueAsState(interactionSource)
    val backgroundColor = style.colors.backgroundColor?.colorForInteractionAsState(interactionSource)
    val borderStrokeModifier = if (style.dimensions.strokeWidth.isSpecified) {
        val strokeColor by style.colors.stroke.colorForInteractionAsState(interactionSource)
        Modifier.border(BorderStroke(style.dimensions.strokeWidth, strokeColor), style.shape)
    } else {
        Modifier
    }
    Layout(
        modifier = modifier
            .shadow(style.shadow, style.shape)
            .background(background, backgroundColor?.value, style.shape)
            .then(borderStrokeModifier)
            .padding(style.dimensions.paddings),
        measurePolicy = remember(headerOverlap) { DrawerMeasurePolicy(headerOverlap) },
        content = content,
    )
}

@Composable
private fun DrawerContentHeader(
    closeIcon: (@Composable () -> Unit)?,
    closeIconPlacement: CloseIconPlacement,
    closeIconAlignment: CloseIconAlignment,
    closeIconPadding: Dp,
    modifier: Modifier = Modifier,
    content: (@Composable () -> Unit)?,
) {
    val hasIcon = closeIconPlacement == Inner
    val isIconStart = hasIcon && closeIcon != null && closeIconAlignment == CloseIconAlignment.Start
    val isIconEnd = hasIcon && closeIcon != null && closeIconAlignment == CloseIconAlignment.End
    BaseCell(
        modifier = modifier,
        dimensions = CellDimensions.builder()
            .contentPaddingStart(if (isIconStart) closeIconPadding else 0.dp)
            .contentPaddingEnd(if (isIconEnd) closeIconPadding else 0.dp)
            .build(),
        centerContent = { content?.invoke() },
        startContent = if (isIconStart) {
            { closeIcon?.invoke() }
        } else {
            null
        },
        endContent = if (isIconEnd) {
            { closeIcon?.invoke() }
        } else {
            null
        },
    )
}

@Composable
internal fun DraggableContainer(
    drawerConstraints: Constraints,
    drawerState: DrawerState,
    onClose: () -> Unit,
    peekOffset: Dp,
    closeIcon: @Composable (() -> Unit)?,
    closeIconPlacement: CloseIconPlacement,
    closeIconAlignment: CloseIconAlignment,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    val alignment = drawerState.alignment
    val density = LocalDensity.current
    var draggableSize by remember { mutableStateOf<IntSize?>(null) }
    val peekOffsetPx = with(density) { peekOffset.toPx() }

    LaunchedEffect(alignment, draggableSize) {
        draggableSize?.let { drawerState.updateAnchorsFor(it, peekOffsetPx) }
    }

    val hasIconStart = closeIconPlacement == Outer && closeIconAlignment == CloseIconAlignment.Start
    val hasIconEnd = closeIconPlacement == Outer && closeIconAlignment == CloseIconAlignment.End

    BaseCell(
        modifier = with(density) {
            modifier
                .sizeIn(
                    maxWidth = drawerConstraints.maxWidth.toDp(),
                    maxHeight = drawerConstraints.maxHeight.toDp(),
                )
        }
            .onSizeChanged { size ->
                draggableSize = size
                drawerState.updateAnchorsFor(size, peekOffsetPx)
            }
            .offset {
                alignment.toDrawerOffset(
                    drawerState
                        .requireOffset()
                        .roundToInt(),
                )
            }
            .semantics {
                if (drawerState.isOpen) {
                    dismiss {
                        if (drawerState.confirmStateChange(DrawerValue.Closed)) {
                            onClose()
                        }
                        true
                    }
                }
            }
            .pointerInput(Unit) {},
        startContent = if (hasIconStart) { { closeIcon?.invoke() } } else { null },
        endContent = if (hasIconEnd) { { closeIcon?.invoke() } } else { null },
        gravity = CellGravity.Top,
        centerContent = content,
    )
}

private fun DrawerAlignment.toDrawerOffset(offset: Int): IntOffset {
    return when (this) {
        Start, End -> IntOffset(offset, 0)
        Top, Bottom -> IntOffset(0, offset)
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun DrawerState.updateAnchorsFor(size: IntSize, peekOffset: Float) {
    val drawerSizePx = if (alignment.isHorizontal()) {
        size.width.toFloat()
    } else {
        size.height.toFloat()
    }

    val (closedAnchor, openedAnchor) = when (alignment) {
        Start, Top -> -drawerSizePx + peekOffset to 0f
        End, Bottom -> drawerSizePx - peekOffset to 0f
    }
    val anchors = DraggableAnchors {
        DrawerValue.Closed at closedAnchor
        DrawerValue.Opened at openedAnchor
    }

    val hasAnchors = anchoredDraggableState.anchors.size > 0
    val newTarget = if (!hasAnchors && anchors.hasAnchorFor(currentValue)) {
        currentValue
    } else {
        when (targetValue) {
            DrawerValue.Closed -> DrawerValue.Closed
            DrawerValue.Opened -> {
                val newTarget = if (anchors.hasAnchorFor(DrawerValue.Opened)) {
                    DrawerValue.Opened
                } else {
                    DrawerValue.Closed
                }
                newTarget
            }
        }
    }
    anchoredDraggableState.updateAnchors(anchors, newTarget)
}

private class DrawerMeasurePolicy(private val headerOverlap: Boolean) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val layoutWidth = constraints.maxWidth
        var layoutHeight = constraints.maxHeight
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)

        val header = measurables.find { it.layoutId == HEADER }
        val footer = measurables.find { it.layoutId == FOOTER }
        val body = measurables.find { it.layoutId == BODY }

        val footerPlaceable = footer?.measure(looseConstraints)
        val headerPlaceable = header?.measure(looseConstraints)

        val headerHeight = headerPlaceable.heightOrZero()
        val footerHeight = footerPlaceable.heightOrZero()
        val bodyConstraints = looseConstraints.copy(
            maxHeight = if (headerOverlap) {
                layoutHeight - footerHeight
            } else {
                layoutHeight - headerHeight - footerHeight
            },
        )

        val bodyPlaceable = body?.measure(bodyConstraints)
        val bodyHeight = bodyPlaceable.heightOrZero()
        layoutHeight = (bodyHeight + headerHeight + footerHeight)
            .coerceIn(constraints.minHeight, constraints.maxHeight)
        return layout(
            width = layoutWidth,
            height = layoutHeight,
        ) {
            headerPlaceable?.placeRelative(0, 0)
            bodyPlaceable?.placeRelative(0, if (headerOverlap) 0 else headerHeight)
            footerPlaceable?.placeRelative(0, layoutHeight - footerHeight)
        }
    }
}

internal const val FOOTER = "footer"
internal const val HEADER = "header"
internal const val BODY = "body"
