// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.giga.styles.drawer.HasShadow
import com.sdds.plasma.giga.styles.drawer.M

internal object PlasmaGigaDrawerCloseOuterVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "M" to ComposeStyleReference { DrawerCloseOuter.M.style() },
            "M.HasShadow" to ComposeStyleReference { DrawerCloseOuter.M.HasShadow.style() },
        )
}
