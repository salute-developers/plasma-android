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
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.icontabitem.IconTabItem
import com.sdds.serv.styles.icontabitem.IconTabItemSize
import com.sdds.serv.styles.icontabitem.IconTabItemStyles
import com.sdds.serv.styles.icontabitem.L
import com.sdds.serv.styles.icontabitem.M
import com.sdds.serv.styles.icontabitem.S
import com.sdds.serv.styles.icontabitem.Xs
import com.sdds.serv.styles.icontabitem.resolve

internal object SddsServIconTabItemVariationsCompose : ComposeStyleProvider<TabItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "IconTabItem.L" to ComposeStyleReference { IconTabItem.L.style() },
            "IconTabItem.M" to ComposeStyleReference { IconTabItem.M.style() },
            "IconTabItem.S" to ComposeStyleReference { IconTabItem.S.style() },
            "IconTabItem.Xs" to ComposeStyleReference { IconTabItem.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconTabItemStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IconTabItemSize.L
                "M" -> IconTabItemSize.M
                "S" -> IconTabItemSize.S
                "Xs" -> IconTabItemSize.Xs
                else -> IconTabItemSize.L
            },
        ).key
    }
}
