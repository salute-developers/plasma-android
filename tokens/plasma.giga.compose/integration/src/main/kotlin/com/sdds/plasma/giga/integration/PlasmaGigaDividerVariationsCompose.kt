// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.divider.Default
import com.sdds.plasma.giga.styles.divider.Divider

internal object PlasmaGigaDividerVariationsCompose : ComposeStyleProvider<DividerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DividerStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Divider.Default.style() },
        )
}
