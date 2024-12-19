package com.sdds.playground.sandbox.segment.vs.group

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout.LayoutParams
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.segment.vs.SegmentItemIcon
import com.sdds.playground.sandbox.segment.vs.SegmentOrientation
import com.sdds.playground.sandbox.segment.vs.SegmentParametersViewModel
import com.sdds.playground.sandbox.segment.vs.SegmentParametersViewModelFactory
import com.sdds.playground.sandbox.segment.vs.SegmentUiState
import com.sdds.playground.sandbox.segment.vs.SegmentVariant
import com.sdds.playground.sandbox.segment.vs.Variant
import com.sdds.uikit.Button
import com.sdds.uikit.Segment
import com.sdds.uikit.SegmentItem
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

internal class SegmentFragment : ComponentFragment() {

    private var _segment: Segment? = null
    private var _currentVariant: Variant = SegmentVariant.SegmentL
    private val _segmentAdapter: SegmentAdapter by lazy { SegmentAdapter() }
    private val segmentViewModel by viewModels<SegmentParametersViewModel> {
        SegmentParametersViewModelFactory(
            groupMode = true,
            defaultState = getState { SegmentUiState(_currentVariant) },
        )
    }
    private var _currentOrientation: SegmentOrientation = SegmentOrientation.HORIZONTAL
    private var _currentStretch: Boolean = false

    override val defaultLayoutParams: LayoutParams
        get() = when {
            _currentStretch -> LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            else -> super.defaultLayoutParams
        }

    override val componentLayout: View
        get() = Segment(ContextThemeWrapper(requireContext(), _currentVariant.styleRes))
            .apply {
                adapter = _segmentAdapter
                id = R.id.segment
            }
            .also { _segment = it }
            .let { segment ->
                when {
                    _currentStretch && _currentOrientation == SegmentOrientation.HORIZONTAL -> segment.apply {
                        layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                    }
                    _currentOrientation == SegmentOrientation.HORIZONTAL -> segment.horizontalScrollable()
                    else -> segment.verticalScrollable()
                }
            }

    override val propertiesOwner: PropertiesOwner
        get() = segmentViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        segmentViewModel.segmentItemState
            .onEach { segmentState ->
                var isChanged = false
                if (_currentVariant != segmentState.variant) {
                    _currentVariant = segmentState.variant
                    isChanged = true
                }
                if (_currentStretch != segmentState.stretch) {
                    _currentStretch = segmentState.stretch
                    isChanged = true
                }
                if (_currentOrientation != segmentState.orientation) {
                    _currentOrientation = segmentState.orientation
                    isChanged = true
                }
                if (isChanged) dispatchComponentStyleChanged()

                _segment?.apply {
                    orientation = _currentOrientation.orientationState
                    isStretch = _currentStretch
                }

                _segmentAdapter.updateState(segmentState)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _segment = null
    }
}

private class SegmentAdapter : Segment.Adapter() {

    private var _state: SegmentUiState = SegmentUiState(SegmentVariant.SegmentL)

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
        }
    }
}
