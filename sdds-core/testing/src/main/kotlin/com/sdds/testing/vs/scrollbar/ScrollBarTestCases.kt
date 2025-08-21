package com.sdds.testing.vs.scrollbar

import android.view.ViewGroup
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.ScrollBar

/**
 * Тест-кейсы для [ScrollBar]
 */
@Suppress("UndocumentedPublicFunction")
abstract class ScrollBarTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2124
     */
    abstract fun testScrollBarMHasTrackHoverExpand()

    /**
     * PLASMA-T2125
     */
    abstract fun testScrollBarSNoTrackHoverExpand()

    /**
     * PLASMA-T2126
     */
    abstract fun testScrollBarManyItems()

    fun ComponentScope.scrollBarTest(style: Int): ViewGroup =
        scrollBar(
            context = context,
            style = style,
            ScrollBarUiState(
                variant = "",
                orientation = ScrollOrientation.VERTICAL,
                itemsAmount = 30,
                hasTrack = true,
                hoverExpand = true,
                autoHideScrollBar = false,
            ),
        )

    fun ComponentScope.scrollBarTestNoTrack(style: Int): ViewGroup =
        scrollBar(
            context = context,
            style = style,
            ScrollBarUiState(
                variant = "",
                orientation = ScrollOrientation.VERTICAL,
                itemsAmount = 30,
                hasTrack = false,
                hoverExpand = true,
                autoHideScrollBar = false,
            ),
        )

    fun ComponentScope.scrollBarTestManyItems(style: Int): ViewGroup =
        scrollBar(
            context = context,
            style = style,
            ScrollBarUiState(
                variant = "",
                orientation = ScrollOrientation.VERTICAL,
                itemsAmount = 100,
                hasTrack = true,
                hoverExpand = true,
                autoHideScrollBar = false,
            ),
        )
}
