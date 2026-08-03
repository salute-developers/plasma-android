@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@Deprecated(
    "Use NotificationContent with iconSource",
    replaceWith = ReplaceWith("NotificationContent(iconSource = resourceImageSource(iconRes))"),
    level = DeprecationLevel.WARNING,
)
fun NotificationContent(
    modifier: Modifier = Modifier,
    style: NotificationContentStyle = LocalNotificationContentStyle.current,
    title: String = "",
    text: String = "",
    @DrawableRes iconRes: Int?,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    buttons: (NotificationContentButtonsScope.() -> Unit)? = null,
) = NotificationContent(
    modifier = modifier,
    style = style,
    title = title,
    text = text,
    iconSource = iconRes?.let(::resourceImageSource),
    interactionSource = interactionSource,
    buttons = buttons,
)
