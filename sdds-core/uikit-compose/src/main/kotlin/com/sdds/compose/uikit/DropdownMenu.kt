package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.popover.BasePopover
import com.sdds.compose.uikit.internal.popover.DefaultPopupProperties
import com.sdds.compose.uikit.internal.widthOrZero

/**
 * Компонент DropdownMenu.
 * Представляет из себя раскрывающееся меню — отображает список пунктов поверх контента.
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
    BasePopover(
        show = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo,
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
                    ScrollableContentWithFooter(
                        listContent = { content.invoke() },
                        footerContent = { footer?.invoke() },
                        scrollBar = { ScrollBarContent(scrollState, style) },
                    )
                }
            }
        }
    }
}

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
private fun ScrollableContentWithFooter(
    modifier: Modifier = Modifier,
    listContent: @Composable () -> Unit,
    footerContent: @Composable () -> Unit,
    scrollBar: @Composable () -> Unit,
) {
    Layout(
        modifier = modifier,
        content = {
            Box(
                modifier = Modifier.layoutId("listContent"),
            ) {
                listContent.invoke()
            }

            Box(modifier = Modifier.layoutId("footerContent")) {
                footerContent.invoke()
            }

            Box(modifier = Modifier.layoutId("scrollbar")) {
                scrollBar.invoke()
            }
        },
    ) { measurables, constraints ->
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val footerPlaceable =
            measurables.find { it.layoutId == "footerContent" }?.measure(looseConstraints)
        val footerHeight = footerPlaceable.heightOrZero()

        val listPlaceable = measurables.find { it.layoutId == "listContent" }?.measure(
            constraints.offset(vertical = -footerHeight),
        )

        val height = listPlaceable.heightOrZero() + footerPlaceable.heightOrZero()

        val scrollBarConstraints = constraints.copy(maxHeight = height)
        val scrollBarPlaceable = measurables
            .find { it.layoutId == "scrollbar" }
            ?.measure(scrollBarConstraints)

        val width = maxOf(
            listPlaceable.widthOrZero(),
            footerPlaceable.widthOrZero(),
        )

        layout(width, height) {
            listPlaceable?.placeRelative(0, 0)
            val footerX = (width - (footerPlaceable.widthOrZero())) / 2
            footerPlaceable?.placeRelative(footerX, height - footerHeight)
            scrollBarPlaceable?.placeRelative(width - (scrollBarPlaceable.width), y = 0)
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
