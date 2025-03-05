package com.sdds.testing.vs.indicator

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Indicator

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
