package com.sdds.playground.sandbox.segment.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout.LayoutParams
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.segment.vs.SegmentItemIcon
import com.sdds.playground.sandbox.segment.vs.SegmentOrientation
import com.sdds.playground.sandbox.segment.vs.SegmentUiState
import com.sdds.uikit.Button
import com.sdds.uikit.Segment
import com.sdds.uikit.SegmentItem

internal class SegmentFragment : ComponentFragment<SegmentUiState, Segment>() {

    private val _segmentAdapter: SegmentAdapter by lazy { SegmentAdapter() }
    override val componentViewModel by viewModels<SegmentViewModel> {
        SegmentViewModelFactory(
            defaultState = getState { SegmentUiState() },
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
        return Segment(contextWrapper)
            .apply {
                adapter = _segmentAdapter
                id = R.id.segment
            }
            .also { segment ->
                if (_currentStretch && _currentOrientation == SegmentOrientation.HORIZONTAL) {
                    segment.apply { layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT) }
                }
            }
    }

    override fun onComponentUpdate(component: Segment?, state: SegmentUiState) {
        component?.apply {
            orientation = state.orientation.orientationState
            isStretch = state.stretch
        }

        _segmentAdapter.updateState(state)
    }
}

private class SegmentAdapter : Segment.Adapter() {

    private var _state: SegmentUiState = SegmentUiState()

    fun updateState(state: SegmentUiState) {
        _state = state
        notifySegmentChanged()
    }

    override fun getCount(): Int {
        return _state.amount
    }

    override fun onBindSegmentItem(segmentItemView: SegmentItem, position: Int) {
        segmentItemView.apply {
            text = _state.segmentItemLabel
            value = _state.segmentItemValue
            isEnabled = _state.enabled
            id = position
            if (_state.icon != SegmentItemIcon.No) {
                setIconResource(_state.icon.iconId)
            } else {
                icon = null
            }
            iconPosition = when (_state.icon) {
                SegmentItemIcon.End -> Button.IconPosition.TextEnd
                else -> Button.IconPosition.TextStart
            }
            isCounterEnabled = _state.counter
            counterText = _state.count
        }
    }
}
