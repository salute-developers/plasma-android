package com.sdds.testing.compose.tabbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [TabBar]
 */

@Composable
fun TabBarExtraNone(style: TabBarStyle) {
    var selectedIndex by remember { mutableStateOf(0) }
    TabBar(
        style = style,
    ) {
        repeat(3) { index ->
            tabItem {
                TabBarItem(
                    modifier = Modifier.testTag("TabBar"),
                    isSelected = index == selectedIndex,
                    defaultIcon = R.drawable.ic_smile_outline_36,
                    selectedIcon = R.drawable.ic_smile_fill_36,
                    label = "Label",
                    extra = {},
                    onClick = {
                        selectedIndex = index
                    },
                )
            }
        }
    }
}

/**
 * Тест-кейс с Indicator
 */
@Composable
fun TabBarIndicator(style: TabBarStyle) {
    TabBar(
        style = style,
    ) {
        repeat(3) {
            tabItem {
                TabBarItem(
                    isSelected = it == 0,
                    defaultIcon = R.drawable.ic_smile_outline_36,
                    selectedIcon = R.drawable.ic_smile_fill_36,
                    label = "Label",
                    extra = { Indicator() },
                )
            }
        }
    }
}

/**
 * Тест-кейс с Counter
 */
@Composable
fun TabBarCounter(style: TabBarStyle) {
    TabBar(
        style = style,
    ) {
        repeat(3) {
            tabItem {
                TabBarItem(
                    isSelected = it == 0,
                    defaultIcon = R.drawable.ic_smile_outline_36,
                    selectedIcon = R.drawable.ic_smile_fill_36,
                    label = "Label",
                    extra = { Counter(count = "123") },
                )
            }
        }
    }
}

/**
 * Тест-кейс с 6 tabBar и Counter
 */
@Composable
fun TabBarCounterCountSix(style: TabBarStyle) {
    TabBar(
        style = style,
    ) {
        repeat(6) {
            tabItem {
                TabBarItem(
                    isSelected = it == 0,
                    defaultIcon = R.drawable.ic_smile_outline_36,
                    selectedIcon = R.drawable.ic_smile_fill_36,
                    label = "Label",
                    extra = { Counter(count = "123") },
                )
            }
        }
    }
}
