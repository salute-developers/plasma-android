package com.sdds.playground.sandbox.segment.group

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.segment.SegmentItemIcon
import com.sdds.playground.sandbox.segment.SegmentOrientation
import com.sdds.playground.sandbox.segment.SegmentParametersViewModel
import com.sdds.playground.sandbox.segment.SegmentParametersViewModelFactory
import com.sdds.playground.sandbox.segment.SegmentUiState
import com.sdds.playground.sandbox.segment.SegmentVariant
import com.sdds.playground.sandbox.segment.Variant
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
    override val componentLayout: View
        get() {
            val orientation =
                _segment?.orientation ?: SegmentOrientation.HORIZONTAL.orientationState
            val segmentView =
                Segment(ContextThemeWrapper(requireContext(), _currentVariant.styleRes))
                    .apply { adapter = _segmentAdapter }
                    .apply { id = R.id.segment }
                    .also { _segment = it }
            segmentView.orientation = orientation
            return if (segmentView.isHorizontal) {
                segmentView.horizontalScrollable()
            } else {
                segmentView.verticalScrollable()
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
                if (_segment?.orientation != segmentState.orientation.orientationState) {
                    _segment?.orientation = segmentState.orientation.orientationState
                    isChanged = true
                }
                if (isChanged) dispatchComponentStyleChanged()
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

    override fun getCount(): Int = 5

    override fun onBindSegmentItem(segmentItemView: SegmentItem, position: Int) {
        segmentItemView.apply {
            text = _state.segmentItemLabel
            value = _state.segmentItemValue
            isEnabled = _state.enabled
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
