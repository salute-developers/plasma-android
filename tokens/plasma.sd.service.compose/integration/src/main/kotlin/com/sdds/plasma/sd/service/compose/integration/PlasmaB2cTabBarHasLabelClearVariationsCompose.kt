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
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.tabbar.Accent
import com.sdds.plasma.sd.service.styles.tabbar.Default
import com.sdds.plasma.sd.service.styles.tabbar.Divider
import com.sdds.plasma.sd.service.styles.tabbar.L
import com.sdds.plasma.sd.service.styles.tabbar.M
import com.sdds.plasma.sd.service.styles.tabbar.Rounded
import com.sdds.plasma.sd.service.styles.tabbar.Secondary
import com.sdds.plasma.sd.service.styles.tabbar.Shadow
import com.sdds.plasma.sd.service.styles.tabbar.TabBarHasLabelClear
import com.sdds.plasma.sd.service.styles.tabbar.TabBarHasLabelClearSize
import com.sdds.plasma.sd.service.styles.tabbar.TabBarHasLabelClearView
import com.sdds.plasma.sd.service.styles.tabbar.TabBarStyles
import com.sdds.plasma.sd.service.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cTabBarHasLabelClearVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
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
            "TabBarHasLabelClear.M.Default" to ComposeStyleReference { TabBarHasLabelClear.M.Default.style() },
            "TabBarHasLabelClear.M.Secondary" to ComposeStyleReference { TabBarHasLabelClear.M.Secondary.style() },
            "TabBarHasLabelClear.M.Accent" to ComposeStyleReference { TabBarHasLabelClear.M.Accent.style() },
            "TabBarHasLabelClear.M.Rounded.Default" to ComposeStyleReference { TabBarHasLabelClear.M.Rounded.Default.style() },
            "TabBarHasLabelClear.M.Rounded.Secondary" to ComposeStyleReference { TabBarHasLabelClear.M.Rounded.Secondary.style() },
            "TabBarHasLabelClear.M.Rounded.Accent" to ComposeStyleReference { TabBarHasLabelClear.M.Rounded.Accent.style() },
            "TabBarHasLabelClear.M.Shadow.Default" to ComposeStyleReference { TabBarHasLabelClear.M.Shadow.Default.style() },
            "TabBarHasLabelClear.M.Shadow.Secondary" to ComposeStyleReference { TabBarHasLabelClear.M.Shadow.Secondary.style() },
            "TabBarHasLabelClear.M.Shadow.Accent" to ComposeStyleReference { TabBarHasLabelClear.M.Shadow.Accent.style() },
            "TabBarHasLabelClear.M.Shadow.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelClear.M.Shadow.Rounded.Default.style()
            },
            "TabBarHasLabelClear.M.Shadow.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelClear.M.Shadow.Rounded.Secondary.style()
            },
            "TabBarHasLabelClear.M.Shadow.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelClear.M.Shadow.Rounded.Accent.style()
            },
            "TabBarHasLabelClear.M.Divider.Default" to ComposeStyleReference { TabBarHasLabelClear.M.Divider.Default.style() },
            "TabBarHasLabelClear.M.Divider.Secondary" to ComposeStyleReference { TabBarHasLabelClear.M.Divider.Secondary.style() },
            "TabBarHasLabelClear.M.Divider.Accent" to ComposeStyleReference { TabBarHasLabelClear.M.Divider.Accent.style() },
            "TabBarHasLabelClear.M.Divider.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelClear.M.Divider.Rounded.Default.style()
            },
            "TabBarHasLabelClear.M.Divider.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelClear.M.Divider.Rounded.Secondary.style()
            },
            "TabBarHasLabelClear.M.Divider.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelClear.M.Divider.Rounded.Accent.style()
            },
            "TabBarHasLabelClear.L.Default" to ComposeStyleReference { TabBarHasLabelClear.L.Default.style() },
            "TabBarHasLabelClear.L.Secondary" to ComposeStyleReference { TabBarHasLabelClear.L.Secondary.style() },
            "TabBarHasLabelClear.L.Accent" to ComposeStyleReference { TabBarHasLabelClear.L.Accent.style() },
            "TabBarHasLabelClear.L.Rounded.Default" to ComposeStyleReference { TabBarHasLabelClear.L.Rounded.Default.style() },
            "TabBarHasLabelClear.L.Rounded.Secondary" to ComposeStyleReference { TabBarHasLabelClear.L.Rounded.Secondary.style() },
            "TabBarHasLabelClear.L.Rounded.Accent" to ComposeStyleReference { TabBarHasLabelClear.L.Rounded.Accent.style() },
            "TabBarHasLabelClear.L.Shadow.Default" to ComposeStyleReference { TabBarHasLabelClear.L.Shadow.Default.style() },
            "TabBarHasLabelClear.L.Shadow.Secondary" to ComposeStyleReference { TabBarHasLabelClear.L.Shadow.Secondary.style() },
            "TabBarHasLabelClear.L.Shadow.Accent" to ComposeStyleReference { TabBarHasLabelClear.L.Shadow.Accent.style() },
            "TabBarHasLabelClear.L.Shadow.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelClear.L.Shadow.Rounded.Default.style()
            },
            "TabBarHasLabelClear.L.Shadow.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelClear.L.Shadow.Rounded.Secondary.style()
            },
            "TabBarHasLabelClear.L.Shadow.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelClear.L.Shadow.Rounded.Accent.style()
            },
            "TabBarHasLabelClear.L.Divider.Default" to ComposeStyleReference { TabBarHasLabelClear.L.Divider.Default.style() },
            "TabBarHasLabelClear.L.Divider.Secondary" to ComposeStyleReference { TabBarHasLabelClear.L.Divider.Secondary.style() },
            "TabBarHasLabelClear.L.Divider.Accent" to ComposeStyleReference { TabBarHasLabelClear.L.Divider.Accent.style() },
            "TabBarHasLabelClear.L.Divider.Rounded.Default" to ComposeStyleReference {
                TabBarHasLabelClear.L.Divider.Rounded.Default.style()
            },
            "TabBarHasLabelClear.L.Divider.Rounded.Secondary" to ComposeStyleReference {
                TabBarHasLabelClear.L.Divider.Rounded.Secondary.style()
            },
            "TabBarHasLabelClear.L.Divider.Rounded.Accent" to ComposeStyleReference {
                TabBarHasLabelClear.L.Divider.Rounded.Accent.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.HasLabelClear.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TabBarHasLabelClearSize.M
                "L" -> TabBarHasLabelClearSize.L
                else -> TabBarHasLabelClearSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            rounded = booleanBindingValue(bindings, "rounded", false),
            divider = booleanBindingValue(bindings, "divider", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarHasLabelClearView.Default
                "Secondary" -> TabBarHasLabelClearView.Secondary
                "Accent" -> TabBarHasLabelClearView.Accent
                else -> TabBarHasLabelClearView.Default
            },
        ).key
    }
}
