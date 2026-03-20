package com.sdds.compose.uikit.fixtures.stories.tabs

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconTabItem
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsStyle
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.TabsUiStatePropertiesProducer
import com.sdds.sandbox.TabsUiStateTransformer
import com.sdds.sandbox.UiState

@StoryUiState
data class TabsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 5,
    val icon: TabItemIcon = TabItemIcon.None,
    val tabItemLabel: String = "Tab",
    val tabItemValue: String = "",
    val enabled: Boolean = true,
    val stretch: Boolean = false,
    val clip: TabsClip = TabsClip.Scroll,
    val counter: Boolean = false,
    val count: String = "1",
    val actionEnabled: Boolean = false,
    val dividerEnabled: Boolean = true,
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
        var selectedTab by remember { mutableIntStateOf(0) }
        Tabs(
            style = style,
            enabled = state.enabled,
            selectedTabIndex = selectedTab,
            onTabClicked = {
                selectedTab = it
            },
            clip = state.clip,
            stretch = state.stretch,
            indicatorEnabled = state.indicatorEnabled,
            dividerEnabled = state.dividerEnabled,
        ) {
            repeat(state.amount) { index ->
                val label = "${state.tabItemLabel}$index"
                tab(dropdownAlias = label) { selected ->
                    TabItem(
                        isSelected = selected,
                        label = label,
                        helpText = state.tabItemValue,
                        count = if (state.counter) state.count else null,
                        startContent = startIcon(state),
                        endContent = endIcon(state),
                        actionIcon = actionIcon(state, style),
                        onActionClicked = {},
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
        var selectedTab by remember { mutableIntStateOf(0) }
        Tabs(
            style = style,
            enabled = state.enabled,
            selectedTabIndex = selectedTab,
            onTabClicked = {
                selectedTab = it
            },
            clip = state.clip,
            stretch = state.stretch,
            indicatorEnabled = state.indicatorEnabled,
            dividerEnabled = state.dividerEnabled,
        ) {
            repeat(state.amount) { index ->
                val label = "${state.tabItemLabel}$index"
                tab(dropdownAlias = label) { selected ->
                    IconTabItem(
                        isSelected = selected,
                        count = if (state.counter) state.count else null,
                        icon = R.drawable.ic_plasma_24,
                        actionIcon = actionIcon(state, style),
                        onActionClicked = {},
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
}

@DrawableRes
private fun actionIcon(state: TabsUiState, style: TabsStyle): Int? {
    return if (state.actionEnabled) {
        style.tabItemStyle.actionIcon
    } else {
        null
    }
}

private fun endIcon(state: TabsUiState): (@Composable () -> Unit)? {
    return if (state.icon == TabItemIcon.End) {
        {
            Icon(
                painter = painterResource(R.drawable.ic_plasma_24),
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
                painter = painterResource(R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}
