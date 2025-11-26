package com.sdds.testing.compose.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconTabItem
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [Tabs]
 */

/**
 * PLASMA-T2271
 */
@Composable
fun TabsLHorizontalFiveHasDividerScroll(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
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
 * PLASMA-T2272
 */
@Composable
fun TabsMVerticalTwentyIconStartValueHasActionCounter(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.Scroll,
        stretch = false,
        indicatorEnabled = true,
        orientation = TabsOrientation.Vertical,
        dividerEnabled = false,
    ) {
        repeat(20) { index ->
            val label = "Label$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = selected,
                    label = label,
                    helpText = "Value",
                    startContent = {
                        Icon(
                            painter = painterResource(R.drawable.ic_plasma_24),
                            contentDescription = "",
                        )
                    },
                    endContent = {},
                    count = "123",
                    actionIcon = R.drawable.ic_close_24,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2273
 */
@Composable
fun TabsSHorizontalFiveIconEndStretch(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.None,
        stretch = true,
        indicatorEnabled = false,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = false,
                    label = label,
                    startContent = {},
                    endContent = {
                        Icon(
                            painter = painterResource(R.drawable.ic_plasma_24),
                            contentDescription = "",
                        )
                    },
                    count = "",
                    actionIcon = null,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2274
 */
@Composable
fun TabsXsHorizontalTenShowAll(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.ShowMore,
        stretch = false,
        indicatorEnabled = false,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(10) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = false,
                    label = label,
                    startContent = {},
                    endContent = {},
                    count = "123",
                    actionIcon = null,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2275
 */
@Composable
fun TabsLVerticalStretchFive(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.None,
        stretch = true,
        indicatorEnabled = true,
        orientation = TabsOrientation.Vertical,
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
                    count = "123",
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
fun TabsDisabled(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
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

/**
 * PLASMA-T2277
 */
@Composable
fun TabsH1FiveValueScroll(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.Scroll,
        stretch = false,
        enabled = true,
        indicatorEnabled = false,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = false,
                    label = label,
                    helpText = "Value",
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
 * PLASMA-T2278
 */
@Composable
fun TabsH2TwoValueScroll(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.None,
        stretch = true,
        enabled = true,
        indicatorEnabled = true,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = false,
    ) {
        repeat(2) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = selected,
                    label = label,
                    helpText = "Value",
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
 * PLASMA-T2278
 */
@Composable
fun TabsH3OneHasAction(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.ShowMore,
        stretch = false,
        enabled = true,
        indicatorEnabled = false,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(1) { index ->
            val label = "Label$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = false,
                    label = label,
                    helpText = "Value",
                    startContent = {
                        Icon(
                            painter = painterResource(R.drawable.ic_plasma_24),
                            contentDescription = "",
                        )
                    },
                    endContent = {},
                    actionIcon = R.drawable.ic_close_24,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2279
 */
@Composable
fun TabsH4FiveHasActionIconEnd(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.Scroll,
        stretch = false,
        enabled = true,
        indicatorEnabled = true,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = false,
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = selected,
                    label = label,
                    helpText = "Value",
                    startContent = {},
                    endContent = {
                        Icon(
                            painter = painterResource(R.drawable.ic_plasma_24),
                            contentDescription = "",
                        )
                    },
                    actionIcon = R.drawable.ic_close_24,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2280
 */
@Composable
fun TabsH5FiftyValueShowAll(style: TabsStyle) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTabIndex,
        onTabClicked = {
            selectedTabIndex = it
        },
        clip = TabsClip.ShowMore,
        stretch = false,
        enabled = true,
        indicatorEnabled = true,
        orientation = TabsOrientation.Horizontal,
        dividerEnabled = true,
    ) {
        repeat(50) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                TabItem(
                    isSelected = selected,
                    label = label,
                    helpText = "Value",
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
 * PLASMA-T2283
 */
@Composable
fun IconTabsLHorizontalFiveHasActionScroll(style: TabsStyle) {
    var selectedTab by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTab,
        indicatorEnabled = true,
        clip = TabsClip.Scroll,
        onTabClicked = {
            selectedTab = it
        },
    ) {
        repeat(5) { index ->
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

/**
 * PLASMA-T2284
 */
@Composable
fun IconTabsMVerticalFiveHasActionStretchCounter(style: TabsStyle) {
    var selectedTab by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTab,
        indicatorEnabled = true,
        clip = TabsClip.None,
        stretch = true,
        onTabClicked = {
            selectedTab = it
        },
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                IconTabItem(
                    isSelected = selected,
                    actionIcon = null,
                    count = "123",
                    icon = R.drawable.ic_plasma_24,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2285
 */
@Composable
fun IconTabsSHorizontalFiveHasActionStretchCounter(style: TabsStyle) {
    var selectedTab by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTab,
        indicatorEnabled = false,
        clip = TabsClip.ShowMore,
        stretch = false,
        onTabClicked = {
            selectedTab = it
        },
    ) {
        repeat(10) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                IconTabItem(
                    isSelected = false,
                    actionIcon = R.drawable.ic_close_24,
                    count = "",
                    icon = R.drawable.ic_plasma_24,
                    onActionClicked = {},
                )
            }
        }
    }
}

/**
 * PLASMA-T2286
 */
@Composable
fun IconTabsXsVerticalScrollCounter(style: TabsStyle) {
    var selectedTab by remember { mutableIntStateOf(0) }
    Tabs(
        modifier = Modifier,
        style = style,
        selectedTabIndex = selectedTab,
        indicatorEnabled = true,
        clip = TabsClip.Scroll,
        stretch = false,
        onTabClicked = {
            selectedTab = it
        },
    ) {
        repeat(5) { index ->
            val label = "Tab$index"
            tab(dropdownAlias = label) { selected ->
                IconTabItem(
                    isSelected = true,
                    actionIcon = R.drawable.ic_close_24,
                    count = "123",
                    icon = R.drawable.ic_plasma_24,
                    onActionClicked = {},
                )
            }
        }
    }
}
