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
import com.sdds.plasma.giga.styles.tabbar.Divider
import com.sdds.plasma.giga.styles.tabbar.L
import com.sdds.plasma.giga.styles.tabbar.M
import com.sdds.plasma.giga.styles.tabbar.Rounded
import com.sdds.plasma.giga.styles.tabbar.Secondary
import com.sdds.plasma.giga.styles.tabbar.Shadow
import com.sdds.plasma.giga.styles.tabbar.TabBarSolid
import com.sdds.plasma.giga.styles.tabbar.TabBarSolidSize
import com.sdds.plasma.giga.styles.tabbar.TabBarSolidView
import com.sdds.plasma.giga.styles.tabbar.TabBarStyles
import com.sdds.plasma.giga.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarSolidVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M")),
            Property.BooleanProperty(name = "rounded", value = false),
            Property.BooleanProperty(name = "hasShadow", value = false),
            Property.BooleanProperty(name = "divider", value = false),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "TabBarSolid.M.Default" to ComposeStyleReference { TabBarSolid.M.Default.style() },
            "TabBarSolid.M.Secondary" to ComposeStyleReference { TabBarSolid.M.Secondary.style() },
            "TabBarSolid.M.Accent" to ComposeStyleReference { TabBarSolid.M.Accent.style() },
            "TabBarSolid.M.Rounded.Default" to ComposeStyleReference { TabBarSolid.M.Rounded.Default.style() },
            "TabBarSolid.M.Rounded.Secondary" to ComposeStyleReference { TabBarSolid.M.Rounded.Secondary.style() },
            "TabBarSolid.M.Rounded.Accent" to ComposeStyleReference { TabBarSolid.M.Rounded.Accent.style() },
            "TabBarSolid.M.Shadow.Default" to ComposeStyleReference { TabBarSolid.M.Shadow.Default.style() },
            "TabBarSolid.M.Shadow.Secondary" to ComposeStyleReference { TabBarSolid.M.Shadow.Secondary.style() },
            "TabBarSolid.M.Shadow.Accent" to ComposeStyleReference { TabBarSolid.M.Shadow.Accent.style() },
            "TabBarSolid.M.Shadow.Rounded.Default" to ComposeStyleReference { TabBarSolid.M.Shadow.Rounded.Default.style() },
            "TabBarSolid.M.Shadow.Rounded.Secondary" to ComposeStyleReference { TabBarSolid.M.Shadow.Rounded.Secondary.style() },
            "TabBarSolid.M.Shadow.Rounded.Accent" to ComposeStyleReference { TabBarSolid.M.Shadow.Rounded.Accent.style() },
            "TabBarSolid.M.Divider.Default" to ComposeStyleReference { TabBarSolid.M.Divider.Default.style() },
            "TabBarSolid.M.Divider.Secondary" to ComposeStyleReference { TabBarSolid.M.Divider.Secondary.style() },
            "TabBarSolid.M.Divider.Accent" to ComposeStyleReference { TabBarSolid.M.Divider.Accent.style() },
            "TabBarSolid.M.Divider.Rounded.Default" to ComposeStyleReference { TabBarSolid.M.Divider.Rounded.Default.style() },
            "TabBarSolid.M.Divider.Rounded.Secondary" to ComposeStyleReference { TabBarSolid.M.Divider.Rounded.Secondary.style() },
            "TabBarSolid.M.Divider.Rounded.Accent" to ComposeStyleReference { TabBarSolid.M.Divider.Rounded.Accent.style() },
            "TabBarSolid.L.Default" to ComposeStyleReference { TabBarSolid.L.Default.style() },
            "TabBarSolid.L.Secondary" to ComposeStyleReference { TabBarSolid.L.Secondary.style() },
            "TabBarSolid.L.Accent" to ComposeStyleReference { TabBarSolid.L.Accent.style() },
            "TabBarSolid.L.Rounded.Default" to ComposeStyleReference { TabBarSolid.L.Rounded.Default.style() },
            "TabBarSolid.L.Rounded.Secondary" to ComposeStyleReference { TabBarSolid.L.Rounded.Secondary.style() },
            "TabBarSolid.L.Rounded.Accent" to ComposeStyleReference { TabBarSolid.L.Rounded.Accent.style() },
            "TabBarSolid.L.Shadow.Default" to ComposeStyleReference { TabBarSolid.L.Shadow.Default.style() },
            "TabBarSolid.L.Shadow.Secondary" to ComposeStyleReference { TabBarSolid.L.Shadow.Secondary.style() },
            "TabBarSolid.L.Shadow.Accent" to ComposeStyleReference { TabBarSolid.L.Shadow.Accent.style() },
            "TabBarSolid.L.Shadow.Rounded.Default" to ComposeStyleReference { TabBarSolid.L.Shadow.Rounded.Default.style() },
            "TabBarSolid.L.Shadow.Rounded.Secondary" to ComposeStyleReference { TabBarSolid.L.Shadow.Rounded.Secondary.style() },
            "TabBarSolid.L.Shadow.Rounded.Accent" to ComposeStyleReference { TabBarSolid.L.Shadow.Rounded.Accent.style() },
            "TabBarSolid.L.Divider.Default" to ComposeStyleReference { TabBarSolid.L.Divider.Default.style() },
            "TabBarSolid.L.Divider.Secondary" to ComposeStyleReference { TabBarSolid.L.Divider.Secondary.style() },
            "TabBarSolid.L.Divider.Accent" to ComposeStyleReference { TabBarSolid.L.Divider.Accent.style() },
            "TabBarSolid.L.Divider.Rounded.Default" to ComposeStyleReference { TabBarSolid.L.Divider.Rounded.Default.style() },
            "TabBarSolid.L.Divider.Rounded.Secondary" to ComposeStyleReference { TabBarSolid.L.Divider.Rounded.Secondary.style() },
            "TabBarSolid.L.Divider.Rounded.Accent" to ComposeStyleReference { TabBarSolid.L.Divider.Rounded.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.Solid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabBarSolidSize.L
                "M" -> TabBarSolidSize.M
                else -> TabBarSolidSize.L
            },
            rounded = booleanBindingValue(bindings, "rounded", false),
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            divider = booleanBindingValue(bindings, "divider", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarSolidView.Default
                "Secondary" -> TabBarSolidView.Secondary
                "Accent" -> TabBarSolidView.Accent
                else -> TabBarSolidView.Default
            },
        ).key
    }
}
