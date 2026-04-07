// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.drawer.DrawerCloseNone
import com.sdds.plasma.sd.service.styles.drawer.HasShadow
import com.sdds.plasma.sd.service.styles.drawer.M

internal object PlasmaB2cDrawerCloseNoneVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "M" to ComposeStyleReference { DrawerCloseNone.M.style() },
            "M.HasShadow" to ComposeStyleReference { DrawerCloseNone.M.HasShadow.style() },
        )
}
