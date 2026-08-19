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
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.listitem.L
import com.sdds.finai.styles.listitem.ListItemStyles
import com.sdds.finai.styles.listitem.ListItemTight
import com.sdds.finai.styles.listitem.ListItemTightSize
import com.sdds.finai.styles.listitem.M
import com.sdds.finai.styles.listitem.S
import com.sdds.finai.styles.listitem.Xs
import com.sdds.finai.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiListItemTightVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItemTight.L" to ComposeStyleReference { ListItemTight.L.style() },
            "ListItemTight.M" to ComposeStyleReference { ListItemTight.M.style() },
            "ListItemTight.S" to ComposeStyleReference { ListItemTight.S.style() },
            "ListItemTight.Xs" to ComposeStyleReference { ListItemTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ListItemTightSize.L
                "M" -> ListItemTightSize.M
                "S" -> ListItemTightSize.S
                "Xs" -> ListItemTightSize.Xs
                else -> ListItemTightSize.L
            },
        ).key
    }
}
