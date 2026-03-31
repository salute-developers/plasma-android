package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AutocompleteStyle] для компонента [Autocomplete]
 */
val LocalAutocompleteStyle: ProvidableCompositionLocal<AutocompleteStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { AutocompleteStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface AutocompleteStyle : Style {

    /**
     * Стиль текстового поля [TextFieldStyle]
     */
    val textFieldStyle: TextFieldStyle

    /**
     * Стиль дропдауна [DropdownMenuStyle]
     */
    val dropdownStyle: DropdownMenuStyle

    companion object {
        /**
         * Возвращает экземпляр [AutocompleteStyleBuilder]
         */
        fun builder(receiver: Any? = null): AutocompleteStyleBuilder =
            DefaultAutocompleteStyle.Builder()
    }
}

/**
 * Билдер стиля компонента [Autocomplete]
 */
interface AutocompleteStyleBuilder : StyleBuilder<AutocompleteStyle> {
    /**
     * Устанавливает стиль текстового поля [textFieldStyle]
     */
    fun textFieldStyle(textFieldStyle: TextFieldStyle): AutocompleteStyleBuilder

    /**
     * Устанавливает стиль раскрыващегося списка [dropdownStyle]
     */
    fun dropdownStyle(dropdownStyle: DropdownMenuStyle): AutocompleteStyleBuilder
}

private data class DefaultAutocompleteStyle(
    override val textFieldStyle: TextFieldStyle,
    override val dropdownStyle: DropdownMenuStyle,
) : AutocompleteStyle {
    class Builder : AutocompleteStyleBuilder {
        private var textFieldStyle: TextFieldStyle? = null
        private var dropdownStyle: DropdownMenuStyle? = null

        override fun textFieldStyle(textFieldStyle: TextFieldStyle): AutocompleteStyleBuilder =
            apply { this.textFieldStyle = textFieldStyle }

        override fun dropdownStyle(dropdownStyle: DropdownMenuStyle): AutocompleteStyleBuilder =
            apply { this.dropdownStyle = dropdownStyle }

        override fun style(): AutocompleteStyle = DefaultAutocompleteStyle(
            textFieldStyle = textFieldStyle ?: TextFieldStyle.builder().style(),
            dropdownStyle = dropdownStyle ?: DropdownMenuStyle.builder().style(),
        )
    }
}
