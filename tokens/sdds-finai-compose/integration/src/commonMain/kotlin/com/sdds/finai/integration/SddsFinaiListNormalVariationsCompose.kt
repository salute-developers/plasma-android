// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.list.L
import com.sdds.finai.styles.list.ListNormal
import com.sdds.finai.styles.list.ListNormalSize
import com.sdds.finai.styles.list.ListStyles
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.list.S
import com.sdds.finai.styles.list.Xs
import com.sdds.finai.styles.list.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiListNormalVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "ListNormal.L" to ComposeStyleReference { ListNormal.L.style() },
            "ListNormal.M" to ComposeStyleReference { ListNormal.M.style() },
            "ListNormal.S" to ComposeStyleReference { ListNormal.S.style() },
            "ListNormal.Xs" to ComposeStyleReference { ListNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ListNormalSize.L
                "M" -> ListNormalSize.M
                "S" -> ListNormalSize.S
                "Xs" -> ListNormalSize.Xs
                else -> ListNormalSize.L
            },
        ).key
    }
}
