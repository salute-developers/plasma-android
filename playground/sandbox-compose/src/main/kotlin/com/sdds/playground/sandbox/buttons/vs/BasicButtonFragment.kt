package com.sdds.playground.sandbox.buttons.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.Button
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом BasicButton
 * @author Малышев Александр on 31.07.2024
 */
internal class BasicButtonFragment : ComponentFragment() {

    private val buttonViewModel by viewModels<ButtonParametersViewModel> {
        ButtonParametersViewModelFactory(
            type = ButtonType.Basic,
            defaultState = getState { ButtonUiState(BasicButtonVariant.BasicButtonLDefault) },
        )
    }

    override val componentLayout: Button
        get() = Button(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.basic_button }
            .also { button = it }

    override val propertiesOwner: PropertiesOwner
        get() = buttonViewModel

    private var currentVariant: ButtonVariant = BasicButtonVariant.BasicButtonLDefault
    private var button: Button? = null
    private var isFixedSize: Boolean = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonViewModel.buttonState
            .onEach { state ->
                var dispatchChange = false
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchChange = true
                }
                if (isFixedSize != state.fixedSize) {
                    isFixedSize = state.fixedSize
                    dispatchChange = true
                }
                if (dispatchChange) {
                    dispatchComponentStyleChanged(layoutParams = getButtonLayoutParams())
                }
                button?.apply {
                    text = state.buttonLabel
                    value = state.buttonValue
                    isLoading = state.loading
                    isEnabled = state.enabled
                    spacing = state.spacing
                    if (state.icon != ButtonIcon.No) {
                        setIconResource(state.icon.iconId)
                    } else {
                        icon = null
                    }
                    iconPosition = when (state.icon) {
                        ButtonIcon.End -> Button.IconPosition.TextEnd
                        else -> Button.IconPosition.TextStart
                    }
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    private fun getButtonLayoutParams() = if (isFixedSize) {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )
    } else {
        FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )
    }
}
