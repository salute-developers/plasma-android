package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SelectItemStyle] для компонента [SelectItem]
 */
val LocalSelectStyle: ProvidableCompositionLocal<SelectStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { SelectStyle.builder().style() }

/**
 * Стиль компонента Select (выпадающий список).
 *
 * @see TextFieldStyle
 * @see ButtonStyle
 * @see DropdownMenuStyle
 * @see SelectItemStyle
 */
@Immutable
interface SelectStyle : Style {
    /**
     * Стиль текстового поля, отображающего текущее выбранное значение
     */
    val textFieldStyle: TextFieldStyle

    /**
     * Стиль кнопки для открытия/закрытия выпадающего списка
     */
    val buttonStyle: ButtonStyle

    /**
     * Стиль выпадающего меню, содержащего список доступных вариантов
     */
    val dropdownStyle: DropdownMenuStyle

    /**
     * Стиль отдельного элемента в выпадающем списке
     */
    val selectItemStyle: SelectItemStyle

    companion object {
        /**
         * Создает новый экземпляр билдера для [SelectStyle].
         * @return Новый экземпляр [SelectStyleBuilder]
         */
        fun builder(receiver: Any? = null): SelectStyleBuilder =
            DefaultSelectStyle.Builder()
    }
}

/**
 * Билдер для создания [SelectStyle] с конфигурацией отдельных компонентов.
 *
 * Позволяет последовательно настроить все составные части стиля выпадающего списка.
 * Если какой-либо компонент стиля не задан явно, используется значение по умолчанию.
 *
 * @see SelectStyle
 */
interface SelectStyleBuilder : StyleBuilder<SelectStyle> {
    /**
     * Устанавливает стиль текстового поля.
     *
     * @param textFieldStyle Стиль текстового поля для отображения выбранного значения
     * @return Текущий экземпляр билдера для цепочки вызовов
     */
    fun textFieldStyle(textFieldStyle: TextFieldStyle): SelectStyleBuilder

    /**
     * Устанавливает стиль кнопки.
     *
     * @param buttonStyle Стиль кнопки открытия/закрытия выпадающего списка
     * @return Текущий экземпляр билдера для цепочки вызовов
     */
    fun buttonStyle(buttonStyle: ButtonStyle): SelectStyleBuilder

    /**
     * Устанавливает стиль выпадающего меню.
     *
     * @param dropdownStyle Стиль выпадающего меню с вариантами выбора
     * @return Текущий экземпляр билдера для цепочки вызовов
     */
    fun dropdownStyle(dropdownStyle: DropdownMenuStyle): SelectStyleBuilder

    /**
     * Устанавливает стиль элементов выпадающего списка.
     *
     * @param selectItemStyle Стиль отдельного элемента в выпадающем меню
     * @return Текущий экземпляр билдера для цепочки вызовов
     */
    fun selectItemStyle(selectItemStyle: SelectItemStyle): SelectStyleBuilder
}

/**
 * Приватная реализация [SelectStyle].
 *
 * @param textFieldStyle Стиль текстового поля
 * @param buttonStyle Стиль кнопки
 * @param dropdownStyle Стиль выпадающего меню
 * @param selectItemStyle Стиль элементов списка
 */
private data class DefaultSelectStyle(
    override val textFieldStyle: TextFieldStyle,
    override val buttonStyle: ButtonStyle,
    override val dropdownStyle: DropdownMenuStyle,
    override val selectItemStyle: SelectItemStyle,
) : SelectStyle {

    class Builder : SelectStyleBuilder {
        private var textFieldStyle: TextFieldStyle? = null
        private var buttonStyle: ButtonStyle? = null
        private var dropdownStyle: DropdownMenuStyle? = null
        private var selectItemStyle: SelectItemStyle? = null

        override fun textFieldStyle(textFieldStyle: TextFieldStyle) = apply {
            this.textFieldStyle = textFieldStyle
        }

        override fun buttonStyle(buttonStyle: ButtonStyle) = apply {
            this.buttonStyle = buttonStyle
        }

        override fun dropdownStyle(dropdownStyle: DropdownMenuStyle) = apply {
            this.dropdownStyle = dropdownStyle
        }

        override fun selectItemStyle(selectItemStyle: SelectItemStyle) = apply {
            this.selectItemStyle = selectItemStyle
        }

        override fun style(): SelectStyle = DefaultSelectStyle(
            textFieldStyle = textFieldStyle ?: TextFieldStyle.builder().style(),
            buttonStyle = buttonStyle ?: ButtonStyle.basicButtonBuilder().style(),
            dropdownStyle = dropdownStyle ?: DropdownMenuStyle.builder().style(),
            selectItemStyle = selectItemStyle ?: SelectItemStyle.builder().style(),
        )
    }
}
