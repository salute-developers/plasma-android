package com.sdds.playground.sandbox.textfield

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.TextField
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом TextField
 * @author Малышев Александр on 19.08.2024
 */
internal open class TextFieldFragment : ComponentFragment() {

    private val textFieldViewModel by viewModels<TextFieldViewModel> {
        TextFieldViewModelFactory(
            mode = mode,
            defaultState = getState { TextFieldUiState(currentVariant) },
        )
    }

    private val adapter: ChipAdapter by lazy {
        ChipAdapter().apply {
            onDeleteChip { textFieldViewModel.deleteChip(it) }
        }
    }

    protected open val mode: TextFieldViewModel.Mode
        get() = TextFieldViewModel.Mode.TextField

    override val componentLayout: TextField
        get() = TextField(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .also { textField = it }
            .apply {
                chipAdapter = adapter
                addChipsHandler()
            }

    override val propertiesOwner: PropertiesOwner
        get() = textFieldViewModel

    private var currentVariant: FieldVariant = when (mode) {
        TextFieldViewModel.Mode.TextField -> TextFieldVariant.TextFieldMOuterLabel
        TextFieldViewModel.Mode.TextArea -> TextAreaVariant.TextAreaMOuterLabel
    }

    private var textField: TextField? = null
    private var shouldDeleteChip: Boolean = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textFieldViewModel.textFieldUiState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                textField?.apply {
                    this.state = state.state
                    label = state.labelText
                    placeholder = state.placeholderText
                    caption = state.captionText
                    counter = state.counterText
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
                        Toast.makeText(requireContext(), "action clicked", Toast.LENGTH_SHORT).show()
                    }
                    isEnabled = state.enabled
                    isReadOnly = state.readOnly
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)

        textFieldViewModel.chips
            .onEach { adapter.updateState(it) }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        textField?.chipAdapter = adapter
        textField = null
    }

    private fun TextField.addChipsHandler() {
        editText.doAfterTextChanged {
            val editable = it ?: return@doAfterTextChanged
            shouldDeleteChip = if (editable.isNotBlank() && editable[editable.length - 1].isWhitespace()) {
                val currentValue = editable.toString().trim()
                textFieldViewModel.addChip(currentValue)
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
                    val chipToDelete = textFieldViewModel.deleteChip(chipsCount - 1)
                    editText.append(chipToDelete?.text)
                    chipToDelete != null
                }
                else -> false
            }
        }
    }
}
