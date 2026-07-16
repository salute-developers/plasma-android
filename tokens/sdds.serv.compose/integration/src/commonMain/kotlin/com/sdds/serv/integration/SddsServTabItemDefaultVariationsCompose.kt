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
import com.sdds.serv.styles.tabitem.Horizontal
import com.sdds.serv.styles.tabitem.L
import com.sdds.serv.styles.tabitem.M
import com.sdds.serv.styles.tabitem.S
import com.sdds.serv.styles.tabitem.TabItemDefault
import com.sdds.serv.styles.tabitem.TabItemDefaultOrientation
import com.sdds.serv.styles.tabitem.TabItemDefaultSize
import com.sdds.serv.styles.tabitem.TabItemStyles
import com.sdds.serv.styles.tabitem.Vertical
import com.sdds.serv.styles.tabitem.Xs
import com.sdds.serv.styles.tabitem.resolve

internal object SddsServTabItemDefaultVariationsCompose : ComposeStyleProvider<TabItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "orientation",
                value = "Default",
                variants = listOf("Default", "Horizontal", "Vertical"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "TabItemDefault.L" to ComposeStyleReference { TabItemDefault.L.style() },
            "TabItemDefault.L.Horizontal" to ComposeStyleReference { TabItemDefault.L.Horizontal.style() },
            "TabItemDefault.L.Vertical" to ComposeStyleReference { TabItemDefault.L.Vertical.style() },
            "TabItemDefault.M" to ComposeStyleReference { TabItemDefault.M.style() },
            "TabItemDefault.M.Horizontal" to ComposeStyleReference { TabItemDefault.M.Horizontal.style() },
            "TabItemDefault.M.Vertical" to ComposeStyleReference { TabItemDefault.M.Vertical.style() },
            "TabItemDefault.S" to ComposeStyleReference { TabItemDefault.S.style() },
            "TabItemDefault.S.Horizontal" to ComposeStyleReference { TabItemDefault.S.Horizontal.style() },
            "TabItemDefault.S.Vertical" to ComposeStyleReference { TabItemDefault.S.Vertical.style() },
            "TabItemDefault.Xs" to ComposeStyleReference { TabItemDefault.Xs.style() },
            "TabItemDefault.Xs.Horizontal" to ComposeStyleReference { TabItemDefault.Xs.Horizontal.style() },
            "TabItemDefault.Xs.Vertical" to ComposeStyleReference { TabItemDefault.Xs.Vertical.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabItemStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabItemDefaultSize.L
                "M" -> TabItemDefaultSize.M
                "S" -> TabItemDefaultSize.S
                "Xs" -> TabItemDefaultSize.Xs
                else -> TabItemDefaultSize.L
            },
            orientation = when (bindings["orientation"]?.toString()) {
                "Default" -> TabItemDefaultOrientation.Default
                "Horizontal" -> TabItemDefaultOrientation.Horizontal
                "Vertical" -> TabItemDefaultOrientation.Vertical
                else -> TabItemDefaultOrientation.Default
            },
        ).key
    }
}
