package com.sdds.testing.vs.spinner

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Spinner

/**
 * Тест-кейсы для [Spinner]
 */
@Suppress("UndocumentedPublicFunction")
abstract class SpinnerTestCases(mode: String) : RoborazziConfig(mode) {

    fun ComponentScope.spinnerTest(style: Int): Spinner =
        spinner(
            context = context,
            style = style,
        )
}
