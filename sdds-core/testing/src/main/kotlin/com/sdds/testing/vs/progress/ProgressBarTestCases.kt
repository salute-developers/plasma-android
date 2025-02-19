package com.sdds.testing.vs.progress

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.ProgressBar

/**
 * Тест-кейсы [ProgressBar]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class ProgressBarTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testProgressDefault()

    abstract fun testProgressSecondary()

    abstract fun testProgressWarning()

    abstract fun testProgressPositive()

    abstract fun testProgressNegative()

    abstract fun testProgressAccent()

    abstract fun testProgressGradientAccent()

    abstract fun testProgressDefaultValueOne()

    fun ComponentScope.progressDefault(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.25f,
            ),
        )

    fun ComponentScope.progressSecondary(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.25f,
            ),
        )

    fun ComponentScope.progressWarning(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.25f,
            ),
        )

    fun ComponentScope.progressPositive(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.5f,
            ),
        )

    fun ComponentScope.progressNegative(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.99f,
            ),
        )

    fun ComponentScope.progressAccent(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 1f,
            ),
        )

    fun ComponentScope.progressGradientAccent(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.5f,
            ),
        )

    fun ComponentScope.progressDefaultValueOne(style: Int): ProgressBar =
        progressBar(
            context,
            style,
            ProgressUiState(
                progress = 0.01f,
            ),
        )
}
