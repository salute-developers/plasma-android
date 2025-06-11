package com.sdds.testing.vs.skeleton

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.RectSkeleton

/**
 * Тест-кейс для [RectSkeleton]
 */
@Suppress("UndocumentedPublicFunction")
abstract class RectSkeletonTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testRectSkeleton()

    fun ComponentScope.rectSkeletonTest(style: Int): RectSkeleton =
        rectSkeleton(
            context = context,
            style = style,
            state = RectSkeletonUiState(
                variant = "",
            ),
        )
}
