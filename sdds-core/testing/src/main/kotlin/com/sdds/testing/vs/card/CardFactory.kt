package com.sdds.testing.vs.card

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.ViewGroup
import com.sdds.testing.R
import com.sdds.testing.databinding.LayoutComponentCardBinding
import com.sdds.uikit.Card
import com.sdds.uikit.FlowLayout

/**
 * Фабрика для создания [Card]
 */
fun card(
    context: Context,
    style: Int? = null,
    state: CardUiState? = null,
): Card {
    val wrapper = style?.let { ContextThemeWrapper(context, it) } ?: context
    return cardLayoutBinding(wrapper)
        .adjustContentSize()
        .root
        .applyState(state)
        .apply {
            id = R.id.card
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
}

/**
 * Применяет [CardUiState] к [Card]
 */
fun Card.applyState(state: CardUiState?): Card = apply {
    state ?: return this@apply
    orientation = state.orientation.toOrientation()
    alignment = if (state.orientation == CardOrientation.VERTICAL) {
        FlowLayout.ALIGNMENT_START
    } else {
        FlowLayout.ALIGNMENT_CENTER
    }
}

private fun cardLayoutBinding(
    context: Context,
): LayoutComponentCardBinding {
    return LayoutComponentCardBinding.inflate(LayoutInflater.from(context))
}

/**
 * Не всегда у [CardContent] будут заданы минимальные размеры в стилях.
 * В этом случае укажем их для песочницы и тестов
 */
private fun LayoutComponentCardBinding.adjustContentSize(): LayoutComponentCardBinding = apply {
    val minSize = cardContent.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_50x)
    if (cardContent.minWidth == 0) {
        cardContent.minWidth = minSize
    }
    if (cardContent.minHeight == 0) {
        cardContent.minHeight = minSize
    }
}
