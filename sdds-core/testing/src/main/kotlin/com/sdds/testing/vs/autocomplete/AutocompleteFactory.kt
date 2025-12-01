package com.sdds.testing.vs.autocomplete

import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StyleRes
import androidx.core.view.isVisible
import com.sdds.testing.databinding.LayoutComponentAutocompleteBinding
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Autocomplete
import com.sdds.uikit.ListItem

private val AutocompleteSuggestions = listOf(
    ListItem.simpleItem(0, "Иван Иванов", hasDisclosure = false),
    ListItem.simpleItem(1, "Пётр Петров", hasDisclosure = false),
    ListItem.simpleItem(2, "Сергей Сергеев", hasDisclosure = false),
    ListItem.simpleItem(3, "Алексей Алексеев", hasDisclosure = false),
    ListItem.simpleItem(4, "Анна Смирнова", hasDisclosure = false),
    ListItem.simpleItem(5, "Мария Кузнецова", hasDisclosure = false),
    ListItem.simpleItem(6, "Дмитрий Попов", hasDisclosure = false),
    ListItem.simpleItem(7, "Елена Соколова", hasDisclosure = false),
    ListItem.simpleItem(8, "Ольга Морозова", hasDisclosure = false),
    ListItem.simpleItem(9, "Николай Волков", hasDisclosure = false),
)

/**
 * Создает [Autocomplete]
 */
fun autocomplete(
    context: Context,
    @StyleRes style: Int? = null,
    state: AutocompleteUiState = AutocompleteUiState(),
): Autocomplete {
    return LayoutComponentAutocompleteBinding.inflate(LayoutInflater.from(context.styleWrapper(style)))
        .root
        .apply {
            textField.caption = "Введите имя Алексей"
            textField.placeholder = "Сотрудник"
            textField.setAction(com.sdds.icons.R.drawable.ic_search_24)
            setItemProducer { text ->
                AutocompleteSuggestions.filter { it.title.lowercase().contains(text.toString().lowercase()) }
            }
        }
        .applyState(state)
}

/**
 * Применяет [AutocompleteUiState] к [Autocomplete]
 */
fun Autocomplete.applyState(state: AutocompleteUiState): Autocomplete = apply {
    getEmptyStateView()?.isVisible = state.withEmptyState
    getFooterView()?.isVisible = state.showLoading
}
