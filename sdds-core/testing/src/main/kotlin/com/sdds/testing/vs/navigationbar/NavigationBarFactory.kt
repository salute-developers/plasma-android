package com.sdds.testing.vs.navigationbar

import android.content.Context
import com.sdds.testing.vs.getTextColorPrimary
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.IconButton
import com.sdds.uikit.NavigationBar
import com.sdds.uikit.TextView

/**
 * Фабрика для создания [NavigationBar]
 */
fun navigationBar(
    context: Context,
    style: Int? = null,
    state: NavigationBarUiState = NavigationBarUiState(),
): NavigationBar {
    return NavigationBar(context.styleWrapper(style)).applyState(state)
}

/**
 * Применяет [NavigationBarUiState] к [NavigationBar]
 */
fun NavigationBar.applyState(state: NavigationBarUiState) = apply {
    setTitle(title(context, state.title))
    setDescription(description(context, state.description))
    setContent(contentText(context, state.contentText))
    if (state.hasActionStart) {
        setActionStart(IconButton(context).apply {
            setIconResource(com.sdds.icons.R.drawable.ic_search_24)
        }
        )
    } else {
        removeActionStart()
    }
    if (state.hasActionEnd) {
        setActionStart(IconButton(context).apply {
            setIconResource(com.sdds.icons.R.drawable.ic_menu_24)
        }
        )
    } else {
        removeActionStart()
    }
}

private fun title(context: Context, title: String) =
    TextView(context).apply { text = title }

private fun description(context: Context, description: String) =
    TextView(context).apply { text = description }

private fun contentText(context: Context, contentText: String) =
    TextView(context).apply {
        text = contentText
        textSize = 16f
        setTextColor(context.getTextColorPrimary())
    }
