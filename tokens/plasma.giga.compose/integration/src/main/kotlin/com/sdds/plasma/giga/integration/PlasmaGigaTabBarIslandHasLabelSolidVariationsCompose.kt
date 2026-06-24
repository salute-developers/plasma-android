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
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelSolid
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelSolidSize
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelSolidView
import com.sdds.plasma.giga.styles.tabbar.TabBarStyles
import com.sdds.plasma.giga.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarIslandHasLabelSolidVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
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
            "TabBarIslandHasLabelSolid.M.Default" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Default.style() },
            "TabBarIslandHasLabelSolid.M.Secondary" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Secondary.style() },
            "TabBarIslandHasLabelSolid.M.Accent" to ComposeStyleReference { TabBarIslandHasLabelSolid.M.Accent.style() },
            "TabBarIslandHasLabelSolid.M.Shadow.Default" to ComposeStyleReference {
                TabBarIslandHasLabelSolid.M.Shadow.Default.style()
            },
            "TabBarIslandHasLabelSolid.M.Shadow.Secondary" to ComposeStyleReference {
                TabBarIslandHasLabelSolid.M.Shadow.Secondary.style()
            },
            "TabBarIslandHasLabelSolid.M.Shadow.Accent" to ComposeStyleReference {
                TabBarIslandHasLabelSolid.M.Shadow.Accent.style()
            },
            "TabBarIslandHasLabelSolid.L.Default" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Default.style() },
            "TabBarIslandHasLabelSolid.L.Secondary" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Secondary.style() },
            "TabBarIslandHasLabelSolid.L.Accent" to ComposeStyleReference { TabBarIslandHasLabelSolid.L.Accent.style() },
            "TabBarIslandHasLabelSolid.L.Shadow.Default" to ComposeStyleReference {
                TabBarIslandHasLabelSolid.L.Shadow.Default.style()
            },
            "TabBarIslandHasLabelSolid.L.Shadow.Secondary" to ComposeStyleReference {
                TabBarIslandHasLabelSolid.L.Shadow.Secondary.style()
            },
            "TabBarIslandHasLabelSolid.L.Shadow.Accent" to ComposeStyleReference {
                TabBarIslandHasLabelSolid.L.Shadow.Accent.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.IslandHasLabelSolid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabBarIslandHasLabelSolidSize.L
                "M" -> TabBarIslandHasLabelSolidSize.M
                else -> TabBarIslandHasLabelSolidSize.L
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarIslandHasLabelSolidView.Default
                "Secondary" -> TabBarIslandHasLabelSolidView.Secondary
                "Accent" -> TabBarIslandHasLabelSolidView.Accent
                else -> TabBarIslandHasLabelSolidView.Default
            },
        ).key
    }
}
