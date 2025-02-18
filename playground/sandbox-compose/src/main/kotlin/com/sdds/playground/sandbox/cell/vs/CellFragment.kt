package com.sdds.playground.sandbox.cell.vs

import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.databinding.LayoutComponentCellBinding
import com.sdds.uikit.CellLayout

/**
 * Фрагмент с компонентом CellLayout
 * @author Малышев Александр on 14.10.2024
 */
internal class CellFragment : ComponentFragment<CellUiState, CellLayout>() {

    override val componentViewModel by viewModels<CellParametersViewModel> {
        CellParametersViewModelFactory(getState { CellUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_160x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): CellLayout {
        return LayoutComponentCellBinding.inflate(
            LayoutInflater.from(contextWrapper),
        )
            .also { cellLayout = it }.root
            .apply { id = R.id.cell }
    }

    override fun onComponentUpdate(component: CellLayout?, state: CellUiState) {
        cellLayout?.update(state)
    }

    private var cellLayout: LayoutComponentCellBinding? = null

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
