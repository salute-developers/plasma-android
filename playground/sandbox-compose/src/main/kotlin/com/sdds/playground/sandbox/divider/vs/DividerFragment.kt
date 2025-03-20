package com.sdds.playground.sandbox.divider.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.divider.DividerUiState
import com.sdds.testing.vs.divider.divider
import com.sdds.uikit.Divider

/**
 * Фрагмент с компонентом Divider
 */
internal class DividerFragment : ComponentFragment<DividerUiState, Divider>() {

    override val componentViewModel by viewModels<DividerViewModel> {
        DividerViewModelFactory(
            defaultState = getState { DividerUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): Divider {
        return divider(contextWrapper)
    }

    override fun onComponentUpdate(component: Divider?, state: DividerUiState) = Unit
}
