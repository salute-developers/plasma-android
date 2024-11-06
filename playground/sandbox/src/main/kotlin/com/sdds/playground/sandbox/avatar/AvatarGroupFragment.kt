package com.sdds.playground.sandbox.avatar

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.Avatar
import com.sdds.uikit.AvatarGroup
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class AvatarGroupFragment : ComponentFragment() {

    private val avatarParametersViewModel by viewModels<AvatarParameterViewModel> {
        AvatarParameterViewModelFactory(
            groupMode = true,
            defaultState = getState { AvatarUiState(AvatarVariant.AvatarL) },
        )
    }

    private val avatarAdapter: AvatarAdapter by lazy { AvatarAdapter() }

    override val componentLayout: AvatarGroup
        get() = AvatarGroup(requireContext())
            .also { avatarGroup = it }
            .apply { adapter = avatarAdapter }
            .apply { id = R.id.avatar_group }

    override val propertiesOwner: PropertiesOwner
        get() = avatarParametersViewModel

    private var avatarGroup: AvatarGroup? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        avatarParametersViewModel.avatarUiState
            .onEach { state ->
                avatarAdapter.updateState(state)
                avatarGroup?.threshold = state.threshold
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
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
