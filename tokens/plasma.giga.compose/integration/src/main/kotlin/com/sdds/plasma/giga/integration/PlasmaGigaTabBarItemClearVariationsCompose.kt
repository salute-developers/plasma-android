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
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemClear
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemClearLabelPlacement
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemClearSize
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemClearView
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemStyles
import com.sdds.plasma.giga.styles.tabbaritem.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarItemClearVariationsCompose : ComposeStyleProvider<TabBarItemStyle>() {
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
                "L" -> TabBarItemClearSize.L
                "M" -> TabBarItemClearSize.M
                else -> TabBarItemClearSize.L
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
