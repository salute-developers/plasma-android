package com.sdds.playground.sandbox.avatar.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Avatar
import com.sdds.uikit.AvatarGroup

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class AvatarGroupFragment : ComponentFragment<AvatarUiState, AvatarGroup>() {

    override val componentViewModel by viewModels<AvatarParameterViewModel> {
        AvatarParameterViewModelFactory(
            groupMode = true,
            defaultState = getState { AvatarUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): AvatarGroup {
        return AvatarGroup(contextWrapper)
            .apply { id = R.id.avatar_group }
            .apply { adapter = avatarAdapter }
    }

    private val avatarAdapter: AvatarAdapter by lazy { AvatarAdapter() }

    override fun onComponentUpdate(component: AvatarGroup?, state: AvatarUiState) {
        avatarAdapter.updateState(state)
        component?.threshold = state.threshold
    }
}

private class AvatarAdapter : AvatarGroup.Adapter() {

    private var _state: AvatarUiState = AvatarUiState()

    fun updateState(state: AvatarUiState) {
        _state = state
        notifyAvatarGroupChanged()
    }

    override fun getCount(): Int = 4

    override fun onBindAvatar(avatarView: Avatar, position: Int) {
        avatarView.apply {
            when (position) {
                1 -> Glide.with(this)
                    .load(AVATAR_REMOTE_URL)
                    .into(this)

                2 -> setImageDrawable(null)
                else -> setImageResource(R.drawable.il_avatar_test)
            }
            setInitials(_state.fullName)
        }
    }
}
