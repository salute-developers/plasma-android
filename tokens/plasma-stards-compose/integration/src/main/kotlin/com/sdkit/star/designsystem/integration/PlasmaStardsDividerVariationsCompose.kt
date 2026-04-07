// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.divider.Default
import com.sdkit.star.designsystem.styles.divider.Divider

internal object PlasmaStardsDividerVariationsCompose : ComposeStyleProvider<DividerStyle>() {
    override val variations: Map<String, ComposeStyleReference<DividerStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Divider.Default.style() },
        )
}
