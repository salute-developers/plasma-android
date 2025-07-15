package com.sdds.playground.sandbox.core.vs

import android.content.Context
import android.view.View
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allViewThemes
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.uikit.DropdownMenu
import com.sdds.uikit.ListItem
import com.sdds.uikit.SimpleListViewAdapter

internal class ThemeSwitcher(
    context: Context,
    private val themeManager: ThemeManager = ThemeManager,
) : DropdownMenu(context) {

    init {
        isFocusable = true
        itemAdapter = SimpleListViewAdapter().apply {
            setSelectionListener { item ->
                themeManager.updateTheme(Theme.valueOf(item.title))
                dismiss()
            }
        }
        setItems<SimpleListViewAdapter>(
            allViewThemes.mapIndexed { index, theme ->
                ListItem.simpleItem(index.toLong(), theme.name, hasDisclosure = false)
            },
        )
    }

    fun show(anchor: View) {
        minWidth = anchor.measuredWidth
        showWithTrigger(
            anchor,
            placementMode = PLACEMENT_MODE_STRICT,
            placement = PLACEMENT_BOTTOM,
            alignment = ALIGNMENT_START,
        )
    }
}
