package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.carousel.ButtonsPlacementInner
import com.sdds.plasma.sd.service.styles.carousel.ButtonsPlacementOuter
import com.sdds.plasma.sd.service.styles.carousel.Carousel
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cCarouselVariationsCompose : ComposeStyleProvider<String, CarouselStyle>() {
    override val variations: Map<String, @Composable () -> CarouselStyle> =
        mapOf(
            "ButtonsPlacementInner" to { Carousel.ButtonsPlacementInner.style() },
            "ButtonsPlacementOuter" to { Carousel.ButtonsPlacementOuter.style() },
        )
}
