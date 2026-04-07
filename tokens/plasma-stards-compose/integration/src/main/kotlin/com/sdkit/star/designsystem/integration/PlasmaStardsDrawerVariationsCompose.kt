// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.drawer.Drawer
import com.sdkit.star.designsystem.styles.drawer.HasBackground
import com.sdkit.star.designsystem.styles.drawer.NoBackground

internal object PlasmaStardsDrawerVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "HasBackground" to ComposeStyleReference { Drawer.HasBackground.style() },
            "NoBackground" to ComposeStyleReference { Drawer.NoBackground.style() },
        )
}
