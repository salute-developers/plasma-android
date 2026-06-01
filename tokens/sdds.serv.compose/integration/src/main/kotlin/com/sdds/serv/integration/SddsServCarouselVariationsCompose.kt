// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.carousel.ButtonsPlacementInner
import com.sdds.serv.styles.carousel.ButtonsPlacementOuter
import com.sdds.serv.styles.carousel.Carousel
import com.sdds.serv.styles.carousel.CarouselButtonsPlacement
import com.sdds.serv.styles.carousel.CarouselStyles
import com.sdds.serv.styles.carousel.resolve

internal object SddsServCarouselVariationsCompose : ComposeStyleProvider<CarouselStyle>() {
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
