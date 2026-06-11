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
import com.sdds.plasma.sd.service.styles.tabbar.L
import com.sdds.plasma.sd.service.styles.tabbar.M
import com.sdds.plasma.sd.service.styles.tabbar.Secondary
import com.sdds.plasma.sd.service.styles.tabbar.Shadow
import com.sdds.plasma.sd.service.styles.tabbar.TabBarIslandClear
import com.sdds.plasma.sd.service.styles.tabbar.TabBarIslandClearSize
import com.sdds.plasma.sd.service.styles.tabbar.TabBarIslandClearView
import com.sdds.plasma.sd.service.styles.tabbar.TabBarStyles
import com.sdds.plasma.sd.service.styles.tabbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cTabBarIslandClearVariationsCompose : ComposeStyleProvider<TabBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "L")),
            Property.BooleanProperty(name = "hasShadow", value = false),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TabBarStyle>> =
        mapOf(
            "TabBarIslandClear.M.Default" to ComposeStyleReference { TabBarIslandClear.M.Default.style() },
            "TabBarIslandClear.M.Secondary" to ComposeStyleReference { TabBarIslandClear.M.Secondary.style() },
            "TabBarIslandClear.M.Accent" to ComposeStyleReference { TabBarIslandClear.M.Accent.style() },
            "TabBarIslandClear.M.Shadow.Default" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Default.style() },
            "TabBarIslandClear.M.Shadow.Secondary" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Secondary.style() },
            "TabBarIslandClear.M.Shadow.Accent" to ComposeStyleReference { TabBarIslandClear.M.Shadow.Accent.style() },
            "TabBarIslandClear.L.Default" to ComposeStyleReference { TabBarIslandClear.L.Default.style() },
            "TabBarIslandClear.L.Secondary" to ComposeStyleReference { TabBarIslandClear.L.Secondary.style() },
            "TabBarIslandClear.L.Accent" to ComposeStyleReference { TabBarIslandClear.L.Accent.style() },
            "TabBarIslandClear.L.Shadow.Default" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Default.style() },
            "TabBarIslandClear.L.Shadow.Secondary" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Secondary.style() },
            "TabBarIslandClear.L.Shadow.Accent" to ComposeStyleReference { TabBarIslandClear.L.Shadow.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabBarStyles.IslandClear.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TabBarIslandClearSize.M
                "L" -> TabBarIslandClearSize.L
                else -> TabBarIslandClearSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> TabBarIslandClearView.Default
                "Secondary" -> TabBarIslandClearView.Secondary
                "Accent" -> TabBarIslandClearView.Accent
                else -> TabBarIslandClearView.Default
            },
        ).key
    }
}
