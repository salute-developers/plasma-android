package com.sdds.uikit.fixtures.stories.tabs

import android.content.Context
import com.sdds.uikit.Button
import com.sdds.uikit.Tabs
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.styleWrapper

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
        }
        .applyIconsState(state)
}

/**
 * Применяет [TabsUiState] к [Tabs]
 */
fun Tabs.applyIconsState(state: TabsUiState): Tabs = apply {
    displayMode = state.displayMode.mode
    dividerEnabled = state.dividerEnabled
    indicatorEnabled = state.indicatorEnabled
    addIconTabsWith(
        state.amount,
        state.count,
        state.tabItemLabel,
        state.counter,
        state.actionEnabled,
    )
    isEnabled = state.enabled
}

/**
 * Применяет [TabsUiState] к [Tabs]
 */
fun Tabs.applyIconsState(state: IconTabsUiState): Tabs = apply {
    displayMode = state.displayMode.mode
    dividerEnabled = state.dividerEnabled
    indicatorEnabled = state.indicatorEnabled
    addIconTabsWith(
        state.amount,
        state.count,
        state.disclosureText,
        state.counter,
        state.actionEnabled,
    )
    isEnabled = state.enabled
}

/**
 * Применяет [TabsUiState] к [Tabs]
 */
fun Tabs.applyState(state: TabsUiState): Tabs = apply {
    displayMode = state.displayMode.mode
    dividerEnabled = state.dividerEnabled
    indicatorEnabled = state.indicatorEnabled
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

private fun Tabs.addIconTabsWith(
    amount: Int,
    count: String,
    disclosureText: String,
    counterEnabled: Boolean,
    actionEnabled: Boolean,
) = apply {
    clearTabs()
    repeat(amount) {
        addTab(
            Tabs.IconTab.builder(context)
                .setId(it)
                .setIcon(TabItemIcon.Start.iconId)
                .setCounterText(count)
                .setDisclosureText(disclosureText)
                .setCounterEnabled(counterEnabled)
                .setActionEnabled(actionEnabled)
                .build(),
        )
    }
}
