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
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.tabbar.Accent
import com.sdds.serv.styles.tabbar.Default
import com.sdds.serv.styles.tabbar.L
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.Secondary
import com.sdds.serv.styles.tabbar.Shadow
import com.sdds.serv.styles.tabbar.TabBarIslandClear
import com.sdds.serv.styles.tabbar.TabBarIslandClearSize
import com.sdds.serv.styles.tabbar.TabBarIslandClearView
import com.sdds.serv.styles.tabbar.TabBarStyles
import com.sdds.serv.styles.tabbar.resolve

internal object SddsServTabBarIslandClearVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "L")),
            Property.BooleanProperty(name = "hasShadow", value = false),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "TabBarIslandClear.M.Default" to ComposeStyleReference { TabBarIslandClear.M.Default.style() },
            "TabBarIslandClear.M.Secondary" to ComposeStyleReference { TabBarIslandClear.M.Secondary.style() },
            "TabBarIslandClear.M.Accent" to ComposeStyleReference { TabBarIslandClear.M.Accent.style() },
            "TabBarIslandClear.M.Shadow.Default" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Default.style() },
            "TabBarIslandClear.M.Shadow.Secondary" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Secondary.style() },
            "TabBarIslandClear.M.Shadow.Accent" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Accent.style() },
            "TabBarIslandClear.L.Default" to ComposeStyleReference { TabBarIslandClear.L.Default.style() },
            "TabBarIslandClear.L.Secondary" to ComposeStyleReference { TabBarIslandClear.L.Secondary.style() },
            "TabBarIslandClear.L.Accent" to ComposeStyleReference { TabBarIslandClear.L.Accent.style() },
            "TabBarIslandClear.L.Shadow.Default" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Default.style() },
            "TabBarIslandClear.L.Shadow.Secondary" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Secondary.style() },
            "TabBarIslandClear.L.Shadow.Accent" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.IslandClear.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TabBarIslandClearSize.M
                "L" -> TabBarIslandClearSize.L
                else -> TabBarIslandClearSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarIslandClearView.Default
                "Secondary" -> TabBarIslandClearView.Secondary
                "Accent" -> TabBarIslandClearView.Accent
                else -> TabBarIslandClearView.Default
            },
        ).key
    }
}
