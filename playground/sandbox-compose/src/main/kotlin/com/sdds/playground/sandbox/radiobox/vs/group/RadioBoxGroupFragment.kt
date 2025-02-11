package com.sdds.playground.sandbox.radiobox.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxUiState
import com.sdds.uikit.RadioBox
import com.sdds.uikit.RadioBoxGroup

/**
 * Фрагмент с компонентом RadioBox
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxGroupFragment : ComponentFragment<RadioBoxUiState, RadioBoxGroup>() {

    override val componentViewModel by viewModels<RadioBoxGroupViewModel> {
        RadioBoxGroupViewModelFactory(getState { RadioBoxUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): RadioBoxGroup {
        return RadioBoxGroup(contextWrapper)
            .apply { id = R.id.radioBox_group }
    }

    override fun onComponentUpdate(component: RadioBoxGroup?, state: RadioBoxUiState) {
        component?.populate(state)
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    private fun RadioBoxGroup.populate(state: RadioBoxUiState) {
        removeAllViews()
        repeat(3) {
            val radioBox = RadioBox(requireContext())
                .apply {
                    text = state.label
                    description = state.description
                    id = it
                }
            addView(radioBox)
        }
    }
}
