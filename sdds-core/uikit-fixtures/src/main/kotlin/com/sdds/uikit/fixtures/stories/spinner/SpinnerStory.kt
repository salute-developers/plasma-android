package com.sdds.uikit.fixtures.stories.spinner

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Spinner
import com.sdds.uikit.fixtures.stories.SpinnerUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.SpinnerUiStateTransformer

/**
 * История компонента Spinner для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Spinner.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Spinner
 */
@Story
object SpinnerStory : ViewBaseStory<SpinnerUiState, Spinner>(
    ComponentKey.Spinner,
    SpinnerUiState(),
    SpinnerUiStatePropertiesProducer,
    SpinnerUiStateTransformer,
) {
    override fun getComponent(context: Context): Spinner {
        return spinner(context)
    }

    override fun onComponentUpdate(component: Spinner, state: SpinnerUiState) = Unit
}
