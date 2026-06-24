package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ComboBoxStyle] для компонента [ComboBox].
 */
val LocalComboBoxStyle: ProvidableCompositionLocal<ComboBoxStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { ComboBoxStyle.builder().style() }

/**
 * Стиль компонента ComboBox.
 *
 * @see TextFieldStyle
 * @see DropdownMenuStyle
 * @see SelectItemStyle
 */
@Immutable
interface ComboBoxStyle : Style {

    /**
     * Стиль текстового поля, отображающего вводимое значение.
     */
    val textFieldStyle: TextFieldStyle

    /**
     * Стиль выпадающего меню, содержащего список доступных вариантов.
     */
    val dropdownStyle: DropdownMenuStyle

    /**
     * Стиль отдельного элемента в выпадающем списке.
     */
    val selectItemStyle: SelectItemStyle

    companion object {
        /**
         * Создает новый экземпляр билдера для [ComboBoxStyle].
         *
         * @return Новый экземпляр [ComboBoxStyleBuilder]
         */
        fun builder(receiver: Any? = null): ComboBoxStyleBuilder =
            DefaultComboBoxStyle.Builder()
    }
}

/**
 * Билдер для создания [ComboBoxStyle] с конфигурацией отдельных компонентов.
 *
 * @see ComboBoxStyle
 */
@ApiInfo
interface ComboBoxStyleBuilder : StyleBuilder<ComboBoxStyle> {

    /**
     * Устанавливает стиль текстового поля.
     *
     * @param textFieldStyle Стиль текстового поля для отображения вводимого значения.
     * @return Текущий экземпляр билдера для цепочки вызовов.
     */
    fun textFieldStyle(textFieldStyle: TextFieldStyle): ComboBoxStyleBuilder

    /**
     * Устанавливает стиль выпадающего меню.
     *
     * @param dropdownStyle Стиль выпадающего меню с вариантами выбора.
     * @return Текущий экземпляр билдера для цепочки вызовов.
     */
    fun dropdownStyle(dropdownStyle: DropdownMenuStyle): ComboBoxStyleBuilder

    /**
     * Устанавливает стиль элементов выпадающего списка.
     *
     * @param selectItemStyle Стиль отдельного элемента в выпадающем меню.
     * @return Текущий экземпляр билдера для цепочки вызовов.
     */
    fun selectItemStyle(selectItemStyle: SelectItemStyle): ComboBoxStyleBuilder
}

/**
 * Приватная реализация [ComboBoxStyle].
 *
 * @param textFieldStyle Стиль текстового поля.
 * @param dropdownStyle Стиль выпадающего меню.
 * @param selectItemStyle Стиль элементов списка.
 */
private data class DefaultComboBoxStyle(
    override val textFieldStyle: TextFieldStyle,
    override val dropdownStyle: DropdownMenuStyle,
    override val selectItemStyle: SelectItemStyle,
) : ComboBoxStyle {

    class Builder : ComboBoxStyleBuilder {
        private var textFieldStyle: TextFieldStyle? = null
        private var dropdownStyle: DropdownMenuStyle? = null
        private var selectItemStyle: SelectItemStyle? = null

        override fun textFieldStyle(textFieldStyle: TextFieldStyle) = apply {
            this.textFieldStyle = textFieldStyle
        }

        override fun dropdownStyle(dropdownStyle: DropdownMenuStyle) = apply {
            this.dropdownStyle = dropdownStyle
        }

        override fun selectItemStyle(selectItemStyle: SelectItemStyle) = apply {
            this.selectItemStyle = selectItemStyle
        }

        override fun style(): ComboBoxStyle = DefaultComboBoxStyle(
            textFieldStyle = textFieldStyle ?: TextFieldStyle.builder().style(),
            dropdownStyle = dropdownStyle ?: DropdownMenuStyle.builder().style(),
            selectItemStyle = selectItemStyle ?: SelectItemStyle.builder().style(),
        )
    }
}
