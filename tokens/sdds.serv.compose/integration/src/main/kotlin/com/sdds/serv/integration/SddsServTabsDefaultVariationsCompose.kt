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
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.TabsDefaultOrientation
import com.sdds.serv.styles.tabs.TabsDefaultSize
import com.sdds.serv.styles.tabs.TabsStyles
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs
import com.sdds.serv.styles.tabs.resolve

internal object SddsServTabsDefaultVariationsCompose : ComposeStyleProvider<TabsStyle>() {
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
            "TabsDefault.L" to ComposeStyleReference { TabsDefault.L.style() },
            "TabsDefault.L.Vertical" to ComposeStyleReference { TabsDefault.L.Vertical.style() },
            "TabsDefault.L.Horizontal" to ComposeStyleReference { TabsDefault.L.Horizontal.style() },
            "TabsDefault.M" to ComposeStyleReference { TabsDefault.M.style() },
            "TabsDefault.M.Vertical" to ComposeStyleReference { TabsDefault.M.Vertical.style() },
            "TabsDefault.M.Horizontal" to ComposeStyleReference { TabsDefault.M.Horizontal.style() },
            "TabsDefault.S" to ComposeStyleReference { TabsDefault.S.style() },
            "TabsDefault.S.Vertical" to ComposeStyleReference { TabsDefault.S.Vertical.style() },
            "TabsDefault.S.Horizontal" to ComposeStyleReference { TabsDefault.S.Horizontal.style() },
            "TabsDefault.Xs" to ComposeStyleReference { TabsDefault.Xs.style() },
            "TabsDefault.Xs.Vertical" to ComposeStyleReference { TabsDefault.Xs.Vertical.style() },
            "TabsDefault.Xs.Horizontal" to ComposeStyleReference { TabsDefault.Xs.Horizontal.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabsStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabsDefaultSize.L
                "M" -> TabsDefaultSize.M
                "S" -> TabsDefaultSize.S
                "Xs" -> TabsDefaultSize.Xs
                else -> TabsDefaultSize.L
            },
            orientation = when (bindings["orientation"]?.toString()) {
                "Default" -> TabsDefaultOrientation.Default
                "Horizontal" -> TabsDefaultOrientation.Horizontal
                "Vertical" -> TabsDefaultOrientation.Vertical
                else -> TabsDefaultOrientation.Default
            },
        ).key
    }
}
