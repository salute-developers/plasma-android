package com.sdds.compose.uikit.mask

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldAnimation
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings

/**
 * Поле ввода текста.
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param mask маска ввода [TextFieldMask]. Например при вводе телефона можно использовать [PhoneMask]
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param placeholderText заглушка если пустое [value] и тип [TextFieldLabelPlacement.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param optionalText текст опционального поля
 * @param prefix текст префикса
 * @param suffix текст суффикса
 * @param startContent иконка, которая будет находиться в начале поля ввода
 * @param endContent иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту.
 * @param animation параметры анимации [TextFieldAnimation]
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param focusSelectorSettings режим отображения фокуса компонента [FocusSelectorSettings]
 * когда [FocusSelectorSettings] != None
 * @param interactionSource источник взаимодействия с полем
 */
@Composable
@NonRestartableComposable
fun MaskedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    mask: TextFieldMask,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
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
    endContent: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    animation: TextFieldAnimation = TextFieldAnimation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    focusSelectorSettings: FocusSelectorSettings,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    TextField(
        value = value,
        onValueChange = { text ->
            onValueChange.invoke(mask.preFilterInput(text))
        },
        modifier = modifier,
        style = style,
        enabled = enabled,
        readOnly = readOnly,
        placeholderText = placeholderText,
        optionalText = optionalText,
        labelText = labelText,
        captionText = captionText,
        counterText = counterText,
        prefix = prefix,
        suffix = suffix,
        startContent = startContent,
        endContent = endContent,
        chipsContent = chipsContent,
        animation = animation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = maskVisualTransformation(
            mask = mask,
            style = style,
            isReadOnly = readOnly,
            interactionSource = interactionSource,
        ),
        focusSelectorSettings = focusSelectorSettings,
        interactionSource = interactionSource,
    )
}

/**
 * Маска для компонента [MaskedTextField].
 */
@Immutable
interface TextFieldMask {

    /**
     * Вернёт трансформацию [VisualTransformation] с учетом основного цвета [mainColor] и цвета подсказки [hintColor]
     */
    fun getVisualTransformation(mainColor: Color, hintColor: Color): VisualTransformation

    /**
     * Фильтрует ввод в [MaskedTextField] до применения трансформации
     *
     * @param text исходный текст
     * @return отфильтрованный текст
     */
    fun preFilterInput(text: String): String = text
}

/**
 * Режим отображения маски
 */
enum class TextFieldMaskMode {
    /**
     * Маска отображается всегда
     */
    Always,

    /**
     * Маска отображается при вводе данных
     */
    OnInput,
}

@Composable
private fun maskVisualTransformation(
    mask: TextFieldMask,
    style: TextFieldStyle,
    isReadOnly: Boolean,
    interactionSource: InteractionSource,
): VisualTransformation {
    val mainColor = style.colors.valueColor(isReadOnly).colorForInteraction(interactionSource)
    val hintColor = style.colors.placeholderColor(isReadOnly).colorForInteraction(interactionSource)
    return mask.getVisualTransformation(mainColor, hintColor)
}
