package com.sdds.playground.sandbox.cell.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.databinding.LayoutComponentCellBinding
import com.sdds.testing.vs.cell.CellUiState
import com.sdds.testing.vs.cell.applyState
import com.sdds.testing.vs.cell.cellLayoutBinding
import com.sdds.uikit.CellLayout

/**
 * Фрагмент с компонентом CellLayout
 * @author Малышев Александр on 14.10.2024
 */
internal class CellFragment : ComponentFragment<CellUiState, CellLayout, CellParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CellParametersViewModelFactory(
            defaultState = getState { CellUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_160x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    private var cellLayout: LayoutComponentCellBinding? = null

    override fun getComponent(contextWrapper: ContextThemeWrapper): CellLayout {
        return cellLayoutBinding(contextWrapper)
            .also { cellLayout = it }.root
            .apply { id = R.id.cell }
    }

    override fun onComponentUpdate(component: CellLayout?, state: CellUiState) {
        cellLayout?.applyState(state)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cellLayout = null
    }
}
