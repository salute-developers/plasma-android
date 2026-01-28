package com.sdds.compose.uikit.fixtures.samples.tabbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarLabelPlacement
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun TabBar_Simple() {
    composableCodeSnippet {
        var selectedIndex by remember { mutableStateOf(0) }

        TabBar {
            repeat(3) { index ->
                tabItem(weight = 1f) {
                    TabBarItem(
                        isSelected = index == selectedIndex,
                        defaultIcon = com.sdds.icons.R.drawable.ic_smile_outline_36,
                        selectedIcon = com.sdds.icons.R.drawable.ic_smile_fill_36,
                        label = "Label",
                        extra = { Counter(count = "123") },
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
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.White, "/** Токен цвета */"),
                    ),
                )
                labelColor(
                    placeholder(Color.LightGray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.White, "/** Токен цвета */"),
                    ),
                )
                iconColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Токен цвета */"),
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
            .counterStyle(
                placeholder(
                    CounterStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .badgeStyle(
                placeholder(
                    BadgeStyle.badgeBuilder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .indicatorStyle(
                placeholder(
                    IndicatorStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .style()
    }
}
