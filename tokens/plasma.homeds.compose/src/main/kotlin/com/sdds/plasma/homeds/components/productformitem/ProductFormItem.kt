package com.sdds.plasma.homeds.components.productformitem

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.FormItem

/**
 * Компонент-оболочка с набором вариаций и элементами управления формой.
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier модификатор
 * @param editableModifier модификатор для текстового поля
 * @param style стиль компонента
 * @param caption контент надписи
 * @param counter контент счетчика
 * @param enabled включен ли компонент
 * @param icon иконка справа
 * @param singleLine если false, поле может быть многострочным
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param maxLines максимальное количество строк
 * @param minLines минимальное количество строк
 * @param textAlign выранивание текста
 * @param iconPlacement режим расположения иконки [EditableIconPlacement].
 * @param visualTransformation фильтр визуального отображения [VisualTransformation].
 * @param onTextLayout колбэк, сигнализирующий об окончания лэйаута текста
 * @param interactionSource источник взаимодействий [InteractionSource]
 */
@Composable
fun ProductFormItem(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    editableModifier: Modifier = Modifier,
    style: ProductFormItemStyle = LocalProductFormItemStyle.current,
    caption: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    icon: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    textAlign: TextAlign = TextAlign.Start,
    iconPlacement: EditableIconPlacement = EditableIconPlacement.Absolute,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    FormItem(
        modifier = modifier,
        style = style.formItemStyle,
        caption = caption,
        counter = counter,
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        Editable(
            modifier = editableModifier,
            value = value,
            onValueChange = onValueChange,
            style = style.editableStyle,
            icon = icon,
            singleLine = singleLine,
            readOnly = readOnly,
            enabled = enabled,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            maxLines = maxLines,
            minLines = minLines,
            textAlign = textAlign,
            iconPlacement = iconPlacement,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            onTextLayout = onTextLayout,
        )
    }
}

/**
 * Компонент-оболочка с набором вариаций и элементами управления формой.
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier модификатор
 * @param editableModifier модификатор для текстового поля
 * @param style стиль компонента
 * @param caption контент надписи
 * @param counter контент счетчика
 * @param enabled включен ли компонент
 * @param icon иконка справа
 * @param singleLine если false, поле может быть многострочным
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param maxLines максимальное количество строк
 * @param minLines минимальное количество строк
 * @param textAlign выранивание текста
 * @param iconPlacement режим расположения иконки [EditableIconPlacement].
 * @param visualTransformation фильтр визуального отображения [VisualTransformation].
 * @param onTextLayout колбэк, сигнализирующий об окончания лэйаута текста
 * @param interactionSource источник взаимодействий [InteractionSource]
 */
@Composable
fun ProductFormItem(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    editableModifier: Modifier = Modifier,
    style: ProductFormItemStyle = LocalProductFormItemStyle.current,
    caption: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    icon: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    textAlign: TextAlign = TextAlign.Start,
    iconPlacement: EditableIconPlacement = EditableIconPlacement.Absolute,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    FormItem(
        modifier = modifier,
        style = style.formItemStyle,
        caption = caption,
        counter = counter,
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        Editable(
            modifier = editableModifier,
            value = value,
            onValueChange = onValueChange,
            style = style.editableStyle,
            icon = icon,
            singleLine = singleLine,
            readOnly = readOnly,
            enabled = enabled,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            maxLines = maxLines,
            minLines = minLines,
            textAlign = textAlign,
            iconPlacement = iconPlacement,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            onTextLayout = onTextLayout,
        )
    }
}
