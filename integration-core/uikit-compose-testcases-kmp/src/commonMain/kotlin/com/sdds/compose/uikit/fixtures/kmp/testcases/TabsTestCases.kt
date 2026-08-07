package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle

/**
 * PLASMA-T2271
 */
@Composable
fun TabsLHorizontalFiveHasDividerScrollKmp(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = { selectedTabIndex = it },
        clip = TabsClip.Scroll,
        stretch = false,
        indicatorEnabled = true,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = selected,
                    label = label,
                    startContent = {},
                    endContent = {},
                    actionIcon = null,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2276
 */
@Composable
fun TabsDisabledKmp(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = { selectedTabIndex = it },
        clip = TabsClip.Scroll,
        stretch = false,
        enabled = false,
        indicatorEnabled = false,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = selected,
                    label = label,
                    startContent = {},
                    endContent = {},
                    actionIcon = null,
                    onActionClicked = {},
                )
            }
        }
    }
}
