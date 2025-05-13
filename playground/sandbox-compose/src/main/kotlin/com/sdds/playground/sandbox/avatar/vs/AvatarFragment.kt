package com.sdds.playground.sandbox.avatar.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.avatar.AvatarUiState
import com.sdds.testing.vs.avatar.applyState
import com.sdds.testing.vs.avatar.avatar
import com.sdds.uikit.Avatar

/**
 * Фрагмент с компонентом Avatar
 * @author Малышев Александр on 19.08.2024
 */
internal class AvatarFragment : ComponentFragment<AvatarUiState, Avatar, AvatarViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        AvatarViewModelFactory(
            defaultState = getState { AvatarUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Avatar {
        return avatar(contextWrapper)
    }

    override fun onComponentUpdate(component: Avatar?, state: AvatarUiState) {
        component?.applyState(state)
    }
}
