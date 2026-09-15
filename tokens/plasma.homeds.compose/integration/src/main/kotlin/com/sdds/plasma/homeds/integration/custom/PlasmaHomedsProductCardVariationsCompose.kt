@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
)

package com.sdds.plasma.homeds.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.productcard.ProductCardStyle
import com.sdds.plasma.homeds.styles.customcomponents.productcard.HasInnerPaddings
import com.sdds.plasma.homeds.styles.customcomponents.productcard.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.productcard.L
import com.sdds.plasma.homeds.styles.customcomponents.productcard.M
import com.sdds.plasma.homeds.styles.customcomponents.productcard.ProductCard

object PlasmaHomedsProductCardVariationsCompose : ComposeStyleProvider<ProductCardStyle>() {
    override val variations: Map<String, ComposeStyleReference<ProductCardStyle>> =
        mapOf(
            "ProductCard.M" to ComposeStyleReference { ProductCard.M.style() },
            "ProductCard.L" to ComposeStyleReference { ProductCard.L.style() },
            "ProductCardM.HasInnerPaddings" to ComposeStyleReference { ProductCard.M.HasInnerPaddings.style() },
            "ProductCardL.HasInnerPaddings" to ComposeStyleReference { ProductCard.L.HasInnerPaddings.style() },
            "ProductCard.M.Humidity" to ComposeStyleReference { ProductCard.M.Humidity.style() },
            "ProductCard.L.Humidity" to ComposeStyleReference { ProductCard.L.Humidity.style() },
            "ProductCardMHumidity.HasInnerPaddings" to ComposeStyleReference {
                ProductCard.M.Humidity.HasInnerPaddings.style()
            },
            "ProductCardLHumidity.HasInnerPaddings" to ComposeStyleReference {
                ProductCard.L.Humidity.HasInnerPaddings.style()
            },
        )
}
