package com.sdds.playground.sandbox.avatar.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.avatar.AvatarUiState
import com.sdds.testing.vs.avatar.applyState
import com.sdds.testing.vs.avatar.avatarGroup
import com.sdds.uikit.AvatarGroup

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class AvatarGroupFragment : ComponentFragment<AvatarUiState, AvatarGroup>() {

    override val componentViewModel by viewModels<AvatarGroupViewModel> {
        AvatarGroupViewModelFactory(
            defaultState = getState { AvatarUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): AvatarGroup {
        return avatarGroup(contextWrapper)
    }

    override fun onComponentUpdate(component: AvatarGroup?, state: AvatarUiState) {
        component?.applyState(state)
    }
}
