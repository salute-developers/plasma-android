package com.sdds.playground.sandbox.avatar.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Avatar

/**
 * Фрагмент с компонентом Avatar
 * @author Малышев Александр on 19.08.2024
 */
internal class AvatarFragment : ComponentFragment<AvatarUiState, Avatar>() {

    override val componentViewModel by viewModels<AvatarParameterViewModel> {
        AvatarParameterViewModelFactory(
            groupMode = false,
            defaultState = getState { AvatarUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Avatar {
        return Avatar(contextWrapper)
            .apply { id = R.id.avatar }
    }

    override fun onComponentUpdate(component: Avatar?, state: AvatarUiState) {
        component?.apply {
            when (state.exampleMode) {
                ExampleMode.Local -> setImageResource(R.drawable.il_avatar_test)
                ExampleMode.Remote -> {
                    Glide.with(this@AvatarFragment)
                        .load(AVATAR_REMOTE_URL)
                        .into(this)
                }

                ExampleMode.Placeholder -> {
                    setImageDrawable(null)
                }
            }
            setInitials(state.fullName)
            status = state.status
            setActionResource(com.sdds.icons.R.drawable.ic_sber_36)
            actionEnabled = state.actionEnabled
        }
    }
}
