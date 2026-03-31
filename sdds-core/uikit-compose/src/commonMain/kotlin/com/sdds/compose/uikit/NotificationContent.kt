package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.StyledText

/**
 * Контент для компонента уведомлений [Notification]
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title заголовок
 * @param text текст
 * @param iconRes ресурс иконки
 * @param interactionSource источник взаимодействий
 * @param buttons кнопки уведомления
 */
@Composable
fun NotificationContent(
    modifier: Modifier = Modifier,
    style: NotificationContentStyle = LocalNotificationContentStyle.current,
    title: String = "",
    text: String = "",
    @DrawableRes
    iconRes: Int? = style.icon,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    buttons: (NotificationContentButtonsScope.() -> Unit)? = null,
) {
    Column(modifier = modifier) {
        Content(
            modifier = Modifier
                .padding(
                    start = style.dimensions.contentStartPadding,
                    end = style.dimensions.contentEndPadding,
                    top = style.dimensions.contentTopPadding,
                    bottom = style.dimensions.contentBottomPadding,
                ),
            title = title,
            text = text,
            iconRes = iconRes,
            style = style,
            interactionSource = interactionSource,
        )

        val notificationContentActionScope = remember { NotificationContentButtonsScopeImpl() }
        buttons?.let { notificationContentActionScope.it() }
        ButtonGroup(
            style = style.buttonGroupStyle,
            modifier = Modifier
                .padding(
                    start = style.dimensions.buttonGroupStartPadding,
                    end = style.dimensions.buttonGroupEndPadding,
                    top = style.dimensions.buttonGroupTopPadding,
                    bottom = style.dimensions.buttonGroupBottomPadding,
                ),
        ) {
            val weight = when (style.buttonLayout) {
                NotificationContentButtonLayout.Stretch -> 1f
                NotificationContentButtonLayout.Normal -> null
            }
            notificationContentActionScope.buttons.forEach { buttonContent ->
                button(weight = weight, content = buttonContent)
            }
        }
        notificationContentActionScope.reset()
    }
}

/**
 * Расположение иконки
 */
enum class NotificationContentIconPlacement {

    /**
     * Иконка расположена в начале
     */
    Start,

    /**
     * Иконка расположена сверху
     */
    Top,

    /**
     * Иконка отсутствует
     */
    None,
}

/**
 * Режим размещения кнопок
 */
enum class NotificationContentButtonLayout {

    /**
     * Кнопки занимают всю ширину компонента
     */
    Stretch,

    /**
     * Кнопки имеют ширину по своему контенту
     */
    Normal,
}

/**
 * Cкоуп [NotificationContent]
 */
interface NotificationContentButtonsScope {

    /**
     * Добавляет кнопку [content] в [NotificationContent]
     */
    fun button(content: @Composable () -> Unit)
}

private class NotificationContentButtonsScopeImpl : NotificationContentButtonsScope {
    val buttons = mutableListOf<@Composable () -> Unit>()

    override fun button(content: @Composable () -> Unit) {
        buttons.add(content)
    }

    fun reset() { buttons.clear() }
}

@Composable
private fun Content(
    modifier: Modifier,
    title: String,
    text: String,
    iconRes: Int?,
    style: NotificationContentStyle,
    interactionSource: InteractionSource,
) {
    Column(modifier = modifier) {
        if (style.iconPlacement == NotificationContentIconPlacement.Top && iconRes != null) {
            NotificationIcon(
                modifier = Modifier
                    .padding(bottom = style.dimensions.iconMargin),
                iconRes = iconRes,
                style = style,
                interactionSource = interactionSource,
            )
        }
        Row {
            if (style.iconPlacement == NotificationContentIconPlacement.Start && iconRes != null) {
                NotificationIcon(
                    modifier = Modifier
                        .padding(end = style.dimensions.iconMargin),
                    iconRes = iconRes,
                    style = style,
                    interactionSource = interactionSource,
                )
            }
            TextBox(
                modifier = Modifier.padding(
                    start = style.dimensions.textBoxStartPadding,
                    end = style.dimensions.textBoxEndPadding,
                    top = style.dimensions.textBoxTopPadding,
                    bottom = style.dimensions.textBoxBottomPadding,
                ),
                title = title,
                text = text,
                style = style,
                interactionSource = interactionSource,
            )
        }
    }
}

@Composable
private fun NotificationIcon(
    modifier: Modifier,
    iconRes: Int,
    style: NotificationContentStyle,
    interactionSource: InteractionSource,
) {
    Icon(
        painter = painterResource(iconRes),
        modifier = modifier
            .size(style.dimensions.iconSize)
            .defaultMinSize(style.dimensions.iconSize, style.dimensions.iconSize),
        contentDescription = "",
        tint = style.colors.iconColor.colorForInteraction(interactionSource),
    )
}

@Composable
private fun TextBox(
    modifier: Modifier,
    title: String,
    text: String,
    style: NotificationContentStyle,
    interactionSource: InteractionSource,
) {
    if (title.isEmpty() && text.isEmpty()) return
    Column(
        modifier = modifier,
    ) {
        StyledText(
            text = title,
            textStyle = style.titleStyle,
            textColor = style.colors.titleColor.colorForInteraction(interactionSource),
        )
        StyledText(
            modifier = Modifier.padding(top = style.dimensions.textPadding),
            text = text,
            textStyle = style.textStyle,
            textColor = style.colors.textColor.colorForInteraction(interactionSource),
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun NotificationContentPreview() {
    NotificationContent(
        modifier = Modifier.width(600.dp),
        style = NotificationContentStyle.builder()
            .dimensions {
                textBoxStartPadding(8.dp)
                textBoxEndPadding(8.dp)
                textBoxTopPadding(8.dp)
                textBoxBottomPadding(8.dp)
                textPadding(8.dp)
                contentStartPadding(2.dp)
                contentEndPadding(2.dp)
                contentTopPadding(2.dp)
                contentBottomPadding(2.dp)
                buttonGroupStartPadding(12.dp)
            }
            .colors {
                titleColor(Color.Blue)
                textColor(Color.DarkGray)
                iconColor(Color.Blue)
            }
            .style(),
        title = "Title",
        text = "Some text",
        buttons = {
            button { Button(label = "btn", {}) }
            button { Button(label = "btn", {}) }
        },
    )
}
