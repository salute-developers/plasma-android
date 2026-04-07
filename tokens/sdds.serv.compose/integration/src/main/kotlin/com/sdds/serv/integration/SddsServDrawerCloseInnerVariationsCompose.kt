// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.drawer.DrawerCloseInner
import com.sdds.serv.styles.drawer.HasShadow
import com.sdds.serv.styles.drawer.M

internal object SddsServDrawerCloseInnerVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "M" to ComposeStyleReference { DrawerCloseInner.M.style() },
            "M.HasShadow" to ComposeStyleReference { DrawerCloseInner.M.HasShadow.style() },
        )
}
