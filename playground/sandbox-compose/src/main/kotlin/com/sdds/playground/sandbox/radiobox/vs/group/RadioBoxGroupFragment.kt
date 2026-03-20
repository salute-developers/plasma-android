package com.sdds.playground.sandbox.radiobox.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.RadioBoxGroup
import com.sdds.uikit.fixtures.stories.radiobox.RadioBoxUiState
import com.sdds.uikit.fixtures.stories.radiobox.applyState
import com.sdds.uikit.fixtures.stories.radiobox.radioBoxGroup

/**
 * Фрагмент с компонентом RadioBoxGroup
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxGroupFragment : ComponentFragment<RadioBoxUiState, RadioBoxGroup, RadioBoxGroupViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        RadioBoxGroupViewModelFactory(
            defaultState = getState { RadioBoxUiState() },
            componentKey = componentKey,
        )
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
