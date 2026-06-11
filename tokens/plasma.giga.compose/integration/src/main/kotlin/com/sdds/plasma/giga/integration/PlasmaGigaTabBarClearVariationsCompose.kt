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
import com.sdds.plasma.giga.styles.tabbar.TabBarClear
import com.sdds.plasma.giga.styles.tabbar.TabBarClearSize
import com.sdds.plasma.giga.styles.tabbar.TabBarClearView
import com.sdds.plasma.giga.styles.tabbar.TabBarStyles
import com.sdds.plasma.giga.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTabBarClearVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
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
            "TabBarClear.M.Default" to ComposeStyleReference { TabBarClear.M.Default.style() },
            "TabBarClear.M.Secondary" to ComposeStyleReference { TabBarClear.M.Secondary.style() },
            "TabBarClear.M.Accent" to ComposeStyleReference { TabBarClear.M.Accent.style() },
            "TabBarClear.M.Rounded.Default" to ComposeStyleReference { TabBarClear.M.Rounded.Default.style() },
            "TabBarClear.M.Rounded.Secondary" to ComposeStyleReference { TabBarClear.M.Rounded.Secondary.style() },
            "TabBarClear.M.Rounded.Accent" to ComposeStyleReference { TabBarClear.M.Rounded.Accent.style() },
            "TabBarClear.M.Shadow.Default" to ComposeStyleReference { TabBarClear.M.Shadow.Default.style() },
            "TabBarClear.M.Shadow.Secondary" to ComposeStyleReference { TabBarClear.M.Shadow.Secondary.style() },
            "TabBarClear.M.Shadow.Accent" to ComposeStyleReference { TabBarClear.M.Shadow.Accent.style() },
            "TabBarClear.M.Shadow.Rounded.Default" to ComposeStyleReference { TabBarClear.M.Shadow.Rounded.Default.style() },
            "TabBarClear.M.Shadow.Rounded.Secondary" to ComposeStyleReference { TabBarClear.M.Shadow.Rounded.Secondary.style() },
            "TabBarClear.M.Shadow.Rounded.Accent" to ComposeStyleReference { TabBarClear.M.Shadow.Rounded.Accent.style() },
            "TabBarClear.M.Divider.Default" to ComposeStyleReference { TabBarClear.M.Divider.Default.style() },
            "TabBarClear.M.Divider.Secondary" to ComposeStyleReference { TabBarClear.M.Divider.Secondary.style() },
            "TabBarClear.M.Divider.Accent" to ComposeStyleReference { TabBarClear.M.Divider.Accent.style() },
            "TabBarClear.M.Divider.Rounded.Default" to ComposeStyleReference { TabBarClear.M.Divider.Rounded.Default.style() },
            "TabBarClear.M.Divider.Rounded.Secondary" to ComposeStyleReference { TabBarClear.M.Divider.Rounded.Secondary.style() },
            "TabBarClear.M.Divider.Rounded.Accent" to ComposeStyleReference { TabBarClear.M.Divider.Rounded.Accent.style() },
            "TabBarClear.L.Default" to ComposeStyleReference { TabBarClear.L.Default.style() },
            "TabBarClear.L.Secondary" to ComposeStyleReference { TabBarClear.L.Secondary.style() },
            "TabBarClear.L.Accent" to ComposeStyleReference { TabBarClear.L.Accent.style() },
            "TabBarClear.L.Rounded.Default" to ComposeStyleReference { TabBarClear.L.Rounded.Default.style() },
            "TabBarClear.L.Rounded.Secondary" to ComposeStyleReference { TabBarClear.L.Rounded.Secondary.style() },
            "TabBarClear.L.Rounded.Accent" to ComposeStyleReference { TabBarClear.L.Rounded.Accent.style() },
            "TabBarClear.L.Shadow.Default" to ComposeStyleReference { TabBarClear.L.Shadow.Default.style() },
            "TabBarClear.L.Shadow.Secondary" to ComposeStyleReference { TabBarClear.L.Shadow.Secondary.style() },
            "TabBarClear.L.Shadow.Accent" to ComposeStyleReference { TabBarClear.L.Shadow.Accent.style() },
            "TabBarClear.L.Shadow.Rounded.Default" to ComposeStyleReference { TabBarClear.L.Shadow.Rounded.Default.style() },
            "TabBarClear.L.Shadow.Rounded.Secondary" to ComposeStyleReference { TabBarClear.L.Shadow.Rounded.Secondary.style() },
            "TabBarClear.L.Shadow.Rounded.Accent" to ComposeStyleReference { TabBarClear.L.Shadow.Rounded.Accent.style() },
            "TabBarClear.L.Divider.Default" to ComposeStyleReference { TabBarClear.L.Divider.Default.style() },
            "TabBarClear.L.Divider.Secondary" to ComposeStyleReference { TabBarClear.L.Divider.Secondary.style() },
            "TabBarClear.L.Divider.Accent" to ComposeStyleReference { TabBarClear.L.Divider.Accent.style() },
            "TabBarClear.L.Divider.Rounded.Default" to ComposeStyleReference { TabBarClear.L.Divider.Rounded.Default.style() },
            "TabBarClear.L.Divider.Rounded.Secondary" to ComposeStyleReference { TabBarClear.L.Divider.Rounded.Secondary.style() },
            "TabBarClear.L.Divider.Rounded.Accent" to ComposeStyleReference { TabBarClear.L.Divider.Rounded.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TabBarClearSize.L
                "M" -> TabBarClearSize.M
                else -> TabBarClearSize.L
            },
            rounded = booleanBindingValue(bindings, "rounded", false),
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            divider = booleanBindingValue(bindings, "divider", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarClearView.Default
                "Secondary" -> TabBarClearView.Secondary
                "Accent" -> TabBarClearView.Accent
                else -> TabBarClearView.Default
            },
        ).key
    }
}
