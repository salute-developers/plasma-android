package com.sdds.compose.uikit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor

/**
 * AccordionItem.
 * Служит составным элементом для списка Accordion.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param opened состояние открыт/закрыт
 * @param title основной текст
 * @param onClick обработчик нажатия на компонент
 * @param openTransition анимация открытия
 * @param closeTransition анимация закрытия
 * @param iconAnimationSpec спецификация анимации иконки при открытии/закрытии
 * @param interactionSource источник взаимодействий
 * @param content контент
 */
@Composable
fun AccordionItem(
    modifier: Modifier = Modifier,
    style: AccordionItemStyle = LocalAccordionItemStyle.current,
    opened: Boolean = false,
    title: String,
    onClick: () -> Unit = {},
    openTransition: EnterTransition = remember { fadeIn() + expandVertically() },
    closeTransition: ExitTransition = remember { fadeOut() + shrinkVertically() },
    iconAnimationSpec: AnimationSpec<Float>? = remember { spring() },
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    AccordionItem(
        modifier = modifier,
        style = style,
        opened = opened,
        title = title,
        onClick = onClick,
        action = { AccordionAction(opened, style, iconAnimationSpec) },
        openTransition = openTransition,
        closeTransition = closeTransition,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * AccordionItem.
 * Служит составным элементом для списка Accordion.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param opened состояние открыт/закрыт
 * @param title основной текст
 * @param action контент иконки
 * @param onClick обработчик нажатия на компонент
 * @param openTransition анимация открытия
 * @param closeTransition анимация закрытия
 * @param interactionSource источник взаимодействий
 * @param content контент
 */
@Composable
fun AccordionItem(
    modifier: Modifier = Modifier,
    style: AccordionItemStyle = LocalAccordionItemStyle.current,
    opened: Boolean = false,
    title: String,
    onClick: () -> Unit = {},
    action: @Composable () -> Unit,
    openTransition: EnterTransition = fadeIn() + expandVertically(),
    closeTransition: ExitTransition = fadeOut() + shrinkVertically(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .clickable(
                indication = null,
                interactionSource = interactionSource,
            ) { onClick.invoke() },
    ) {
        val iconContent: @Composable RowScope.() -> Unit = {
            CompositionLocalProvider(LocalTint provides style.colors.iconColor.colorForInteraction(interactionSource)) {
                action.invoke()
            }
        }
        Cell(
            modifier = Modifier.padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
            style = cellStyle(
                titleStyle = style.titleStyle,
                titleColor = style.colors.titleColor,
                iconPadding = style.dimensions.iconPadding,
            ),
            title = AnnotatedString(title),
            startContent = startContent(iconContent, style.iconPlacement),
            endContent = endContent(iconContent, style.iconPlacement),
            gravity = CellGravity.Center,
            disclosureContentEnabled = false,
            disclosureIconRes = null,
        )
        AnimatedVisibility(
            visible = opened,
            enter = openTransition,
            exit = closeTransition,
        ) {
            val textColor = style.colors.contentTextColor.colorForInteraction(interactionSource)
            val textStyle = style.contentTextStyle.copy(color = textColor)
            CompositionLocalProvider(LocalTextStyle provides textStyle) {
                Box(
                    modifier = Modifier.padding(
                        start = style.dimensions.contentPaddingStart,
                        end = style.dimensions.contentPaddingEnd,
                        top = style.dimensions.contentPaddingTop,
                        bottom = style.dimensions.contentPaddingBottom,
                    ),
                ) {
                    content.invoke()
                }
            }
        }
    }
}

/**
 * Расположение иконки
 */
enum class AccordionIconPlacement {

    /**
     * Иконка в начале
     */
    Start,

    /**
     * Иконка в конце
     */
    End,
}

@Composable
private fun cellStyle(
    titleStyle: TextStyle,
    titleColor: InteractiveColor,
    iconPadding: Dp,
): CellStyle {
    val builder = remember { CellStyle.builder() }
    return builder
        .titleStyle(titleStyle)
        .colors { titleColor(titleColor) }
        .dimensions {
            contentPaddingStart(iconPadding)
            contentPaddingEnd(iconPadding)
        }
        .style()
}

@Composable
private fun AccordionAction(
    opened: Boolean,
    style: AccordionItemStyle,
    iconAnimationSpec: AnimationSpec<Float>?,
) {
    val transition = iconAnimationState(opened, iconAnimationSpec)
    val iconClosed = style.iconClosed?.let { painterResource(it) }
    val iconOpened = style.iconOpened?.let { painterResource(it) }
    val rotation = style.iconRotation
    Box {
        iconClosed?.let {
            Icon(
                modifier = Modifier
                    .rotate(rotation * transition.value - rotation)
                    .graphicsLayer { alpha = transition.value },
                painter = it,
                contentDescription = "",
            )
        }
        iconOpened?.let {
            Icon(
                modifier = Modifier
                    .rotate(rotation * transition.value)
                    .graphicsLayer { alpha = 1f - transition.value },
                painter = it,
                contentDescription = "",
            )
        }
    }
}

private fun startContent(
    iconContent: @Composable RowScope.() -> Unit,
    iconPlacement: AccordionIconPlacement,
): (@Composable RowScope.() -> Unit)? {
    return when (iconPlacement) {
        AccordionIconPlacement.Start -> iconContent
        AccordionIconPlacement.End -> null
    }
}

private fun endContent(
    iconContent: @Composable RowScope.() -> Unit,
    iconPlacement: AccordionIconPlacement,
): (@Composable RowScope.() -> Unit)? {
    return when (iconPlacement) {
        AccordionIconPlacement.End -> iconContent
        AccordionIconPlacement.Start -> null
    }
}

@Composable
private fun iconAnimationState(
    opened: Boolean,
    iconAnimationSpec: AnimationSpec<Float>?,
): State<Float> = if (iconAnimationSpec == null) {
    rememberUpdatedState(if (opened) 0f else 1f)
} else {
    animateFloatAsState(
        targetValue = if (opened) 0f else 1f,
        animationSpec = iconAnimationSpec,
    )
}
