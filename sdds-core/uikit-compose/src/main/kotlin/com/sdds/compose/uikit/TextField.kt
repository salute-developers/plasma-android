package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextField.DotBadge.Position
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.compose.uikit.internal.textfield.BaseTextField

/**
 * Поле ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [TextField.FieldType])
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами
 * @param outerLabelStyle стиль лэйбла в режиме [labelType] == [LabelType.Outer]
 * @param innerLabelStyle стиль лэйбла в режиме [labelType] == [LabelType.Inner]
 * @param valuesStyle стиль value
 * @param captionStyle стиль caption
 * @param placeHolderStyle стиль placeholder
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы и текстовое поля.
 * @param iconSize размер иконки
 * @param fieldHeight высота текстового поля
 * @param animation параметры анимации [TextField.Animation]
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param interactionSource источник взаимодействия с полем
 */
@Suppress("LongParameterList")
@Composable
@NonRestartableComposable
fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldType: TextField.FieldType? = null,
    labelType: LabelType = LabelType.Outer,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    valuesStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape = RoundedCornerShape(25),
    chipContainerShape: CornerBasedShape? = null,
    fieldHeight: Dp = 56.dp,
    iconSize: Dp = 24.dp,
    paddings: TextField.Paddings = TextField.Paddings(),
    animation: TextField.Animation = TextField.Animation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseTextField(
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
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
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
        iconSize = iconSize,
        fieldHeight = fieldHeight,
        paddings = paddings,
        animation = animation,
        chipsContent = chipsContent,
        chipContainerShape = chipContainerShape,
        interactionSource = interactionSource,
    )
}

/**
 * Поле ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [TextField.FieldType])
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами
 * @param outerLabelStyle стиль лэйбла в режиме [labelType] == [LabelType.Outer]
 * @param innerLabelStyle стиль лэйбла в режиме [labelType] == [LabelType.Inner]
 * @param valuesStyle стиль value
 * @param captionStyle стиль caption
 * @param placeHolderStyle стиль placeholder
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы и текстовое поля.
 * @param iconSize размер иконки
 * @param fieldHeight высота текстового поля
 * @param animation параметры анимации [TextField.Animation]
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param interactionSource источник взаимодействия с полем
 */
@Suppress("LongParameterList", "LongMethod")
@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldType: TextField.FieldType? = null,
    labelType: LabelType = LabelType.Outer,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    valuesStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape = RoundedCornerShape(CornerSize(16.dp)).adjustBy(all = 2.dp),
    chipContainerShape: CornerBasedShape? = null,
    iconSize: Dp = 24.dp,
    fieldHeight: Dp = 56.dp,
    paddings: TextField.Paddings = TextField.Paddings(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    animation: TextField.Animation = TextField.Animation(),
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

    TextField(
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
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
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
        iconSize = iconSize,
        fieldHeight = fieldHeight,
        paddings = paddings,
        animation = animation,
        chipsContent = chipsContent,
        chipContainerShape = chipContainerShape,
        interactionSource = interactionSource,
    )
}

/**
 * Параметры текстового поля
 */
object TextField {

    /**
     * Отступы text field
     *
     * @property startContentPadding отступ в начале текстового поля
     * @property endContentPadding отступ в конце текстового поля
     * @property valueTopPadding отступ от value до верхней границы текстового поля в режиме labelType == [LabelType.Inner]
     * @property valueBottomPadding отступ от value до верхней границы текстового поля в режиме labelType == [LabelType.Inner]
     * @property innerLabelToValuePadding отступ между лэйблом и value в режиме labelType == [LabelType.Inner]
     * @property outerLabelBottomPadding отступ между лэйблом и текстовым полем в режиме labelType == [LabelType.Outer]
     * @property iconHorizontalPadding отступ от иконки до текста
     * @property captionTopPadding отступ между текстовым полем и caption
     * @property chipsSpacing расстояние между chip-элементами
     * @property keepDotBadgeStartPadding позволяет выставить отступ слева, для случаев, когда нужно сохранить отступ, эквивалентный ширине индикатора обязательного поля.
     * Например, когда TextField используется в списке и состояние fieldType меняется у разных элементов,
     * может появиться необходимость сохранить отступ слева, когда индикатор обзательного поля скрывается.
     */
    @Immutable
    data class Paddings(
        val startContentPadding: Dp = 16.dp,
        val endContentPadding: Dp = 16.dp,
        val valueTopPadding: Dp = 25.dp,
        val valueBottomPadding: Dp = 9.dp,
        val innerLabelToValuePadding: Dp = 2.dp,
        val outerLabelBottomPadding: Dp = 12.dp,
        val iconHorizontalPadding: Dp = 8.dp,
        val captionTopPadding: Dp = 4.dp,
        val chipsSpacing: Dp = 2.dp,
        val keepDotBadgeStartPadding: Dp? = null,
    )

    /**
     * Типы отображения лейбла
     */
    enum class LabelType {
        /**
         * Лэйбл снаружи текстового поля
         */
        Outer,

        /**
         * Лэйбл внутри текстового поля
         */
        Inner,
    }

    /**
     * Параметры анимации текстового поля
     *
     * @property animationDuration длительность основной анимации
     * @property placeholderAnimationDelayOrDuration длительность анимации или задержка анимации плэйсхолдера в зависимости от состояния
     * @property placeholderAnimationDuration длительность анимации плэйсхолдера
     */
    @Immutable
    data class Animation(
        val animationDuration: Int = 150,
        val placeholderAnimationDelayOrDuration: Int = 67,
        val placeholderAnimationDuration: Int = 83,
    )

    /**
     * Тип текстового поля (обязательное или опциональное)
     */
    @Immutable
    sealed class FieldType {

        /**
         * Опциональный тип поля.
         * Когда поле имеет данный тип, к label добавляется [optionalText].
         *
         * @property optionalText текст, свидетельствующий о том, что поле опционалдьное
         * @property labelOptionalAlpha альфа, которая будет применена к стилю лэйбла,
         * чтобы получить стиль optional лэйбла
         * @property startMargin отступ перед [optionalText]
         */
        data class Optional(
            val optionalText: String = "Optional",
            val labelOptionalAlpha: Float = 0.28f,
            val startMargin: Dp = 4.dp,
        ) : FieldType()

        /**
         * Обязательный тип поля.
         * Когда поле имеет данный тип, к label или к полю добавляется бэйдж-точка [DotBadge].
         *
         * @property dotBadge модель, описывающая бэйдж-точку
         */
        data class Required(val dotBadge: DotBadge = DotBadge()) : FieldType()
    }

    /**
     * Бэйдж-точка (индикатор опционального поля)
     *
     * @property size размер точки
     * @property paddingValues отступы точки
     * @property color цвет точки
     * @property position расположение точки [Position]
     */
    @Immutable
    data class DotBadge(
        val size: Dp = 6.dp,
        val paddingValues: PaddingValues = PaddingValues(0.dp),
        val color: Color = Color.Red,
        val position: Position = Position.End,
    ) {

        /**
         * Расположение точки
         */
        enum class Position {
            /**
             * Расположение в начале
             */
            Start,

            /**
             * Расположение в конце
             */
            End,
        }
    }
}