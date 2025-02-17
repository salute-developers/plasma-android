package com.sdds.playground.sandbox.badge.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Badge

/**
 * Фрагмент с компонентом Badge
 */
internal class BadgeFragment : ComponentFragment<BadgeUiState, Badge>() {

    override val componentViewModel by viewModels<BadgeParametersViewModel> {
        BadgeParametersViewModelFactory(
            defaultState = getState { BadgeUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Badge {
        return Badge(contextWrapper)
            .apply { id = com.sdds.playground.sandbox.R.id.badge }
    }

    override fun onComponentUpdate(component: Badge?, state: BadgeUiState) {
        component?.apply {
            text = state.label
            if (state.contentLeft) {
                setDrawableStartRes(R.drawable.ic_plasma_24)
            } else {
                drawableStart = null
            }

            if (state.contentRight) {
                setDrawableEndRes(R.drawable.ic_plasma_24)
            } else {
                drawableEnd = null
            }
        }
    }
}
