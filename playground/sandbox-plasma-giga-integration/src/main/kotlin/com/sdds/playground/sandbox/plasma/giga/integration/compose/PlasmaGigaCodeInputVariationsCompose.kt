package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.codeinput.CodeInput
import com.sdds.plasma.giga.styles.codeinput.L
import com.sdds.plasma.giga.styles.codeinput.M
import com.sdds.plasma.giga.styles.codeinput.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaCodeInputVariationsCompose : ComposeStyleProvider<String, CodeInputStyle>() {
    override val variations: Map<String, @Composable () -> CodeInputStyle> =
        mapOf(
            "S" to { CodeInput.S.style() },
            "M" to { CodeInput.M.style() },
            "L" to { CodeInput.L.style() },
        )
}
