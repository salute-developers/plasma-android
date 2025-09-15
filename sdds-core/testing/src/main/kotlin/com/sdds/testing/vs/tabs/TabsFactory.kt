package com.sdds.testing.vs.tabs

import android.content.Context
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Button
import com.sdds.uikit.Tabs

/**
 * Фабрика для создания [Tabs]
 */
fun tabs(
    context: Context,
    style: Int? = null,
    state: TabsUiState = TabsUiState(),
): Tabs {
    return Tabs(context.styleWrapper(style))
        .apply {
            id = R.id.tabs
            val layoutParams = state.currentLayoutParams(orientation)
            if (layoutParams != null) {
                this.layoutParams = layoutParams
            }
        }
        .applyState(state)
}

/**
 * Фабрика для создания [Tabs] с иконками
 */
fun iconTabs(
    context: Context,
    style: Int? = null,
    state: TabsUiState = TabsUiState(),
): Tabs {
    return Tabs(context.styleWrapper(style))
        .apply {
            id = R.id.icon_tabs
            val layoutParams = state.currentLayoutParams(orientation)
            if (layoutParams != null) {
                this.layoutParams = layoutParams
            }
        }
        .applyIconsState(state)
}

/**
 * Применяет [TabsUiState] к [Tabs]
 */
fun Tabs.applyIconsState(state: TabsUiState): Tabs = apply {
    displayMode = state.displayMode.mode
    dividerEnabled = state.dividerEnabled
    addIconTabsWith(state)
    isEnabled = state.enabled
}

/**
 * Применяет [TabsUiState] к [Tabs]
 */
fun Tabs.applyState(state: TabsUiState): Tabs = apply {
    displayMode = state.displayMode.mode
    dividerEnabled = state.dividerEnabled
    addTabsWith(state)
    isEnabled = state.enabled
}

private fun Tabs.addTabsWith(state: TabsUiState) = apply {
    clearTabs()
    repeat(state.amount) {
        addTab(
            Tabs.Tab.builder(context)
                .setId(it)
                .setText("${state.tabItemLabel} $it")
                .setHelperText(state.tabItemValue)
                .run {
                    if (state.icon != TabItemIcon.No) {
                        setIcon(state.icon.iconId)
                    } else {
                        this
                    }
                }
                .setCounterText(state.count)
                .setCounterEnabled(state.counter)
                .setActionEnabled(state.actionEnabled)
                .setIconPosition(
                    when (state.icon) {
                        TabItemIcon.End -> Button.IconPosition.TextEnd
                        else -> Button.IconPosition.TextStart
                    },
                )
                .build(),
        )
    }
}

private fun Tabs.addIconTabsWith(state: TabsUiState) = apply {
    clearTabs()
    repeat(state.amount) {
        addTab(
            Tabs.IconTab.builder(context)
                .setId(it)
                .setIcon(TabItemIcon.Start.iconId)
                .setCounterText(state.count)
                .setDisclosureText(state.tabItemLabel)
                .setCounterEnabled(state.counter)
                .setActionEnabled(state.actionEnabled)
                .build(),
        )
    }
}

private fun TabsUiState.currentLayoutParams(orientation: Int): LayoutParams? {
    return if (displayMode == DisplayMode.STRETCH && orientation == Tabs.HORIZONTAL) {
        FrameLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
    } else {
        null
    }
}
