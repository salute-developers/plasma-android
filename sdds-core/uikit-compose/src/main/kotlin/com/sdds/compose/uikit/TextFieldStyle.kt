package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.style.Style

/**
 * Стиль компонента [TextField]
 */
@Stable
interface TextFieldStyle : Style {

    /**
     * Размеры и отступы компонента
     * @see TextField.Dimensions
     */
    val dimensions: TextField.Dimensions

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
     * @see TextField.FieldType
     */
    val fieldType: TextField.FieldType

    /**
     * Внешний вид текстового поля
     * @see TextField.FieldAppearance
     */
    val fieldAppearance: TextField.FieldAppearance

    /**
     * Расположение лэйбла
     * @see
     */
    val labelPlacement: TextField.LabelPlacement

    /**
     * Расположение вспомогательного текста
     * @see TextField.HelperTextPlacement
     */
    val helperTextPlacement: TextField.HelperTextPlacement

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
     * Есть ли разделитель
     */
    val hasDivider: Boolean

    /**
     * Стиль группы чипов
     */
    val chipGroupStyle: ChipGroupStyle

    /**
     * Стиль чипов
     */
    val chipStyle: ChipStyle

    companion object
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
