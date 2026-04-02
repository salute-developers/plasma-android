// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.overlay.Default
import com.sdds.serv.styles.overlay.Overlay

internal object SddsServOverlayVariationsCompose : ComposeStyleProvider<OverlayStyle>() {
    override val variations: Map<String, ComposeStyleReference<OverlayStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Overlay.Default.style() },
        )
}
