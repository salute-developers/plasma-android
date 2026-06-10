package com.sdds.compose.uikit.internal.dropdownmenu

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.DropdownMenuColors
import com.sdds.compose.uikit.DropdownMenuDimensions
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownScope
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalDropdownEmptyStateStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalScrollBarStyle
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverColors
import com.sdds.compose.uikit.PopoverDimensions
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.PopoverPositionStrategy
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.graphics.cutout.ProvideCutoutState
import com.sdds.compose.uikit.graphics.cutout.cutout
import com.sdds.compose.uikit.graphics.cutout.cutoutTarget
import com.sdds.compose.uikit.graphics.cutout.rememberCutoutState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.modal.EdgeToEdgeDialog
import com.sdds.compose.uikit.internal.popover.BasePopover
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.dropdownmenu.DropdownMenuMotionStyle
import com.sdds.compose.uikit.motion.components.dropdownmenu.rememberDropdownMenuMotion
import androidx.compose.ui.unit.offset as constraintsOffset

@Composable
@Suppress("LongMethod")
@NonRestartableComposable
internal fun BaseDropdownMenu(
    opened: Boolean,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    modifier: Modifier = Modifier,
    style: DropdownMenuStyle,
    clipHeight: Boolean,
    clipWidth: Boolean,
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    positionStrategy: PopoverPositionStrategy,
    alignment: PopoverAlignment,
    popupProperties: PopupProperties,
    enterTransition: EnterTransition,
    exitTransition: ExitTransition,
    offset: Dp,
    scrollState: LazyListState?,
    showEmptyState: Boolean,
    emptyState: (@Composable DropdownScope.() -> Unit)?,
    header: (@Composable () -> Unit)?,
    footer: (@Composable () -> Unit)?,
    safeAreaPadding: PaddingValues = PaddingValues(0.dp),
    motion: Motion<DropdownMenuMotionStyle> = rememberDropdownMenuMotion(),
    content: @Composable () -> Unit,
) {
    val popoverContent: @Composable () -> Unit = {
        val hasBorder = style.dimensions.strokeWidth != Dp.Unspecified
        val borderModifier = if (hasBorder) {
            Modifier.border(
                width = style.dimensions.strokeWidth,
                brush = style.colors.strokeColor.getValueAsState(motion.context).value,
                shape = style.shape,
            )
        } else {
            Modifier
        }
        CompositionLocalProvider(
            LocalListStyle provides style.listStyle,
            LocalDividerStyle provides style.dividerStyle,
            LocalDropdownEmptyStateStyle provides style.emptyStateStyle,
            LocalScrollBarStyle provides style.scrollBarStyle,
        ) {
            Box(
                modifier = modifier
                    .then(borderModifier)
                    .padding(
                        start = style.dimensions.paddingStart,
                        end = style.dimensions.paddingEnd,
                        top = style.dimensions.paddingTop,
                        bottom = style.dimensions.paddingBottom,
                    ),
            ) {
                if (showEmptyState && emptyState != null) {
                    DropdownScopeImpl.emptyState()
                } else {
                    ScrollableContentWithHeaderFooter(
                        listContent = { content.invoke() },
                        headerContent = { header?.invoke() },
                        footerContent = { footer?.invoke() },
                        scrollBar = { ScrollBarContent(scrollState, style) },
                    )
                }
            }
        }
    }
    BasePopover(
        show = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = { triggerInfo },
        colors = style.colors.toPopoverColors(),
        dimensions = style.dimensions.toPopoverDimensions(offset),
        shape = style.shape,
        shadow = style.shadow,
        placement = placement,
        placementMode = placementMode,
        positionStrategy = positionStrategy,
        alignment = alignment,
        triggerCentered = false,
        tailEnabled = false,
        duration = null,
        clipWidth = clipWidth,
        clipHeight = clipHeight,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        safeAreaPadding = safeAreaPadding,
        motion = motion,
        content = popoverContent,
    )
}

@Composable
@NonRestartableComposable
internal fun BaseModalDropdownMenu(
    opened: Boolean,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    modifier: Modifier = Modifier,
    style: DropdownMenuStyle,
    clipHeight: Boolean,
    clipWidth: Boolean,
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    positionStrategy: PopoverPositionStrategy,
    alignment: PopoverAlignment,
    dialogProperties: DialogProperties,
    popupProperties: PopupProperties,
    enterTransition: EnterTransition,
    exitTransition: ExitTransition,
    offset: Dp,
    scrollState: LazyListState?,
    showEmptyState: Boolean,
    edgeToEdge: Boolean,
    dimBackground: Boolean,
    emptyState: (@Composable DropdownScope.() -> Unit)?,
    header: (@Composable () -> Unit)?,
    footer: (@Composable () -> Unit)?,
    safeAreaPadding: PaddingValues = PaddingValues(0.dp),
    motion: Motion<DropdownMenuMotionStyle> = rememberDropdownMenuMotion(),
    content: @Composable () -> Unit,
) {
    val visibleState = remember { MutableTransitionState(false) }
    visibleState.targetState = opened
    if (!visibleState.currentState && !visibleState.targetState && visibleState.isIdle) return
    EdgeToEdgeDialog(
        onDismissRequest = onDismissRequest,
        dialogProperties = dialogProperties,
        edgeToEdge = edgeToEdge,
        useNativeBlackout = false,
        lightAppearance = false,
    ) {
        if (dimBackground) {
            ModalDropdownMenuContent(
                visibleState = visibleState,
                onDismissRequest = onDismissRequest,
                triggerInfo = triggerInfo,
                overlayStyle = style.overlayStyle,
                enterTransition = enterTransition,
                exitTransition = exitTransition,
            )
        }
        BaseDropdownMenu(
            opened = opened,
            onDismissRequest = onDismissRequest,
            triggerInfo = triggerInfo.asDialogTriggerInfo(),
            modifier = modifier,
            style = style,
            clipHeight = clipHeight,
            clipWidth = clipWidth,
            placement = placement,
            placementMode = placementMode,
            positionStrategy = positionStrategy,
            alignment = alignment,
            popupProperties = popupProperties,
            enterTransition = enterTransition,
            exitTransition = exitTransition,
            offset = offset,
            scrollState = scrollState,
            showEmptyState = showEmptyState,
            emptyState = emptyState,
            header = header,
            footer = footer,
            safeAreaPadding = safeAreaPadding,
            motion = motion,
            content = content,
        )
    }
}

@Composable
private fun ModalDropdownMenuContent(
    visibleState: MutableTransitionState<Boolean>,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    overlayStyle: OverlayStyle,
    enterTransition: EnterTransition,
    exitTransition: ExitTransition,
) {
    val cutoutState = rememberCutoutState()
    val density = LocalDensity.current
    val dialogView = LocalView.current.rootView
    ProvideCutoutState(cutoutState) {
        AnimatedVisibility(
            visibleState = visibleState,
            enter = enterTransition,
            exit = exitTransition,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(onDismissRequest) {
                        detectTapGestures(onTap = { onDismissRequest() })
                    }
                    .semantics(mergeDescendants = true) {
                        contentDescription = CLOSE_DROPDOWN_MENU_DESCRIPTION
                        onClick {
                            onDismissRequest()
                            true
                        }
                    },
            ) {
                Overlay(
                    modifier = Modifier
                        .fillMaxSize()
                        .cutoutTarget(),
                    style = overlayStyle,
                )
                val dialogLocation = IntArray(2)
                dialogView.getLocationOnScreen(dialogLocation)
                val visibleCutoutBounds = triggerInfo.visibleBoundsInScreen
                    ?.toDialogBounds(dialogLocation)
                val cutoutEnabled = visibleCutoutBounds
                    ?.let { it.width > 0f && it.height > 0f }
                    ?: true
                if (cutoutEnabled) {
                    Box(
                        modifier = Modifier
                            .offset {
                                IntOffset(
                                    x = triggerInfo.positionInScreen.x - dialogLocation[0],
                                    y = triggerInfo.positionInScreen.y - dialogLocation[1],
                                )
                            }
                            .requiredSize(
                                width = with(density) { triggerInfo.size.width.toDp() },
                                height = with(density) { triggerInfo.size.height.toDp() },
                            )
                            .cutout(
                                shape = triggerInfo.cutoutShape,
                                padding = triggerInfo.cutoutPaddings,
                                enabled = true,
                                state = null,
                                clipBoundsInRoot = visibleCutoutBounds,
                            )
                            .alpha(0f),
                    )
                }
            }
        }
    }
}

private fun Rect.toDialogBounds(dialogLocation: IntArray): Rect = Rect(
    left = left - dialogLocation[0],
    top = top - dialogLocation[1],
    right = right - dialogLocation[0],
    bottom = bottom - dialogLocation[1],
)

private fun TriggerInfo.asDialogTriggerInfo(): TriggerInfo = copy(
    positionInRoot = positionInScreen,
)

internal val DefaultModalDropdownDialogProperties = DialogProperties(
    usePlatformDefaultWidth = false,
    decorFitsSystemWindows = false,
    dismissOnClickOutside = false,
)

internal val DefaultModalDropdownPopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = true,
    usePlatformDefaultWidth = false,
)

private const val CLOSE_DROPDOWN_MENU_DESCRIPTION = "Close DropdownMenu"

private object DropdownScopeImpl : DropdownScope

@Composable
private fun BoxScope.ScrollBarContent(scrollState: LazyListState?, style: DropdownMenuStyle) {
    if (scrollState != null && (scrollState.canScrollForward || scrollState.canScrollBackward)) {
        com.sdds.compose.uikit.ScrollBar(
            modifier = Modifier
                .padding(
                    top = style.dimensions.scrollBarPaddingTop,
                    bottom = style.dimensions.scrollBarPaddingTop,
                )
                .align(Alignment.CenterEnd),
            style = style.scrollBarStyle,
            scrollState = scrollState,
            orientation = Orientation.Vertical,
            hasTrack = true,
            alwaysShowScrollbar = false,
        )
    }
}

@Composable
private fun ScrollableContentWithHeaderFooter(
    modifier: Modifier = Modifier,
    listContent: @Composable () -> Unit,
    headerContent: @Composable () -> Unit,
    footerContent: @Composable () -> Unit,
    scrollBar: @Composable () -> Unit,
) {
    Layout(
        modifier = modifier,
        content = {
            Box(
                modifier = Modifier.layoutId(LIST_CONTENT_ID),
            ) {
                listContent.invoke()
            }

            Box(modifier = Modifier.layoutId(HEADER_ID)) {
                headerContent.invoke()
            }

            Box(modifier = Modifier.layoutId(FOOTER_ID)) {
                footerContent.invoke()
            }

            Box(modifier = Modifier.layoutId(SCROLLBAR_ID)) {
                scrollBar.invoke()
            }
        },
    ) { measurables, constraints ->
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val footerPlaceable =
            measurables.find { it.layoutId == FOOTER_ID }?.measure(looseConstraints)
        val footerHeight = footerPlaceable.heightOrZero()

        val headerPlaceable =
            measurables.find { it.layoutId == HEADER_ID }?.measure(looseConstraints)
        val headerHeight = headerPlaceable.heightOrZero()

        val listPlaceable = measurables.find { it.layoutId == LIST_CONTENT_ID }?.measure(
            constraints.constraintsOffset(vertical = -footerHeight - headerHeight),
        )

        val height = listPlaceable.heightOrZero() + footerPlaceable.heightOrZero() + headerPlaceable.heightOrZero()

        val scrollBarConstraints = constraints.copy(maxHeight = listPlaceable.heightOrZero())
        val scrollBarPlaceable = measurables
            .find { it.layoutId == SCROLLBAR_ID }
            ?.measure(scrollBarConstraints)

        val width = maxOf(
            listPlaceable.widthOrZero(),
            footerPlaceable.widthOrZero(),
            headerPlaceable.widthOrZero(),
        )

        layout(width, height) {
            headerPlaceable?.placeRelative(0, 0)
            listPlaceable?.placeRelative(0, headerPlaceable.heightOrZero())
            val footerX = (width - (footerPlaceable.widthOrZero())) / 2
            footerPlaceable?.placeRelative(footerX, height - footerHeight)
            scrollBarPlaceable?.placeRelative(width - (scrollBarPlaceable.width), y = headerPlaceable.heightOrZero())
        }
    }
}

private fun DropdownMenuDimensions.toPopoverDimensions(offset: Dp = this.offset): PopoverDimensions {
    return object : PopoverDimensions {
        override val width = this@toPopoverDimensions.width
        override val offset = offset
        override val tailWidth = 0.dp
        override val tailHeight = 0.dp
        override val tailPadding = 0.dp
    }
}

private fun DropdownMenuColors.toPopoverColors(): PopoverColors {
    return object : PopoverColors {
        override val backgroundColor = this@toPopoverColors.backgroundColor
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = false,
)
private fun DropdownMenuPreview() {
    Box(Modifier.fillMaxSize()) {
        val scrollState = rememberLazyListState()
        DropdownMenu(
            opened = true,
            onDismissRequest = {},
            triggerInfo = TriggerInfo(),
            scrollState = scrollState,
        ) {
            List(state = scrollState) {
                items(9) { ListItem(text = "title") }
            }
        }
    }
}

private const val LIST_CONTENT_ID = "list_content"
private const val HEADER_ID = "header_content"
private const val FOOTER_ID = "footer_content"
private const val SCROLLBAR_ID = "scrollbar_content"
