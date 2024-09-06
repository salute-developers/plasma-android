package com.sdds.playground.sandbox.switcher

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.Switch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class SwitchFragment : ComponentFragment() {

    private val switchParametersViewModel by viewModels<SwitchParametersViewModel>()

    override val componentLayout: Switch
        get() = Switch(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .also { switch = it }
            .apply {
                setOnClickListener { switchParametersViewModel.updateActive(isChecked) }
            }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_90x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override val propertiesOwner: PropertiesOwner
        get() = switchParametersViewModel

    private var currentVariant: SwitchVariant = SwitchVariant.SwitchL
    private var switch: Switch? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        switchParametersViewModel.switchState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                switch?.apply {
                    text = state.label
                    description = state.description
                    isEnabled = state.enabled
                    isChecked = state.active
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
