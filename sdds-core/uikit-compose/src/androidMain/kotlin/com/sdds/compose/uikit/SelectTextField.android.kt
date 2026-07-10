@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings

@Composable
@Deprecated(
    "Use SelectTextField with ImageSource icons",
    replaceWith = ReplaceWith(
        "SelectTextField(iconOpened = resourceImageSource(iconOpened), iconClosed = resourceImageSource(iconClosed))",
    ),
    level = DeprecationLevel.WARNING,
)
fun SelectScope.SelectTextField(
    value: String,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    @DrawableRes iconOpened: Int?,
    @DrawableRes iconClosed: Int?,
    readOnly: Boolean = false,
    enabled: Boolean = false,
    placeholderText: String? = null,
    labelText: String? = null,
    captionText: String? = null,
    counterText: String? = null,
    optionalText: String? = null,
    prefix: String? = null,
    suffix: String? = null,
    startContent: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = SelectTextField(
    value = value,
    modifier = modifier,
    style = style,
    iconOpened = iconOpened?.let(::resourceImageSource),
    iconClosed = iconClosed?.let(::resourceImageSource),
    readOnly = readOnly,
    enabled = enabled,
    placeholderText = placeholderText,
    labelText = labelText,
    captionText = captionText,
    counterText = counterText,
    optionalText = optionalText,
    prefix = prefix,
    suffix = suffix,
    startContent = startContent,
    chipsContent = chipsContent,
    focusSelectorSettings = focusSelectorSettings,
    interactionSource = interactionSource,
)

@Composable
@Deprecated(
    "Use SelectTextField with ImageSource icons",
    replaceWith = ReplaceWith(
        "SelectTextField(iconOpened = resourceImageSource(iconOpened), iconClosed = resourceImageSource(iconClosed))",
    ),
    level = DeprecationLevel.WARNING,
)
fun SelectScope.SelectTextField(
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    value: TextFieldValue,
    @DrawableRes iconOpened: Int?,
    @DrawableRes iconClosed: Int?,
    readOnly: Boolean = false,
    enabled: Boolean = false,
    placeholderText: String? = null,
    labelText: String? = null,
    captionText: String? = null,
    counterText: String? = null,
    optionalText: String? = null,
    prefix: String? = null,
    suffix: String? = null,
    startContent: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = SelectTextField(
    modifier = modifier,
    style = style,
    value = value,
    iconOpened = iconOpened?.let(::resourceImageSource),
    iconClosed = iconClosed?.let(::resourceImageSource),
    readOnly = readOnly,
    enabled = enabled,
    placeholderText = placeholderText,
    labelText = labelText,
    captionText = captionText,
    counterText = counterText,
    optionalText = optionalText,
    prefix = prefix,
    suffix = suffix,
    startContent = startContent,
    chipsContent = chipsContent,
    focusSelectorSettings = focusSelectorSettings,
    interactionSource = interactionSource,
)
