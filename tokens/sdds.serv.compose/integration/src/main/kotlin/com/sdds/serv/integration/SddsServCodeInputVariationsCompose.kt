// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.L
import com.sdds.serv.styles.codeinput.M
import com.sdds.serv.styles.codeinput.S

internal object SddsServCodeInputVariationsCompose : ComposeStyleProvider<CodeInputStyle>() {
    override val variations: Map<String, ComposeStyleReference<CodeInputStyle>> =
        mapOf(
            "S" to ComposeStyleReference { CodeInput.S.style() },
            "M" to ComposeStyleReference { CodeInput.M.style() },
            "L" to ComposeStyleReference { CodeInput.L.style() },
        )
}
