package com.sdds.playground.sandbox.segment.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Button
import com.sdds.uikit.SegmentItem

internal class SegmentItemFragment : ComponentFragment<SegmentUiState, SegmentItem>() {

    override val componentViewModel by viewModels<SegmentItemViewModel> {
        SegmentItemViewModelFactory(
            defaultState = getState { SegmentUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): SegmentItem {
        return SegmentItem(contextWrapper)
            .apply { id = com.sdds.playground.sandbox.R.id.segment_item }
    }

    override fun onComponentUpdate(component: SegmentItem?, state: SegmentUiState) {
        component?.apply {
            setOnCheckedChangedListener { _, isChecked ->
                componentViewModel.updateProperty("checked", isChecked)
            }
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
    }
}
