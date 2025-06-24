import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.DropdownMenuColors
import com.sdds.compose.uikit.DropdownMenuDimensions
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalDropdownMenuStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverColors
import com.sdds.compose.uikit.PopoverDimensions
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.popover.BasePopover
import com.sdds.compose.uikit.internal.popover.DefaultPopupProperties

/**
 * Компонент DropdownMenu.
 * Представляет из себя раскрывающееся меню — отображает список пунктов поверх контента.
 *
 * @param opened будет ли открыто меню
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
 * @param content содержимое Popover
 */
@Composable
fun DropdownMenu(
    opened: Boolean,
    modifier: Modifier = Modifier,
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
    content: @Composable () -> Unit,
) {
    BasePopover(
        show = opened,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo,
        colors = style.colors.toPopoverColors(),
        dimensions = style.dimensions.toPopoverDimensions(),
        shape = style.shape,
        shadow = style.shadow,
        placement = placement,
        placementMode = placementMode,
        alignment = alignment,
        triggerCentered = false,
        tailEnabled = false,
        duration = null,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        interactionSource = interactionSource,
    ) {
        val hasBorder = style.dimensions.strokeWidth != 0.dp
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
        ) {
            Box(
                modifier = modifier.then(borderModifier),
            ) {
                content.invoke()
            }
        }
    }
}

private fun DropdownMenuDimensions.toPopoverDimensions(): PopoverDimensions {
    return object : PopoverDimensions {
        override val width = this@toPopoverDimensions.width
        override val offset = this@toPopoverDimensions.offset
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
        DropdownMenu(
            opened = true,
            onDismissRequest = {},
            triggerInfo = TriggerInfo(),
        ) {
            List {
                items(9) { ListItem(title = "title") }
            }
        }
    }
}
