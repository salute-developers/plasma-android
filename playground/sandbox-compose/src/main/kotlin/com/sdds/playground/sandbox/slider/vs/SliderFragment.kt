package com.sdds.playground.sandbox.slider.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.core.view.setMargins
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.slider.SliderUiState
import com.sdds.testing.vs.slider.applyState
import com.sdds.testing.vs.slider.slider
import com.sdds.uikit.Slider

/**
 * Фрагмент с компонентом Slider
 */
internal class SliderFragment : ComponentFragment<SliderUiState, Slider, SliderParametersViewModel>() {

    private var sliderState: SliderUiState = SliderUiState()

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        SliderParametersViewModelFactory(
            defaultState = getState { SliderUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = super.defaultLayoutParams.apply { setMargins(50) }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Slider {
        return slider(contextWrapper, state = sliderState)
    }

    override fun onComponentUpdate(component: Slider?, state: SliderUiState) {
        component?.applyState(state)
    }
}
