package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.LocalTabItemStyle
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.motion.components.tabs.LocalTabItemMotionStyle
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorClearButton
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.Xs

@Composable
internal fun ScenarioTabs(
    items: List<ScenarioTabsItem>,
    selectedIndex: Int,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
    clip: TabsClip = TabsClip.ShowMore,
    keyboardFocusable: Boolean = true,
    showFocusIndicator: Boolean = false,
    onTabFocusChanged: (Int, Boolean) -> Unit = { _, _ -> },
) {
    Tabs(
        modifier = modifier,
        selectedTabIndexProvider = { selectedIndex },
        style = TabsDefault.Xs.Horizontal.style(),
        clip = clip,
        onDisclosureTabClicked = onTabSelected,
    ) {
        items.forEachIndexed { index, item ->
            tabItem(dropdownAlias = item.title) {
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused by interactionSource.collectIsFocusedAsState()
                val motion = rememberMotion(
                    LocalTabItemMotionStyle.current,
                    rememberMotionContext(interactionSource),
                )
                val fsSettings = LocalFocusSelectorSettings.current
                val tabItemStyle = LocalTabItemStyle.current

                LaunchedEffect(isFocused) {
                    onTabFocusChanged(index, isFocused)
                }

                val focusModifier = if (showFocusIndicator) {
                    Modifier.focusSelector(
                        settings = FocusSelectorSettings.builder()
                            .scale(fsSettings.scale)
                            .border(
                                fsSettings.border.copy(
                                    strokeInsets = -fsSettings.border.strokeWidth,
                                ),
                            )
                            .build(),
                        shape = tabItemStyle.shape,
                    ) { isFocused }
                } else {
                    Modifier
                }

                TabItem(
                    modifier = if (keyboardFocusable) {
                        Modifier
                            .then(focusModifier)
                            .focusable(
                                enabled = true,
                                interactionSource = interactionSource,
                            )
                            .testTag(item.testTag)
                    } else {
                        Modifier
                            .focusProperties { canFocus = false }
                            .testTag(item.testTag)
                    },
                    isSelected = selectedIndex == index,
                    onClick = { onTabSelected(index) },
                    motion = motion,
                ) {
                    Text(item.title)
                }
            }
        }
    }
}

@Composable
internal fun TabsFocusCase(
    isFocused: Boolean,
    rootFocusRequester: FocusRequester,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    var selectedIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf(
        ScenarioTabsItem("Tab 1", FocusSelectorTags.tabsItem(0)),
        ScenarioTabsItem("Tab 2", FocusSelectorTags.tabsItem(1)),
        ScenarioTabsItem("Tab 3", FocusSelectorTags.tabsItem(2)),
    )

    Column(
        modifier = Modifier.testTag(FocusSelectorTags.TABS_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Tabs")
        Box(
            modifier = Modifier
                .size(1.dp)
                .focusRequester(rootFocusRequester)
                .focusable(),
        )
        ScenarioTabs(
            items = tabs,
            selectedIndex = selectedIndex,
            onTabSelected = { selectedIndex = it },
            showFocusIndicator = true,
            onTabFocusChanged = { _, focused -> onFocusChanged(focused) },
        )
        Text(
            text = if (isFocused) "Tabs в фокусе" else "Tabs не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.TABS_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}
