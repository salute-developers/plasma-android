package com.sdds.compose.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.isDisabled
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.interactions.ActivateInteraction
import com.sdds.compose.uikit.interactions.activate
import com.sdds.compose.uikit.interactions.deactivate
import com.sdds.compose.uikit.interactions.tryDeactivate

/**
 * Текстовое поле для ввода и выбора значения, предназначенное для использования внутри [ComboBoxScope].
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента
 * @param style стиль текстового поля
 * @param iconOpened источник иконки, отображаемой когда список открыт
 * @param iconClosed источник иконки, отображаемой когда список закрыт
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если true - ввод текста и открытие списка отключены
 * @param placeholderText текст-подсказка
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param optionalText текст опционального поля
 * @param prefix текст префикса
 * @param suffix текст суффикса
 * @param startContent контент в начале поля ввода
 * @param chipsContent контент с chip-элементами
 * @param animation параметры анимации [TextFieldAnimation]
 * @param keyboardOptions настройки клавиатуры
 * @param keyboardActions обработчики действий клавиатуры
 * @param visualTransformation фильтр визуального отображения
 * @param focusSelectorSettings настройки управления фокусом для селектора
 * @param interactionSource источник взаимодействий с полем
 */
@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
fun ComboBoxScope.ComboBoxTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    iconOpened: ImageSource? = null,
    iconClosed: ImageSource? = null,
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
) {
    val selectState = rememberComboBoxTextFieldState(
        interactionSource = interactionSource,
        readOnly = readOnly,
        focusSelectorSettings = focusSelectorSettings,
    )
    TextField(
        value = value,
        onValueChange = {
            onValueChange(it)
            selectState.open()
        },
        modifier = modifier,
        style = style,
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
        endContent = {
            ComboBoxTextFieldIcon(
                selectState = selectState,
                iconOpened = iconOpened,
                iconClosed = iconClosed,
                enabled = enabled,
                readOnly = readOnly,
            )
        },
        chipsContent = chipsContent,
        animation = animation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        focusSelectorSettings = focusSelectorSettings,
        interactionSource = interactionSource,
    )
}

/**
 * Текстовое поле для ввода и выбора значения, предназначенное для использования внутри [ComboBoxScope].
 *
 * Перегрузка с [TextFieldValue], позволяющая управлять выделением и composition-состоянием.
 */
@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
fun ComboBoxScope.ComboBoxTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    iconOpened: ImageSource? = null,
    iconClosed: ImageSource? = null,
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
) {
    val selectState = rememberComboBoxTextFieldState(
        interactionSource = interactionSource,
        readOnly = readOnly,
        focusSelectorSettings = focusSelectorSettings,
    )
    TextField(
        value = value,
        onValueChange = {
            onValueChange(it)
            selectState.open()
        },
        modifier = modifier,
        style = style,
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
        endContent = {
            ComboBoxTextFieldIcon(
                selectState = selectState,
                iconOpened = iconOpened,
                iconClosed = iconClosed,
                enabled = enabled,
                readOnly = readOnly,
            )
        },
        chipsContent = chipsContent,
        animation = animation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        focusSelectorSettings = focusSelectorSettings,
        interactionSource = interactionSource,
    )
}

@Composable
private fun rememberComboBoxTextFieldState(
    interactionSource: MutableInteractionSource,
    readOnly: Boolean,
    focusSelectorSettings: FocusSelectorSettings,
): SelectState {
    val selectState = LocalSelectState.current
    val isOpened = selectState.isOpened
    val activateInteraction = remember { mutableStateOf<ActivateInteraction.Activate?>(null) }
    DisposableEffect(interactionSource) {
        onDispose {
            activateInteraction.tryDeactivate(interactionSource)
        }
    }
    LaunchedEffect(isOpened) {
        if (!isOpened) {
            activateInteraction.deactivate(interactionSource)
        } else {
            activateInteraction.activate(interactionSource)
        }
    }
    LaunchedEffect(interactionSource, readOnly, focusSelectorSettings) {
        if (!readOnly) {
            interactionSource.interactions
                .collect { interaction ->
                    when (interaction) {
                        is ActivateInteraction.Activate -> {
                            if (focusSelectorSettings.isEnabled()) selectState.open()
                        }

                        is FocusInteraction.Focus -> {
                            if (focusSelectorSettings.isDisabled()) selectState.open()
                        }
                    }
                }
        }
    }
    return selectState
}

@Composable
private fun ComboBoxTextFieldIcon(
    selectState: SelectState,
    iconOpened: ImageSource? = null,
    iconClosed: ImageSource? = null,
    enabled: Boolean,
    readOnly: Boolean,
) {
    val isOpened = selectState.isOpened
    val icon = if (isOpened) iconOpened else iconClosed
    val dismissState = LocalComboBoxDismissState.current
    icon?.let {
        Icon(
            source = icon,
            contentDescription = "",
            modifier = Modifier.clickable(
                indication = null,
                enabled = enabled && !readOnly,
                onClick = {
                    if (selectState.isOpened) {
                        selectState.close()
                    } else if (dismissState?.consumeRecentDismiss() != true) {
                        selectState.open()
                    }
                },
                interactionSource = remember { MutableInteractionSource() },
            ),
        )
    }
}
