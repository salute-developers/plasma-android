package com.sdds.playground.sandbox.radiobox.vs.group

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxGroupVariant
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxParametersViewModel
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxParametersViewModelFactory
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxUiState
import com.sdds.playground.sandbox.radiobox.vs.toGroupVariant
import com.sdds.uikit.RadioBox
import com.sdds.uikit.RadioBoxGroup
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом RadioBox
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxGroupFragment : ComponentFragment() {

    private val radioBoxViewModel by viewModels<RadioBoxParametersViewModel> {
        RadioBoxParametersViewModelFactory(true, getState { RadioBoxUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override val componentLayout: RadioBoxGroup
        get() = RadioBoxGroup(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.radioBox_group }
            .also { radioBoxGroup = it }

    override val propertiesOwner: PropertiesOwner
        get() = radioBoxViewModel

    private var currentVariant: RadioBoxGroupVariant = RadioBoxGroupVariant.RadioBoxGroupM
    private var radioBoxGroup: RadioBoxGroup? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        radioBoxViewModel.radioBoxState
            .onEach { state ->
                val newGroupVariant = state.variant.toGroupVariant()
                if (currentVariant != newGroupVariant) {
                    currentVariant = newGroupVariant
                    dispatchComponentStyleChanged()
                }
                radioBoxGroup?.populate(state)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    private fun RadioBoxGroup.populate(state: RadioBoxUiState) {
        removeAllViews()
        val theme = ContextThemeWrapper(context, state.variant.styleRes)
        repeat(3) {
            val radioBox = RadioBox(theme)
                .apply {
                    text = state.label
                    description = state.description
                    id = it
                }
            addView(radioBox)
        }
    }
}
