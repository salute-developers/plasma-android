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
 * Фрагмент с компонентом IconBadge
 */
internal class IconBadgeFragment : ComponentFragment() {
    private val badgeParametersViewModel by viewModels<BadgeParametersViewModel> {
        BadgeParametersViewModelFactory(
            type = BadgeType.IconBadge,
            defaultState = getState { BadgeUiState(IconBadgeVariant.IconBadgeLDefault) },
        )
    }
    private var currentVariant: BadgesVariant = IconBadgeVariant.IconBadgeLDefault
    private var _badge: Badge? = null

    override val componentLayout: View
        get() = Badge(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = com.sdds.playground.sandbox.R.id.icon_badge }
            .also { _badge = it }

    override val propertiesOwner: PropertiesOwner
        get() = badgeParametersViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        badgeParametersViewModel.badgeState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                _badge?.apply {
                    setDrawableStartRes(R.drawable.ic_plasma_24)
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
