package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.textarea.BaseTextArea

/**
 * Многострочное поле ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [TextField.FieldType])
 * @param labelType тип отображения лэйбла: [TextField.LabelType.Outer] снаружи поля ввода, [TextField.LabelType.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика
 * @param icon иконка, которая будет находиться в конце поля ввода
 * @param chips контент с chip-элементами
 * @param outerLabelStyle стиль лэйбла в режиме [labelType] == [TextField.LabelType.Outer]
 * @param innerLabelStyle стиль лэйбла в режиме [labelType] == [TextField.LabelType.Inner]
 * @param valuesStyle стиль value
 * @param captionStyle стиль caption
 * @param placeHolderStyle стиль placeholder
 * @param counterStyle стиль counter
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param chipsSpacing пространство между чипами
 * @param startContentPadding отступ в начале текстового поля
 * @param endContentPadding отступ в конце текстового поля
 * @param iconStartPadding отступ от текста до иконки
 * @param textTopPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [TextField.LabelType.Inner]
 * @param textBottomPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [TextField.LabelType.Inner]
 * @param innerLabelToValuePadding отступ между лэйблом и value в режиме [labelType] == [TextField.LabelType.Inner]
 * @param outerLabelBottomPadding отступ между лэйблом и текстовым полем в режиме [labelType] == [TextField.LabelType.Outer]
 * @param bottomTextBottomPadding отступ между текстовым полем и нижним текстом (caption и counter)
 * @param iconTopPadding отступ иконки сверху
 * @param iconSize размер иконки
 * @param animation параметры анимации [TextField.Animation]
 * @param keepDotBadgeStartPadding позволяет выставить отступ слева, для случаев, когда нужно сохранить отступ, эквивалентный ширине индикатора обязательного поля.
 * Например, когда TextField используется в списке и состояние [fieldType] меняется у разных элементов,
 * может появиться необходимость сохранить отступ слева, когда индикатор обзательного поля скрывается.
 * @param scrollBarConfig настройки скроллбара
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param interactionSource источник взаимодействия с полем
 */
@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
fun TextArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldType: TextField.FieldType? = null,
    labelType: TextField.LabelType = TextField.LabelType.Outer,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    counterText: String? = null,
    icon: @Composable (() -> Unit)? = null,
    chips: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    valuesStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    counterStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape = RoundedCornerShape(25),
    chipsSpacing: Dp = 2.dp,
    startContentPadding: Dp = 16.dp,
    endContentPadding: Dp = 16.dp,
    iconStartPadding: Dp = 8.dp,
    textTopPadding: Dp = 25.dp,
    textBottomPadding: Dp = 9.dp,
    innerLabelToValuePadding: Dp = 2.dp,
    outerLabelBottomPadding: Dp = 12.dp,
    bottomTextBottomPadding: Dp = 4.dp,
    iconTopPadding: Dp = 16.dp,
    iconSize: Dp = 24.dp,
    keepDotBadgeStartPadding: Dp? = 16.dp,
    animation: TextField.Animation = TextField.Animation(),
    scrollBarConfig: ScrollBarConfig = ScrollBarConfig(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseTextArea(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        fieldType = fieldType,
        labelType = labelType,
        placeholderText = placeholderText,
        labelText = labelText,
        captionText = captionText,
        counterText = counterText,
        counterStyle = counterStyle,
        icon = icon,
        outerLabelStyle = outerLabelStyle,
        innerLabelStyle = innerLabelStyle,
        valuesStyle = valuesStyle,
        captionStyle = captionStyle,
        placeHolderStyle = placeHolderStyle,
        backgroundColor = backgroundColor,
        cursorColor = cursorColor,
        enabledAlpha = enabledAlpha,
        disabledAlpha = disabledAlpha,
        shape = shape,
        startContentPadding = startContentPadding,
        endContentPadding = endContentPadding,
        iconStartPadding = iconStartPadding,
        textTopPadding = textTopPadding,
        textBottomPadding = textBottomPadding,
        innerLabelToValuePadding = innerLabelToValuePadding,
        outerLabelBottomPadding = outerLabelBottomPadding,
        bottomTextBottomPadding = bottomTextBottomPadding,
        iconSize = iconSize,
        animation = animation,
        keepDotBadgeStartPadding = keepDotBadgeStartPadding,
        chips = chips,
        chipsSpacing = chipsSpacing,
        iconTopPadding = iconTopPadding,
        scrollBarConfig = scrollBarConfig,
        interactionSource = interactionSource,
    )
}

/**
 * Многострочное поле ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [TextField.FieldType])
 * @param labelType тип отображения лэйбла: [TextField.LabelType.Outer] снаружи поля ввода, [TextField.LabelType.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика
 * @param icon иконка, которая будет находиться в конце поля ввода
 * @param chips контент с chip-элементами
 * @param outerLabelStyle стиль лэйбла в режиме [labelType] == [TextField.LabelType.Outer]
 * @param innerLabelStyle стиль лэйбла в режиме [labelType] == [TextField.LabelType.Inner]
 * @param valuesStyle стиль value
 * @param captionStyle стиль caption
 * @param placeHolderStyle стиль placeholder
 * @param counterStyle стиль counter
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param chipsSpacing пространство между чипами
 * @param startContentPadding отступ в начале текстового поля
 * @param endContentPadding отступ в конце текстового поля
 * @param iconStartPadding отступ от текста до иконки
 * @param textTopPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [TextField.LabelType.Inner]
 * @param textBottomPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [TextField.LabelType.Inner]
 * @param innerLabelToValuePadding отступ между лэйблом и value в режиме [labelType] == [TextField.LabelType.Inner]
 * @param outerLabelBottomPadding отступ между лэйблом и текстовым полем в режиме [labelType] == [TextField.LabelType.Outer]
 * @param bottomTextBottomPadding отступ между текстовым полем и нижним текстом (caption и counter)
 * @param iconTopPadding отступ иконки сверху
 * @param iconSize размер иконки
 * @param animation параметры анимации [TextField.Animation]
 * @param keepDotBadgeStartPadding позволяет выставить отступ слева, для случаев, когда нужно сохранить отступ, эквивалентный ширине индикатора обязательного поля.
 * Например, когда TextField используется в списке и состояние [fieldType] меняется у разных элементов,
 * может появиться необходимость сохранить отступ слева, когда индикатор обзательного поля скрывается.
 * @param scrollBarConfig настройки скроллбара
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param interactionSource источник взаимодействия с полем
 */
@Composable
@Suppress("LongMethod")
fun TextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldType: TextField.FieldType? = null,
    labelType: TextField.LabelType = TextField.LabelType.Outer,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    counterText: String? = null,
    icon: @Composable (() -> Unit)? = null,
    chips: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    valuesStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    counterStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape = RoundedCornerShape(25),
    chipsSpacing: Dp = 2.dp,
    startContentPadding: Dp = 16.dp,
    endContentPadding: Dp = 16.dp,
    iconStartPadding: Dp = 8.dp,
    textTopPadding: Dp = 25.dp,
    textBottomPadding: Dp = 9.dp,
    innerLabelToValuePadding: Dp = 2.dp,
    outerLabelBottomPadding: Dp = 12.dp,
    bottomTextBottomPadding: Dp = 4.dp,
    iconSize: Dp = 24.dp,
    animation: TextField.Animation = TextField.Animation(),
    keepDotBadgeStartPadding: Dp? = 16.dp,
    iconTopPadding: Dp = 16.dp,
    scrollBarConfig: ScrollBarConfig = ScrollBarConfig(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    // Специфика перевода String -> TextFieldValue, взято из исходников гугла
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)

    SideEffect {
        if (textFieldValue.selection != textFieldValueState.selection ||
            textFieldValue.composition != textFieldValueState.composition
        ) {
            textFieldValueState = textFieldValue
        }
    }
    var lastTextValue by remember(value) { mutableStateOf(value) }
    TextArea(
        value = textFieldValue,
        onValueChange = { newTextFieldValueState: TextFieldValue ->
            textFieldValueState = newTextFieldValueState

            val stringChangedSinceLastInvocation = lastTextValue != newTextFieldValueState.text
            lastTextValue = newTextFieldValueState.text

            if (stringChangedSinceLastInvocation) {
                onValueChange(newTextFieldValueState.text)
            }
        },
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        fieldType = fieldType,
        labelType = labelType,
        placeholderText = placeholderText,
        labelText = labelText,
        captionText = captionText,
        counterText = counterText,
        counterStyle = counterStyle,
        icon = icon,
        outerLabelStyle = outerLabelStyle,
        innerLabelStyle = innerLabelStyle,
        valuesStyle = valuesStyle,
        captionStyle = captionStyle,
        placeHolderStyle = placeHolderStyle,
        backgroundColor = backgroundColor,
        cursorColor = cursorColor,
        enabledAlpha = enabledAlpha,
        disabledAlpha = disabledAlpha,
        shape = shape,
        startContentPadding = startContentPadding,
        endContentPadding = endContentPadding,
        iconStartPadding = iconStartPadding,
        textTopPadding = textTopPadding,
        textBottomPadding = textBottomPadding,
        innerLabelToValuePadding = innerLabelToValuePadding,
        outerLabelBottomPadding = outerLabelBottomPadding,
        bottomTextBottomPadding = bottomTextBottomPadding,
        iconSize = iconSize,
        animation = animation,
        keepDotBadgeStartPadding = keepDotBadgeStartPadding,
        chips = chips,
        chipsSpacing = chipsSpacing,
        iconTopPadding = iconTopPadding,
        scrollBarConfig = scrollBarConfig,
        interactionSource = interactionSource,
    )
}
