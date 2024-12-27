package com.sdds.playground.sandbox.progress.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.ProgressBar
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class ProgressBarFragment : ComponentFragment() {

    private val progressBarParametersViewModel by viewModels<ProgressBarParametersViewModel> {
        ProgressBarParametersViewModelFactory(getState { ProgressUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override val componentLayout: ProgressBar
        get() = ProgressBar(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.progressBar }
            .also { progressBar = it }

    override val propertiesOwner: PropertiesOwner
        get() = progressBarParametersViewModel

    private var currentVariant: ProgressVariant = ProgressVariant.Default
    private var progressBar: ProgressBar? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressBarParametersViewModel.progressUiState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                progressBar?.apply {
                    setProgress(state.progress, true)
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
