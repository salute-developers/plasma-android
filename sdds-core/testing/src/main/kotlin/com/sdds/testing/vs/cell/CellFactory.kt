package com.sdds.testing.vs.cell

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.sdds.testing.databinding.LayoutComponentCellBinding
import com.sdds.uikit.CellLayout

/**
 * Фабрика для создания [CellLayout]
 */
fun cellLayout(
    context: Context,
    style: Int? = null,
    state: CellUiState? = null,
): CellLayout {
    val wrapper = style?.let { ContextThemeWrapper(context, it) } ?: context
    return cellLayoutBinding(wrapper)
        .applyState(state)
        .root
        .apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
}

/**
 * Фабрика для создания [LayoutComponentCellBinding]
 */
fun cellLayoutBinding(
    context: Context,
): LayoutComponentCellBinding {
    return LayoutComponentCellBinding.inflate(LayoutInflater.from(context))
}

/**
 * Применяет [CellUiState] к [LayoutComponentCellBinding]
 */
fun LayoutComponentCellBinding.applyState(state: CellUiState?): LayoutComponentCellBinding = apply {
    state ?: return this@apply
    componentCellStartAvatar.isVisible = state.startContent == CellContent.AVATAR
    componentCellStartSwitch.isVisible = state.startContent == CellContent.SWITCH
    componentCellStartRadioBox.isVisible = state.startContent == CellContent.RADIOBOX
    componentCellStartCheckBox.isVisible = state.startContent == CellContent.CHECKBOX
    componentCellStartIconButton.isVisible = state.startContent == CellContent.ICON

    componentCellEndAvatar.isVisible = state.endContent == CellContent.AVATAR
    componentCellEndSwitch.isVisible = state.endContent == CellContent.SWITCH
    componentCellEndRadioBox.isVisible = state.endContent == CellContent.RADIOBOX
    componentCellEndCheckBox.isVisible = state.endContent == CellContent.CHECKBOX
    componentCellEndIconButton.isVisible = state.endContent == CellContent.ICON

    componentCellLabel.apply {
        text = state.label
        isVisible = state.label.isNotBlank()
    }

    componentCellTitle.apply {
        text = state.title
        isVisible = state.title.isNotBlank()
    }

    componentCellSubtitle.apply {
        text = state.subtitle
        isVisible = state.subtitle.isNotBlank()
    }

    root.disclosureEnabled = state.hasDisclosure
    root.disclosureText = state.disclosureText
}
