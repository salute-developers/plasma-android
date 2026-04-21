// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider

internal object PlasmaHomedsDividerVariationsCompose : ComposeStyleProvider<DividerStyle>() {

    override val variations: Map<String, ComposeStyleReference<DividerStyle>> =
        mapOf(
            "Divider.Default" to ComposeStyleReference { Divider.Default.style() },
        )
}
