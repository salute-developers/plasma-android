package com.sdds.playground.sandbox.textfield.vs

import android.view.ContextThemeWrapper
import android.view.KeyEvent
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.stylesProvider
import com.sdds.testing.vs.textfield.TextFieldUiState
import com.sdds.testing.vs.textfield.applyState
import com.sdds.testing.vs.textfield.textField
import com.sdds.uikit.TextField

/**
 * Фрагмент с компонентом TextField
 * @author Малышев Александр on 19.08.2024
 */
internal class TextFieldFragment : ComponentFragment<TextFieldUiState, TextField>() {

    override val componentViewModel by viewModels<TextFieldViewModel> {
        TextFieldViewModelFactory(getState { TextFieldUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): TextField {
        return textField(contextWrapper, onDeleteChip = { componentViewModel.deleteChip(it) })
            .apply {
                addChipsHandler()
            }
    }

    override fun onComponentUpdate(component: TextField?, state: TextFieldUiState) {
        component?.applyState(state, componentViewModel.stylesProvider.textField.colorState(state.colorVariant))
    }

    private var shouldDeleteChip: Boolean = false

    override fun onDestroyView() {
        super.onDestroyView()
        componentRef?.chipAdapter = null
    }

    private fun TextField.addChipsHandler() {
        editText.doAfterTextChanged {
            val editable = it ?: return@doAfterTextChanged
            shouldDeleteChip =
                if (editable.isNotBlank() && editable[editable.length - 1].isWhitespace()) {
                    val currentValue = editable.toString().trim()
                    componentViewModel.addChip(currentValue)
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
                    val chipToDelete = componentViewModel.deleteChip(chipsCount - 1)
                    editText.append(chipToDelete?.text)
                    chipToDelete != null
                }

                else -> false
            }
        }
    }
}
