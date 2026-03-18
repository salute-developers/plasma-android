package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.carousel.ButtonsPlacementInner
import com.sdds.serv.styles.carousel.ButtonsPlacementOuter
import com.sdds.serv.styles.carousel.Carousel

internal object SddsServCarouselVariationsCompose : ComposeStyleProvider<String, CarouselStyle>() {
    override val variations: Map<String, @Composable () -> CarouselStyle> =
        mapOf(
            "ButtonsPlacementInner" to { Carousel.ButtonsPlacementInner.style() },
            "ButtonsPlacementOuter" to { Carousel.ButtonsPlacementOuter.style() },
        )
}
