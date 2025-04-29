package com.sdds.playground.sandbox.flow.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.flow.FlowUiState
import com.sdds.testing.vs.flow.applyState
import com.sdds.testing.vs.flow.flowLayout
import com.sdds.uikit.FlowLayout

/**
 * Фрагмент с компонентом FlowLayout
 * @author Малышев Александр on 13.03.2025
 */
internal class FlowFragment : ComponentFragment<FlowUiState, FlowLayout, FlowViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        FlowViewModelFactory(
            defaultState = getState { FlowUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): FlowLayout {
        return flowLayout(contextWrapper)
            .apply { id = R.id.flow }
    }

    override fun onComponentUpdate(component: FlowLayout?, state: FlowUiState) {
        component?.applyState(state)
    }
}
