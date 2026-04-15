// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.overlay.Default
import com.sdds.plasma.giga.styles.overlay.Overlay

internal object PlasmaGigaOverlayVariationsCompose : ComposeStyleProvider<OverlayStyle>() {
    override val variations: Map<String, ComposeStyleReference<OverlayStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Overlay.Default.style() },
        )
}
