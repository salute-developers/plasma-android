@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
)

package com.sdds.plasma.homeds.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.productformitem.ProductFormItemStyle
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.Default
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.H2
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.H3
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.Negative
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.Positive
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.ProductFormItem
import com.sdds.plasma.homeds.styles.customcomponents.productformitem.Warning

object PlasmaHomedsProductFormItemVariationsCompose : ComposeStyleProvider<ProductFormItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ProductFormItemStyle>> =
        mapOf(
            "ProductFormItem.H2.Default" to ComposeStyleReference { ProductFormItem.H2.Default.style() },
            "ProductFormItem.H2.Positive" to ComposeStyleReference { ProductFormItem.H2.Positive.style() },
            "ProductFormItem.H2.Warning" to ComposeStyleReference { ProductFormItem.H2.Warning.style() },
            "ProductFormItem.H2.Negative" to ComposeStyleReference { ProductFormItem.H2.Negative.style() },

            "ProductFormItem.H3.Default" to ComposeStyleReference { ProductFormItem.H3.Default.style() },
            "ProductFormItem.H3.Positive" to ComposeStyleReference { ProductFormItem.H3.Positive.style() },
            "ProductFormItem.H3.Warning" to ComposeStyleReference { ProductFormItem.H3.Warning.style() },
            "ProductFormItem.H3.Negative" to ComposeStyleReference { ProductFormItem.H3.Negative.style() },
        )
}
