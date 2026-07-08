@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@Deprecated(
    message = "Use SelectButton with ImageSource icons",
    replaceWith = ReplaceWith(
        expression = "SelectButton(" +
            "startIcon = resourceImageSource(startIcon)," +
            " iconOpened = resourceImageSource(iconOpened), " +
            "iconClosed = resourceImageSource(iconClosed))",
    ),
    level = DeprecationLevel.WARNING,
)
fun SelectScope.SelectButton(
    label: String,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalButtonStyle.current,
    spacing: ButtonSpacing = ButtonSpacing.SpaceBetween,
    enabled: Boolean = true,
    readonly: Boolean = false,
    @DrawableRes startIcon: Int?,
    @DrawableRes iconOpened: Int?,
    @DrawableRes iconClosed: Int?,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = SelectButton(
    label = label,
    modifier = modifier,
    style = style,
    spacing = spacing,
    enabled = enabled,
    readonly = readonly,
    startIcon = startIcon?.let(::resourceImageSource),
    iconOpened = iconOpened?.let(::resourceImageSource),
    iconClosed = iconClosed?.let(::resourceImageSource),
    onClickLabel = onClickLabel,
    interactionSource = interactionSource,
)
