package com.sdds.uikit.fixtures.stories.segment

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Segment
import com.sdds.uikit.fixtures.stories.SegmentUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.SegmentUiStateTransformer

/**
 * История компонента Segment для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Segment.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Segment
 */
@Story
object SegmentStory : ViewBaseStory<SegmentUiState, Segment>(
    ComponentKey.Segment,
    SegmentUiState(),
    SegmentUiStatePropertiesProducer,
    SegmentUiStateTransformer,
) {

    private var _currentOrientation: SegmentOrientation = SegmentOrientation.HORIZONTAL
    private var _currentStretch: Boolean = false

    override val scrollMode: ScrollMode
        get() = when {
            _currentStretch && _currentOrientation == SegmentOrientation.HORIZONTAL -> ScrollMode.NONE
            _currentOrientation == SegmentOrientation.HORIZONTAL -> ScrollMode.HORIZONTAL
            else -> ScrollMode.VERTICAL
        }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            if (_currentStretch) {
                width = FrameLayout.LayoutParams.MATCH_PARENT
            }
        }
    }

    override fun shouldRecreateComponentOnStateUpdate(state: SegmentUiState): Boolean {
        var isChanged = false
        if (_currentStretch != state.stretch) {
            _currentStretch = state.stretch
            isChanged = true
        }
        if (_currentOrientation != state.orientation) {
            _currentOrientation = state.orientation
            isChanged = true
        }
        return isChanged
    }

    override fun getComponent(context: Context): Segment {
        return segment(context)
    }

    override fun onComponentUpdate(component: Segment, state: SegmentUiState) {
        component.applyState(state)
    }
}
