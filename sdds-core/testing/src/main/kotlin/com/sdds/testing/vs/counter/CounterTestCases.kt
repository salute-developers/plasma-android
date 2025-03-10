package com.sdds.testing.vs.counter

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Counter

/**
 * Тест-кейсы для [Counter]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CounterTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1724
     */
    abstract fun testCounterSizeLDefault()

    /**
     * PLASMA-T1725
     */
    abstract fun testCounterSizeMAccent()

    /**
     * PLASMA-T1726
     */
    abstract fun testCounterSizeSPositive()

    /**
     * PLASMA-T1727
     */
    abstract fun testCounterSizeXsWarning()

    /**
     * PLASMA-T1728
     */
    abstract fun testCounterSizeXxsNegative()

    /**
     * PLASMA-T1729
     */
    abstract fun testCounterSizeLWhite()

    /**
     * PLASMA-T1934
     */
    abstract fun testCounterSizeLDisabled()

    fun ComponentScope.counterCommon(style: Int): Counter =
        counter(
            context,
            style,
            CounterUiState(
                count = "123",
                enabled = true,
            ),
        )

    fun ComponentScope.counterPositiveLongNumber(style: Int): Counter =
        counter(
            context,
            style,
            CounterUiState(
                count = "999999999999999",
                enabled = true,
            ),
        )

    fun ComponentScope.counterSizeLWhite(style: Int): Counter =
        counter(
            context,
            style,
            CounterUiState(
                count = "1",
                enabled = true,
            ),
        )

    fun ComponentScope.counterDisabled(style: Int): Counter =
        counter(
            context,
            style,
            CounterUiState(
                count = "123",
                enabled = false,
            ),
        )
}
