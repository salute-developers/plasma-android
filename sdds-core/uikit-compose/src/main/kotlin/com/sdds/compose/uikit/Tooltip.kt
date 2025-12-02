package com.sdds.compose.uikit

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.popover.BasePopover
import com.sdds.compose.uikit.internal.popover.DefaultPopupProperties

/**
 * Компонент Tooltip.
 * Представляет из себя всплывающую подсказку, привязанную к какому-либо тригеру.
 *
 * @param show будет ли показан Tooltip
 * @param modifier модификатор для контейнера Tooltip
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне Tooltip либо по истечении [duration]
 * @param triggerInfo информация о размерах и размещении триггера
 * @param style стиль компонента
 * @param contentStart контент в начале
 * @param text текст
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param triggerCentered если true, то компонент будет выравнен относительно триггера таким образом,
 * что указатель будет смотреть на центр триггера
 * @param alignment выравнивание компонента относительно триггера
 * @param tailEnabled включен ли указатель
 * @param duration время, в течение которого будет показан Tooltip.
 * Если null, то компонент будет показываться до принудительного закрытия.
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Tooltip(
    show: Boolean,
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    style: TooltipStyle = LocalTooltipStyle.current,
    contentStart: (@Composable () -> Unit)? = null,
    text: AnnotatedString = AnnotatedString(""),
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    triggerCentered: Boolean = false,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    tailEnabled: Boolean = true,
    duration: Long? = null,
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    if (text.isEmpty() && contentStart == null) return
    BasePopover(
        show = show,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo,
        dimensions = style.dimensions.toPopoverDimensions(),
        colors = style.colors.toPopoverColors(),
        shape = style.shape,
        shadow = style.shadow,
        placement = placement,
        placementMode = placementMode,
        triggerCentered = triggerCentered,
        alignment = alignment,
        tailEnabled = tailEnabled,
        duration = duration,
        popupProperties = DefaultPopupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = modifier.padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            contentStart?.let {
                Box(
                    modifier = Modifier.padding(end = style.dimensions.tailPadding),
                ) {
                    val contentStartColor = style.colors.contentStartColor.colorForInteraction(interactionSource)
                    CompositionLocalProvider(LocalTint provides contentStartColor) {
                        it.invoke()
                    }
                }
            }
            StyledText(
                text = text,
                textStyle = style.textStyle,
                textColor = style.colors.textColor.getValue(interactionSource),
            )
        }
    }
}

private fun TooltipDimensions.toPopoverDimensions(offset: Dp = this.offset): PopoverDimensions {
    return object : PopoverDimensions {
        override val width = 0.dp
        override val offset = offset
        override val tailWidth = this@toPopoverDimensions.tailWidth
        override val tailHeight = this@toPopoverDimensions.tailHeight
        override val tailPadding = this@toPopoverDimensions.tailPadding
    }
}

private fun TooltipColors.toPopoverColors(): PopoverColors {
    return object : PopoverColors {
        override val backgroundColor = this@toPopoverColors.backgroundColor
    }
}
