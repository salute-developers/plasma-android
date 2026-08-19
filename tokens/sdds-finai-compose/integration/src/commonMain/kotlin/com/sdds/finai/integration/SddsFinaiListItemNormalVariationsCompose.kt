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
import com.sdds.finai.styles.listitem.ListItemNormal
import com.sdds.finai.styles.listitem.ListItemNormalSize
import com.sdds.finai.styles.listitem.ListItemStyles
import com.sdds.finai.styles.listitem.M
import com.sdds.finai.styles.listitem.S
import com.sdds.finai.styles.listitem.Xs
import com.sdds.finai.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiListItemNormalVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItemNormal.L" to ComposeStyleReference { ListItemNormal.L.style() },
            "ListItemNormal.M" to ComposeStyleReference { ListItemNormal.M.style() },
            "ListItemNormal.S" to ComposeStyleReference { ListItemNormal.S.style() },
            "ListItemNormal.Xs" to ComposeStyleReference { ListItemNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ListItemNormalSize.L
                "M" -> ListItemNormalSize.M
                "S" -> ListItemNormalSize.S
                "Xs" -> ListItemNormalSize.Xs
                else -> ListItemNormalSize.L
            },
        ).key
    }
}
