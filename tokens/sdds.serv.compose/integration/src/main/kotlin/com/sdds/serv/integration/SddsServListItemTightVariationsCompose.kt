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
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.listitem.L
import com.sdds.serv.styles.listitem.ListItemStyles
import com.sdds.serv.styles.listitem.ListItemTight
import com.sdds.serv.styles.listitem.ListItemTightSize
import com.sdds.serv.styles.listitem.M
import com.sdds.serv.styles.listitem.S
import com.sdds.serv.styles.listitem.Xl
import com.sdds.serv.styles.listitem.Xs
import com.sdds.serv.styles.listitem.resolve

internal object SddsServListItemTightVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItemTight.Xl" to ComposeStyleReference { ListItemTight.Xl.style() },
            "ListItemTight.L" to ComposeStyleReference { ListItemTight.L.style() },
            "ListItemTight.M" to ComposeStyleReference { ListItemTight.M.style() },
            "ListItemTight.S" to ComposeStyleReference { ListItemTight.S.style() },
            "ListItemTight.Xs" to ComposeStyleReference { ListItemTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListItemTightSize.Xl
                "L" -> ListItemTightSize.L
                "M" -> ListItemTightSize.M
                "S" -> ListItemTightSize.S
                "Xs" -> ListItemTightSize.Xs
                else -> ListItemTightSize.Xl
            },
        ).key
    }
}
