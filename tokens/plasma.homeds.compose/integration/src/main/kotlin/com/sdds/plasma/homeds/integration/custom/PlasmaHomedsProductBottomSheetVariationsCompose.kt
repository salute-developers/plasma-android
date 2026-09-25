@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
)

package com.sdds.plasma.homeds.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.productbottomsheet.ProductBottomSheetStyle
import com.sdds.plasma.homeds.styles.customcomponents.productbottomsheet.Default
import com.sdds.plasma.homeds.styles.customcomponents.productbottomsheet.HasButtons
import com.sdds.plasma.homeds.styles.customcomponents.productbottomsheet.ProductBottomSheet

object PlasmaHomedsProductBottomSheetVariationsCompose : ComposeStyleProvider<ProductBottomSheetStyle>() {
    override val variations: Map<String, ComposeStyleReference<ProductBottomSheetStyle>> =
        mapOf(
            "ProductBottomSheet.Default" to ComposeStyleReference { ProductBottomSheet.Default.style() },
            "ProductBottomSheet.HasButtons" to ComposeStyleReference { ProductBottomSheet.HasButtons.style() },
        )
}
