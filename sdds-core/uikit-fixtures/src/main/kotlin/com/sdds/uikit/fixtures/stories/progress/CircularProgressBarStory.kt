package com.sdds.uikit.fixtures.stories.progress

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.CircularProgressBar
import com.sdds.uikit.fixtures.stories.CircularProgressUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CircularProgressUiStateTransformer

/**
 * История компонента CircularProgressBar для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации CircularProgressBar.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.CircularProgressBar
 */
@Story
object CircularProgressBarStory : ViewBaseStory<CircularProgressUiState, CircularProgressBar>(
    ComponentKey.CircularProgressBar,
    CircularProgressUiState(),
    CircularProgressUiStatePropertiesProducer,
    CircularProgressUiStateTransformer,
) {
    override fun getComponent(context: Context): CircularProgressBar {
        return circularProgressBar(context)
    }

    override fun onComponentUpdate(component: CircularProgressBar, state: CircularProgressUiState) {
        component.applyState(state)
    }
}
