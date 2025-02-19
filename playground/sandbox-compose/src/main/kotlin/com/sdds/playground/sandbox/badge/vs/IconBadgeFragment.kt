package com.sdds.playground.sandbox.badge.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.badge.BadgeUiState
import com.sdds.testing.vs.badge.iconBadge
import com.sdds.uikit.IconBadge

/**
 * Фрагмент с компонентом IconBadge
 */
internal class IconBadgeFragment : ComponentFragment<BadgeUiState, IconBadge>() {
    override val componentViewModel by viewModels<IconBadgeParametersViewModel> {
        IconBadgeParametersViewModelFactory(
            defaultState = getState { BadgeUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): IconBadge {
        return iconBadge(contextWrapper)
    }

    override fun onComponentUpdate(component: IconBadge?, state: BadgeUiState) = Unit
}
