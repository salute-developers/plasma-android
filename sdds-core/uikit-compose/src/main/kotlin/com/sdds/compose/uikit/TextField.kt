package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CoreTextField.Animation
import com.sdds.compose.uikit.CoreTextField.DotBadge.Position
import com.sdds.compose.uikit.CoreTextField.FieldType
import com.sdds.compose.uikit.CoreTextField.HelperTextPosition
import com.sdds.compose.uikit.CoreTextField.LabelPosition
import com.sdds.compose.uikit.CoreTextField.Paddings
import com.sdds.compose.uikit.internal.textfield.BaseTextField
import com.sdds.compose.uikit.internal.textfield.PrefixSuffixTransformation

/**
 * Поле ввода текста.
 * Поддержка префикса/суффикса с помощью [prefixSuffixTransformation].
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param singleLine однострочный или многострочный режим
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [FieldType])
 * @param labelPosition тип отображения лэйбла: [LabelPosition.Outer] снаружи поля ввода, [LabelPosition.Inner] внутри поля ввода
 * @param helperTextPosition тип отображения вспомогательного текста (caption/counter): [HelperTextPosition.Outer] снаружи поля ввода, [HelperTextPosition.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [LabelPosition.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту, которая должна быть задана в параметре [chipHeight]
 * @param valueStyle стиль value
 * @param innerLabelStyle стиль лэйбла в режиме [labelPosition] == [LabelPosition.Inner]
 * @param innerOptionalStyle стиль optional в режиме [labelPosition] == [LabelPosition.Inner]
 * @param innerCaptionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPosition.Inner]
 * @param outerLabelStyle стиль лэйбла в режиме [labelPosition] == [LabelPosition.Outer]
 * @param outerCaptionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPosition.Outer]
 * @param outerOptionalStyle стиль optional в режиме [labelPosition] == [LabelPosition.Outer]
 * @param counterTextStyle стиль счетчика
 * @param placeHolderStyle стиль placeholder
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы
 * @param chipHeight высота чипов
 * @param iconSize размер иконки
 * @param paddings отступы [TextField]
 * @param scrollBarConfig настройки scroll bar для режима [singleLine] == true
 * @param animation параметры анимации [Animation]
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
    singleLine: Boolean = true,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldType: FieldType? = null,
    labelPosition: LabelPosition = LabelPosition.Outer,
    helperTextPosition: HelperTextPosition = if (singleLine) {
        HelperTextPosition.Outer
    } else {
        HelperTextPosition.Inner
    },
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    counterText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    valueStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    innerOptionalStyle: TextStyle = TextStyle(),
    innerCaptionStyle: TextStyle = TextStyle(),
    outerLabelStyle: TextStyle = TextStyle(),
    outerCaptionStyle: TextStyle = TextStyle(),
    outerOptionalStyle: TextStyle = TextStyle(),
    counterTextStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape = RoundedCornerShape(CornerSize(8.dp)),
    chipContainerShape: CornerBasedShape? = null,
    boxMinHeight: Dp = 56.dp,
    alignmentLineHeight: Dp = 56.dp,
    chipHeight: Dp = 44.dp,
    iconSize: Dp = 24.dp,
    paddings: Paddings = Paddings(),
    scrollBarConfig: ScrollBarConfig = ScrollBarConfig(),
    animation: Animation = Animation(),
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
        fieldType = fieldType,
        labelPosition = labelPosition,
        helperTextPosition = helperTextPosition,
        singleLine = singleLine,
        placeholderText = placeholderText,
        labelText = labelText,
        captionText = captionText,
        counterText = counterText,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        chipsContent = chipsContent,
        chipHeight = chipHeight,
        boxMinHeight = boxMinHeight,
        alignmentLineHeight = alignmentLineHeight,
        outerLabelStyle = outerLabelStyle,
        innerLabelStyle = innerLabelStyle,
        valueStyle = valueStyle,
        outerCaptionStyle = outerCaptionStyle,
        innerCaptionStyle = innerCaptionStyle,
        innerOptionalStyle = innerOptionalStyle,
        outerOptionalStyle = outerOptionalStyle,
        counterTextStyle = counterTextStyle,
        placeHolderStyle = placeHolderStyle,
        backgroundColor = backgroundColor,
        cursorColor = cursorColor,
        enabledAlpha = enabledAlpha,
        disabledAlpha = disabledAlpha,
        shape = shape,
        chipContainerShape = chipContainerShape,
        paddings = paddings,
        iconSize = iconSize,
        scrollBarConfig = scrollBarConfig,
        animation = animation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
    )
}

/**
 * Параметры текстового поля
 */
object CoreTextField {

    /**
     * Отступы текстового поля
     *
     * @property boxPaddingStart отступ контента в начале
     * @property boxPaddingEnd отступ контента в конце
     * @property boxPaddingTop верхний отступ контента
     * @property boxPaddingBottom нижний отступ контента
     * @property labelPadding нижний отступ лэйбла
     * @property optionalPadding отступ в начале optional текста
     * @property helperTextPadding верхний отступ helper текста (caption/counter)
     * @property startContentEndPadding отступ после startContent
     * @property endContentStartPadding отступ перед endContent
     * @property chipsPadding отступ от контейнера с chip-элементами
     * @property chipsSpacing расстояние между chip-элементами
     * @property keepDotBadgeStartPadding позволяет выставить отступ слева, для случаев, когда нужно сохранить отступ, эквивалентный ширине индикатора обязательного поля.
     * Например, когда TextField используется в списке и состояние fieldType меняется у разных элементов,
     * может появиться необходимость сохранить отступ слева, когда индикатор обзательного поля скрывается.
     */
    @Immutable
    data class Paddings(
        val boxPaddingStart: Dp = 16.dp,
        val boxPaddingEnd: Dp = 16.dp,
        val boxPaddingTop: Dp = 25.dp,
        val boxPaddingBottom: Dp = 9.dp,
        val labelPadding: Dp = 2.dp,
        val optionalPadding: Dp = 4.dp,
        val helperTextPadding: Dp = 4.dp,
        val startContentEndPadding: Dp = 6.dp,
        val endContentStartPadding: Dp = 6.dp,
        val chipsPadding: Dp = 6.dp,
        val chipsSpacing: Dp = 2.dp,
        val keepDotBadgeStartPadding: Dp? = null,
    )

    /**
     * Типы отображения лейбла
     */
    enum class LabelPosition {
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
     * Типы отображения вспомогательного текста
     */
    enum class HelperTextPosition {
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
    @Immutable
    sealed class FieldType {

        /**
         * Опциональный тип поля.
         * Когда поле имеет данный тип, к label добавляется [optionalText].
         *
         * @property optionalText текст, свидетельствующий о том, что поле опционалдьное
         */
        data class Optional(val optionalText: String = "") : FieldType()

        /**
         * Обязательный тип поля.
         * Когда поле имеет данный тип, к label или к полю добавляется бэйдж-точка [DotBadge].
         *
         * @property dotBadge модель, описывающая бэйдж-точку
         */
        data class Required(val dotBadge: DotBadge = DotBadge()) : FieldType()
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
     * Бэйдж-точка (индикатор опционального поля)
     *
     * @property size размер точки
     * @property horizontalPadding горизонтальный отступ
     * @property verticalPadding вертикальный отступ
     * @property color цвет точки
     * @property position расположение точки [Position]
     */
    @Immutable
    data class DotBadge(
        val size: Dp = 6.dp,
        val horizontalPadding: Dp = 0.dp,
        val verticalPadding: Dp = 0.dp,
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

/**
 * Вернет [VisualTransformation], которая добавит префикс [prefix] и/или суффикс [suffix].
 * Отступ до основного текста будет иметь ширину пробела в текстовом стиле [textStyle].
 *
 * @param prefix значение префикса
 * @param suffix значение суффикса
 * @param textStyle стиль [prefix] и [suffix]
 */
fun prefixSuffixTransformation(
    prefix: String = "",
    suffix: String = "",
    textStyle: TextStyle = TextStyle(),
): VisualTransformation = if (prefix.isEmpty() && suffix.isEmpty()) {
    VisualTransformation.None
} else {
    PrefixSuffixTransformation(prefix, suffix, textStyle)
}
