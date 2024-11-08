package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextField.Animation
import com.sdds.compose.uikit.TextField.LabelPlacement
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
 * @param placeholderText заглушка если пустое [value] и тип [LabelPlacement.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param optionalText текст опционального поля
 * @param prefix текст префикса
 * @param suffix текст суффикса
 * @param startContent иконка, которая будет находиться в начале поля ввода
 * @param endContent иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту.
 * @param animation параметры анимации [Animation]
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation].
 * Используется, только если отсутствуют [prefix] и [suffix].
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
        interactionSource = interactionSource,
    )
}

/**
 * Параметры текстового поля
 */
object TextField {

    /**
     * Отступы текстового поля
     *
     * @property boxPaddingStart отступ контента в начале
     * @property boxPaddingEnd отступ контента в конце
     * @property boxPaddingTopInnerLabel верхний отступ контента с внутренним лэйблом
     * @property boxPaddingBottomInnerLabel нижний отступ контента с внутренним лэйблом
     * @property boxPaddingTopOuterLabel верхний отступ контента с наружным лэйблом
     * @property boxPaddingBottomOuterLabel нижний отступ контента с наружным лэйблом
     * @property innerLabelPadding нижний отступ внутреннего лэйбла
     * @property outerLabelPadding нижний отступ наружного лэйбла
     * @property optionalPadding отступ в начале optional текста
     * @property helperTextPaddingInner верхний отступ внутреннего helper текста (caption/counter)
     * @property helperTextPaddingOuter верхний отступ наружного helper текста (caption/counter)
     * @property startContentEndPadding отступ после startContent
     * @property endContentStartPadding отступ перед endContent
     * @property chipsPadding отступ от контейнера с chip-элементами
     * @property chipsSpacing расстояние между chip-элементами
     * @property boxMinHeight минимальная высота поля
     * @property alignmentLineHeight высота первой строки контента
     * @property iconSize размер иконки
     * @property indicatorDimensions настройки индикатора
     * @property dividerThickness толщина разделителя в clear режиме
     */
    @Immutable
    data class Dimensions(
        val boxPaddingStart: Dp = 16.dp,
        val boxPaddingEnd: Dp = 16.dp,
        val boxPaddingTopInnerLabel: Dp = 25.dp,
        val boxPaddingBottomInnerLabel: Dp = 9.dp,
        val boxPaddingTopOuterLabel: Dp = 25.dp,
        val boxPaddingBottomOuterLabel: Dp = 9.dp,
        val innerLabelPadding: Dp = 2.dp,
        val outerLabelPadding: Dp = 2.dp,
        val optionalPadding: Dp = 4.dp,
        val helperTextPaddingInner: Dp = 4.dp,
        val helperTextPaddingOuter: Dp = 4.dp,
        val startContentEndPadding: Dp = 6.dp,
        val endContentStartPadding: Dp = 6.dp,
        val chipsPadding: Dp = 6.dp,
        val chipsSpacing: Dp = 2.dp,
        val boxMinHeight: Dp = 56.dp,
        val alignmentLineHeight: Dp = 56.dp,
        val iconSize: Dp = 24.dp,
        val indicatorDimensions: IndicatorDimensions = IndicatorDimensions(),
        val dividerThickness: Dp = 1.dp,
    ) {

        /**
         * Настройки индикатора
         *
         * @property startLabelHorizontalPadding начальный горизонтальный отступ внешнего индикатора
         * @property startLabelVerticalPadding начальный вертикальный отступ внешнего индикатора
         * @property endLabelHorizontalPadding конечный горизонтальный отступ внешнего индикатора
         * @property endLabelVerticalPadding конечный вертикальный отступ внешнего индикатора
         * @property startFieldHorizontalPadding начальный горизонтальный отступ внутреннего индикатора
         * @property startFieldVerticalPadding начальный вертикальный отступ внутреннего индикатора
         * @property endFieldHorizontalPadding конечный горизонтальный отступ внутреннего индикатора
         * @property endFieldVerticalPadding конечный вертикальный отступ внутреннего индикатора
         * @property labelIndicatorSize размер внешнего индикатора
         * @property fieldIndicatorSize размер внутреннего индикатора
         */
        @Immutable
        data class IndicatorDimensions(
            val startLabelHorizontalPadding: Dp = 0.dp,
            val startLabelVerticalPadding: Dp = 0.dp,
            val endLabelHorizontalPadding: Dp = 0.dp,
            val endLabelVerticalPadding: Dp = 0.dp,
            val startFieldHorizontalPadding: Dp = 0.dp,
            val startFieldVerticalPadding: Dp = 0.dp,
            val endFieldHorizontalPadding: Dp = 0.dp,
            val endFieldVerticalPadding: Dp = 0.dp,
            val labelIndicatorSize: Dp = 6.dp,
            val fieldIndicatorSize: Dp = 6.dp,
        )
    }

    /**
     * Внешний вид текстового поля
     */
    enum class FieldAppearance {

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
    enum class LabelPlacement {
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
    enum class HelperTextPlacement {
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
    enum class FieldType {

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
    data class Animation(
        val animationDuration: Int = 150,
        val placeholderAnimationDelayOrDuration: Int = 67,
        val placeholderAnimationDuration: Int = 83,
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object TextFieldClear

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object TextArea

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object TextAreaClear

/**
 * Вернет [VisualTransformation], которая добавит префикс [prefix] и/или суффикс [suffix].
 * Отступ до основного текста будет иметь ширину пробела в соответствующем текстовом стиле.
 *
 * @param prefix значение префикса
 * @param suffix значение суффикса
 * @param prefixTextStyle стиль [prefix]
 * @param suffixTextStyle стиль [suffix]
 */
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
