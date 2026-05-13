package com.sdds.compose.uikit

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.list.ListItemMotionStyle
import com.sdds.compose.uikit.motion.components.list.rememberListItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент ListItem
 *
 * @param modifier модификатор
 * @param titleContent заголовок элемента
 * @param style стиль компонента
 * @param interactionSource источник взаимодействий
 * @param disclosureEnabled включен ли disclosure
 * @param labelContent подпись элемента
 * @param subtitleContent подзаголовок
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param disclosureContent контент в disclosure
 */
@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    titleContent: @Composable () -> Unit,
    style: ListItemStyle = LocalListItemStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    disclosureEnabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    disclosureContent: (@Composable RowScope.() -> Unit) = { ListItemDisclosure(style, interactionSource) },
) {
    ListItem(
        modifier = modifier,
        motion = rememberListItemMotion(motionContext = rememberMotionContext(interactionSource)),
        titleContent = titleContent,
        style = style,
        disclosureEnabled = disclosureEnabled,
        labelContent = labelContent,
        subtitleContent = subtitleContent,
        startContent = startContent,
        endContent = endContent,
        disclosureContent = disclosureContent,
    )
}

/**
 * Компонент ListItem
 *
 * @param modifier модификатор
 * @param motion объект анимаций
 * @param titleContent заголовок элемента
 * @param style стиль компонента
 * @param disclosureEnabled включен ли disclosure
 * @param labelContent подпись элемента
 * @param subtitleContent подзаголовок
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param disclosureContent контент в disclosure
 */
@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    motion: Motion<ListItemMotionStyle>,
    titleContent: @Composable () -> Unit,
    style: ListItemStyle = LocalListItemStyle.current,
    disclosureEnabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    disclosureContent: (@Composable RowScope.() -> Unit) = { ListItemDisclosure(style, motion) },
) {
    val background = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val interactionSource = motion.context.interactionSource
    val paddings = style.dimensions.getPaddingValues(interactionSource)
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .backgroundBrush(
                brushProducer = { background.value },
                shape = style.shape,
            )
            .heightIn(min = style.dimensions.heightValues.getValue(interactionSource))
            .padding(paddings),
        titleContent = titleContent,
        subtitleContent = subtitleContent,
        labelContent = labelContent,
        gravity = CellGravity.Center,
        disclosureContent = disclosureContent.takeIf { disclosureEnabled },
        startContent = startContent,
        endContent = endContent,
        motion = motion,
    )
}

/**
 * Компонент ListItem
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param text текст элемента
 * @param disclosureEnabled включена ли иконка
 * @param disclosureIconRes иконка disclosure
 * @param interactionSource источник взаимодействий
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param label лэйбл
 * @param subtitle сабтайтл
 */
@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    style: ListItemStyle = LocalListItemStyle.current,
    text: String,
    disclosureEnabled: Boolean = false,
    @DrawableRes disclosureIconRes: Int? = style.disclosureIconRes,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    label: String? = null,
    subtitle: String? = null,
    motion: Motion<ListItemMotionStyle> = rememberListItemMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    val paddings = style.dimensions.getPaddingValues(interactionSource)
    Log.d("paddings", "$paddings")
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .backgroundBrush(
                brushProducer = { background.value },
                shape = style.shape,
            )
            .heightIn(min = style.dimensions.heightValues.getValue(interactionSource))
            .padding(paddings),
        title = AnnotatedString(text),
        subtitle = subtitle?.let { AnnotatedString(it) } ?: AnnotatedString(""),
        label = label?.let { AnnotatedString(it) } ?: AnnotatedString(""),
        gravity = CellGravity.Center,
        disclosureContentEnabled = disclosureEnabled,
        disclosureIconRes = disclosureIconRes,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
    )
}

/**
 * Элемент Disclosue для ListItem
 * @param style стиль ListItem
 * @param interactionSource источник взаимодействий
 * @param icon иконка Disclosure
 * @param text текст Disclosure
 */
@Deprecated("Use extension ListItemDisclosure with motion")
@Composable
fun RowScope.ListItemDisclosure(
    style: ListItemStyle = LocalListItemStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: (@Composable () -> Unit)? = null,
    text: (@Composable () -> Unit)? = null,
) {
    if (text != null) {
        ProvideTextStyle(
            style.disclosureTextStyle.getValue(interactionSource),
            color = style.colors.disclosureTextColor.colorForInteraction(interactionSource),
            content = text,
        )
    }

    if (icon != null) {
        CompositionLocalProvider(
            LocalTint provides style.colors.disclosureIconColor.colorForInteraction(interactionSource),
            content = icon,
        )
    }
}

/**
 * Элемент Disclosue для ListItem
 * @param style стиль ListItem
 * @param motion объект анимаций
 * @param icon иконка Disclosure
 * @param text текст Disclosure
 */
@Composable
fun RowScope.ListItemDisclosure(
    style: ListItemStyle = LocalListItemStyle.current,
    motion: Motion<ListItemMotionStyle>,
    icon: (@Composable () -> Unit)? = null,
    text: (@Composable () -> Unit)? = null,
) {
    if (text != null) {
        val textStyle by style.disclosureTextStyle.getTextStyleAsState(
            motion.context,
            motion.style.disclosureTextStyle,
        )
        val textColor = style.colors.disclosureTextBrush.getBrushAsState(
            motion.context,
            motion.style.disclosureTextColor,
        )
        ProvideTextStyle(
            textStyle,
            brush = { textColor.value },
            content = text,
        )
    }

    if (icon != null) {
        val iconColor = style.colors.disclosureIconBrush.getBrushAsState(
            motion.context,
            motion.style.disclosureIconColor,
        )
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
            content = icon,
        )
    }
}

/**
 * Компонент ListItem
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title текст элемента
 * @param disclosureEnabled включена ли иконка
 * @param disclosureIcon иконка
 * @param interactionSource источник взаимодействий
 */
@Composable
@Deprecated("Use ListItem with disclosureIconRes")
fun ListItem(
    modifier: Modifier = Modifier,
    style: ListItemStyle = LocalListItemStyle.current,
    title: String,
    disclosureEnabled: Boolean = false,
    disclosureIcon: Painter? = style.disclosureIcon,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .height(style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
        title = AnnotatedString(title),
        gravity = CellGravity.Center,
        disclosureEnabled = disclosureEnabled,
        disclosureIcon = disclosureIcon,
        interactionSource = interactionSource,
    )
}

@Composable
private fun ListItemStyle.toCellStyle(): CellStyle {
    return CellStyle.builder().apply {
        titleStyle(titleStyles)
        subtitleStyle(subtitleStyles)
        labelStyle(labelStyles)
        disclosureTextStyle(disclosureTextStyle)
        disclosureIconRes?.let { disclosureIcon(it) }
        colors {
            titleBrush(colors.titleBrush)
            subtitleBrush(colors.subtitleBrush)
            labelBrush(colors.labelBrush)
            disclosureIconBrush(colors.disclosureIconBrush)
            disclosureTextBrush(colors.disclosureTextBrush)
        }
        dimensions {
            contentPaddingEnd(dimensions.contentPaddingEnd)
        }
        avatarStyle?.let { avatarStyle(it) }
        iconButtonStyle?.let { iconButtonStyle(it) }
        checkBoxStyle?.let { checkBoxStyle(it) }
        radioBoxStyle?.let { radioBoxStyle(it) }
        switchStyle?.let { switchStyle(it) }
        counterStyle?.let { counterStyle(it) }
    }.style()
}

@Composable
@NonRestartableComposable
private fun RowScope.ListItemDisclosure(
    style: ListItemStyle = LocalListItemStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    ListItemDisclosure(
        style = style,
        interactionSource = interactionSource,
        icon = style.disclosureIconRes?.let {
            @Composable {
                Icon(
                    painter = painterResource(it),
                    contentDescription = "",
                    tint = style.colors.disclosureIconColor.colorForInteraction(
                        interactionSource,
                    ),
                )
            }
        },
    )
}

@Composable
@NonRestartableComposable
private fun RowScope.ListItemDisclosure(
    style: ListItemStyle = LocalListItemStyle.current,
    motion: Motion<ListItemMotionStyle>,
) {
    val iconColor = style.colors.disclosureIconBrush.getBrushAsState(
        motion.context,
        motion.style.disclosureIconColor,
    )
    style.disclosureIconRes?.let { icon ->
        ListItemDisclosure(
            style = style,
            motion = motion,
            icon = {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = "",
                    brush = { iconColor.value },
                )
            },
        )
    }
}

@Composable
private fun ListItemDimensions.getPaddingValues(
    interactionSource: MutableInteractionSource,
) = PaddingValues(
    start = paddingStartValues.getValue(interactionSource),
    top = paddingTopValues.getValue(interactionSource),
    end = paddingEndValues.getValue(interactionSource),
    bottom = paddingBottomValues.getValue(interactionSource),
)

@Composable
@Preview(showBackground = true)
private fun ListItemPreview() {
    ListItem(
        style = ListItemStyle.builder()
            .shape(CircleShape)
            .colors {
                backgroundColor(Color.Transparent)
            }
            .dimensions {
                height(48.dp)
            }
            .style(),
        text = "Title",
    )
}
