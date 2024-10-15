package com.sdds.playground.sandbox.cell

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.databinding.LayoutComponentCellBinding
import com.sdds.uikit.CellLayout
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом CellLayout
 * @author Малышев Александр on 14.10.2024
 */
internal class CellFragment : ComponentFragment() {

    private val cellParametersViewModel by viewModels<CellParametersViewModel> {
        CellParametersViewModelFactory(getState { CellUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_160x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override val componentLayout: CellLayout
        get() = LayoutComponentCellBinding.inflate(
            LayoutInflater.from(ContextThemeWrapper(requireContext(), currentVariant.styleRes)),
        ).also { cellLayout = it }.root

    override val propertiesOwner: PropertiesOwner
        get() = cellParametersViewModel

    private var currentVariant: CellVariant = CellVariant.CellM
    private var cellLayout: LayoutComponentCellBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cellParametersViewModel.cellUiState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                cellLayout?.update(state)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cellLayout = null
    }

    private fun LayoutComponentCellBinding.update(state: CellUiState) {
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
}
