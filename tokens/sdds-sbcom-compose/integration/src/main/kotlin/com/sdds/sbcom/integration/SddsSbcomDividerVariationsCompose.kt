// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider

internal object SddsSbcomDividerVariationsCompose : ComposeStyleProvider<DividerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DividerStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Divider.Default.style() },
        )
}
