package com.sdds.playground.sandbox.textfield

import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup

/**
 * Пример адаптера для чипов в TextField
 * @author Малышев Александр on 11.09.2024
 */
internal class ChipAdapter : ChipGroup.Adapter() {

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
