package com.sdds.playground.sandbox.tabbar.compose

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun TabBarScreen(componentKey: ComponentKey = ComponentKey.TabBar) {
    val tabBarViewModel = viewModel<TabBarViewModel>(
        factory = TabBarViewModelFactory(TabBarUiState(), componentKey),
        key = componentKey.toString(),
    )
    ComponentScaffold(
        key = componentKey,
        viewModel = tabBarViewModel,
        component = { uiState, style ->
            TabBar(style = style) {
                uiState.items.map {
                    tabItem {
                        TabBarItem(
                            isSelected = tabBarViewModel.isSelected(it),
                            defaultIcon = R.drawable.ic_smile_outline_36,
                            selectedIcon = R.drawable.ic_smile_fill_36,
                            label = uiState.label,
                            extra = getExtra(uiState.extraType),
                            onClick = {
                                tabBarViewModel.onSelect(it)
                            },
                        )
                    }
                }
            }
        },
    )
}

private fun getExtra(extraType: TabBarExtraType): (@Composable () -> Unit)? {
    return when (extraType) {
        TabBarExtraType.None -> null
        TabBarExtraType.Counter -> {
            { Counter(count = "12") }
        }

        TabBarExtraType.Indicator -> {
            { Indicator() }
        }
    }
}

@Composable
internal fun TabBarPreview(style: TabBarStyle) {
    TabBar(style = style) {
        repeat(3) {
            tabItem {
                TabBarItem(
                    isSelected = it == 0,
                    defaultIcon = R.drawable.ic_smile_outline_36,
                    selectedIcon = R.drawable.ic_smile_fill_36,
                    label = "Label",
                    extra = { Counter(count = "12") },
                )
            }
        }
    }
}
