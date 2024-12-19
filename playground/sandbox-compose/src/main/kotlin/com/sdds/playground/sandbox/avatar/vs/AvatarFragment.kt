package com.sdds.playground.sandbox.avatar.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.Avatar
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом Avatar
 * @author Малышев Александр on 19.08.2024
 */
internal class AvatarFragment : ComponentFragment() {

    private val avatarParametersViewModel by viewModels<AvatarParameterViewModel>() {
        AvatarParameterViewModelFactory(
            groupMode = false,
            defaultState = getState { AvatarUiState(AvatarVariant.AvatarL) },
        )
    }

    override val componentLayout: Avatar
        get() = Avatar(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .also { avatar = it }
            .apply { id = R.id.avatar }

    override val propertiesOwner: PropertiesOwner
        get() = avatarParametersViewModel

    private var currentVariant: AvatarVariant = AvatarVariant.AvatarXXL
    private var avatar: Avatar? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        avatarParametersViewModel.avatarUiState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                avatar?.apply {
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
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
