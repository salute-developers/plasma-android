package com.sdds.compose.uikit.fixtures.samples.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Tabs_Simple() {
    composableCodeSnippet {
        var selectedTab by remember { mutableIntStateOf(0) }
        Tabs(
            selectedTabIndex = selectedTab,
            clip = TabsClip.Scroll,
            orientation = TabsOrientation.Horizontal,
            onTabClicked = {
                selectedTab = it
            },
        ) {
            repeat(5) { index ->
                val label = "Label$index"
                tab(dropdownAlias = label) { selected ->
                    TabItem(
                        isSelected = selected,
                        label = label,
                        helpText = "HelpText",
                        count = "2",
                        startContent = {
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
}

@Composable
@DocSample(needScreenshot = false)
fun Tabs_Style() {
    composableCodeSnippet {
        TabsStyle.builder()
            .colors {
                indicatorColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                overflowNextIconColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                overflowPrevIconColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                disclosureColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии pressed */"),
                    ),
                )
            }
            .dimensions {
                indicatorThickness(2.0.dp)
                minSpacing(0.0.dp)
                minHeight(68.dp)
            }
            .orientation(TabsOrientation.Vertical)
            .dividerStyle(placeholder(DividerStyle.builder().style(), "/** Стиль компонента */"))
            .overflowNextIcon(R.drawable.ic_disclosure_right_outline_24)
            .overflowPrevIcon(R.drawable.ic_disclosure_left_outline_24)
            .dividerEnabled(true)
            .indicatorEnabled(true)
            .dropdownMenuStyle(placeholder(DropdownMenuStyle.builder().style(), "/** Стиль компонента */"))
            .disclosureTextStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .tabItemStyle(placeholder(TabItemStyle.builder().style(), "/** Стиль компонента */"))
            .overflowNextIcon(R.drawable.ic_disclosure_down_outline_24)
            .overflowPrevIcon(R.drawable.ic_disclosure_up_outline_24)
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TabItem_Style() {
    composableCodeSnippet {
        TabItemStyle.builder()
            .colors {
                labelColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected, InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + pressed */"),
                        setOf(InteractiveState.Selected, InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + hovered */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected */"),
                    ),
                )
                valueColor(
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected, InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + pressed */"),
                        setOf(InteractiveState.Selected, InteractiveState.Hovered)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии selected + hovered */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Gray, "/** Цвет в состоянии selected */"),
                    ),
                )
                startContentColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected, InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + pressed */"),
                        setOf(InteractiveState.Selected, InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + hovered */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Gray, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected */"),
                    ),
                )
                endContentColor(
                    placeholder(Color.LightGray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected, InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + pressed */"),
                        setOf(InteractiveState.Selected, InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + hovered */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected */"),
                    ),
                )
                actionColor(
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии pressed */"),
                    ),
                )
            }
            .disableAlpha(0.4f)
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .valueStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                paddingStart(0.0.dp)
                paddingEnd(0.0.dp)
                minHeight(56.0.dp)
                startContentSize(24.0.dp)
                endContentSize(24.0.dp)
                counterPadding(8.0.dp)
                valuePadding(8.0.dp)
                actionPadding(10.0.dp)
            }
            .counterStyle(placeholder(CounterStyle.builder().style(), "/** Стиль компонента */"))
            .actionIcon(R.drawable.ic_close_24)
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TabItemIcon_Style() {
    composableCodeSnippet {
        TabItemStyle.builder()
            .colors {
                startContentColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected, InteractiveState.Pressed)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + pressed */"),
                        setOf(InteractiveState.Selected, InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + hovered */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected */"),
                    ),
                )
                endContentColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Selected, InteractiveState.Pressed)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии selected + pressed */"),
                        setOf(InteractiveState.Selected, InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected + hovered */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Gray, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Gray, "/** Цвет в состоянии pressed */"),
                        setOf(InteractiveState.Selected)
                            to placeholder(Color.Black, "/** Цвет в состоянии selected */"),
                    ),
                )
                actionColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Gray, "/** Цвет в состоянии hovered */"),
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Gray, "/** Цвет в состоянии pressed */"),
                    ),
                )
            }
            .disableAlpha(0.4f)
            .dimensions {
                minHeight(56.0.dp)
                paddingStart(18.0.dp)
                paddingEnd(18.0.dp)
                startContentSize(24.0.dp)
                endContentSize(24.0.dp)
                actionPadding(10.0.dp)
                counterPadding(0.0.dp)
                counterOffsetX(8.0.dp)
                counterOffsetY(8.0.dp)
            }
            .counterStyle(placeholder(CounterStyle.builder().style(), "/** Стиль компонента */"))
            .actionIcon(R.drawable.ic_close_24)
            .style()
    }
}
