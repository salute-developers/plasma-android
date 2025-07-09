package com.sdds.testing.vs.skeleton

import android.view.View
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.TextSkeleton

/**
 * Тест-кейс для [TextSkeleton]
 */
@Suppress("UndocumentedPublicFunction")
abstract class TextSkeletonTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testTextSkeleton()

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
}
