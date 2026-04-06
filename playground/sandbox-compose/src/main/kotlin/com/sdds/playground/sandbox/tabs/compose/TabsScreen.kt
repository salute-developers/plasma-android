package com.sdds.playground.sandbox.tabs.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalTintProvider
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.components.counter.rememberCounterMotion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.components.tabs.rememberTabItemPagerMotion
import com.sdds.compose.uikit.components.tabs.rememberTabSelectedState
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.theme.SddsServTheme
import kotlinx.coroutines.launch

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
            val pagerState = rememberPagerState { tabsUiState.amount }
            val scope = rememberCoroutineScope()
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Tabs(
                    style = style,
                    enabled = tabsUiState.enabled,
                    selectedTabIndexProvider = { pagerState.currentPage },
                    selectedTabOffset = { pagerState.currentPageOffsetFraction },
                    onDisclosureTabClicked = {
                        scope.launch {
                            pagerState.animateScrollToPage(it, pagerState.currentPageOffsetFraction)
                        }
                    },
                    clip = tabsUiState.clip,
                    stretch = tabsUiState.stretch,
                    indicatorEnabled = true, //tabsUiState.indicatorEnabled,
                    dividerEnabled = tabsUiState.dividerEnabled,
                ) {
                    repeat(tabsUiState.amount) { index ->
                        val label = "${tabsUiState.tabItemLabel}$index"

                        tabItem(dropdownAlias = label) {
                            val tabMotion = rememberTabItemPagerMotion(index, pagerState)
                            val isTabSelected = rememberTabSelectedState(index, pagerState)
                            TabItem(
                                isSelected = isTabSelected.value,
                                onClick = {
                                    scope.launch {
                                        pagerState.animateScrollToPage(
                                            index,
                                            pagerState.currentPageOffsetFraction,
                                        )
                                    }
                                },
                                content = { Text(label) },
                                helperContent = { Text(tabsUiState.tabItemValue) },
                                counter = counter(tabsUiState, tabMotion.context),
                                startContent = startIcon(tabsUiState),
                                endContent = endIcon(tabsUiState),
                                action = actionIcon(tabsUiState, style),
                                motion = tabMotion,
                            )
                        }
                    }
                }

                Box(contentAlignment = Alignment.Center) {
                    HorizontalPager(
                        pagerState,
                        Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    ) {
                    }
                    val textColor = SddsServTheme.colors.textDefaultSecondary
                    Text("Swipe to change tab", color = { textColor })
                }

            }

        },
    )
}

private fun counter(tabsUiState: TabsUiState, motionContext: MotionContext): (@Composable () -> Unit)? {
    return if (tabsUiState.counter) {
        {
            Counter(motion = rememberCounterMotion(motionContext)) {
                Text(tabsUiState.count)
            }
        }
    } else null
}

private fun actionIcon(tabsUiState: TabsUiState, style: TabsStyle): (@Composable () -> Unit)? {
    val actionIconRes = style.tabItemStyle.actionIcon
    return if (tabsUiState.actionEnabled && actionIconRes != null) {
        {
            Icon(painter = painterResource(actionIconRes), contentDescription = "")
        }
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
    val selectedTab = remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTab.intValue,
        onTabClicked = {
            selectedTab.intValue = it
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
