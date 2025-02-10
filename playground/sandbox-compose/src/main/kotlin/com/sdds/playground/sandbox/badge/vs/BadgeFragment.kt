package com.sdds.playground.sandbox.badge.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.Badge
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом Badge
 */
internal class BadgeFragment : ComponentFragment() {
    private val badgeParametersViewModel by viewModels<BadgeParametersViewModel> {
        BadgeParametersViewModelFactory(
            type = BadgeType.Badge,
            defaultState = getState { BadgeUiState(BadgeVariant.BadgeLDefault) },
        )
    }
    override val componentLayout: View
        get() = Badge(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = com.sdds.playground.sandbox.R.id.badge }
            .also { _badge = it }

    override val propertiesOwner: PropertiesOwner
        get() = badgeParametersViewModel

    private var currentVariant: BadgesVariant = BadgeVariant.BadgeLDefault
    private var _badge: Badge? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        badgeParametersViewModel.badgeState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                _badge?.apply {
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
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
