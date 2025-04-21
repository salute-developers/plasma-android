package com.sdds.testing.vs.progress

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.CircularProgressBar

/**
 * Тест-кейсы [CircularProgressBar]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CircularProgressTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1991
     */
    abstract fun testCircularProgressXxlDefault()

    /**
     * PLASMA-T1992
     */
    abstract fun testCircularProgressXlSecondary()

    /**
     * PLASMA-T1993
     */
    abstract fun testCircularProgressLAccent()

    /**
     * PLASMA-T1994
     */
    abstract fun testCircularProgressMGradient()

    /**
     * PLASMA-T1995
     */
    abstract fun testCircularProgressSInfo()

    /**
     * PLASMA-T1996
     */
    abstract fun testCircularProgressXsPositive()

    /**
     * PLASMA-T1997
     */
    abstract fun testCircularProgressXxsWarning()

    /**
     * PLASMA-T1998
     */
    abstract fun testCircularProgressXxlNegative()

    fun ComponentScope.circularProgress(style: Int): CircularProgressBar =
        circularProgressBar(
            context = context,
            style = style,
            state = CircularProgressUiState(
                progress = 0.5f,
                animateProgress = false,
                trackEnabled = true,
            ),
        )

    fun ComponentScope.circularProgressMax(style: Int): CircularProgressBar =
        circularProgressBar(
            context = context,
            style = style,
            state = CircularProgressUiState(
                progress = 1f,
                animateProgress = false,
                trackEnabled = true,
            ),
        )

    fun ComponentScope.circularProgressNoTrack(style: Int): CircularProgressBar =
        circularProgressBar(
            context = context,
            style = style,
            state = CircularProgressUiState(
                progress = 0.5f,
                animateProgress = false,
                trackEnabled = false,
            ),
        )
}
