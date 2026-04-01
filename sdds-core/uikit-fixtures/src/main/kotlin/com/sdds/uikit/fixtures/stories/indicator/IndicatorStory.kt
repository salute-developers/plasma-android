package com.sdds.uikit.fixtures.stories.indicator

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Indicator
import com.sdds.uikit.fixtures.stories.IndicatorUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.IndicatorUiStateTransformer

/**
 * История компонента Indicator для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Indicator.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Indicator
 */
@Story
object IndicatorStory : ViewBaseStory<IndicatorUiState, Indicator>(
    ComponentKey.Indicator,
    IndicatorUiState(),
    IndicatorUiStatePropertiesProducer,
    IndicatorUiStateTransformer,
) {
    override fun getComponent(context: Context): Indicator {
        return Indicator(context)
    }

    override fun onComponentUpdate(component: Indicator, state: IndicatorUiState) = Unit
}
