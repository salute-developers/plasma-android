package com.sdds.testing.vs.select

import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StyleRes
import androidx.core.view.isVisible
import com.sdds.testing.databinding.LayoutComponentSelectBinding
import com.sdds.testing.vs.popover.toPlacementMode
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Button
import com.sdds.uikit.ListItem
import com.sdds.uikit.Select
import com.sdds.uikit.TextField

private val SelectSuggestions = listOf(
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
 * Создает [Select]
 */
fun select(
    context: Context,
    @StyleRes style: Int? = null,
    state: SelectUiState = SelectUiState(),
): Select {
    return LayoutComponentSelectBinding.inflate(LayoutInflater.from(context.styleWrapper(style)))
        .root
        .applyState(state)
}

/**
 * Применяет [SelectUiState] к [Select]
 */
fun Select.applyState(state: SelectUiState): Select = apply {
//    emptyStateEnabled = state.withEmptyState
    val trigger = when (state.triggerType) {
        TriggerType.TextField -> getTextFieldTrigger(this.context)
        else -> getButtonTrigger(this.context)
    }
    setTrigger(trigger)
    setItems(SelectSuggestions)
    dropdownPlacementMode = state.dropdownPlacementMode.toPlacementMode()
    getFooterView()?.isVisible = state.showLoading
}

private fun getTextFieldTrigger(context: Context) =
    TextField(context).apply {
        placeholder = "Сотрудник"
        caption = "Выберете имя"
        setAction(com.sdds.icons.R.drawable.ic_search_24)
    }

private fun getButtonTrigger(context: Context) =
    Button(context).apply {
        value = "Сотрудник"
    }
