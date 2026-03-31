package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.getValue

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
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .heightIn(min = style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
        titleContent = titleContent,
        subtitleContent = subtitleContent,
        labelContent = labelContent,
        gravity = CellGravity.Center,
        disclosureContent = disclosureContent.takeIf { disclosureEnabled },
        startContent = startContent,
        endContent = endContent,
        interactionSource = interactionSource,
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
) {
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .heightIn(min = style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
        title = AnnotatedString(text),
        subtitle = subtitle?.let { AnnotatedString(it) } ?: AnnotatedString(""),
        label = label?.let { AnnotatedString(it) } ?: AnnotatedString(""),
        gravity = CellGravity.Center,
        disclosureContentEnabled = disclosureEnabled,
        disclosureIconRes = disclosureIconRes,
        startContent = startContent,
        endContent = endContent,
        interactionSource = interactionSource,
    )
}

/**
 * Элемент Disclosue для ListItem
 * @param style стиль ListItem
 * @param interactionSource источник взаимодействий
 * @param icon иконка Disclosure
 * @param text текст Disclosure
 */
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
            titleColor(colors.titleColor)
            subtitleColor(colors.subtitleColor)
            labelColor(colors.labelColor)
            disclosureIconColor(colors.disclosureIconColor)
            disclosureTextColor(colors.disclosureTextColor)
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
