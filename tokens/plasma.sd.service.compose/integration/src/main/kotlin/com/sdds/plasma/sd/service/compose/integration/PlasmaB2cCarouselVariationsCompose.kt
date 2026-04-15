// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.carousel.ButtonsPlacementInner
import com.sdds.plasma.sd.service.styles.carousel.ButtonsPlacementOuter
import com.sdds.plasma.sd.service.styles.carousel.Carousel

internal object PlasmaB2cCarouselVariationsCompose : ComposeStyleProvider<CarouselStyle>() {
    override val variations: Map<String, ComposeStyleReference<CarouselStyle>> =
        mapOf(
            "ButtonsPlacementInner" to ComposeStyleReference { Carousel.ButtonsPlacementInner.style() },
            "ButtonsPlacementOuter" to ComposeStyleReference { Carousel.ButtonsPlacementOuter.style() },
        )
}
