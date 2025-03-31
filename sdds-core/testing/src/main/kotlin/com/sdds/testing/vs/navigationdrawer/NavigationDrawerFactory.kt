package com.sdds.testing.vs.navigationdrawer

import android.content.Context
import androidx.annotation.StyleRes
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.NavigationDrawer

/**
 * Фабрика для создания [NavigationDrawer]
 */
fun navigationDrawer(
    context: Context,
    @StyleRes style: Int = 0,
    state: NavigationDrawerUiState = NavigationDrawerUiState(),
): NavigationDrawer {
    return NavigationDrawer(context.styleWrapper(style))
        .applyState(state)
        .apply {
            id = R.id.navigation_drawer
            setNavigationItemSelectedListener { true }
        }
}

/**
 * Применяет состояние [NavigationDrawerUiState] к [NavigationDrawer]
 */
fun NavigationDrawer.applyState(state: NavigationDrawerUiState): NavigationDrawer = apply {
    val items = mutableListOf<NavigationDrawer.Item>()
    mode = state.mode.value
    repeat(state.amount) {
        items.add(
            NavigationDrawer.Item.Builder()
                .setId(it)
                .setTitle(state.itemLabel)
                .setIconResource(context, com.sdds.icons.R.drawable.ic_plasma_24)
                .setCounter(state.counterText.takeIf { state.counterEnabled })
                .build(),
        )
    }
    setItems(items)

    setHeader(
        if (state.hasHeader) {
            NavigationDrawer.Item.Builder()
                .setId(R.id.navigation_drawer_header)
                .setTitle(context.getString(R.string.testing_nav_header))
                .setIconResource(context, com.sdds.icons.R.drawable.ic_view_person_fill_24)
                .build()
        } else {
            null
        },
    )

    setFooter(
        if (state.hasFooter) {
            NavigationDrawer.Item.Builder()
                .setId(R.id.navigation_drawer_footer)
                .setTitle(context.getString(R.string.testing_nav_footer))
                .setIconResource(context, com.sdds.icons.R.drawable.ic_house_fill_24)
                .build()
        } else {
            null
        },
    )
}
