package com.sdds.playground.sandbox.radiobox.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.radiobox.RadioBoxUiState
import com.sdds.testing.vs.radiobox.applyState
import com.sdds.testing.vs.radiobox.radioBoxGroup
import com.sdds.uikit.RadioBoxGroup

/**
 * Фрагмент с компонентом RadioBox
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxGroupFragment : ComponentFragment<RadioBoxUiState, RadioBoxGroup>() {

    override val componentViewModel by viewModels<RadioBoxGroupViewModel> {
        RadioBoxGroupViewModelFactory(getState { RadioBoxUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): RadioBoxGroup {
        return radioBoxGroup(contextWrapper)
    }

    override fun onComponentUpdate(component: RadioBoxGroup?, state: RadioBoxUiState) {
        component?.applyState(state)
    }
}
