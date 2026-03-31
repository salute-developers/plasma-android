package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.isDisabled
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.interactions.ActivateInteraction
import com.sdds.compose.uikit.interactions.activate
import com.sdds.compose.uikit.interactions.deactivate
import com.sdds.compose.uikit.interactions.tryDeactivate
import com.sdds.compose.uikit.internal.textfield.BaseTextField

/**
 * Компонент текстового поля для выбора, предназначенный для использования внутри [SelectScope].
 * Упрощенная версия с базовым строковым значением.
 *
 * @param value Текущее значение текстового поля в виде строки
 * @param modifier Модификатор для настройки внешнего вида и поведения компонента
 * @param style Стиль текстового поля, определяющий его визуальное оформление
 * @param iconOpened Ресурс иконки, отображаемой когда селектор открыт (в виде drawable ресурса)
 * @param iconClosed Ресурс иконки, отображаемой когда селектор закрыт (в виде drawable ресурса)
 * @param readOnly Флаг, определяющий возможность открытия селектора
 * @param enabled Флаг, определяющий доступность компонента для взаимодействия
 * @param placeholderText Текст-подсказка, отображаемый когда поле пустое
 * @param labelText Текст метки, отображаемый над полем ввода
 * @param captionText Дополнительный пояснительный текст под полем ввода
 * @param counterText Текст счетчика, отображаемый в правой части под полем
 * @param optionalText Текст, указывающий на необязательность поля (например, "Опционально")
 * @param prefix Текст префикса, отображаемый перед значением
 * @param suffix Текст суффикса, отображаемый после значения
 * @param startContent Кастомный контент, отображаемый в начале поля ввода
 * @param chipsContent Кастомный контент для отображения чипсов внутри поля
 * @param focusSelectorSettings Настройки управления фокусом для селектора
 * @param interactionSource Источник взаимодействий для отслеживания состояний компонента
 */
@Composable
fun SelectScope.SelectTextField(
    value: String,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    @DrawableRes
    iconOpened: Int? = null,
    @DrawableRes
    iconClosed: Int? = null,
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
    val textFieldValue = TextFieldValue(value)

    SelectTextField(
        modifier = modifier,
        style = style,
        value = textFieldValue,
        iconOpened = iconOpened,
        iconClosed = iconClosed,
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

/**
 * Компонент текстового поля для выбора, предназначенный для использования внутри [SelectScope].
 * Упрощенная версия с базовым строковым значением.
 *
 * @param value Текущее значение текстового поля в виде строки
 * @param modifier Модификатор для настройки внешнего вида и поведения компонента
 * @param style Стиль текстового поля, определяющий его визуальное оформление
 * @param iconOpened Ресурс иконки, отображаемой когда селектор открыт (в виде drawable ресурса)
 * @param iconClosed Ресурс иконки, отображаемой когда селектор закрыт (в виде drawable ресурса)
 * @param readOnly Флаг, определяющий возможность открытия селектора
 * @param enabled Флаг, определяющий доступность компонента для взаимодействия
 * @param placeholderText Текст-подсказка, отображаемый когда поле пустое
 * @param labelText Текст метки, отображаемый над полем ввода
 * @param captionText Дополнительный пояснительный текст под полем ввода
 * @param counterText Текст счетчика, отображаемый в правой части под полем
 * @param optionalText Текст, указывающий на необязательность поля (например, "Опционально")
 * @param prefix Текст префикса, отображаемый перед значением
 * @param suffix Текст суффикса, отображаемый после значения
 * @param startContent Кастомный контент, отображаемый в начале поля ввода
 * @param chipsContent Кастомный контент для отображения чипсов внутри поля
 * @param focusSelectorSettings Настройки управления фокусом для селектора
 * @param interactionSource Источник взаимодействий для отслеживания состояний компонента
 */
@Composable
fun SelectScope.SelectTextField(
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    value: TextFieldValue,
    @DrawableRes
    iconOpened: Int? = null,
    @DrawableRes
    iconClosed: Int? = null,
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
    LaunchedEffect(interactionSource) {
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
    Box {
        BaseTextField(
            modifier = modifier,
            style = style,
            value = value,
            onValueChange = {},
            labelText = labelText,
            placeholderText = placeholderText,
            captionText = captionText,
            counterText = counterText,
            optionalText = optionalText,
            prefix = prefix,
            suffix = suffix,
            startContent = startContent,
            readOnly = readOnly,
            enabled = enabled,
            fakeTextField = true,
            endContent = {
                val icon = if (isOpened) iconOpened else iconClosed
                icon?.let { Icon(painterResource(icon), contentDescription = "") }
            },
            focusSelectorSettings = focusSelectorSettings,
            chipsContent = chipsContent,
            interactionSource = interactionSource,
            onDecorationBoxClicked = { if (!readOnly) selectState.toggle() },
        )
    }
}
