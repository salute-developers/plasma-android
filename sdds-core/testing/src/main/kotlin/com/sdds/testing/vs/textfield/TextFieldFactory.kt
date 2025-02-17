package com.sdds.testing.vs.textfield

import android.content.Context
import android.widget.Toast
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.TextArea
import com.sdds.uikit.TextField
import com.sdds.uikit.colorstate.ColorState

/**
 * Фабрика для создания [TextField]
 */
fun textField(
    context: Context,
    style: Int? = null,
    colorState: ColorState? = null,
    state: TextFieldUiState? = null,
    onDeleteChip: (Int) -> Unit = {},
): TextField {
    return TextField(context.styleWrapper(style))
        .apply {
            id = R.id.textField
            chipAdapter = ChipAdapter().apply {
                onDeleteChip(onDeleteChip)
            }
        }
        .applyState(state, colorState)
}

/**
 * Фабрика для создания [TextArea]
 */
fun textArea(
    context: Context,
    style: Int? = null,
    colorState: ColorState? = null,
    state: TextFieldUiState? = null,
    onDeleteChip: (Int) -> Unit = {},
): TextArea {
    return TextArea(context.styleWrapper(style))
        .apply {
            id = R.id.textField
            chipAdapter = ChipAdapter().apply {
                onDeleteChip(onDeleteChip)
            }
        }
        .applyState(state, colorState)
}

/**
 * Применяет [TextFieldUiState] и [ColorState] к [TextField]
 */
fun TextField.applyState(state: TextFieldUiState?, colorState: ColorState?): TextField =
    applyCommonState(state, colorState)

/**
 * Применяет [TextFieldUiState] и [ColorState] к [TextArea]
 */
fun TextArea.applyState(state: TextFieldUiState?, colorState: ColorState?): TextArea =
    applyCommonState(state, colorState)
        .apply {
            state ?: return@apply
            counter = state.counterText
        }

private fun <T : TextField> T.applyCommonState(state: TextFieldUiState?, colorState: ColorState?): T = apply {
    state ?: return@apply
    colorState ?: return@apply

    (chipAdapter as? ChipAdapter)?.updateState(state.chipData)

    this.colorState = colorState
    label = state.labelText
    placeholder = state.placeholderText
    state.valueText?.let { this.value = it }
    caption = state.captionText
    prefixText = state.prefix
    suffixText = state.suffix
    if (state.icon) {
        setIcon(com.sdds.icons.R.drawable.ic_scribble_diagonal_24)
    } else {
        setIcon(null)
    }
    if (state.action) {
        setAction(com.sdds.icons.R.drawable.ic_shazam_24)
    } else {
        setAction(null)
    }
    setActionClickListener {
        Toast.makeText(context, "action clicked", Toast.LENGTH_SHORT)
            .show()
    }
    isEnabled = state.enabled
    isReadOnly = state.readOnly
}

/**
 * Пример адаптера для чипов в TextField
 * @author Малышев Александр on 11.09.2024
 */
private class ChipAdapter : ChipGroup.Adapter() {

    private val chips: MutableList<ExampleChipData> = mutableListOf()

    private var _chipDeleteDelegate: ChipDeleteDelegate? = null

    fun interface ChipDeleteDelegate {
        fun onDelete(index: Int)
    }

    fun updateState(newChips: List<ExampleChipData>) {
        chips.clear()
        chips.addAll(newChips)
        notifyChipGroupChanged()
    }

    fun onDeleteChip(delegate: ChipDeleteDelegate) {
        _chipDeleteDelegate = delegate
    }

    override fun getCount(): Int = chips.size

    override fun onBindChip(chipView: Chip, position: Int) {
        chipView.apply {
            text = chips[position].text
            setDrawableEndRes(com.sdds.icons.R.drawable.ic_close_24)
            setOnClickListener { _chipDeleteDelegate?.onDelete(position) }
        }
    }

    override fun onUnbindChip(chipView: Chip) {
        super.onUnbindChip(chipView)
        chipView.setOnClickListener(null)
    }
}
