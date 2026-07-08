@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings

@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
@Deprecated(
    "Use ComboBoxTextField with ImageSource icons",
    replaceWith = ReplaceWith(
        "ComboBoxTextField(iconOpened = resourceImageSource(iconOpened), iconClosed = resourceImageSource(iconClosed))",
    ),
    level = DeprecationLevel.WARNING,
)
fun ComboBoxScope.ComboBoxTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    @DrawableRes iconOpened: Int?,
    @DrawableRes iconClosed: Int?,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    counterText: String? = null,
    optionalText: String? = null,
    prefix: String? = null,
    suffix: String? = null,
    startContent: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    animation: TextFieldAnimation = TextFieldAnimation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = ComboBoxTextField(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    style = style,
    iconOpened = iconOpened?.let(::resourceImageSource),
    iconClosed = iconClosed?.let(::resourceImageSource),
    enabled = enabled,
    readOnly = readOnly,
    placeholderText = placeholderText,
    labelText = labelText,
    captionText = captionText,
    counterText = counterText,
    optionalText = optionalText,
    prefix = prefix,
    suffix = suffix,
    startContent = startContent,
    chipsContent = chipsContent,
    animation = animation,
    keyboardOptions = keyboardOptions,
    keyboardActions = keyboardActions,
    visualTransformation = visualTransformation,
    focusSelectorSettings = focusSelectorSettings,
    interactionSource = interactionSource,
)

@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
@Deprecated(
    "Use ComboBoxTextField with ImageSource icons",
    replaceWith = ReplaceWith(
        "ComboBoxTextField(iconOpened = resourceImageSource(iconOpened), iconClosed = resourceImageSource(iconClosed))",
    ),
    level = DeprecationLevel.WARNING,
)
fun ComboBoxScope.ComboBoxTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    @DrawableRes iconOpened: Int?,
    @DrawableRes iconClosed: Int?,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    counterText: String? = null,
    optionalText: String? = null,
    prefix: String? = null,
    suffix: String? = null,
    startContent: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    animation: TextFieldAnimation = TextFieldAnimation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = ComboBoxTextField(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    style = style,
    iconOpened = iconOpened?.let(::resourceImageSource),
    iconClosed = iconClosed?.let(::resourceImageSource),
    enabled = enabled,
    readOnly = readOnly,
    placeholderText = placeholderText,
    labelText = labelText,
    captionText = captionText,
    counterText = counterText,
    optionalText = optionalText,
    prefix = prefix,
    suffix = suffix,
    startContent = startContent,
    chipsContent = chipsContent,
    animation = animation,
    keyboardOptions = keyboardOptions,
    keyboardActions = keyboardActions,
    visualTransformation = visualTransformation,
    focusSelectorSettings = focusSelectorSettings,
    interactionSource = interactionSource,
)
