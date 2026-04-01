package com.sdds.uikit.fixtures.stories.slider

import android.content.Context
import android.widget.FrameLayout
import androidx.core.view.setMargins
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Slider
import com.sdds.uikit.fixtures.stories.SliderUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.SliderUiStateTransformer

/**
 * История компонента Slider для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Slider.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Slider
 */
@Story
object SliderStory : ViewBaseStory<SliderUiState, Slider>(
    ComponentKey.Slider,
    SliderUiState(),
    SliderUiStatePropertiesProducer,
    SliderUiStateTransformer,
) {
    override fun getComponent(context: Context): Slider {
        return slider(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            setMargins(50)
        }
    }

    override fun onComponentUpdate(component: Slider, state: SliderUiState) {
        component.applyState(state)
    }
}
