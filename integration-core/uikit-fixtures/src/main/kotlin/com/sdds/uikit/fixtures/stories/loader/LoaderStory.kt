package com.sdds.uikit.fixtures.stories.loader

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Loader
import com.sdds.uikit.fixtures.stories.LoaderUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.LoaderUiStateTransformer

/**
 * История компонента Loader для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Loader.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Loader
 */
@Story
object LoaderStory : ViewBaseStory<LoaderUiState, Loader>(
    ComponentKey.Loader,
    LoaderUiState(),
    LoaderUiStatePropertiesProducer,
    LoaderUiStateTransformer,
) {
    override fun getComponent(context: Context): Loader {
        return loader(context)
    }

    override fun onComponentUpdate(component: Loader, state: LoaderUiState) {
        component.applyState(state)
    }
}
