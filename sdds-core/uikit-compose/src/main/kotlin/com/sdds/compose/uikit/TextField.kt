package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.internal.textfield.BaseTextField
import com.sdds.compose.uikit.internal.textfield.PrefixSuffixTransformation

/**
 * Поле ввода текста.
 * Поддержка префикса/суффикса с помощью [prefixSuffixTransformation].
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
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
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation].
 * Используется, только если отсутствуют [prefix] и [suffix].
 * @param focusSelectorMode режим отображения фокуса компонента [FocusSelectorMode]
 * когда [focusSelectorMode] != [FocusSelectorMode.None]
 * @param interactionSource источник взаимодействия с полем
 */
@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
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
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorMode: FocusSelectorMode = LocalFocusSelectorMode.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseTextField(
        value = value,
        onValueChange = onValueChange,
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
        visualTransformation = visualTransformation,
        focusSelectorMode = focusSelectorMode,
        interactionSource = interactionSource,
    )
}

/**
 * Поле ввода текста.
 * Поддержка префикса/суффикса с помощью [prefixSuffixTransformation].
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
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
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation].
 * Используется, только если отсутствуют [prefix] и [suffix].
 * @param focusSelectorMode режим отображения фокуса компонента [FocusSelectorMode]
 * когда [focusSelectorMode] != [FocusSelectorMode.None]
 * @param interactionSource источник взаимодействия с полем
 */
@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
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
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorMode: FocusSelectorMode = LocalFocusSelectorMode.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)
    SideEffect {
        if (
            textFieldValue.selection != textFieldValueState.selection ||
            textFieldValue.composition != textFieldValueState.composition
        ) {
            textFieldValueState = textFieldValue
        }
    }
    var lastTextValue by remember(value) { mutableStateOf(value) }
    BaseTextField(
        value = textFieldValue,
        onValueChange = { newTextFieldValueState ->
            textFieldValueState = newTextFieldValueState

            val stringChangedSinceLastInvocation = lastTextValue != newTextFieldValueState.text
            lastTextValue = newTextFieldValueState.text

            if (stringChangedSinceLastInvocation) {
                onValueChange(newTextFieldValueState.text)
            }
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
        visualTransformation = visualTransformation,
        focusSelectorMode = focusSelectorMode,
        interactionSource = interactionSource,
    )
}

/**
 * Отступы текстового поля
 *
 * @property boxPaddingStart отступ контента в начале
 * @property boxPaddingEnd отступ контента в конце
 * @property boxPaddingTop верхний отступ контента с внутренним лэйблом
 * @property boxPaddingBottom нижний отступ контента с внутренним лэйблом
 * @property labelPadding нижний отступ внутреннего лэйбла
 * @property optionalPadding отступ в начале optional текста
 * @property helperTextPadding верхний отступ внутреннего helper текста (caption/counter)
 * @property startContentPadding отступ после startContent
 * @property endContentPadding отступ перед endContent
 * @property chipsPadding отступ от контейнера с chip-элементами
 * @property boxMinHeight минимальная высота поля
 * @property alignmentLineHeight высота первой строки контента
 * @property startContentSize размер иконки в начале
 * @property endContentSize размер иконки в конце
 * @property indicatorDimensions настройки индикатора
 * @property dividerThickness толщина разделителя в clear режиме
 */
@Immutable
data class TextFieldDimensions(
    val boxPaddingStart: Dp = 16.dp,
    val boxPaddingEnd: Dp = 16.dp,
    val boxPaddingTop: Dp = 25.dp,
    val boxPaddingBottom: Dp = 9.dp,
    val labelPadding: Dp = 2.dp,
    val optionalPadding: Dp = 4.dp,
    val helperTextPadding: Dp = 4.dp,
    val startContentPadding: Dp = 6.dp,
    val endContentPadding: Dp = 6.dp,
    val chipsPadding: Dp = 6.dp,
    val boxMinHeight: Dp = 56.dp,
    val alignmentLineHeight: Dp = 56.dp,
    val startContentSize: Dp = 24.dp,
    val endContentSize: Dp = 24.dp,
    val indicatorDimensions: IndicatorDimensions = IndicatorDimensions(),
    val dividerThickness: Dp = 1.dp,
) {

    /**
     * Настройки индикатора
     *
     * @property horizontalPadding горизонтальный отступ индикатора
     * @property verticalPadding вертикальный отступ индикатора
     * @property indicatorSize размер внешнего индикатора
     */
    @Immutable
    data class IndicatorDimensions(
        val horizontalPadding: Dp = 0.dp,
        val verticalPadding: Dp = 0.dp,
        val indicatorSize: Dp = 6.dp,
    )
}

/**
 * Внешний вид текстового поля
 */
enum class TextFieldAppearance {

    /**
     * Текстовое поле с фоном
     */
    Solid,

    /**
     * Текстовое поле без фона
     */
    Clear,
}

/**
 * Типы отображения лейбла
 */
enum class TextFieldLabelPlacement {
    /**
     * Лэйбл снаружи текстового поля
     */
    Outer,

    /**
     * Лэйбл внутри текстового поля
     */
    Inner,

    /**
     * Нет лэйбла
     */
    None,
}

/**
 * Типы отображения вспомогательного текста
 */
enum class TextFieldHelperTextPlacement {
    /**
     * Снаружи текстового поля
     */
    Inner,

    /**
     * Внутри текстового поля
     */
    Outer,
}

/**
 * Тип текстового поля (обязательное или опциональное)
 */
enum class TextFieldType {

    /**
     * Опциональный тип поля.
     * Когда поле имеет данный тип, к label добавляется optionalText.
     */
    Optional,

    /**
     * Обязательный тип поля, индикатор в начале
     */
    RequiredStart,

    /**
     * Обязательный тип поля, индикатор в конце
     */
    RequiredEnd,
}

/**
 * Параметры анимации текстового поля
 *
 * @property animationDuration длительность основной анимации
 * @property placeholderAnimationDelayOrDuration длительность анимации или задержка анимации плэйсхолдера в зависимости от состояния
 * @property placeholderAnimationDuration длительность анимации плэйсхолдера
 */
@Immutable
data class TextFieldAnimation(
    val animationDuration: Int = 150,
    val placeholderAnimationDelayOrDuration: Int = 67,
    val placeholderAnimationDuration: Int = 83,
)

/**
 * Вернет [VisualTransformation], которая добавит префикс [prefix] и/или суффикс [suffix].
 * Отступ до основного текста будет иметь ширину пробела в соответствующем текстовом стиле.
 *
 * @param prefix значение префикса
 * @param suffix значение суффикса
 * @param prefixTextStyle стиль [prefix]
 * @param suffixTextStyle стиль [suffix]
 */
@Deprecated("Для внутреннего использования")
fun prefixSuffixTransformation(
    prefix: String? = null,
    suffix: String? = null,
    prefixTextStyle: TextStyle = TextStyle(),
    suffixTextStyle: TextStyle = TextStyle(),
): VisualTransformation = if (prefix.isNullOrEmpty() && suffix.isNullOrEmpty()) {
    VisualTransformation.None
} else {
    PrefixSuffixTransformation(prefix.orEmpty(), suffix.orEmpty(), prefixTextStyle, suffixTextStyle)
}
