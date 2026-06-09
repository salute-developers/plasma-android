package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.graphics.cutout.ProvideCutoutState
import com.sdds.compose.uikit.graphics.cutout.cutout
import com.sdds.compose.uikit.graphics.cutout.cutoutTarget
import com.sdds.compose.uikit.graphics.cutout.rememberCutoutState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.modal.EdgeToEdgeDialog
import com.sdds.compose.uikit.internal.popover.BasePopover
import com.sdds.compose.uikit.internal.popover.DefaultPopupProperties
import com.sdds.compose.uikit.internal.widthOrZero
import androidx.compose.ui.unit.offset as constraintsOffset

/**
 * Компонент DropdownMenu.
 * Представляет собой раскрывающееся меню — отображает список пунктов поверх контента.
 *
 * @param opened будет ли открыто меню
 * @param modifier модификатор
 * @param clipHeight высота DropdownMenu будет ограничена доступным пространством на экране, с учетом клавиатуры
 * @param clipWidth ширина DropdownMenu будет ограничена доступным пространством на экране
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param triggerInfo информация о размерах и размещении триггера
 * @param style стиль компонента
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param alignment выравнивание компонента относительно триггера
 * @param popupProperties свойства [Popup]
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
 * @param interactionSource источник взаимодействий
 * @param scrollState состояния прокрутки [LazyListState]
 * @param emptyState слот для представления пустого состояния
 * @param footer слот для футера. Например для лоадера, индикатора загрузки и т.д.
 * @param content содержимое DropdownMenu
 */
@Composable
@Suppress("LongMethod")
@NonRestartableComposable
fun DropdownMenu(
    opened: Boolean,
    modifier: Modifier = Modifier,
    clipHeight: Boolean = false,
    clipWidth: Boolean = false,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    style: DropdownMenuStyle = LocalDropdownMenuStyle.current,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    popupProperties: PopupProperties = remember { DefaultPopupProperties },
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    offset: Dp = style.dimensions.offset,
    scrollState: LazyListState? = null,
    showEmptyState: Boolean = false,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit,
) {
    DropdownMenu(
        opened = opened,
        modifier = modifier,
        clipHeight = clipHeight,
        clipWidth = clipWidth,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo,
        style = style,
        placement = placement,
        placementMode = placementMode,
        alignment = alignment,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        interactionSource = interactionSource,
        offset = offset,
        scrollState = scrollState,
        showEmptyState = showEmptyState,
        emptyState = emptyState,
        header = null,
        footer = footer,
        content = content,
    )
}

/**
 * Компонент DropdownMenu.
 * Представляет собой раскрывающееся меню — отображает список пунктов поверх контента.
 *
 * @param opened будет ли открыто меню
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param triggerInfo информация о размерах и размещении триггера
 * @param modifier модификатор
 * @param style стиль компонента
 * @param clipHeight высота DropdownMenu будет ограничена доступным пространством на экране, с учетом клавиатуры
 * @param clipWidth ширина DropdownMenu будет ограничена доступным пространством на экране
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param alignment выравнивание компонента относительно триггера
 * @param popupProperties свойства [Popup]
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
 * @param interactionSource источник взаимодействий
 * @param scrollState состояния прокрутки [LazyListState]
 * @param emptyState слот для представления пустого состояния
 * @param footer слот для футера. Например для лоадера, индикатора загрузки и т.д.
 * @param content содержимое DropdownMenu
 */
@Composable
@Suppress("LongMethod")
@NonRestartableComposable
fun DropdownMenu(
    opened: Boolean,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    modifier: Modifier = Modifier,
    style: DropdownMenuStyle = LocalDropdownMenuStyle.current,
    clipHeight: Boolean = false,
    clipWidth: Boolean = false,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    popupProperties: PopupProperties = remember { DefaultPopupProperties },
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    offset: Dp = style.dimensions.offset,
    scrollState: LazyListState? = null,
    showEmptyState: Boolean = false,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit,
) {
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
        alignment = alignment,
        triggerCentered = false,
        tailEnabled = false,
        duration = null,
        clipWidth = clipWidth,
        clipHeight = clipHeight,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        interactionSource = interactionSource,
    ) {
        val hasBorder = style.dimensions.strokeWidth != Dp.Unspecified
        val borderModifier = if (hasBorder) {
            Modifier.border(
                width = style.dimensions.strokeWidth,
                brush = style.colors.strokeColor.getValue(interactionSource),
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
}

/**
 * Модальный вариант DropdownMenu.
 * Представляет собой раскрывающееся меню — отображает список пунктов поверх контента.
 *
 * @param opened будет ли открыто меню
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param triggerInfo информация о размерах и размещении триггера
 * @param modifier модификатор
 * @param style стиль компонента
 * @param clipHeight высота DropdownMenu будет ограничена доступным пространством на экране, с учетом клавиатуры
 * @param clipWidth ширина DropdownMenu будет ограничена доступным пространством на экране
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param alignment выравнивание компонента относительно триггера
 * @param popupProperties свойства [Popup]
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
 * @param interactionSource источник взаимодействий
 * @param scrollState состояния прокрутки [LazyListState]
 * @param showEmptyState отобразить или нет пустое состояние
 * @param edgeToEdge включить/выключить полноэкранный режим (отрисовка под системным UI)
 * @param dimBackground включить/выключить затемнение фона
 * @param emptyState слот для представления пустого состояния
 * @param footer слот для футера. Например для лоадера, индикатора загрузки и т.д.
 * @param content содержимое DropdownMenu
 */
@Composable
@NonRestartableComposable
fun ModalDropdownMenu(
    opened: Boolean,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    modifier: Modifier = Modifier,
    style: DropdownMenuStyle = LocalDropdownMenuStyle.current,
    clipHeight: Boolean = false,
    clipWidth: Boolean = false,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    dialogProperties: DialogProperties = DefaultModalDropdownDialogProperties,
    popupProperties: PopupProperties = DefaultModalDropdownPopupProperties,
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    offset: Dp = style.dimensions.offset,
    scrollState: LazyListState? = null,
    showEmptyState: Boolean = false,
    edgeToEdge: Boolean = true,
    dimBackground: Boolean = true,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
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
        DropdownMenu(
            opened = opened,
            onDismissRequest = onDismissRequest,
            triggerInfo = triggerInfo.asDialogTriggerInfo(),
            modifier = modifier,
            style = style,
            clipHeight = clipHeight,
            clipWidth = clipWidth,
            placement = placement,
            placementMode = placementMode,
            alignment = alignment,
            popupProperties = popupProperties,
            enterTransition = enterTransition,
            exitTransition = exitTransition,
            interactionSource = interactionSource,
            offset = offset,
            scrollState = scrollState,
            showEmptyState = showEmptyState,
            emptyState = emptyState,
            header = header,
            footer = footer,
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
                Box(
                    modifier = Modifier
                        .offset {
                            val location = IntArray(2)
                            dialogView.getLocationOnScreen(location)
                            IntOffset(
                                x = triggerInfo.positionInScreen.x - location[0],
                                y = triggerInfo.positionInScreen.y - location[1],
                            )
                        }
                        .requiredSize(
                            width = with(density) { triggerInfo.size.width.toDp() },
                            height = with(density) { triggerInfo.size.height.toDp() },
                        )
                        .cutout(shape = triggerInfo.cutoutShape, triggerInfo.cutoutPaddings)
                        .alpha(0f),
                )
            }
        }
    }
}

private fun TriggerInfo.asDialogTriggerInfo(): TriggerInfo = copy(
    positionInRoot = positionInScreen,
)

private val DefaultModalDropdownDialogProperties = DialogProperties(
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

/**
 * Скоуп компонента [DropdownMenu]
 */
interface DropdownScope

/**
 * Представление пустого состояния [DropdownMenu]
 *
 * @param style стиль компонента
 * @param iconRes ресурс иконки
 * @param description описание
 * @param buttonLabel текст кнопки действия
 * @param onClick обработчик кнопки действия
 */
@Composable
fun DropdownScope.EmptyState(
    style: DropdownEmptyStateStyle = LocalDropdownEmptyStateStyle.current,
    @DrawableRes iconRes: Int? = null,
    description: String,
    buttonLabel: String? = null,
    onClick: (() -> Unit)? = null,
) {
    EmptyState(
        image = if (iconRes != null) {
            {
                Icon(
                    painter = painterResource(id = iconRes),
                    contentDescription = null,
                )
            }
        } else {
            null
        },
        description = if (description.isNotEmpty()) {
            {
                Text(text = description)
            }
        } else {
            null
        },
        button = if (!buttonLabel.isNullOrEmpty()) {
            {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    label = buttonLabel,
                    onClick = { onClick?.invoke() },
                )
            }
        } else {
            null
        },
    )
}

/**
 * Представление пустого состояния [DropdownMenu]
 *
 * @param style стиль компонента
 * @param image изображение
 * @param description описание
 * @param button кнопка действия
 */
@Composable
fun DropdownScope.EmptyState(
    style: DropdownEmptyStateStyle = LocalDropdownEmptyStateStyle.current,
    image: (@Composable () -> Unit)? = null,
    description: (@Composable () -> Unit)? = null,
    button: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val interactionSource = remember { MutableInteractionSource() }
        image?.let {
            CompositionLocalProvider(
                LocalTint provides style.colors.iconColor.colorForInteraction(interactionSource),
            ) {
                Box { image.invoke() }
            }
        }
        description?.let {
            CompositionLocalProvider(
                LocalTextStyle provides style.descriptionStyle
                    .copy(style.colors.descriptionColor.colorForInteraction(interactionSource)),
            ) {
                Box(
                    Modifier.padding(top = style.dimensions.descriptionPadding),
                ) { description.invoke() }
            }
        }
        val buttonStyle = style.buttonStyle
        if (button != null && buttonStyle != null) {
            CompositionLocalProvider(LocalButtonStyle provides buttonStyle) {
                Box { button.invoke() }
            }
        }
    }
}

private object DropdownScopeImpl : DropdownScope

@Composable
private fun BoxScope.ScrollBarContent(scrollState: LazyListState?, style: DropdownMenuStyle) {
    if (scrollState != null && (scrollState.canScrollForward || scrollState.canScrollBackward)) {
        ScrollBar(
            modifier = Modifier
                .padding(
                    top = style.dimensions.scrollBarPaddingTop,
                    bottom = style.dimensions.scrollBarPaddingBottom,
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
