package com.sdds.compose.uikit

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.internal.dropdownmenu.BaseDropdownMenu
import com.sdds.compose.uikit.internal.dropdownmenu.BaseModalDropdownMenu
import com.sdds.compose.uikit.internal.dropdownmenu.DefaultModalDropdownDialogProperties
import com.sdds.compose.uikit.internal.dropdownmenu.DefaultModalDropdownPopupProperties
import com.sdds.compose.uikit.internal.platform.painterResource
import com.sdds.compose.uikit.internal.popover.DefaultPopupProperties
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.dropdownmenu.DropdownMenuMotionStyle
import com.sdds.compose.uikit.motion.components.dropdownmenu.rememberDropdownMenuMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

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
    BaseDropdownMenu(
        opened = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = { triggerInfo },
        modifier = modifier,
        style = style,
        clipHeight = clipHeight,
        clipWidth = clipWidth,
        placement = placement,
        placementMode = placementMode,
        positionStrategy = PopoverPositionStrategy.Recalculate,
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
        content = content,
        motion = rememberDropdownMenuMotion(
            motionContext = rememberMotionContext(interactionSource),
        ),
    )
}

/**
 * Компонент DropdownMenu.
 * Представляет собой раскрывающееся меню — отображает список пунктов поверх контента.
 *
 * @param opened будет ли открыто меню
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param triggerInfo информация о размерах и размещении триггера
 * @param safeAreaPadding дополнительные отступы от доступной области экрана для расположения DropdownMenu
 * @param motion параметры анимации компонента
 * @param modifier модификатор
 * @param style стиль компонента
 * @param clipHeight высота DropdownMenu будет ограничена доступным пространством на экране, с учетом клавиатуры
 * @param clipWidth ширина DropdownMenu будет ограничена доступным пространством на экране
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param positionStrategy стратегия пересчета позиции [PopoverPositionStrategy]
 * @param alignment выравнивание компонента относительно триггера
 * @param popupProperties свойства [Popup]
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
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
    safeAreaPadding: PaddingValues,
    modifier: Modifier = Modifier,
    style: DropdownMenuStyle = LocalDropdownMenuStyle.current,
    clipHeight: Boolean = false,
    clipWidth: Boolean = false,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    positionStrategy: PopoverPositionStrategy = PopoverPositionStrategy.Recalculate,
    popupProperties: PopupProperties = remember { DefaultPopupProperties },
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    motion: Motion<DropdownMenuMotionStyle> = rememberDropdownMenuMotion(),
    offset: Dp = style.dimensions.offset,
    scrollState: LazyListState? = null,
    showEmptyState: Boolean = false,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit,
) {
    BaseDropdownMenu(
        opened = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = { triggerInfo },
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
    BaseModalDropdownMenu(
        opened = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo,
        modifier = modifier,
        style = style,
        clipHeight = clipHeight,
        clipWidth = clipWidth,
        placement = placement,
        placementMode = placementMode,
        positionStrategy = PopoverPositionStrategy.Recalculate,
        alignment = alignment,
        dialogProperties = dialogProperties,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        offset = offset,
        scrollState = scrollState,
        showEmptyState = showEmptyState,
        edgeToEdge = edgeToEdge,
        dimBackground = dimBackground,
        emptyState = emptyState,
        header = header,
        footer = footer,
        motion = rememberDropdownMenuMotion(
            motionContext = rememberMotionContext(interactionSource = interactionSource),
        ),
        content = content,
    )
}

/**
 * Модальный вариант DropdownMenu.
 * Представляет собой раскрывающееся меню — отображает список пунктов поверх контента.
 *
 * @param opened будет ли открыто меню
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param triggerInfo информация о размерах и размещении триггера
 * @param safeAreaPadding дополнительные отступы от доступной области экрана для расположения DropdownMenu
 * @param motion параметры анимации компонента
 * @param modifier модификатор
 * @param style стиль компонента
 * @param clipHeight высота DropdownMenu будет ограничена доступным пространством на экране, с учетом клавиатуры
 * @param clipWidth ширина DropdownMenu будет ограничена доступным пространством на экране
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param positionStrategy стратегия пересчета позиции [PopoverPositionStrategy]
 * @param alignment выравнивание компонента относительно триггера
 * @param popupProperties свойства [Popup]
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
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
    safeAreaPadding: PaddingValues,
    modifier: Modifier = Modifier,
    style: DropdownMenuStyle = LocalDropdownMenuStyle.current,
    clipHeight: Boolean = false,
    clipWidth: Boolean = false,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    positionStrategy: PopoverPositionStrategy = PopoverPositionStrategy.Recalculate,
    dialogProperties: DialogProperties = DefaultModalDropdownDialogProperties,
    popupProperties: PopupProperties = DefaultModalDropdownPopupProperties,
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    motion: Motion<DropdownMenuMotionStyle> = rememberDropdownMenuMotion(),
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
    BaseModalDropdownMenu(
        opened = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo,
        modifier = modifier,
        style = style,
        clipHeight = clipHeight,
        clipWidth = clipWidth,
        placement = placement,
        placementMode = placementMode,
        positionStrategy = positionStrategy,
        alignment = alignment,
        dialogProperties = dialogProperties,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        offset = offset,
        scrollState = scrollState,
        showEmptyState = showEmptyState,
        edgeToEdge = edgeToEdge,
        dimBackground = dimBackground,
        emptyState = emptyState,
        header = header,
        footer = footer,
        safeAreaPadding = safeAreaPadding,
        motion = motion,
        content = content,
    )
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
