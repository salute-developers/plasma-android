package com.sdds.playground.sandbox.textfield.vs

import android.view.ContextThemeWrapper
import android.view.KeyEvent
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.stylesProvider
import com.sdds.uikit.TextField
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом TextField
 * @author Малышев Александр on 19.08.2024
 */
internal class TextFieldFragment : ComponentFragment<TextFieldUiState, TextField>() {

    override val componentViewModel by viewModels<TextFieldViewModel> {
        TextFieldViewModelFactory(getState { TextFieldUiState() })
    }

    private val adapter: ChipAdapter by lazy {
        ChipAdapter().apply {
            onDeleteChip { componentViewModel.deleteChip(it) }
        }
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): TextField {
        return TextField(contextWrapper)
            .apply {
                chipAdapter = adapter
                addChipsHandler()
            }
            .apply { id = R.id.textField }
    }

    override fun onComponentUpdate(component: TextField?, state: TextFieldUiState) {
        component?.apply {
            val stylesProvider = componentViewModel.stylesProvider
            val textFieldStyles = stylesProvider.textField
            colorState = textFieldStyles.colorState(state.colorVariant)
            label = state.labelText
            placeholder = state.placeholderText
            state.valueText?.let { this.value = it }
            caption = state.captionText
            prefixText = state.prefix
            suffixText = state.suffix
            if (state.icon) {
                setIcon(Icons.drawable.ic_scribble_diagonal_24)
            } else {
                setIcon(null)
            }
            if (state.action) {
                setAction(Icons.drawable.ic_shazam_24)
            } else {
                setAction(null)
            }
            setActionClickListener {
                Toast.makeText(requireContext(), "action clicked", Toast.LENGTH_SHORT)
                    .show()
            }
            isEnabled = state.enabled
            isReadOnly = state.readOnly
        }
    }

    private var shouldDeleteChip: Boolean = false

    override fun onDestroyView() {
        super.onDestroyView()
        componentRef?.chipAdapter = adapter
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
