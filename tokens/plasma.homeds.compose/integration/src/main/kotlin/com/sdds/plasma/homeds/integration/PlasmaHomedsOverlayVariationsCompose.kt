// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.overlay.Default
import com.sdds.plasma.homeds.styles.overlay.DirectionBottom
import com.sdds.plasma.homeds.styles.overlay.DirectionTop
import com.sdds.plasma.homeds.styles.overlay.Overlay

internal object PlasmaHomedsOverlayVariationsCompose : ComposeStyleProvider<OverlayStyle>() {
    override val variations: Map<String, ComposeStyleReference<OverlayStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Overlay.Default.style() },
            "DirectionTop" to ComposeStyleReference { Overlay.DirectionTop.style() },
            "DirectionBottom" to ComposeStyleReference { Overlay.DirectionBottom.style() },
        )
}
