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
import com.sdds.serv.styles.listitem.ListItemNormal
import com.sdds.serv.styles.listitem.ListItemNormalSize
import com.sdds.serv.styles.listitem.ListItemStyles
import com.sdds.serv.styles.listitem.M
import com.sdds.serv.styles.listitem.S
import com.sdds.serv.styles.listitem.Xl
import com.sdds.serv.styles.listitem.Xs
import com.sdds.serv.styles.listitem.resolve

internal object SddsServListItemNormalVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItemNormal.Xl" to ComposeStyleReference { ListItemNormal.Xl.style() },
            "ListItemNormal.L" to ComposeStyleReference { ListItemNormal.L.style() },
            "ListItemNormal.M" to ComposeStyleReference { ListItemNormal.M.style() },
            "ListItemNormal.S" to ComposeStyleReference { ListItemNormal.S.style() },
            "ListItemNormal.Xs" to ComposeStyleReference { ListItemNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListItemNormalSize.Xl
                "L" -> ListItemNormalSize.L
                "M" -> ListItemNormalSize.M
                "S" -> ListItemNormalSize.S
                "Xs" -> ListItemNormalSize.Xs
                else -> ListItemNormalSize.Xl
            },
        ).key
    }
}
