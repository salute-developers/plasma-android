package com.sdds.testing.vs.carousel

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Carousel
import com.sdds.uikit.CellLayout

/**
 * Тест-кейсы для [Carousel]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CarouselTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testCarouselStartInnerControlsIndicatorWithGap()

    fun ComponentScope.carouselTest(style: Int): Carousel =
        carousel(
            style = style,
            context = context,
            state = CarouselUiState(
                variant = "",
                appearance = "",
                itemCount = 10,
                alignment = CarouselContentAlignment.START,
                controlsEnabled = true,
                indicatorEnabled = true,
                indicatorVisibleItemCount = 5,
                withGap = true,
            ),
        )
}
