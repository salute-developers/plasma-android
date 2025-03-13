package com.sdds.testing.vs.flow

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.ViewGroup
import com.sdds.testing.databinding.LayoutComponentFlowBinding
import com.sdds.uikit.FlowLayout

/**
 * Фабрика для создания [FlowLayout]
 */
fun flowLayout(
    context: Context,
    style: Int? = null,
    state: FlowUiState? = null,
): FlowLayout {
    val wrapper = style?.let { ContextThemeWrapper(context, it) } ?: context
    return flowLayoutBinding(wrapper).root
        .applyState(state)
        .apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
}

/**
 * Применяет [FlowUiState] к [LayoutComponentFlowBinding]
 */
fun FlowLayout.applyState(state: FlowUiState?): FlowLayout = apply {
    state ?: return this@apply
    arrangement = state.arrangement.toArrangement()
    alignment = state.alignment.toAlignment()
    orientation = state.orientation.toOrientation()
    itemsPerLine = state.itemsPerLine
}

private fun flowLayoutBinding(
    context: Context,
): LayoutComponentFlowBinding {
    return LayoutComponentFlowBinding.inflate(LayoutInflater.from(context))
}
