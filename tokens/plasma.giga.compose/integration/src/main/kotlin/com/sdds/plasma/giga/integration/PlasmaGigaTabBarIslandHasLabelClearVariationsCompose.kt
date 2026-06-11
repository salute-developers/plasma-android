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
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelClear
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelClearSize
import com.sdds.plasma.giga.styles.tabbar.TabBarIslandHasLabelClearView
import com.sdds.plasma.giga.styles.tabbar.TabBarStyles
import com.sdds.plasma.giga.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarIslandHasLabelClearVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
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
            "TabBarIslandHasLabelClear.M.Default" to ComposeStyleReference { TabBarIslandHasLabelClear.M.Default.style() },
            "TabBarIslandHasLabelClear.M.Secondary" to ComposeStyleReference { TabBarIslandHasLabelClear.M.Secondary.style() },
            "TabBarIslandHasLabelClear.M.Accent" to ComposeStyleReference { TabBarIslandHasLabelClear.M.Accent.style() },
            "TabBarIslandHasLabelClear.M.Shadow.Default" to ComposeStyleReference {
                TabBarIslandHasLabelClear.M.Shadow.Default.style()
            },
            "TabBarIslandHasLabelClear.M.Shadow.Secondary" to ComposeStyleReference {
                TabBarIslandHasLabelClear.M.Shadow.Secondary.style()
            },
            "TabBarIslandHasLabelClear.M.Shadow.Accent" to ComposeStyleReference {
                TabBarIslandHasLabelClear.M.Shadow.Accent.style()
            },
            "TabBarIslandHasLabelClear.L.Default" to ComposeStyleReference { TabBarIslandHasLabelClear.L.Default.style() },
            "TabBarIslandHasLabelClear.L.Secondary" to ComposeStyleReference { TabBarIslandHasLabelClear.L.Secondary.style() },
            "TabBarIslandHasLabelClear.L.Accent" to ComposeStyleReference { TabBarIslandHasLabelClear.L.Accent.style() },
            "TabBarIslandHasLabelClear.L.Shadow.Default" to ComposeStyleReference {
                TabBarIslandHasLabelClear.L.Shadow.Default.style()
            },
            "TabBarIslandHasLabelClear.L.Shadow.Secondary" to ComposeStyleReference {
                TabBarIslandHasLabelClear.L.Shadow.Secondary.style()
            },
            "TabBarIslandHasLabelClear.L.Shadow.Accent" to ComposeStyleReference {
                TabBarIslandHasLabelClear.L.Shadow.Accent.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.IslandHasLabelClear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabBarIslandHasLabelClearSize.L
                "M" -> TabBarIslandHasLabelClearSize.M
                else -> TabBarIslandHasLabelClearSize.L
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarIslandHasLabelClearView.Default
                "Secondary" -> TabBarIslandHasLabelClearView.Secondary
                "Accent" -> TabBarIslandHasLabelClearView.Accent
                else -> TabBarIslandHasLabelClearView.Default
            },
        ).key
    }
}
