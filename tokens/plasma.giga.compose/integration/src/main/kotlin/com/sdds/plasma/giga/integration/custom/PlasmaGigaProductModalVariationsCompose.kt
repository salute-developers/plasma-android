@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.components.productmodal.ProductModalStyle
import com.sdds.plasma.giga.styles.customcomponents.productmodal.M
import com.sdds.plasma.giga.styles.customcomponents.productmodal.ProductModal
import com.sdds.plasma.giga.styles.customcomponents.productmodal.S

internal object PlasmaGigaProductModalVariationsCompose : ComposeStyleProvider<ProductModalStyle>() {

    override val variations: Map<String, ComposeStyleReference<ProductModalStyle>> =
        mapOf(
            "ProductModal.M" to ComposeStyleReference { ProductModal.M.style() },
            "ProductModal.S" to ComposeStyleReference { ProductModal.S.style() },
        )
}
