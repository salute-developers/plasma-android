package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.style.Style

/**
 * CompositionLocal c [TextFieldStyle] для компонента [TextField]
 */
val LocalTextFieldStyle = compositionLocalOf { TextFieldStyle.builder().style() }

/**
 * Стиль компонента [TextField]
 */
@Stable
interface TextFieldStyle : Style {

    /**
     * Размеры и отступы компонента
     * @see TextFieldDimensions
     */
    @Deprecated("Use dimensionValues instead")
    val dimensions: TextFieldDimensions

    /**
     * Размеры и отступы компонента
     * @see TextFieldDimensions
     */
    val dimensionValues: TextFieldDimensionValues

    /**
     * Цвета компонента
     * @see TextFieldColors
     */
    val colors: TextFieldColors

    /**
     * Форма компонента
     * @see CornerBasedShape
     */
    @Deprecated(
        "Use shapes",
        replaceWith = ReplaceWith(
            "shapes",
        ),
    )
    val shape: CornerBasedShape

    /**
     * Формы компонента
     * @see CornerBasedShape
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Тип текстового поля
     * @see TextFieldType
     */
    val fieldType: TextFieldType

    /**
     * Расположение лэйбла
     * @see
     */
    val labelPlacement: TextFieldLabelPlacement

    /**
     * Расположение текста надписи
     * @see TextFieldHelperTextPlacement
     */
    val captionPlacement: TextFieldHelperTextPlacement

    /**
     * Расположение текста счетчика
     * @see TextFieldHelperTextPlacement
     */
    val counterPlacement: TextFieldHelperTextPlacement

    /**
     * Настройки вертикального скроллбара
     * @see ScrollBar
     */
    val scrollBar: ScrollBar?

    /**
     * Стиль лэйбла
     */
    @Deprecated(
        "Use labelStyles",
        replaceWith = ReplaceWith(
            "labelStyles",
        ),
    )
    val labelStyle: TextStyle

    /**
     * Стили лэйбла
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль опционального текста
     */
    @Deprecated(
        "Use optionalStyles",
        replaceWith = ReplaceWith(
            "optionalStyles",
        ),
    )
    val optionalStyle: TextStyle

    /**
     * Стили опционального текста
     */
    val optionalStyles: StatefulValue<TextStyle>

    /**
     * Стиль основного текста
     */
    @Deprecated(
        "Use valueStyles",
        replaceWith = ReplaceWith(
            "valueStyles",
        ),
    )
    val valueStyle: TextStyle

    /**
     * Стили основного текста
     */
    val valueStyles: StatefulValue<TextStyle>

    /**
     * Стиль надписи
     */
    @Deprecated(
        "Use captionStyles",
        replaceWith = ReplaceWith(
            "captionStyles",
        ),
    )
    val captionStyle: TextStyle

    /**
     * Стили надписи
     */
    val captionStyles: StatefulValue<TextStyle>

    /**
     * Стиль счетчика
     */
    @Deprecated(
        "Use counterStyles",
        replaceWith = ReplaceWith(
            "counterStyles",
        ),
    )
    val counterStyle: TextStyle

    /**
     * Стили счетчика
     */
    val counterStyles: StatefulValue<TextStyle>

    /**
     * Стиль плэйсхолдера
     */
    @Deprecated(
        "Use counterStyles",
        replaceWith = ReplaceWith(
            "counterStyles",
        ),
    )
    val placeholderStyle: TextStyle

    /**
     * Стили плэйсхолдера
     */
    val placeholderStyles: StatefulValue<TextStyle>

    /**
     * Стиль префикса
     */
    @Deprecated(
        "Use prefixStyles",
        replaceWith = ReplaceWith(
            "prefixStyles",
        ),
    )
    val prefixStyle: TextStyle

    /**
     * Стили префикса
     */
    val prefixStyles: StatefulValue<TextStyle>

    /**
     * Стиль суффикса
     */
    @Deprecated(
        "Use prefixStyles",
        replaceWith = ReplaceWith(
            "prefixStyles",
        ),
    )
    val suffixStyle: TextStyle

    /**
     * Стили суффикса
     */
    val suffixStyles: StatefulValue<TextStyle>

    /**
     * Однострочный или многострочный режим
     */
    val singleLine: Boolean

    /**
     * Режим размещения индикатора
     */
    val indicatorAlignmentMode: TextFieldIndicatorAlignmentMode

    /**
     * Стиль группы чипов
     */
    val chipGroupStyle: ChipGroupStyle

    /**
     * Стиль чипов
     */
    @Deprecated("Use chipGroupStyle")
    val chipStyle: ChipStyle

    companion object {

        /**
         * Возвращает экземпляр [TextFieldStyleBuilder]
         */
        fun builder(receiver: Any? = null): TextFieldStyleBuilder {
            return DefaultTextFieldStyle.Builder(receiver)
        }
    }
}

/**
 * Цвета компонента [TextField]
 */
@Stable
interface TextFieldColors {

    /**
     * Альфа в состоянии disabled
     */
    val disabledAlpha: Float

    /**
     * Цвет курсора
     */
    @Deprecated(
        "Use cursorBrush",
        replaceWith = ReplaceWith(
            "cursorBrush",
        ),
    )
    fun cursorColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета курсора
     */
    val cursorBrush: StatefulValue<Brush>

    /**
     * Цвет индикатора
     */
    @Deprecated(
        "Use indicatorBrush",
        replaceWith = ReplaceWith(
            "indicatorBrush",
        ),
    )
    fun indicatorColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета индикатора
     */
    val indicatorBrush: StatefulValue<Brush>

    /**
     * Цвет контента в начале
     */
    @Deprecated(
        "Use startContentBrush",
        replaceWith = ReplaceWith(
            "startContentBrush",
        ),
    )
    fun startContentColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета контента в начале
     */
    val startContentBrush: StatefulValue<Brush>

    /**
     * Цвет контента в конце
     */
    @Deprecated(
        "Use endContentBrush",
        replaceWith = ReplaceWith(
            "endContentBrush",
        ),
    )
    fun endContentColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета контента в конце
     */
    val endContentBrush: StatefulValue<Brush>

    /**
     * Цвет лэйбла
     */
    @Deprecated(
        "Use labelBrush",
        replaceWith = ReplaceWith(
            "labelBrush",
        ),
    )
    fun labelColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета контента в конце
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет основного текста
     */
    @Deprecated(
        "Use valueBrush",
        replaceWith = ReplaceWith(
            "valueBrush",
        ),
    )
    fun valueColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета основного текста
     */
    val valueBrush: StatefulValue<Brush>

    /**
     * Цвет надписи
     */
    @Deprecated(
        "Use captionBrush",
        replaceWith = ReplaceWith(
            "captionBrush",
        ),
    )
    fun captionColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета надписи
     */
    val captionBrush: StatefulValue<Brush>

    /**
     * Цвет опционального текста
     */
    @Deprecated(
        "Use optionalBrush",
        replaceWith = ReplaceWith(
            "optionalBrush",
        ),
    )
    fun optionalColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета опционального текста
     */
    val optionalBrush: StatefulValue<Brush>

    /**
     * Цвет счетчика
     */
    @Deprecated(
        "Use counterBrush",
        replaceWith = ReplaceWith(
            "counterBrush",
        ),
    )
    fun counterColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета счетчика
     */
    val counterBrush: StatefulValue<Brush>

    /**
     * Цвет разделителя
     */
    @Deprecated(
        "Use dividerBrush",
        replaceWith = ReplaceWith(
            "dividerBrush",
        ),
    )
    fun dividerColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета разделителя
     */
    val dividerBrush: StatefulValue<Brush>

    /**
     * Цвет плэйсхолдера
     */
    @Deprecated(
        "Use placeholderBrush",
        replaceWith = ReplaceWith(
            "placeholderBrush",
        ),
    )
    fun placeholderColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета плэйсхолдера
     */
    val placeholderBrush: StatefulValue<Brush>

    /**
     * Цвет бэкграунда
     */
    @Deprecated(
        "Use backgroundBrush",
        replaceWith = ReplaceWith(
            "backgroundBrush",
        ),
    )
    fun backgroundColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета бэкграунда
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет префикса
     */
    @Deprecated(
        "Use prefixBrush",
        replaceWith = ReplaceWith(
            "prefixBrush",
        ),
    )
    fun prefixColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета префикса
     */
    val prefixBrush: StatefulValue<Brush>

    /**
     * Цвет суффикса
     */
    @Deprecated(
        "Use suffixBrush",
        replaceWith = ReplaceWith(
            "suffixBrush",
        ),
    )
    fun suffixColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвета суффикса
     */
    val suffixBrush: StatefulValue<Brush>
}

/**
 * Размеры и отступы компонента [TextField]
 */
@Stable
interface TextFieldDimensionValues {
    /**
     * Отступы контента в начале
     */
    val boxPaddingStartValues: StatefulValue<Dp>

    /**
     * Отступы контента в конце
     */
    val boxPaddingEndValues: StatefulValue<Dp>

    /**
     * Верхние отступы контента с внутренним лэйблом
     */
    val boxPaddingTopValues: StatefulValue<Dp>

    /**
     * Нижние отступы контента с внутренним лэйблом
     */
    val boxPaddingBottomValues: StatefulValue<Dp>

    /**
     * Нижние отступы внутреннего лэйбла
     */
    val labelPaddingValues: StatefulValue<Dp>

    /**
     * Отступы в начале optional текста
     */
    val optionalPaddingValues: StatefulValue<Dp>

    /**
     * Верхние отступы внутреннего helper текста (caption/counter)
     */
    val helperTextPaddingValues: StatefulValue<Dp>

    /**
     * Отступы после startContent
     */
    val startContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступы перед endContent
     */
    val endContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступы от контейнера с chip-элементами
     */
    val chipsPaddingValues: StatefulValue<Dp>

    /**
     * Отступы от контейнера с chip-элементами в начале
     */
    val chipsPaddingStartValues: StatefulValue<Dp>

    /**
     * Отступы от контейнера с chip-элементами в конце
     */

    val chipsPaddingEndValues: StatefulValue<Dp>

    /**
     * Отступы от контейнера с chip-элементами сверху
     */
    val chipsPaddingTopValues: StatefulValue<Dp>

    /**
     * Отступы от контейнера с chip-элементами снизу
     */
    val chipsPaddingBottomValues: StatefulValue<Dp>

    /**
     * Минимальная высота поля
     */
    val boxMinHeightValues: StatefulValue<Dp>

    /**
     * Высота первой строки контента
     */
    val alignmentLineHeightValues: StatefulValue<Dp>

    /**
     * Размеры иконки в начале
     */
    val startContentSizeValues: StatefulValue<Dp>

    /**
     * Размеры иконки в конце
     */
    val endContentSizeValues: StatefulValue<Dp>

    /**
     * Настройки индикатора
     */
    val indicatorDimensions: TextFieldIndicatorDimensionValues

    /**
     * Толщина разделителя в clear режиме
     */
    val dividerThicknessValues: StatefulValue<Dp>
}

/**
 * Размеры и отступы Indicator внутри компонента [TextField]
 */
@Stable
interface TextFieldIndicatorDimensionValues {

    /**
     * Горизонтальные отступы индикатора
     */
    val horizontalPaddingValues: StatefulValue<Dp>

    /**
     * Вертикальные отступы индикатора
     */
    val verticalPaddingValues: StatefulValue<Dp>

    /**
     * Размеры внешнего индикатора
     */
    val indicatorSizeValues: StatefulValue<Dp>
}
