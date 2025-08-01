package com.sdds.playground.sandbox.plasma.sd.service.integration.codeinput

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.codeinput.CodeInput
import com.sdds.plasma.sd.service.styles.codeinput.L
import com.sdds.plasma.sd.service.styles.codeinput.M
import com.sdds.plasma.sd.service.styles.codeinput.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceCodeInputVariationsCompose :
    ComposeStyleProvider<String, CodeInputStyle>() {

    override val variations: Map<String, @Composable () -> CodeInputStyle> =
        mapOf(
            "S" to { CodeInput.S.style() },
            "M" to { CodeInput.M.style() },
            "L" to { CodeInput.L.style() },
        )
}
