// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.drawer.Drawer
import com.sdkit.star.designsystem.styles.drawer.DrawerStyles
import com.sdkit.star.designsystem.styles.drawer.HasBackground
import com.sdkit.star.designsystem.styles.drawer.NoBackground
import com.sdkit.star.designsystem.styles.drawer.resolve

internal object PlasmaStardsDrawerVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.BooleanProperty(name = "hasBackground", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "Drawer.HasBackground" to ComposeStyleReference { Drawer.HasBackground.style() },
            "Drawer.NoBackground" to ComposeStyleReference { Drawer.NoBackground.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DrawerStyles.resolve(
            hasBackground = booleanBindingValue(bindings, "hasBackground", false),
        ).key
    }
}
