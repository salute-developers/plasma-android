package com.sdds.playground.sandbox.tabs.compose

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.IconTabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Tabs]
 */
@Composable
internal fun IconTabsScreen(componentKey: ComponentKey = ComponentKey.IconTabs) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<IconTabsViewModel>(
            factory = IconTabsViewModelFactory(
                defaultState = TabsUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { tabsUiState, style ->
            var selectedTab by remember { mutableIntStateOf(0) }
            Tabs(
                style = style,
                enabled = tabsUiState.enabled,
                selectedTabIndex = selectedTab,
                onTabClicked = {
                    selectedTab = it
                },
                clip = tabsUiState.clip,
                stretch = tabsUiState.stretch,
                indicatorEnabled = tabsUiState.indicatorEnabled,
                dividerEnabled = tabsUiState.dividerEnabled,
            ) {
                repeat(tabsUiState.amount) { index ->
                    val label = "${tabsUiState.tabItemLabel}$index"
                    tab(dropdownAlias = label) { selected ->
                        IconTabItem(
                            isSelected = selected,
                            count = if (tabsUiState.counter) tabsUiState.count else null,
                            icon = R.drawable.ic_plasma_24,
                            actionIcon = actionIcon(tabsUiState, style),
                            onActionClicked = {},
                        )
                    }
                }
            }
        },
    )
}

@DrawableRes
private fun actionIcon(tabsUiState: TabsUiState, style: TabsStyle): Int? {
    return if (tabsUiState.actionEnabled) {
        style.tabItemStyle.actionIcon
    } else {
        null
    }
}

@Composable
internal fun IconTabsPreview(style: TabsStyle) {
    var selectedTab by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTab,
        onTabClicked = {
            selectedTab = it
        },
    ) {
        repeat(3) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                IconTabItem(
                    isSelected = selected,
                    actionIcon = R.drawable.ic_close_24,
                    icon = R.drawable.ic_plasma_24,
                    onActionClicked = {},
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun TabsScreenPreview() {
    SandboxTheme {
        TabsScreen()
    }
}
