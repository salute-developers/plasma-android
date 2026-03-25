package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.toolbar.ToolBarUiState
import com.sdds.uikit.fixtures.stories.toolbar.toolBar

/**
 * Тест-кейсы для компонента [ToolBar]
 */
@Suppress("UndocumentedPublicFunction")
abstract class ToolBarTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1716
     */
    abstract fun testToolbarLHorizontalHasShadow()

    /**
     * PLASMA-T1717
     */
    abstract fun testToolBarMVertical()

    /**
     * PLASMA-T1718
     */
    abstract fun testToolBarSHorizontal()

    /**
     * PLASMA-T1719
     */
    abstract fun testToolBarXsHorizontal()

    /**
     * PLASMA-T2372
     */
    abstract fun testToolBarDivider()

    fun ComponentScope.toolbarTestCase(style: Int) =
        toolBar(
            context = context,
            style = style,
            state = ToolBarUiState(
                variant = "",
                appearance = "",
                hasDivider = false,
                slotsAmount = 5,
            ),
        ).apply {
            id = R.id.toolbar
        }

    fun ComponentScope.toolbarTestDivider(style: Int) =
        toolBar(
            context = context,
            style = style,
            state = ToolBarUiState(
                variant = "",
                appearance = "",
                hasDivider = true,
                slotsAmount = 5,
            ),
        ).apply {
            id = R.id.toolbar
        }
}
