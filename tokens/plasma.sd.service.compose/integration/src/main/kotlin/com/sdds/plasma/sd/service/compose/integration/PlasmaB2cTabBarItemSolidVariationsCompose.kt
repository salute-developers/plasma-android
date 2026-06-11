// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.tabbaritem.Accent
import com.sdds.plasma.sd.service.styles.tabbaritem.Default
import com.sdds.plasma.sd.service.styles.tabbaritem.L
import com.sdds.plasma.sd.service.styles.tabbaritem.Label
import com.sdds.plasma.sd.service.styles.tabbaritem.M
import com.sdds.plasma.sd.service.styles.tabbaritem.Secondary
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemSolid
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemSolidLabelPlacement
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemSolidSize
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemSolidView
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemStyles
import com.sdds.plasma.sd.service.styles.tabbaritem.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cTabBarItemSolidVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
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
                "M" -> TabBarItemSolidSize.M
                "L" -> TabBarItemSolidSize.L
                else -> TabBarItemSolidSize.M
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
