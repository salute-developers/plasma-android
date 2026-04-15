package com.sdds.uikit.fixtures.stories.tabs

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Tabs
import com.sdds.uikit.fixtures.stories.TabsUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.TabsUiStateTransformer

/**
 * История компонента Tabs для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Tabs.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Tabs
 */
@Story
object TabsStory : ViewBaseStory<TabsUiState, Tabs>(
    ComponentKey.Tabs,
    TabsUiState(),
    TabsUiStatePropertiesProducer,
    TabsUiStateTransformer,
) {
    override fun getComponent(context: Context): Tabs {
        return tabs(context)
    }

    override fun onComponentUpdate(component: Tabs, state: TabsUiState) {
        component.applyState(state)
    }
}
