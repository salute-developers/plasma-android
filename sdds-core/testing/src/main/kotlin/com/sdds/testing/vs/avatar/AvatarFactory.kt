package com.sdds.testing.vs.avatar

import android.content.Context
import com.bumptech.glide.Glide
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Avatar
import com.sdds.uikit.AvatarGroup

/**
 * Фабрика для создания [Avatar]
 */
fun avatar(
    context: Context,
    style: Int? = null,
    state: AvatarUiState? = null,
): Avatar {
    return Avatar(context.styleWrapper(style))
        .apply {
            id = R.id.avatar
        }
        .applyState(state)
}

/**
 * Фабрика для создания [AvatarGroup]
 */
fun avatarGroup(
    context: Context,
    style: Int? = null,
    state: AvatarUiState? = null,
): AvatarGroup {
    return AvatarGroup(context.styleWrapper(style))
        .apply {
            id = R.id.avatar_group
            adapter = AvatarAdapter()
        }
        .applyState(state)
}

/**
 * Применяет [AvatarUiState] к [Avatar]
 */
fun Avatar.applyState(state: AvatarUiState?): Avatar = apply {
    state ?: return@apply
    when (state.exampleMode) {
        ExampleMode.Local -> setImageResource(R.drawable.il_avatar_for_test)

        ExampleMode.Placeholder -> {
            setImageDrawable(null)
        }
        ExampleMode.Remote -> {
            Glide.with(this)
                .load(AVATAR_REMOTE_URL)
                .into(this)
        }
    }
    setInitials(state.fullName)
    status = state.status
    setActionResource(com.sdds.icons.R.drawable.ic_sber_36)
    actionEnabled = state.actionEnabled
}

/**
 * Применяет [AvatarUiState] к [AvatarGroup]
 */
fun AvatarGroup.applyState(state: AvatarUiState?): AvatarGroup = apply {
    state ?: return@apply
    (adapter as? AvatarAdapter)?.updateState(state)
    threshold = state.threshold
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
                else -> setImageResource(R.drawable.il_avatar_for_test)
            }
            setInitials(_state.fullName)
        }
    }
}
