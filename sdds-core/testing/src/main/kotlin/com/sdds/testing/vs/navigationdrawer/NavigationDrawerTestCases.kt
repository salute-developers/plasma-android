package com.sdds.testing.vs.navigationdrawer

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.NavigationDrawer

/**
 * Тест-кейсы для [NavigationDrawer]
 */
@Suppress("UndocumentedPublicFunction")
abstract class NavigationDrawerTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1972
     */
    abstract fun testNavigationDrawerLabelAmountOne()

    /**
     * PLASMA-T1973
     */
    abstract fun testNavigationDrawerExpandedNoLabel()

    /**
     * PLASMA-T1974
     */
    abstract fun testNavigationDrawerCollapsedHasHeader()

    /**
     * PLASMA-T1975
     */
    abstract fun testNavigationDrawerExpandedHasFooter()

    /**
     * PLASMA-T1976
     */
    abstract fun testNavigationDrawerCollapsedCounter()

    /**
     * PLASMA-T1977
     */
    abstract fun testNavigationDrawerCounterHasHeaderFooter()

    fun ComponentScope.navigationDrawerLabelAmountOne(style: Int): NavigationDrawer =
        navigationDrawer(
            context = context,
            style = style,
            state = NavigationDrawerUiState(
                amount = 1,
                itemLabel = "Label",
                counterEnabled = false,
                counterText = "123",
                mode = NavigationDrawerMode.EXPANDED,
                hasHeader = false,
                hasFooter = false,
            ),
        )

    fun ComponentScope.navigationDrawerExpandedNoLabel(style: Int): NavigationDrawer =
        navigationDrawer(
            context = context,
            style = style,
            state = NavigationDrawerUiState(
                amount = 5,
                itemLabel = "",
                counterEnabled = false,
                counterText = "123",
                mode = NavigationDrawerMode.EXPANDED,
                hasHeader = false,
                hasFooter = false,
            ),
        )

    fun ComponentScope.navigationDrawerCollapsedHasHeader(style: Int): NavigationDrawer =
        navigationDrawer(
            context = context,
            style = style,
            state = NavigationDrawerUiState(
                amount = 5,
                itemLabel = "Label",
                counterEnabled = false,
                counterText = "123",
                mode = NavigationDrawerMode.COLLAPSED,
                hasHeader = true,
                hasFooter = false,
            ),
        )

    fun ComponentScope.navigationDrawerExpandedHasFooter(style: Int): NavigationDrawer =
        navigationDrawer(
            context = context,
            style = style,
            state = NavigationDrawerUiState(
                amount = 5,
                itemLabel = "Label",
                counterEnabled = false,
                counterText = "123",
                mode = NavigationDrawerMode.EXPANDED,
                hasHeader = false,
                hasFooter = true,
            ),
        )

    fun ComponentScope.navigationDrawerCollapsedCounter(style: Int): NavigationDrawer =
        navigationDrawer(
            context = context,
            style = style,
            state = NavigationDrawerUiState(
                amount = 5,
                itemLabel = "Label",
                counterEnabled = true,
                counterText = "123",
                mode = NavigationDrawerMode.COLLAPSED,
                hasHeader = false,
                hasFooter = false,
            ),
        )

    fun ComponentScope.navigationDrawerExpandedCounterHeaderFooter(style: Int): NavigationDrawer =
        navigationDrawer(
            context = context,
            style = style,
            state = NavigationDrawerUiState(
                amount = 50,
                itemLabel = "Label",
                counterEnabled = true,
                counterText = "123",
                mode = NavigationDrawerMode.EXPANDED,
                hasHeader = true,
                hasFooter = true,
            ),
        )
}
