package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.shadow.shadow

/**
 * Компонент Notification
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param hasClose включение иконки закрытия [closeIcon]
 * @param closeIcon иконка закрытия
 * @param onClose колбэк клика на иконку закрытия [closeIcon]
 * @param interactionSource источник взаимодействий
 * @param content контент
 */
@Composable
fun Notification(
    modifier: Modifier = Modifier,
    style: NotificationStyle = LocalNotificationStyle.current,
    hasClose: Boolean = false,
    closeIcon: Painter? = null,
    onClose: (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable BoxScope.() -> Unit,
) {
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource)
    Box(
        modifier = modifier
            .shadow(style.shadow)
            .background(backgroundColor, style.shape)
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            ),
    ) {
        CompositionLocalProvider(
            LocalNotificationContentStyle provides style.notificationContentStyle,
        ) {
            content()
        }
        if (hasClose && closeIcon != null) {
            val closeSize = style.dimensions.closeSize
            val closeInteractionSource = remember { MutableInteractionSource() }
            val closeColor = style.colors.closeColor.colorForInteraction(closeInteractionSource)
            Icon(
                modifier = Modifier
                    .size(closeSize)
                    .defaultMinSize(closeSize, closeSize)
                    .align(style.closeAlignment.alignment)
                    .clickable(
                        interactionSource = closeInteractionSource,
                        indication = null,
                    ) { onClose?.invoke() },
                painter = closeIcon,
                contentDescription = "",
                tint = closeColor,
            )
        }
    }
}

/**
 * Расположение иконки закрытия в [Notification]
 *
 * @property alignment выравнивание [Alignment]
 */
enum class NotificationCloseAlignment(internal val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopEnd(Alignment.TopEnd),
    CenterStart(Alignment.CenterStart),
    CenterEnd(Alignment.CenterEnd),
}

@Composable
@Preview
private fun NotificationPreview() {
    Notification {
        Text("Notification")
    }
}
