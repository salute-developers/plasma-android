// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.codefield.CodeField
import com.sdds.plasma.sd.service.styles.codefield.L
import com.sdds.plasma.sd.service.styles.codefield.M
import com.sdds.plasma.sd.service.styles.codefield.Segmented

internal object PlasmaB2cCodeFieldVariationsCompose : ComposeStyleProvider<CodeFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<CodeFieldStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CodeField.L.style() },
            "L.Segmented" to ComposeStyleReference { CodeField.L.Segmented.style() },
            "M" to ComposeStyleReference { CodeField.M.style() },
            "M.Segmented" to ComposeStyleReference { CodeField.M.Segmented.style() },
        )
}
