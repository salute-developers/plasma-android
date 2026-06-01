package com.sdds.compose.uikit.fixtures.samples.tabbar

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarLabelPlacement
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.icons.R
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun TabBar_Simple() {
    composableCodeSnippet {
        var selectedIndex by remember { mutableStateOf(0) }

        TabBar {
            repeat(3) { index ->
                tabItem {
                    val isSelected = index == selectedIndex
                    TabBarItem(
                        isSelected = isSelected,
                        icon = {
                            AnimatedContent(
                                targetState = isSelected,
                                transitionSpec = {
                                    fadeIn(tween(200))
                                        .togetherWith(fadeOut(tween(200)))
                                },
                            ) {
                                val iconSource = resourceImageSource(
                                    if (it) {
                                        getIconSelected(index)
                                    } else {
                                        getIcon(index)
                                    },
                                )
                                Icon(source = iconSource, contentDescription = "")
                            }
                        },
                        labelContent = { Text(getTitle(index)) },
                        onClick = {
                            selectedIndex = index
                        },
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TabBar_WithCounter() {
    composableCodeSnippet {
        var selectedIndex by remember { mutableStateOf(0) }

        TabBar {
            repeat(3) { index ->
                tabItem {
                    val isSelected = index == selectedIndex
                    TabBarItem(
                        isSelected = isSelected,
                        icon = { TabIcon(index, isSelected) },
                        labelContent = { Text(getTitle(index)) },
                        extra = if (index == 2) {
                            { Counter(count = "3") }
                        } else {
                            null
                        },
                        onClick = {
                            selectedIndex = index
                        },
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TabBar_CustomItem() {
    composableCodeSnippet {
        var selectedIndex by remember { mutableStateOf(0) }

        TabBar {
            tabItem {
                val isSelected = selectedIndex == 0
                TabBarItem(
                    isSelected = isSelected,
                    icon = { TabIcon(0, isSelected) },
                    labelContent = { Text(getTitle(0)) },
                    onClick = { selectedIndex = 0 },
                )
            }
            tabItem(weight = null) {
                Icon(
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { selectedIndex = 1 },
                    source = resourceImageSource(R.drawable.ic_sb_36),
                    contentDescription = null,
                )
            }
            tabItem {
                val isSelected = selectedIndex == 2
                TabBarItem(
                    isSelected = isSelected,
                    icon = { TabIcon(2, isSelected) },
                    labelContent = { Text(getTitle(2)) },
                    onClick = { selectedIndex = 2 },
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TabBar_Style() {
    composableCodeSnippet {
        TabBarStyle.builder()
            .tabBarItemStyle(
                placeholder(
                    TabBarItemStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .topShape(CircleShape)
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .colors {
                backgroundColor(placeholder(Color.White, "/** Цвет фона */"))
            }
            .dimensions {
                paddingStart(8.dp)
                paddingEnd(8.dp)
                contentPaddingStart(2.0.dp)
                contentPaddingEnd(2.0.dp)
                contentPaddingTop(2.0.dp)
                contentPaddingBottom(2.0.dp)
                itemSpacing(2.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TabBarItem_Style() {
    composableCodeSnippet {
        TabBarItemStyle.builder()
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токе формы(скругления) */"))
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .labelPlacement(TabBarLabelPlacement.Bottom)
            .colors {
                backgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.White, "/** Цвет в состоянии selected */"),
                    ),
                )
                labelColor(
                    placeholder(Color.LightGray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.White, "/** Цвет в состоянии selected */"),
                    ),
                )
                iconColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected */"),
                    ),
                )
            }
            .dimensions {
                paddingTop(10.dp)
                paddingBottom(10.dp)
                iconSize(32.dp)
                minHeight(48.dp)
                labelPadding(2.dp)
            }
            .counterStyle(placeholder(CounterStyle.builder().style(), "/** Стиль компонента */"))
            .badgeStyle(placeholder(BadgeStyle.badgeBuilder().style(), "/** Стиль компонента */"))
            .indicatorStyle(
                placeholder(
                    IndicatorStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .style()
    }
}

private fun getTitle(index: Int): String {
    return when (index) {
        0 -> "Почта"
        1 -> "Календарь"
        2 -> "Встречи"
        3 -> "Чаты"
        else -> "Label"
    }
}

private fun getIcon(index: Int): Int {
    return when (index) {
        0 -> R.drawable.ic_mail_outline_24
        1 -> R.drawable.ic_calendar_outline_24
        2 -> R.drawable.ic_call_outline_24
        3 -> R.drawable.ic_chat_outline_24
        else -> R.drawable.ic_settings_outline_24
    }
}

private fun getIconSelected(index: Int): Int {
    return when (index) {
        0 -> R.drawable.ic_mail_fill_24
        1 -> R.drawable.ic_calendar_fill_24
        2 -> R.drawable.ic_call_fill_24
        3 -> R.drawable.ic_chat_fill_24
        else -> R.drawable.ic_settings_fill_24
    }
}

@Composable
private fun TabIcon(index: Int, isSelected: Boolean) {
    AnimatedContent(
        targetState = isSelected,
        transitionSpec = {
            fadeIn(tween(200))
                .togetherWith(fadeOut(tween(200)))
        },
    ) {
        val iconSource = resourceImageSource(
            if (it) {
                getIconSelected(index)
            } else {
                getIcon(index)
            },
        )
        Icon(source = iconSource, contentDescription = "")
    }
}
