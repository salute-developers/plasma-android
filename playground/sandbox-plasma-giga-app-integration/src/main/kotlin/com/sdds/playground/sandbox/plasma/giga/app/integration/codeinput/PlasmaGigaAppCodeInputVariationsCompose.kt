package com.sdds.playground.sandbox.plasma.giga.app.integration.codeinput

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.codeinput.CodeInput
import com.sdds.plasma.giga.app.styles.codeinput.L
import com.sdds.plasma.giga.app.styles.codeinput.M
import com.sdds.plasma.giga.app.styles.codeinput.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppCodeInputVariationsCompose :
    ComposeStyleProvider<String, CodeInputStyle>() {

    override val variations: Map<String, @Composable () -> CodeInputStyle> =
        mapOf(
            "S" to { CodeInput.S.style() },
            "M" to { CodeInput.M.style() },
            "L" to { CodeInput.L.style() },
        )
}
