// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.overlay.Default
import com.sdds.finai.styles.overlay.Overlay

internal object SddsFinaiOverlayVariationsCompose : ComposeStyleProvider<OverlayStyle>() {

    override val variations: Map<String, ComposeStyleReference<OverlayStyle>> =
        mapOf(
            "Overlay.Default" to ComposeStyleReference { Overlay.Default.style() },
        )
}
