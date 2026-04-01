package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.Divider
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.divider.divider

/**
 * Тест-кейсы для [com.sdds.uikit.Divider]
 */
@Suppress("UndocumentedPublicFunction")
abstract class DividerTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testDividerDefault()

    fun ComponentScope.dividerDefault(style: Int): Divider =
        fillWidth {
            divider(
                context,
                style,
            )
        }
}
