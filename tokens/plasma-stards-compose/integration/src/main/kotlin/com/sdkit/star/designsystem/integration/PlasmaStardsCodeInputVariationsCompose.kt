// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.codeinput.CodeInput
import com.sdkit.star.designsystem.styles.codeinput.L
import com.sdkit.star.designsystem.styles.codeinput.M
import com.sdkit.star.designsystem.styles.codeinput.S

internal object PlasmaStardsCodeInputVariationsCompose : ComposeStyleProvider<CodeInputStyle>() {
    override val variations: Map<String, ComposeStyleReference<CodeInputStyle>> =
        mapOf(
            "S" to ComposeStyleReference { CodeInput.S.style() },
            "M" to ComposeStyleReference { CodeInput.M.style() },
            "L" to ComposeStyleReference { CodeInput.L.style() },
        )
}
