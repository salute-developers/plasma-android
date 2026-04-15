package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.Spinner
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.spinner.spinner

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
