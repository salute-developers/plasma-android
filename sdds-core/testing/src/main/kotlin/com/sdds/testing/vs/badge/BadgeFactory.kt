package com.sdds.testing.vs.badge

import android.content.Context
import androidx.appcompat.view.ContextThemeWrapper
import com.sdds.testing.R
import com.sdds.uikit.Badge
import com.sdds.uikit.IconBadge

/**
 * Фабрика для [Badge]
 */
fun badge(
    context: Context,
    style: Int? = null,
    state: BadgeUiState? = null,
): Badge {
    val wrapper = style?.let { ContextThemeWrapper(context, style) } ?: context
    return Badge(wrapper)
        .apply {
            id = R.id.badge
        }
        .applyState(state)
}

/**
 * Фабрика для [IconBadge]
 */
fun iconBadge(
    context: Context,
    style: Int? = null,
): IconBadge {
    val wrapper = style?.let { ContextThemeWrapper(context, style) } ?: context
    return IconBadge(wrapper).apply {
        id = R.id.icon_badge
        setDrawableStartRes(com.sdds.icons.R.drawable.ic_plasma_24)
    }
}

/**
 * Применяет [BadgeUiState] к [Badge]
 */
fun Badge.applyState(state: BadgeUiState?): Badge = apply {
    state ?: return@apply
    text = state.label
    if (state.contentLeft) {
        setDrawableStartRes(com.sdds.icons.R.drawable.ic_plasma_24)
    } else {
        drawableStart = null
    }

    if (state.contentRight) {
        setDrawableEndRes(com.sdds.icons.R.drawable.ic_plasma_24)
    } else {
        drawableEnd = null
    }
}
