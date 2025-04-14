package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
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
    val dimensions: TextFieldDimensions

    /**
     * Цвета компонента
     * @see TextFieldColors
     */
    val colors: TextFieldColors

    /**
     * Форма компонента
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

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
    val labelStyle: TextStyle

    /**
     * Стиль опционального текста
     */
    val optionalStyle: TextStyle

    /**
     * Стиль основного текста
     */
    val valueStyle: TextStyle

    /**
     * Стиль надписи
     */
    val captionStyle: TextStyle

    /**
     * Стиль счетчика
     */
    val counterStyle: TextStyle

    /**
     * Стиль плэйсхолдера
     */
    val placeholderStyle: TextStyle

    /**
     * Стиль префикса
     */
    val prefixStyle: TextStyle

    /**
     * Стиль суффикса
     */
    val suffixStyle: TextStyle

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
    fun cursorColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет индикатора
     */
    fun indicatorColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет контенат в начале
     */
    fun startContentColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет контента в конце
     */
    fun endContentColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет лэйбла
     */
    fun labelColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет основного текста
     */
    fun valueColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет надписи
     */
    fun captionColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет опционального текста
     */
    fun optionalColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет счетчика
     */
    fun counterColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет разделителя
     */
    fun dividerColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет плэйсхолдера
     */
    fun placeholderColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет бэкграунда
     */
    fun backgroundColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет префикса
     */
    fun prefixColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет суффикса
     */
    fun suffixColor(isReadOnly: Boolean): InteractiveColor
}
