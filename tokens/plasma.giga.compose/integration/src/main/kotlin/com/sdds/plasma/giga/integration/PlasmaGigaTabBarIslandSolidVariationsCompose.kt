// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tabbar.Accent
import com.sdds.plasma.giga.styles.tabbar.Default
import com.sdds.plasma.giga.styles.tabbar.L
import com.sdds.plasma.giga.styles.tabbar.M
import com.sdds.plasma.giga.styles.tabbar.Secondary
import com.sdds.plasma.giga.styles.tabbar.Shadow
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandSolid
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandSolidSize
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandSolidView
import com.sdds.plasma.giga.styles.tabbar.TabBarStyles
import com.sdds.plasma.giga.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarIslandSolidVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M")),
            Property.BooleanProperty(name = "hasShadow", value = false),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "TabBarIslandSolid.M.Default" to ComposeStyleReference { TabBarIslandSolid.M.Default.style() },
            "TabBarIslandSolid.M.Secondary" to ComposeStyleReference { TabBarIslandSolid.M.Secondary.style() },
            "TabBarIslandSolid.M.Accent" to ComposeStyleReference { TabBarIslandSolid.M.Accent.style() },
            "TabBarIslandSolid.M.Shadow.Default" to ComposeStyleReference { TabBarIslandSolid.M.Shadow.Default.style() },
            "TabBarIslandSolid.M.Shadow.Secondary" to ComposeStyleReference { TabBarIslandSolid.M.Shadow.Secondary.style() },
            "TabBarIslandSolid.M.Shadow.Accent" to ComposeStyleReference { TabBarIslandSolid.M.Shadow.Accent.style() },
            "TabBarIslandSolid.L.Default" to ComposeStyleReference { TabBarIslandSolid.L.Default.style() },
            "TabBarIslandSolid.L.Secondary" to ComposeStyleReference { TabBarIslandSolid.L.Secondary.style() },
            "TabBarIslandSolid.L.Accent" to ComposeStyleReference { TabBarIslandSolid.L.Accent.style() },
            "TabBarIslandSolid.L.Shadow.Default" to ComposeStyleReference { TabBarIslandSolid.L.Shadow.Default.style() },
            "TabBarIslandSolid.L.Shadow.Secondary" to ComposeStyleReference { TabBarIslandSolid.L.Shadow.Secondary.style() },
            "TabBarIslandSolid.L.Shadow.Accent" to ComposeStyleReference { TabBarIslandSolid.L.Shadow.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.IslandSolid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabBarIslandSolidSize.L
                "M" -> TabBarIslandSolidSize.M
                else -> TabBarIslandSolidSize.L
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarIslandSolidView.Default
                "Secondary" -> TabBarIslandSolidView.Secondary
                "Accent" -> TabBarIslandSolidView.Accent
                else -> TabBarIslandSolidView.Default
            },
        ).key
    }
}
