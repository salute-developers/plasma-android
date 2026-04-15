package com.sdds.compose.uikit.fixtures.stories.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconTabItem
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.TabScope
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.TabsUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TabsUiStateTransformer
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.components.counter.rememberCounterMotion
import com.sdds.compose.uikit.motion.components.tabs.rememberTabItemPagerMotion
import com.sdds.compose.uikit.motion.components.tabs.rememberTabSelectedState
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.stringSource
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@StoryUiState
data class TabsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 5,
    val icon: TabItemIcon = TabItemIcon.End,
    val tabItemLabel: String = "Tab",
    val tabItemValue: String = "",
    val enabled: Boolean = true,
    val stretch: Boolean = false,
    val clip: TabsClip = TabsClip.Scroll,
    val counter: Boolean = true,
    val count: String = "1",
    val actionEnabled: Boolean = false,
    val dividerEnabled: Boolean = false,
    val indicatorEnabled: Boolean = true,
) : UiState {

    override fun updateVariant(
        appearance: String,
        variant: String,
    ): UiState {
        return copy(variant = variant, appearance = appearance)
    }
}

enum class TabItemIcon {
    Start, End, None,
}

@Story
object TabsStory : ComposeBaseStory<TabsUiState, TabsStyle>(
    ComponentKey.Tabs,
    TabsUiState(),
    TabsUiStatePropertiesProducer,
    TabsUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabsStyle,
        state: TabsUiState,
    ) {
        val pagerState = rememberPagerState { state.amount }
        val scope = rememberCoroutineScope()
        CommonTabsContent(pagerState, scope, state, style) {
            repeat(state.amount) { index ->
                val label = "${state.tabItemLabel}$index"

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
                        content = { Text(stringSource(label)) },
                        helperContent = { Text(stringSource(state.tabItemValue)) },
                        counter = counter(state, tabMotion.context),
                        startContent = startIcon(state),
                        endContent = endIcon(state),
                        action = actionIconContent(state, style),
                        motion = tabMotion,
                    )
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: TabsStyle,
        key: ComponentKey,
    ) {
        var selectedTab by remember { mutableIntStateOf(0) }
        Tabs(
            selectedTabIndexProvider = { selectedTab },
            style = style,
            onDisclosureTabClicked = { selectedTab = it },
        ) {
            repeat(3) { index ->
                val label = "Tab$index"
                tabItem(dropdownAlias = label) {
                    TabItem(
                        isSelected = index == selectedTab,
                        onClick = { selectedTab = index },
                        startContent = {
                            Icon(
                                painter = painterResource(R.drawable.ic_plasma_24),
                                contentDescription = "",
                            )
                        },
                        content = { Text(label) },
                    )
                }
            }
        }
    }
}

@Story
object IconTabsStory : ComposeBaseStory<TabsUiState, TabsStyle>(
    ComponentKey.IconTabs,
    TabsUiState(),
    TabsUiStatePropertiesProducer,
    TabsUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabsStyle,
        state: TabsUiState,
    ) {
        val pagerState = rememberPagerState { state.amount }
        val scope = rememberCoroutineScope()
        CommonTabsContent(pagerState, scope, state, style) {
            repeat(state.amount) { index ->
                val label = "${state.tabItemLabel}$index"
                tabItem(dropdownAlias = label) {
                    val tabMotion = rememberTabItemPagerMotion(index, pagerState)
                    val isTabSelected by rememberTabSelectedState(index, pagerState)
                    IconTabItem(
                        isSelected = isTabSelected,
                        onClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    index,
                                    pagerState.currentPageOffsetFraction,
                                )
                            }
                        },
                        counter = counter(state, tabMotion.context),
                        action = actionIconContent(state, style),
                        content = {
                            Icon(
                                source = resourceImageSource(R.drawable.ic_plasma_24),
                                contentDescription = "$label icon",
                            )
                        },
                        motion = tabMotion,
                    )
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: TabsStyle,
        key: ComponentKey,
    ) {
        var selectedTab by remember { mutableIntStateOf(0) }
        Tabs(
            selectedTabIndexProvider = { selectedTab },
            style = style,
            onDisclosureTabClicked = { selectedTab = it },
        ) {
            repeat(3) { index ->
                val label = "Tab$index"
                tabItem(dropdownAlias = label) {
                    IconTabItem(
                        isSelected = index == selectedTab,
                        onClick = { selectedTab = index },
                        content = {
                            Icon(
                                source = resourceImageSource(R.drawable.ic_plasma_24),
                                contentDescription = "$label icon",
                            )
                        },
                    )
                }
            }
        }
    }
}

@Composable
private fun CommonTabsContent(
    pagerState: PagerState,
    scope: CoroutineScope,
    state: TabsUiState,
    style: TabsStyle,
    tabs: TabScope.() -> Unit,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Tabs(
            style = style,
            enabled = state.enabled,
            selectedTabIndexProvider = { pagerState.currentPage },
            selectedTabOffset = { pagerState.currentPageOffsetFraction },
            onDisclosureTabClicked = {
                scope.launch {
                    pagerState.animateScrollToPage(it, pagerState.currentPageOffsetFraction)
                }
            },
            clip = state.clip,
            stretch = state.stretch,
            indicatorEnabled = state.indicatorEnabled,
            dividerEnabled = state.dividerEnabled,
            tabs = tabs,
        )

        Box(contentAlignment = Alignment.Center) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                pageContent = {},
            )
            Text("Swipe here to change tabs")
        }
    }
}

private fun counter(state: TabsUiState, motionContext: MotionContext): (@Composable () -> Unit)? {
    return if (state.counter) {
        {
            Counter(count = state.count, motion = rememberCounterMotion(motionContext = motionContext))
        }
    } else {
        null
    }
}

private fun actionIconContent(state: TabsUiState, style: TabsStyle): (@Composable () -> Unit)? {
    val actionIconRes = style.tabItemStyle.actionIcon
    return if (state.actionEnabled && actionIconRes != null) {
        {
            Icon(source = resourceImageSource(actionIconRes), contentDescription = "")
        }
    } else {
        null
    }
}

private fun endIcon(state: TabsUiState): (@Composable () -> Unit)? {
    return if (state.icon == TabItemIcon.End) {
        {
            Icon(
                source = resourceImageSource(R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun startIcon(state: TabsUiState): (@Composable () -> Unit)? {
    return if (state.icon == TabItemIcon.Start) {
        {
            Icon(
                source = resourceImageSource(R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}
