package com.sdds.uikit.fixtures.stories.segment

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.SegmentItem
import com.sdds.uikit.fixtures.stories.SegmentUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.SegmentUiStateTransformer

/**
 * История компонента SegmentItem для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации SegmentItem.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.SegmentItem
 */
@Story
object SegmentItemStory : ViewBaseStory<SegmentUiState, SegmentItem>(
    ComponentKey.SegmentItem,
    SegmentUiState(),
    SegmentUiStatePropertiesProducer,
    SegmentUiStateTransformer,
) {
    override fun getComponent(context: Context): SegmentItem {
        return segmentItem(context)
    }

    override fun onComponentUpdate(component: SegmentItem, state: SegmentUiState) {
        component.applyState(state)
    }
}
