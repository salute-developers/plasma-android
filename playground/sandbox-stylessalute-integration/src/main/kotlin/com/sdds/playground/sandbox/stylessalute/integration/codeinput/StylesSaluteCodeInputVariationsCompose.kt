package com.sdds.playground.sandbox.stylessalute.integration.codeinput

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.codeinput.CodeInput
import com.sdds.stylessalute.styles.codeinput.L
import com.sdds.stylessalute.styles.codeinput.M
import com.sdds.stylessalute.styles.codeinput.S

internal object StylesSaluteCodeInputVariationsCompose :
    ComposeStyleProvider<String, CodeInputStyle>() {

    override val variations: Map<String, @Composable () -> CodeInputStyle> =
        mapOf(
            "S" to { CodeInput.S.style() },
            "M" to { CodeInput.M.style() },
            "L" to { CodeInput.L.style() },
        )
}
