package com.sdds.testing.vs.divider

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Divider

/**
 * Тест-кейсы для [Divider]
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
