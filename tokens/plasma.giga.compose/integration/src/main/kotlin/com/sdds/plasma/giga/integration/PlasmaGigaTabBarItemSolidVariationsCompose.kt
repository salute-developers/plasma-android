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
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tabbaritem.Accent
import com.sdds.plasma.giga.styles.tabbaritem.Default
import com.sdds.plasma.giga.styles.tabbaritem.L
import com.sdds.plasma.giga.styles.tabbaritem.Label
import com.sdds.plasma.giga.styles.tabbaritem.M
import com.sdds.plasma.giga.styles.tabbaritem.Secondary
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemSolid
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemSolidLabelPlacement
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemSolidSize
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemSolidView
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemStyles
import com.sdds.plasma.giga.styles.tabbaritem.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarItemSolidVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M")),
            Property.SingleChoiceProperty(name = "labelPlacement", value = "None", variants = listOf("None", "Bottom")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Secondary"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarItemStyle>> =
        mapOf(
            "TabBarItemSolid.M.Default" to ComposeStyleReference { TabBarItemSolid.M.Default.style() },
            "TabBarItemSolid.M.Accent" to ComposeStyleReference { TabBarItemSolid.M.Accent.style() },
            "TabBarItemSolid.M.Secondary" to ComposeStyleReference { TabBarItemSolid.M.Secondary.style() },
            "TabBarItemSolid.M.Label.Default" to ComposeStyleReference { TabBarItemSolid.M.Label.Default.style() },
            "TabBarItemSolid.M.Label.Accent" to ComposeStyleReference { TabBarItemSolid.M.Label.Accent.style() },
            "TabBarItemSolid.M.Label.Secondary" to ComposeStyleReference { TabBarItemSolid.M.Label.Secondary.style() },
            "TabBarItemSolid.L.Default" to ComposeStyleReference { TabBarItemSolid.L.Default.style() },
            "TabBarItemSolid.L.Accent" to ComposeStyleReference { TabBarItemSolid.L.Accent.style() },
            "TabBarItemSolid.L.Secondary" to ComposeStyleReference { TabBarItemSolid.L.Secondary.style() },
            "TabBarItemSolid.L.Label.Default" to ComposeStyleReference { TabBarItemSolid.L.Label.Default.style() },
            "TabBarItemSolid.L.Label.Accent" to ComposeStyleReference { TabBarItemSolid.L.Label.Accent.style() },
            "TabBarItemSolid.L.Label.Secondary" to ComposeStyleReference { TabBarItemSolid.L.Label.Secondary.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarItemStyles.Solid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabBarItemSolidSize.L
                "M" -> TabBarItemSolidSize.M
                else -> TabBarItemSolidSize.L
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TabBarItemSolidLabelPlacement.None
                "Bottom" -> TabBarItemSolidLabelPlacement.Bottom
                else -> TabBarItemSolidLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarItemSolidView.Default
                "Accent" -> TabBarItemSolidView.Accent
                "Secondary" -> TabBarItemSolidView.Secondary
                else -> TabBarItemSolidView.Default
            },
        ).key
    }
}
