package com.sdds.playground.sandbox.sdds.serv.integration.codeinput

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.L
import com.sdds.serv.styles.codeinput.M
import com.sdds.serv.styles.codeinput.S

internal object SddsServCodeInputVariationsCompose :
    ComposeStyleProvider<String, CodeInputStyle>() {

    override val variations: Map<String, @Composable () -> CodeInputStyle> =
        mapOf(
            "S" to { CodeInput.S.style() },
            "M" to { CodeInput.M.style() },
            "L" to { CodeInput.L.style() },
        )
}
