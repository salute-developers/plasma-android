package com.sdds.testing.vs.overlay

import android.widget.FrameLayout
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

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
