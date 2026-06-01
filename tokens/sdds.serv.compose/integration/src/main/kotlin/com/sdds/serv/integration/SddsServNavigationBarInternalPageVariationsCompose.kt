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
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.navigationbar.HasBackground
import com.sdds.serv.styles.navigationbar.NavigationBarInternalPage
import com.sdds.serv.styles.navigationbar.NavigationBarStyles
import com.sdds.serv.styles.navigationbar.NoBackground
import com.sdds.serv.styles.navigationbar.Rounded
import com.sdds.serv.styles.navigationbar.Shadow
import com.sdds.serv.styles.navigationbar.resolve

internal object SddsServNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<NavigationBarStyle>() {
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
