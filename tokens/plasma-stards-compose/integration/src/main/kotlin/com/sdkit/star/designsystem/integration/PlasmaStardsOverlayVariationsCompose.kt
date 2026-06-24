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
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.overlay.Default
import com.sdkit.star.designsystem.styles.overlay.Overlay

internal object PlasmaStardsOverlayVariationsCompose : ComposeStyleProvider<OverlayStyle>() {

    override val variations: Map<String, ComposeStyleReference<OverlayStyle>> =
        mapOf(
            "Overlay.Default" to ComposeStyleReference { Overlay.Default.style() },
        )
}
