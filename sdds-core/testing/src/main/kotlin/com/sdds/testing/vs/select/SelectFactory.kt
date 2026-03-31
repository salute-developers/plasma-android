package com.sdds.testing.vs.select

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.view.isVisible
import com.sdds.icons.R
import com.sdds.testing.databinding.LayoutComponentSelectBinding
import com.sdds.testing.vs.popover.toPlacementMode
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Button
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup
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
        .apply {
            setTriggerOpenStateIcon(R.drawable.ic_chevron_up_24)
            setTriggerClosedStateIcon(R.drawable.ic_chevron_down_24)
        }
        .applyState(state)
}

/**
 * Применяет [SelectUiState] к [Select]
 */
fun Select.applyState(state: SelectUiState): Select = apply {
    emptyStateEnabled = state.withEmptyState
    if (!state.showLoading && !state.withEmptyState) {
        setItems(SelectSuggestions)
    } else {
        clearItems()
    }
    adapter?.selectionMode = state.selectionMode
    checkAndConfigureTriggerIfNeed(state)
    dropdownPlacementMode = state.dropdownPlacementMode.toPlacementMode()
    isReadOnly = state.readOnly
    isEnabled = state.enabled
    getFooterView()?.isVisible = state.showLoading
}

private fun Select.checkAndConfigureTriggerIfNeed(state: SelectUiState) {
    val existingTrigger = if (getTrigger() is TextField) TriggerType.TextField else TriggerType.Button
    if (existingTrigger != state.triggerType) {
        val trigger = when (state.triggerType) {
            TriggerType.TextField -> getTextFieldTrigger(this.context)
            else -> {
                getButtonTrigger(this.context)
            }
        }
        setTrigger(trigger)
        setOnItemSelectedListener { item ->
            val selected = getSelectedItems()
            val list = selected?.toStringList()
            when (trigger) {
                is Button -> {
                    if (adapter?.selectionMode == Select.SelectionMode.SINGLE) {
                        trigger.text = selected?.firstOrNull()?.title ?: "Сотрудник"
                    } else {
                        trigger.text = list?.joinToString(",")?.ifEmpty { "Сотрудник" }
                    }
                }
                is TextField -> {
                    if (adapter?.selectionMode == Select.SelectionMode.SINGLE) {
                        trigger.value = selected?.firstOrNull()?.title
                    } else {
                        trigger.placeholder = if (list.isNullOrEmpty()) "Сотрудник" else null
                        (trigger.chipAdapter as? ChipAdapter)?.updateState(list)
                    }
                }
            }
        }
    }
}

private fun List<ListItem>.toStringList(): List<String> {
    return map { it.title }
}

private fun getTextFieldTrigger(context: Context) =
    TextField(context).apply {
        val lp = getLayoutParamsForTrigger(context)
        placeholder = "Сотрудник"
        caption = "Выберете имя"
        setIcon(R.drawable.ic_search_24)
        layoutParams = lp
        chipAdapter = ChipAdapter()
    }

private fun getButtonTrigger(context: Context) =
    Button(context).apply {
        val lp = getLayoutParamsForTrigger(context)
        iconPosition = Button.IconPosition.TextEnd
        spacing = Button.Spacing.SpaceBetween
        text = "Сотрудник"
        layoutParams = lp
    }

private fun getLayoutParamsForTrigger(context: Context) = ViewGroup.LayoutParams(
    context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_130x),
    ViewGroup.LayoutParams.WRAP_CONTENT,
)

/**
 * Пример адаптера для чипов в TextField
 */
private class ChipAdapter : ChipGroup.Adapter() {

    private val chips: MutableList<String> = mutableListOf()

    fun updateState(newChips: List<String>?) {
        chips.clear()
        if (newChips != null) chips.addAll(newChips)
        notifyChipGroupChanged()
    }

    override fun getCount(): Int = chips.size

    override fun onBindChip(chipView: Chip, position: Int) {
        chipView.apply {
            text = chips[position]
        }
    }

    override fun onUnbindChip(chipView: Chip) {
        super.onUnbindChip(chipView)
        chipView.setOnClickListener(null)
    }
}
