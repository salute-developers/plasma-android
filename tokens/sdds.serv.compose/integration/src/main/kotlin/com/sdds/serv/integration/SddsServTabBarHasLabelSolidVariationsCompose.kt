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
import com.sdds.serv.styles.tabbar.Divider
import com.sdds.serv.styles.tabbar.L
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.Rounded
import com.sdds.serv.styles.tabbar.Secondary
import com.sdds.serv.styles.tabbar.Shadow
import com.sdds.serv.styles.tabbar.TabBarHasLabelSolid
import com.sdds.serv.styles.tabbar.TabBarHasLabelSolidSize
import com.sdds.serv.styles.tabbar.TabBarHasLabelSolidView
import com.sdds.serv.styles.tabbar.TabBarStyles
import com.sdds.serv.styles.tabbar.resolve

internal object SddsServTabBarHasLabelSolidVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "L")),
            Property.BooleanProperty(name = "hasShadow", value = false),
            Property.BooleanProperty(name = "rounded", value = false),
            Property.BooleanProperty(name = "divider", value = false),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "TabBarHasLabelSolid.M.Default" to ComposeStyleReference { TabBarHasLabelSolid.M.Default.style() },
            "TabBarHasLabelSolid.M.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.M.Secondary.style() },
            "TabBarHasLabelSolid.M.Accent" to ComposeStyleReference { TabBarHasLabelSolid.M.Accent.style() },
            "TabBarHasLabelSolid.M.Rounded.Default" to ComposeStyleReference { TabBarHasLabelSolid.M.Rounded.Default.style() },
            "TabBarHasLabelSolid.M.Rounded.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.M.Rounded.Secondary.style() },
            "TabBarHasLabelSolid.M.Rounded.Accent" to ComposeStyleReference { TabBarHasLabelSolid.M.Rounded.Accent.style() },
            "TabBarHasLabelSolid.M.Shadow.Default" to ComposeStyleReference { TabBarHasLabelSolid.M.Shadow.Default.style() },
            "TabBarHasLabelSolid.M.Shadow.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.M.Shadow.Secondary.style() },
            "TabBarHasLabelSolid.M.Shadow.Accent" to ComposeStyleReference { TabBarHasLabelSolid.M.Shadow.Accent.style() },
            "TabBarHasLabelSolid.M.Shadow.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelSolid.M.Shadow.Rounded.Default.style()
            },
            "TabBarHasLabelSolid.M.Shadow.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelSolid.M.Shadow.Rounded.Secondary.style()
            },
            "TabBarHasLabelSolid.M.Shadow.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelSolid.M.Shadow.Rounded.Accent.style()
            },
            "TabBarHasLabelSolid.M.Divider.Default" to ComposeStyleReference { TabBarHasLabelSolid.M.Divider.Default.style() },
            "TabBarHasLabelSolid.M.Divider.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.M.Divider.Secondary.style() },
            "TabBarHasLabelSolid.M.Divider.Accent" to ComposeStyleReference { TabBarHasLabelSolid.M.Divider.Accent.style() },
            "TabBarHasLabelSolid.M.Divider.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelSolid.M.Divider.Rounded.Default.style()
            },
            "TabBarHasLabelSolid.M.Divider.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelSolid.M.Divider.Rounded.Secondary.style()
            },
            "TabBarHasLabelSolid.M.Divider.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelSolid.M.Divider.Rounded.Accent.style()
            },
            "TabBarHasLabelSolid.L.Default" to ComposeStyleReference { TabBarHasLabelSolid.L.Default.style() },
            "TabBarHasLabelSolid.L.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.L.Secondary.style() },
            "TabBarHasLabelSolid.L.Accent" to ComposeStyleReference { TabBarHasLabelSolid.L.Accent.style() },
            "TabBarHasLabelSolid.L.Rounded.Default" to ComposeStyleReference { TabBarHasLabelSolid.L.Rounded.Default.style() },
            "TabBarHasLabelSolid.L.Rounded.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.L.Rounded.Secondary.style() },
            "TabBarHasLabelSolid.L.Rounded.Accent" to ComposeStyleReference { TabBarHasLabelSolid.L.Rounded.Accent.style() },
            "TabBarHasLabelSolid.L.Shadow.Default" to ComposeStyleReference { TabBarHasLabelSolid.L.Shadow.Default.style() },
            "TabBarHasLabelSolid.L.Shadow.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.L.Shadow.Secondary.style() },
            "TabBarHasLabelSolid.L.Shadow.Accent" to ComposeStyleReference { TabBarHasLabelSolid.L.Shadow.Accent.style() },
            "TabBarHasLabelSolid.L.Shadow.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelSolid.L.Shadow.Rounded.Default.style()
            },
            "TabBarHasLabelSolid.L.Shadow.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelSolid.L.Shadow.Rounded.Secondary.style()
            },
            "TabBarHasLabelSolid.L.Shadow.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelSolid.L.Shadow.Rounded.Accent.style()
            },
            "TabBarHasLabelSolid.L.Divider.Default" to ComposeStyleReference { TabBarHasLabelSolid.L.Divider.Default.style() },
            "TabBarHasLabelSolid.L.Divider.Secondary" to ComposeStyleReference { TabBarHasLabelSolid.L.Divider.Secondary.style() },
            "TabBarHasLabelSolid.L.Divider.Accent" to ComposeStyleReference { TabBarHasLabelSolid.L.Divider.Accent.style() },
            "TabBarHasLabelSolid.L.Divider.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelSolid.L.Divider.Rounded.Default.style()
            },
            "TabBarHasLabelSolid.L.Divider.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelSolid.L.Divider.Rounded.Secondary.style()
            },
            "TabBarHasLabelSolid.L.Divider.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelSolid.L.Divider.Rounded.Accent.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.HasLabelSolid.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TabBarHasLabelSolidSize.M
                "L" -> TabBarHasLabelSolidSize.L
                else -> TabBarHasLabelSolidSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            rounded = booleanBindingValue(bindings, "rounded", false),
            divider = booleanBindingValue(bindings, "divider", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarHasLabelSolidView.Default
                "Secondary" -> TabBarHasLabelSolidView.Secondary
                "Accent" -> TabBarHasLabelSolidView.Accent
                else -> TabBarHasLabelSolidView.Default
            },
        ).key
    }
}
