package com.sdds.testing.vs.carousel

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Carousel
import com.sdds.uikit.dp

/**
 * Тест-кейсы для [Carousel]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CarouselTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2437
     */
    abstract fun testCarouselStartInnerControlsIndicatorWithGap()

    /**
     * PLASMA-T2438
     */
    abstract fun testCarouselOuterCenterControls()

    /**
     * PLASMA-T2439
     */
    abstract fun testCarouselInnerEndControlsIndicatorWithGap()

    /**
     * PLASMA-T2440
     */
    abstract fun testCarouselInnerCenterWithGap()

    fun ComponentScope.carouselStartControlsIndicatorWithGap(style: Int): Carousel =
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
        ).apply { setOffscreenOffset(10f.dp) }

    fun ComponentScope.carouselCenterControls(style: Int): Carousel =
        carousel(
            style = style,
            context = context,
            state = CarouselUiState(
                variant = "",
                appearance = "",
                itemCount = 10,
                alignment = CarouselContentAlignment.CENTER,
                controlsEnabled = true,
                indicatorEnabled = false,
                indicatorVisibleItemCount = 5,
                withGap = false,
            ),
        ).apply {
            setOffscreenOffset(10f.dp)
        }

    fun ComponentScope.carouselEndControlsIndicatorWithGap(style: Int): Carousel =
        carousel(
            style = style,
            context = context,
            state = CarouselUiState(
                variant = "",
                appearance = "",
                itemCount = 10,
                alignment = CarouselContentAlignment.END,
                controlsEnabled = true,
                indicatorEnabled = true,
                indicatorVisibleItemCount = 10,
                withGap = true,
            ),
        ).apply {
            setOffscreenOffset(10f.dp)
        }

    fun ComponentScope.carouselCenter(style: Int): Carousel =
        carousel(
            style = style,
            context = context,
            state = CarouselUiState(
                variant = "",
                appearance = "",
                itemCount = 10,
                alignment = CarouselContentAlignment.CENTER,
                controlsEnabled = false,
                indicatorEnabled = false,
                indicatorVisibleItemCount = 10,
                withGap = true,
            ),
        ).apply {
            setOffscreenOffset(10f.dp)
        }
}
