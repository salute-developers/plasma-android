package com.sdds.playground.sandbox.segment.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout.LayoutParams
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.segement.SegmentOrientation
import com.sdds.testing.vs.segement.SegmentUiState
import com.sdds.testing.vs.segement.applyState
import com.sdds.testing.vs.segement.segment
import com.sdds.uikit.Segment

internal class SegmentFragment : ComponentFragment<SegmentUiState, Segment>() {

    override val componentViewModel by viewModels<SegmentViewModel> {
        SegmentViewModelFactory(
            defaultState = getState { SegmentUiState() },
            componentKey = componentKey,
        )
    }
    private var _currentOrientation: SegmentOrientation = SegmentOrientation.HORIZONTAL
    private var _currentStretch: Boolean = false

    override val scrollMode: ScrollMode
        get() = when {
            _currentStretch && _currentOrientation == SegmentOrientation.HORIZONTAL -> ScrollMode.NONE
            _currentOrientation == SegmentOrientation.HORIZONTAL -> ScrollMode.HORIZONTAL
            else -> ScrollMode.VERTICAL
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

    override val defaultLayoutParams: LayoutParams
        get() = when {
            _currentStretch -> LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            else -> super.defaultLayoutParams
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Segment {
        return segment(contextWrapper)
    }

    override fun onComponentUpdate(component: Segment?, state: SegmentUiState) {
        component?.applyState(state)
    }
}
