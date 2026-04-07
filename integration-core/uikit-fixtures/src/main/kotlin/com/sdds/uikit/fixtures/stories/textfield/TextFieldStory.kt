package com.sdds.uikit.fixtures.stories.textfield

import android.content.Context
import android.view.KeyEvent
import androidx.core.widget.doAfterTextChanged
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.TextField
import com.sdds.uikit.fixtures.stories.TextFieldUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.TextFieldUiStateTransformer
import kotlin.text.isWhitespace

/**
 * История компонента TextField для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации TextField.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.TextField
 */
@Story
object TextFieldStory : ViewBaseStory<TextFieldUiState, TextField>(
    ComponentKey.TextField,
    TextFieldUiState(),
    TextFieldUiStatePropertiesProducer,
    TextFieldUiStateTransformer,
) {
    private var shouldDeleteChip: Boolean = false

    override fun getComponent(context: Context): TextField {
        return textField(context, onDeleteChip = { deleteChip(it) })
            .apply {
                addChipsHandler()
            }
    }

    override fun onComponentUpdate(component: TextField, state: TextFieldUiState) {
        component.applyState(state)
    }

    private fun TextField.addChipsHandler() {
        editText.doAfterTextChanged {
            val editable = it ?: return@doAfterTextChanged
            shouldDeleteChip =
                if (editable.isNotBlank() && editable[editable.length - 1].isWhitespace()) {
                    val currentValue = editable.toString().trim()
                    addChip(currentValue)
                    true
                } else {
                    editable.isEmpty()
                }
        }
        editText.setOnKeyListener { _, keyCode, _ ->
            when (keyCode) {
                KeyEvent.KEYCODE_DEL -> {
                    val chipsCount = chipAdapter?.getCount() ?: 0
                    if (!value.isNullOrEmpty() || chipsCount == 0 || !shouldDeleteChip) return@setOnKeyListener false
                    val chipToDelete = deleteChip(chipsCount - 1)
                    editText.append(chipToDelete)
                    chipToDelete != null
                }

                else -> false
            }
        }
    }

    private fun addChip(text: String): Boolean {
        if (text.isEmpty() || !uiState.value.hasChips) return false
        val chipsList = uiState.value.chipData.toMutableList()
        chipsList.add(ExampleChipData(text))
        updateState(uiState.value.copy(chipData = chipsList))
        return true
    }

    private fun deleteChip(index: Int): String? {
        val chips = uiState.value.chipData
        if (index < 0 || index >= chips.size) return null
        val chipsList = chips.toMutableList()
        val chip = chipsList[index]
        chipsList.removeAt(index)
        updateState(uiState.value.copy(chipData = chipsList))
        return chip.text
    }
}
