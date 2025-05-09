package com.sdds.playground.sandbox.badge.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.badge.BadgeUiState
import com.sdds.testing.vs.badge.iconBadge
import com.sdds.uikit.IconBadge

/**
 * Фрагмент с компонентом IconBadge
 */
internal class IconBadgeFragment : ComponentFragment<BadgeUiState, IconBadge, IconBadgeParametersViewModel>() {
    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        IconBadgeParametersViewModelFactory(
            defaultState = getState { BadgeUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): IconBadge {
        return iconBadge(contextWrapper)
    }

    override fun onComponentUpdate(component: IconBadge?, state: BadgeUiState) = Unit
}
