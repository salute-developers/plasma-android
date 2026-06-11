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
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.navigationbar.HasBackground
import com.sdds.plasma.sd.service.styles.navigationbar.NavigationBarInternalPage
import com.sdds.plasma.sd.service.styles.navigationbar.NavigationBarStyles
import com.sdds.plasma.sd.service.styles.navigationbar.NoBackground
import com.sdds.plasma.sd.service.styles.navigationbar.Rounded
import com.sdds.plasma.sd.service.styles.navigationbar.Shadow
import com.sdds.plasma.sd.service.styles.navigationbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<NavigationBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.BooleanProperty(name = "hasBackground", value = false),
            Property.BooleanProperty(name = "hasShadow", value = false),
            Property.BooleanProperty(name = "rounded", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<NavigationBarStyle>> =
        mapOf(
            "NavigationBarInternalPage.NoBackground" to ComposeStyleReference { NavigationBarInternalPage.NoBackground.style() },
            "NavigationBarInternalPage.NoBackground.Rounded" to ComposeStyleReference {
                NavigationBarInternalPage.NoBackground.Rounded.style()
            },
            "NavigationBarInternalPage.HasBackground" to ComposeStyleReference { NavigationBarInternalPage.HasBackground.style() },
            "NavigationBarInternalPage.HasBackground.Rounded" to ComposeStyleReference {
                NavigationBarInternalPage.HasBackground.Rounded.style()
            },
            "NavigationBarInternalPage.HasBackground.Shadow" to ComposeStyleReference {
                NavigationBarInternalPage.HasBackground.Shadow.style()
            },
            "NavigationBarInternalPage.HasBackground.Shadow.Rounded" to ComposeStyleReference {
                NavigationBarInternalPage.HasBackground.Shadow.Rounded.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NavigationBarStyles.InternalPage.resolve(
            hasBackground = booleanBindingValue(bindings, "hasBackground", false),
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
            rounded = booleanBindingValue(bindings, "rounded", false),
        ).key
    }
}
