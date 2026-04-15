package com.sdds.uikit.fixtures.testcases

import android.widget.FrameLayout
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.overlay.OverlayUiState
import com.sdds.uikit.fixtures.stories.overlay.overlayWithTrigger

/**
 * Тест-кейсы для компонента [Overlay]
 */
@Suppress("UndocumentedPublicFunction")
abstract class OverlayTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testOverlay()

    fun ComponentScope.overlayBase(style: Int) =
        fillSize {
            overlayWithTrigger(
                context = context,
                style = style,
                state = OverlayUiState(
                    variant = "",
                ),
            ).apply {
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT,
                )
            }
        }
}
