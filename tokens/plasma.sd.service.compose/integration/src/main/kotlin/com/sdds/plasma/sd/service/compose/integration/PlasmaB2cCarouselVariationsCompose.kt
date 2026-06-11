// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
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
import com.sdds.plasma.sd.service.styles.carousel.CarouselButtonsPlacement
import com.sdds.plasma.sd.service.styles.carousel.CarouselStyles
import com.sdds.plasma.sd.service.styles.carousel.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cCarouselVariationsCompose : ComposeStyleProvider<CarouselStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "buttonsPlacement",
                value = "Inner",
                variants = listOf("Inner", "Outer"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<CarouselStyle>> =
        mapOf(
            "Carousel.ButtonsPlacementInner" to ComposeStyleReference { Carousel.ButtonsPlacementInner.style() },
            "Carousel.ButtonsPlacementOuter" to ComposeStyleReference { Carousel.ButtonsPlacementOuter.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CarouselStyles.resolve(
            buttonsPlacement = when (bindings["buttonsPlacement"]?.toString()) {
                "Inner" -> CarouselButtonsPlacement.Inner
                "Outer" -> CarouselButtonsPlacement.Outer
                else -> CarouselButtonsPlacement.Inner
            },
        ).key
    }
}
