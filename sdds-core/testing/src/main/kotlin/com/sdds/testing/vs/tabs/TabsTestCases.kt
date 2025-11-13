package com.sdds.testing.vs.tabs

import android.view.ViewGroup
import androidx.core.view.descendants
import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Tabs

/**
 * Тест кейсы для [Tabs]
 */
@Suppress("UndocumentedPublicFunction")
abstract class TabsTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2271
     */
    abstract fun testTabsLHorizontalHasDividerScroll()

    /**
     * PLASMA-T2272
     */
    abstract fun testTabsMVerticalIconStartNoLabelValueHasActionScrollExtra()

    /**
     * PLASMA-T2273
     */
    abstract fun testTabsSHorizontalAmountFiveIconEndHasDividerStretch()

    /**
     * PLASMA-T2274
     */
    abstract fun testTabsXsHorizontalAmountTenHasDividerIfRoomExtra()

    /**
     * PLASMA-T2275
     */
    abstract fun testTabsLVerticalAmountFiveStretch()

    /**
     * PLASMA-T2276
     */
    abstract fun testTabsDisabled()

    /**
     * PLASMA-T2277
     */
    abstract fun testTabsH1AmountFiveValueNoIconLabelHasDividerScroll()

    /**
     * PLASMA-T2278
     */
    abstract fun testTabsH2AmountTwoValueNoIconLabelStretch()

    /**
     * PLASMA-T2279
     */
    abstract fun testTabsH3AmountOneIconStartValueLabelIfRoom()

    /**
     * PLASMA-T2280
     */
    abstract fun testTabsH4AmountFiveIconEndValueLabelHasActionScroll()

    /**
     * PLASMA-T2281
     */
    abstract fun testTabsH5AmountHundredIconEndValueLabelHasActionIfRoom()

    /**
     * PLASMA-T2283
     */
    abstract fun testIconTabsLHorizontalAmountFiveHasActionHasDividerScroll()

    /**
     * PLASMA-T2284
     */
    abstract fun testIconTabsMVerticalAmountFiveHasDividerExtraStretch()

    /**
     * PLASMA-T2285
     */
    abstract fun testIconTabsSHorizontalAmountFiveHasDividerActionIfRoom()

    /**
     * PLASMA-T2286
     */
    abstract fun testIconTabsXsVerticalAmountFiveHasActionHasDividerScrollExtra()

    fun ComponentScope.tabsAmountFiveNoIconLabelHasDividerScroll(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.No,
                    tabItemLabel = "Label",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.SCROLL,
                    counter = false,
                    count = "123",
                    actionEnabled = false,
                    dividerEnabled = true,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountTwentyIconStartNoLabelValueHasActionScrollExtra(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 20,
                    icon = TabItemIcon.Start,
                    tabItemLabel = "",
                    tabItemValue = "Value",
                    enabled = true,
                    displayMode = DisplayMode.SCROLL,
                    counter = true,
                    count = "123",
                    actionEnabled = true,
                    dividerEnabled = false,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountFiveIconEndHasDividerStretch(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.End,
                    tabItemLabel = "Label",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.STRETCH,
                    counter = false,
                    count = "123",
                    actionEnabled = false,
                    dividerEnabled = true,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountTenHasDividerIfRoomExtra(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 10,
                    icon = TabItemIcon.No,
                    tabItemLabel = "Label",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.IF_ROOM,
                    counter = true,
                    count = "123",
                    actionEnabled = false,
                    dividerEnabled = true,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
            }
        }

    fun ComponentScope.tabsAmountFiveStretch(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.No,
                    tabItemLabel = "Label",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.STRETCH,
                    counter = true,
                    count = "123",
                    actionEnabled = false,
                    dividerEnabled = true,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountFiveValueNoIconLabelHasDividerScroll(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.No,
                    tabItemLabel = "Label",
                    tabItemValue = "Value",
                    enabled = true,
                    displayMode = DisplayMode.SCROLL,
                    counter = false,
                    count = "123",
                    actionEnabled = false,
                    dividerEnabled = true,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountTwoValueNoIconLabelStretch(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 2,
                    icon = TabItemIcon.No,
                    tabItemLabel = "Label",
                    tabItemValue = "Value",
                    enabled = true,
                    displayMode = DisplayMode.STRETCH,
                    counter = false,
                    count = "",
                    actionEnabled = false,
                    dividerEnabled = false,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountOneIconStartValueLabelIfRoom(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 1,
                    icon = TabItemIcon.Start,
                    tabItemLabel = "Label",
                    tabItemValue = "Value",
                    enabled = true,
                    displayMode = DisplayMode.IF_ROOM,
                    counter = false,
                    count = "123",
                    actionEnabled = true,
                    dividerEnabled = true,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountFiveIconEndValueLabelHasActionScroll(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.End,
                    tabItemLabel = "Label",
                    tabItemValue = "Val",
                    enabled = true,
                    displayMode = DisplayMode.SCROLL,
                    counter = false,
                    count = "123",
                    actionEnabled = true,
                    dividerEnabled = false,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
                applyClip()
            }
        }

    fun ComponentScope.tabsAmountHundredIconEndValueLabelHasActionIfRoom(style: Int): Tabs =
        margins {
            tabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 100,
                    icon = TabItemIcon.No,
                    tabItemLabel = "Label",
                    tabItemValue = "Value",
                    enabled = true,
                    displayMode = DisplayMode.IF_ROOM,
                    counter = false,
                    count = "",
                    actionEnabled = true,
                    dividerEnabled = false,
                    indicatorEnabled = true,
                ),
            ).apply {
                id = R.id.tabs
            }
        }

    fun ComponentScope.iconTabsAmountFiveHasActionHasDividerScroll(style: Int): Tabs =
        margins {
            iconTabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.Start,
                    tabItemLabel = "",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.SCROLL,
                    actionEnabled = true,
                    dividerEnabled = true,
                    counter = false,
                    count = "123",
                ),
            ).apply {
                id = R.id.icon_tabs
                applyClip()
            }
        }

    fun ComponentScope.iconTabsAmountFiveHasDividerExtraStretch(style: Int): Tabs =
        margins {
            iconTabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.Start,
                    tabItemLabel = "",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.STRETCH,
                    actionEnabled = false,
                    dividerEnabled = true,
                    counter = true,
                    count = "123",
                ),
            ).apply {
                id = R.id.icon_tabs
                applyClip()
            }
        }

    fun ComponentScope.iconTabsAmountFiveHasDividerActionIfRoom(style: Int): Tabs =
        fillSize {
            iconTabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 20,
                    icon = TabItemIcon.Start,
                    tabItemLabel = "Label",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.IF_ROOM,
                    actionEnabled = true,
                    dividerEnabled = true,
                    counter = false,
                    count = "123",
                ),
            ).apply {
                id = R.id.icon_tabs
            }
        }

    fun ComponentScope.iconTabsAmountFiveHasActionHasDividerScrollExtra(style: Int): Tabs =
        margins {
            iconTabs(
                style = style,
                context = context,
                state = TabsUiState(
                    variant = "",
                    amount = 5,
                    icon = TabItemIcon.No,
                    tabItemLabel = "",
                    tabItemValue = "",
                    enabled = true,
                    displayMode = DisplayMode.SCROLL,
                    actionEnabled = true,
                    dividerEnabled = true,
                    counter = true,
                    count = "123",
                ),
            ).apply {
                id = R.id.icon_tabs
            }
        }

    /**
     * Включает clip у табов
     */
    private fun ViewGroup.applyClip() {
        clipChildren = true
        clipToPadding = true
        clipToOutline = false
        descendants.forEach {
            if (it is ViewGroup) {
                println("ViewGroup: ${it.javaClass.simpleName}")
                it.apply {
                    clipChildren = true
                    clipToPadding = true
                    clipToOutline = false
                }
            }
        }
    }
}
