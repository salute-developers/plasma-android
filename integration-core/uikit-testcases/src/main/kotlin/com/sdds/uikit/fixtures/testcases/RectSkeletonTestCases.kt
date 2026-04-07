package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.RectSkeleton
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.skeleton.RectSkeletonUiState
import com.sdds.uikit.fixtures.stories.skeleton.rectSkeleton

/**
 * Тест-кейс для [RectSkeleton]
 */
@Suppress("UndocumentedPublicFunction")
abstract class RectSkeletonTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testRectSkeleton()

    abstract fun testRectSkeletonLighter()

    fun ComponentScope.rectSkeletonTest(style: Int): RectSkeleton =
        rectSkeleton(
            context = context,
            style = style,
            state = RectSkeletonUiState(
                variant = "",
            ),
        )
}
