package com.sdds.playground.sandbox.buttons

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.Button
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом IconButton
 * @author Малышев Александр on 31.07.2024
 */
internal class IconButtonFragment : ComponentFragment() {

    private val buttonViewModel by viewModels<ButtonParametersViewModel> {
        val default = ButtonUiState(IconButtonVariant.IconButtonLDefault)
        ButtonParametersViewModelFactory(ButtonType.Icon, getState(default))
    }

    override val componentLayout: Button
        get() = Button(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .also { button = it }

    override val propertiesOwner: PropertiesOwner
        get() = buttonViewModel

    private var currentVariant: ButtonVariant = IconButtonVariant.IconButtonLDefault
    private var button: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonViewModel.buttonState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                button?.apply {
                    isLoading = state.loading
                    isEnabled = state.enabled
                    setIconResource(R.drawable.ic_plasma_24)
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
