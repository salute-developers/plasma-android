package com.sdds.testing.vs.segement

import android.content.Context
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Button
import com.sdds.uikit.Segment
import com.sdds.uikit.SegmentItem

/**
 * Фабрика для создания [SegmentItem]
 */
fun segmentItem(
    context: Context,
    style: Int? = null,
    state: SegmentUiState? = null,
): SegmentItem {
    return SegmentItem(context.styleWrapper(style))
        .apply {
            id = R.id.segment_item
        }
        .applyState(state)
}

/**
 * Фабрика для создания [Segment]
 */
fun segment(
    context: Context,
    style: Int? = null,
    state: SegmentUiState? = null,
): Segment {
    val layoutParams = state?.currentLayoutParams()
    return Segment(context.styleWrapper(style))
        .apply {
            id = R.id.segment
            adapter = SegmentAdapter()
            if (layoutParams != null) {
                this.layoutParams = layoutParams
            }
        }
        .applyState(state)
}

/**
 * Применяет [SegmentUiState] к [SegmentItem]
 */
fun SegmentItem.applyState(state: SegmentUiState?): SegmentItem = apply {
    state ?: return@apply
    text = state.segmentItemLabel
    value = state.segmentItemValue
    isEnabled = state.enabled
    if (state.icon != SegmentItemIcon.No) {
        setIconResource(state.icon.iconId)
    } else {
        icon = null
    }
    isChecked = state.checked
    iconPosition = when (state.icon) {
        SegmentItemIcon.End -> Button.IconPosition.TextEnd
        else -> Button.IconPosition.TextStart
    }
    counterText = state.count
    isCounterEnabled = state.counter
}

/**
 * Применяет [SegmentUiState] к [Segment]
 */
fun Segment.applyState(state: SegmentUiState?): Segment = apply {
    state ?: return@apply
    orientation = state.orientation.orientationState
    isStretch = state.stretch
    (adapter as? SegmentAdapter)?.updateState(state)
}

private fun SegmentUiState.currentLayoutParams(): LayoutParams? {
    return if (stretch && orientation == SegmentOrientation.HORIZONTAL) {
        FrameLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
    } else {
        null
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
        segmentItemView
            .applyState(_state)
            .apply {
                id = position
            }
    }
}
