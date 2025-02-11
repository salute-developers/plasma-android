package com.sdds.playground.sandbox.badge.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
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
        return IconBadge(contextWrapper)
            .apply { id = com.sdds.playground.sandbox.R.id.icon_badge }
    }

    override fun onComponentUpdate(component: IconBadge?, state: BadgeUiState) {
        component?.apply {
            setDrawableStartRes(R.drawable.ic_plasma_24)
        }
    }
}
