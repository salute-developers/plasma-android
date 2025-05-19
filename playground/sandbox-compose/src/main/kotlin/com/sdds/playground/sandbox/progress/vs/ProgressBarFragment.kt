package com.sdds.playground.sandbox.progress.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.progress.ProgressUiState
import com.sdds.testing.vs.progress.applyState
import com.sdds.testing.vs.progress.progressBar
import com.sdds.uikit.ProgressBar

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class ProgressBarFragment : ComponentFragment<ProgressUiState, ProgressBar, ProgressBarViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ProgressBarViewModelFactory(
            defaultState = getState { ProgressUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ProgressBar {
        return progressBar(contextWrapper)
    }

    override fun onComponentUpdate(component: ProgressBar?, state: ProgressUiState) {
        component?.applyState(state)
    }
}
