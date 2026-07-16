@file:Suppress("LongParameterList")

package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import com.sdds.compose.uikit.fixtures.resourceImageSource
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings

@Composable
fun IconButton(
    iconRes: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
) {
    IconButton(
        iconSource = resourceImageSource(iconRes),
        onClick = onClick,
        modifier = modifier,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
    )
}

@Composable
fun ComboBoxScope.ComboBoxTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    iconOpened: ImageVector? = null,
    iconClosed: ImageVector? = null,
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
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    ComboBoxTextField(
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
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        focusSelectorSettings = focusSelectorSettings,
        interactionSource = interactionSource,
    )
}

@Composable
fun ComboBoxScope.ComboBoxTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    iconOpened: ImageVector? = null,
    iconClosed: ImageVector? = null,
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
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    ComboBoxTextField(
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
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        focusSelectorSettings = focusSelectorSettings,
        interactionSource = interactionSource,
    )
}

@Composable
fun SelectScope.SelectTextField(
    value: String,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    iconOpened: ImageVector? = null,
    iconClosed: ImageVector? = null,
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
) {
    SelectTextField(
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
}

@Composable
fun DropdownScope.EmptyState(
    style: DropdownEmptyStateStyle = LocalDropdownEmptyStateStyle.current,
    iconRes: ImageVector? = null,
    description: String,
    buttonLabel: String? = null,
    onClick: (() -> Unit)? = null,
) {
    EmptyState(
        style = style,
        iconSource = iconRes?.let(::resourceImageSource),
        description = description,
        buttonLabel = buttonLabel,
        onClick = onClick,
    )
}
