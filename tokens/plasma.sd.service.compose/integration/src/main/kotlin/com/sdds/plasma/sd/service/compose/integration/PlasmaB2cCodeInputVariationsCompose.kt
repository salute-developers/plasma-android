// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.codeinput.CodeInput
import com.sdds.plasma.sd.service.styles.codeinput.L
import com.sdds.plasma.sd.service.styles.codeinput.M
import com.sdds.plasma.sd.service.styles.codeinput.S

internal object PlasmaB2cCodeInputVariationsCompose : ComposeStyleProvider<CodeInputStyle>() {
    override val variations: Map<String, ComposeStyleReference<CodeInputStyle>> =
        mapOf(
            "S" to ComposeStyleReference { CodeInput.S.style() },
            "M" to ComposeStyleReference { CodeInput.M.style() },
            "L" to ComposeStyleReference { CodeInput.L.style() },
        )
}
