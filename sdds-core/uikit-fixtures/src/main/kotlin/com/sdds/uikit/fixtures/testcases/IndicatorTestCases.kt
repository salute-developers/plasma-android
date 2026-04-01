package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.Indicator
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.indicator.indicator

/**
 * Тест-кейсы для [Indicator]
 */
@Suppress("UndocumentedPublicFunction")
abstract class IndicatorTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1738
     */
    abstract fun testIndicatorSizeLDefault()

    /**
     * PLASMA-T1739
     */
    abstract fun testIndicatorSizeMAccent()

    /**
     * PLASMA-T1740
     */
    abstract fun testIndicatorSizeSInactive()

    /**
     * PLASMA-T1741
     */
    abstract fun testIndicatorLPositive()

    /**
     * PLASMA-T1742
     */
    abstract fun testIndicatorLWarning()

    /**
     * PLASMA-T1743
     */
    abstract fun testIndicatorLNegative()

    fun ComponentScope.commonIndicator(style: Int): Indicator =
        indicator(
            context,
            style,
        )
}
