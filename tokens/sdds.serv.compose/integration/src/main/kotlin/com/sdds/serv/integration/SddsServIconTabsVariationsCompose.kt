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
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.IconTabs
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.TabsIconTabsOrientation
import com.sdds.serv.styles.tabs.TabsIconTabsSize
import com.sdds.serv.styles.tabs.TabsStyles
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs
import com.sdds.serv.styles.tabs.resolve

internal object SddsServIconTabsVariationsCompose : ComposeStyleProvider<TabsStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "orientation",
                value = "Default",
                variants = listOf("Default", "Horizontal", "Vertical"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabsStyle>> =
        mapOf(
            "IconTabs.L" to ComposeStyleReference { IconTabs.L.style() },
            "IconTabs.L.Vertical" to ComposeStyleReference { IconTabs.L.Vertical.style() },
            "IconTabs.L.Horizontal" to ComposeStyleReference { IconTabs.L.Horizontal.style() },
            "IconTabs.M" to ComposeStyleReference { IconTabs.M.style() },
            "IconTabs.M.Vertical" to ComposeStyleReference { IconTabs.M.Vertical.style() },
            "IconTabs.M.Horizontal" to ComposeStyleReference { IconTabs.M.Horizontal.style() },
            "IconTabs.S" to ComposeStyleReference { IconTabs.S.style() },
            "IconTabs.S.Vertical" to ComposeStyleReference { IconTabs.S.Vertical.style() },
            "IconTabs.S.Horizontal" to ComposeStyleReference { IconTabs.S.Horizontal.style() },
            "IconTabs.Xs" to ComposeStyleReference { IconTabs.Xs.style() },
            "IconTabs.Xs.Vertical" to ComposeStyleReference { IconTabs.Xs.Vertical.style() },
            "IconTabs.Xs.Horizontal" to ComposeStyleReference { IconTabs.Xs.Horizontal.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabsStyles.IconTabs.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabsIconTabsSize.L
                "M" -> TabsIconTabsSize.M
                "S" -> TabsIconTabsSize.S
                "Xs" -> TabsIconTabsSize.Xs
                else -> TabsIconTabsSize.L
            },
            orientation = when (bindings["orientation"]?.toString()) {
                "Default" -> TabsIconTabsOrientation.Default
                "Horizontal" -> TabsIconTabsOrientation.Horizontal
                "Vertical" -> TabsIconTabsOrientation.Vertical
                else -> TabsIconTabsOrientation.Default
            },
        ).key
    }
}
