package com.sdds.playground.sandbox.tabs.compose

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsStyle
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Tabs]
 */
@Composable
internal fun TabsScreen(componentKey: ComponentKey = ComponentKey.Tabs) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<TabsViewModel>(
            factory = TabsViewModelFactory(
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
                        TabItem(
                            isSelected = selected,
                            enabled = tabsUiState.enabled,
                            label = label,
                            helpText = tabsUiState.tabItemValue,
                            count = if (tabsUiState.counter) tabsUiState.count else null,
                            startContent = startIcon(tabsUiState),
                            endContent = endIcon(tabsUiState),
                            actionIcon = actionIcon(tabsUiState),
                            onActionClicked = {},
                        )
                    }
                }
            }
        },
    )
}

@DrawableRes
private fun actionIcon(tabsUiState: TabsUiState): Int? {
    return if (tabsUiState.actionEnabled) {
        com.sdds.icons.R.drawable.ic_close_24
    } else {
        null
    }
}

private fun endIcon(tabsUiState: TabsUiState): (@Composable () -> Unit)? {
    return if (tabsUiState.icon == TabItemIcon.End) {
        {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun startIcon(tabsUiState: TabsUiState): (@Composable () -> Unit)? {
    return if (tabsUiState.icon == TabItemIcon.Start) {
        {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

@Composable
internal fun TabsPreview(style: TabsStyle) {
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
                TabItem(
                    isSelected = selected,
                    label = label,
                    startContent = {
                        Icon(
                            painter = painterResource(com.sdds.icons.R.drawable.ic_plasma_24),
                            contentDescription = "",
                        )
                    },
                    actionIcon = com.sdds.icons.R.drawable.ic_close_24,
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
