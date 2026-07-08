package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
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
 * @param motion объект анимаций
 * @param modifier модификатор
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
    motion: Motion<ListItemMotionStyle>,
    titleContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
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
    val shape = style.shapes.getValue(interactionSource)
    val paddings = style.dimensions.getPaddingValues(interactionSource)
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .backgroundBrush(
                brushProducer = { background.value },
                shape = shape,
            )
            .heightIn(min = style.dimensions.heightValues.getValue(interactionSource))
            .padding(paddings),
        titleContent = titleContent,
        subtitleContent = subtitleContent,
        labelContent = labelContent,
        gravity = style.gravity,
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
 * @param disclosureIconSource источник иконки disclosure
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
    disclosureIconSource: ImageSource? = null,
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
    val shape = style.shapes.getValue(interactionSource)
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .backgroundBrush(
                brushProducer = { background.value },
                shape = shape,
            )
            .heightIn(min = style.dimensions.heightValues.getValue(interactionSource))
            .padding(paddings),
        title = AnnotatedString(text),
        subtitle = subtitle?.let { AnnotatedString(it) } ?: AnnotatedString(""),
        label = label?.let { AnnotatedString(it) } ?: AnnotatedString(""),
        gravity = style.gravity,
        disclosureContentEnabled = disclosureEnabled,
        disclosureIconSource = disclosureIconSource,
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
@Composable
fun RowScope.ListItemDisclosure(
    style: ListItemStyle = LocalListItemStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: (@Composable () -> Unit)? = null,
    text: (@Composable () -> Unit)? = null,
) {
    if (text != null) {
        val brushState = style.colors.disclosureTextBrush.getValueAsState(interactionSource)
        val style by style.disclosureTextStyle.getValueAsState(interactionSource)
        ProvideTextStyle(
            style,
            brush = { brushState.value },
            content = text,
        )
    }

    if (icon != null) {
        val brushState = style.colors.disclosureIconBrush.getValueAsState(interactionSource)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { brushState.value },
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
    disclosureIcon: Painter? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val background = style.colors.backgroundBrush.getValueAsState(interactionSource)
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .backgroundBrush(
                brushProducer = { background.value },
                shape = style.shapes.getValue(interactionSource),
            )
            .height(style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
        title = AnnotatedString(title),
        gravity = style.gravity,
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
        disclosureIconSource?.let { disclosureIcon(it) }
        colors {
            titleColor(colors.titleBrush)
            subtitleColor(colors.subtitleBrush)
            labelColor(colors.labelBrush)
            disclosureIconColor(colors.disclosureIconBrush)
            disclosureTextColor(colors.disclosureTextBrush)
            contentStartColor(colors.contentStartColor)
            contentEndColor(colors.contentEndColor)
        }
        dimensions {
            contentPaddingEnd(dimensions.contentPaddingEndValues)
            contentPaddingStart(dimensions.contentPaddingStartValues)
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
        icon = style.disclosureIconSource?.let {
            @Composable {
                val brush = style.colors.disclosureIconBrush.getValueAsState(interactionSource)
                Icon(
                    source = it,
                    contentDescription = "",
                    brush = { brush.value },
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
    style.disclosureIconSource?.let { icon ->
        ListItemDisclosure(
            style = style,
            motion = motion,
            icon = {
                val iconColor = style.colors.disclosureIconBrush.getBrushAsState(
                    motion.context,
                    motion.style.disclosureIconColor,
                )
                Icon(
                    source = icon,
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
