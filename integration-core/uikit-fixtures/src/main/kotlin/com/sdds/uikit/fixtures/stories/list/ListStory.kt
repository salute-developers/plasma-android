package com.sdds.uikit.fixtures.stories.list

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.ListView
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.ListUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ListUiStateTransformer

/**
 * История компонента List для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации List.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.List
 */
@Story
object ListStory : ViewBaseStory<ListUiState, ListView>(
    ComponentKey.List,
    ListUiState(),
    ListUiStatePropertiesProducer,
    ListUiStateTransformer,
) {
    override fun getComponent(context: Context): ListView {
        return listView(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 216.dp
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun onComponentUpdate(component: ListView, state: ListUiState) {
        component.applyState(state)
    }
}
