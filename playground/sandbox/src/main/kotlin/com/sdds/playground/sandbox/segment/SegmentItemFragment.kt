package com.sdds.playground.sandbox.segment

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.Button
import com.sdds.uikit.SegmentItem
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

internal class SegmentItemFragment : ComponentFragment() {

    private val segmentItemViewModel by viewModels<SegmentParametersViewModel> {
        SegmentParametersViewModelFactory(
            defaultState = getState { SegmentUiState(SegmentItemVariant.SegmentItemLDefault) },
        )
    }
    private var _currentVariant: Variant = SegmentItemVariant.SegmentItemLDefault
    private var _segmentItem: SegmentItem? = null

    override val componentLayout: SegmentItem
        get() = SegmentItem(ContextThemeWrapper(requireContext(), _currentVariant.styleRes))
            .apply { id = com.sdds.playground.sandbox.R.id.segment_item }
            .also { _segmentItem = it }

    override val propertiesOwner: PropertiesOwner
        get() = segmentItemViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        segmentItemViewModel.segmentItemState
            .onEach { state ->
                if (_currentVariant != state.variant) {
                    _currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                _segmentItem?.apply {
                    text = state.segmentItemLabel
                    value = state.segmentItemValue
                    isEnabled = state.enabled
                    if (state.icon != SegmentItemIcon.No) {
                        setIconResource(state.icon.iconId)
                    } else {
                        icon = null
                    }
                    iconPosition = when (state.icon) {
                        SegmentItemIcon.End -> Button.IconPosition.TextEnd
                        else -> Button.IconPosition.TextStart
                    }
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
