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
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.tabbaritem.Accent
import com.sdds.serv.styles.tabbaritem.Default
import com.sdds.serv.styles.tabbaritem.L
import com.sdds.serv.styles.tabbaritem.Label
import com.sdds.serv.styles.tabbaritem.M
import com.sdds.serv.styles.tabbaritem.Secondary
import com.sdds.serv.styles.tabbaritem.TabBarItemClear
import com.sdds.serv.styles.tabbaritem.TabBarItemClearLabelPlacement
import com.sdds.serv.styles.tabbaritem.TabBarItemClearSize
import com.sdds.serv.styles.tabbaritem.TabBarItemClearView
import com.sdds.serv.styles.tabbaritem.TabBarItemStyles
import com.sdds.serv.styles.tabbaritem.resolve

internal object SddsServTabBarItemClearVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "L")),
            Property.SingleChoiceProperty(name = "labelPlacement", value = "None", variants = listOf("None", "Bottom")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Secondary"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarItemStyle>> =
        mapOf(
            "TabBarItemClear.M.Default" to ComposeStyleReference { TabBarItemClear.M.Default.style() },
            "TabBarItemClear.M.Accent" to ComposeStyleReference { TabBarItemClear.M.Accent.style() },
            "TabBarItemClear.M.Secondary" to ComposeStyleReference { TabBarItemClear.M.Secondary.style() },
            "TabBarItemClear.M.Label.Default" to ComposeStyleReference { TabBarItemClear.M.Label.Default.style() },
            "TabBarItemClear.M.Label.Accent" to ComposeStyleReference { TabBarItemClear.M.Label.Accent.style() },
            "TabBarItemClear.M.Label.Secondary" to ComposeStyleReference { TabBarItemClear.M.Label.Secondary.style() },
            "TabBarItemClear.L.Default" to ComposeStyleReference { TabBarItemClear.L.Default.style() },
            "TabBarItemClear.L.Accent" to ComposeStyleReference { TabBarItemClear.L.Accent.style() },
            "TabBarItemClear.L.Secondary" to ComposeStyleReference { TabBarItemClear.L.Secondary.style() },
            "TabBarItemClear.L.Label.Default" to ComposeStyleReference { TabBarItemClear.L.Label.Default.style() },
            "TabBarItemClear.L.Label.Accent" to ComposeStyleReference { TabBarItemClear.L.Label.Accent.style() },
            "TabBarItemClear.L.Label.Secondary" to ComposeStyleReference { TabBarItemClear.L.Label.Secondary.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarItemStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TabBarItemClearSize.M
                "L" -> TabBarItemClearSize.L
                else -> TabBarItemClearSize.M
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TabBarItemClearLabelPlacement.None
                "Bottom" -> TabBarItemClearLabelPlacement.Bottom
                else -> TabBarItemClearLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarItemClearView.Default
                "Accent" -> TabBarItemClearView.Accent
                "Secondary" -> TabBarItemClearView.Secondary
                else -> TabBarItemClearView.Default
            },
        ).key
    }
}
