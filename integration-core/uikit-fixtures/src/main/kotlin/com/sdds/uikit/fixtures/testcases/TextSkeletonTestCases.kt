package com.sdds.uikit.fixtures.testcases

import android.view.View
import com.sdds.uikit.TextSkeleton
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.skeleton.TextSkeletonUiState
import com.sdds.uikit.fixtures.stories.skeleton.TextSkeletonWidth
import com.sdds.uikit.fixtures.stories.skeleton.textSkeleton

/**
 * Тест-кейс для [TextSkeleton]
 */
@Suppress("UndocumentedPublicFunction")
abstract class TextSkeletonTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testTextSkeleton()

    abstract fun testTextSkeletonDefaultNoTextRandom()

    abstract fun testTextSkeletonDefaultFullWidth()

    abstract fun testTextSkeletonLighterNoTextRandom()

    fun ComponentScope.textSkeletonTest(style: Int): View =
        textSkeleton(
            context = context,
            style = style,
            state = TextSkeletonUiState(
                variant = "",
                lineCount = 3,
                text = "abracadabra",
                width = TextSkeletonWidth.FullWidth,
            ),
        )

    fun ComponentScope.textSkeletonLineCountThreeNoTextRandom(style: Int): View =
        fillSize {
            textSkeleton(
                context = context,
                style = style,
                state = TextSkeletonUiState(
                    variant = "",
                    lineCount = 3,
                    text = "",
                    width = TextSkeletonWidth.Random,
                ),
            )
        }

    fun ComponentScope.textSkeletonLineCountTenTextFullWidth(style: Int): View =
        fillSize {
            textSkeleton(
                context = context,
                style = style,
                state = TextSkeletonUiState(
                    variant = "",
                    lineCount = 10,
                    text = "",
                    width = TextSkeletonWidth.FullWidth,
                ),
            )
        }

    fun ComponentScope.textSkeletonLineCountThreeTextRandom(style: Int): View =
        fillSize {
            textSkeleton(
                context = context,
                style = style,
                state = TextSkeletonUiState(
                    variant = "",
                    lineCount = 3,
                    text = "Lorem Ipsum is simply dummy text",
                    width = TextSkeletonWidth.Random,
                ),
            )
        }
}
