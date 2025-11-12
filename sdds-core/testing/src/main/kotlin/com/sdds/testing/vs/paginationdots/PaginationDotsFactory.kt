package com.sdds.testing.vs.paginationdots

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import androidx.core.view.setPadding
import androidx.core.view.updatePadding
import com.sdds.testing.R
import com.sdds.testing.vs.button.iconButton
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.LinearLayout
import com.sdds.uikit.PaginationDots

/**
 * Создает компонент [PaginationDots]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun paginationDots(
    context: Context,
    style: Int? = null,
    state: PaginationDotsUiState = PaginationDotsUiState(),
): PaginationDots {
    return PaginationDots(context.styleWrapper(style))
        .applyState(state)
        .apply { id = R.id.pagination_dots }
}

/**
 * Создает компонент [PaginationDots] с кнопками управления
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun paginationDotsWithControls(
    context: Context,
    style: Int? = null,
    state: PaginationDotsUiState = PaginationDotsUiState(),
): View {
    val dots = paginationDots(context, style, state)
    val buttons = LinearLayout(context).apply {
        setPadding(context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_3x))
        val spacing = context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_10x)
        updatePadding(top = spacing)
        addView(
            iconButton(context).apply {
                contentDescription = "Previous"
                setIconResource(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
                setOnClickListener {
                    dots.currentIndex -= 1
                }
            },
            MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply {
                rightMargin = spacing
            },
        )
        addView(
            iconButton(context).apply {
                contentDescription = "Next"
                setIconResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
                setOnClickListener {
                    dots.currentIndex += 1
                }
            },
        )
    }
    return LinearLayout(context).apply {
        orientation = android.widget.LinearLayout.VERTICAL
        gravity = Gravity.CENTER_HORIZONTAL
        addView(
            dots,
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ),
        )
        addView(
            buttons,
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ),
        )
    }
}

/**
 * Применяет [PaginationDotsUiState] к [PaginationDots]
 */
fun PaginationDots.applyState(state: PaginationDotsUiState) = apply {
    itemCount = state.itemCount
    visibleItemCount = state.visibleItemCount
}
