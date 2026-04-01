package com.sdds.playground.sandbox.badge.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Badge
import com.sdds.uikit.fixtures.stories.badge.BadgeUiState
import com.sdds.uikit.fixtures.stories.badge.applyState
import com.sdds.uikit.fixtures.stories.badge.badge

/**
 * Фрагмент с компонентом Badge
 */
internal class BadgeFragment : ComponentFragment<BadgeUiState, Badge, BadgeParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        BadgeParametersViewModelFactory(
            defaultState = getState { BadgeUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Badge {
        return badge(contextWrapper)
    }

    override fun onComponentUpdate(component: Badge?, state: BadgeUiState) {
        component?.applyState(state)
    }
}
