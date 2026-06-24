// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.list.L
import com.sdds.plasma.giga.styles.list.ListNormal
import com.sdds.plasma.giga.styles.list.ListNormalSize
import com.sdds.plasma.giga.styles.list.ListStyles
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.list.S
import com.sdds.plasma.giga.styles.list.Xl
import com.sdds.plasma.giga.styles.list.Xs
import com.sdds.plasma.giga.styles.list.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaListNormalVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "ListNormal.Xl" to ComposeStyleReference { ListNormal.Xl.style() },
            "ListNormal.L" to ComposeStyleReference { ListNormal.L.style() },
            "ListNormal.M" to ComposeStyleReference { ListNormal.M.style() },
            "ListNormal.S" to ComposeStyleReference { ListNormal.S.style() },
            "ListNormal.Xs" to ComposeStyleReference { ListNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListNormalSize.Xl
                "L" -> ListNormalSize.L
                "M" -> ListNormalSize.M
                "S" -> ListNormalSize.S
                "Xs" -> ListNormalSize.Xs
                else -> ListNormalSize.Xl
            },
        ).key
    }
}
