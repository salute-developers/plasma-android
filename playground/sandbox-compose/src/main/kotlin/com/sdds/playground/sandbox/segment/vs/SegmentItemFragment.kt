package com.sdds.playground.sandbox.segment.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.segement.SegmentUiState
import com.sdds.testing.vs.segement.applyState
import com.sdds.testing.vs.segement.segmentItem
import com.sdds.uikit.SegmentItem

internal class SegmentItemFragment : ComponentFragment<SegmentUiState, SegmentItem, SegmentItemViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        SegmentItemViewModelFactory(
            defaultState = getState { SegmentUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): SegmentItem {
        return segmentItem(contextWrapper)
            .apply {
                setOnCheckedChangedListener { _, isChecked ->
                    componentViewModel.updateProperty("checked", isChecked)
                }
            }
    }

    override fun onComponentUpdate(component: SegmentItem?, state: SegmentUiState) {
        component?.applyState(state)
    }
}
