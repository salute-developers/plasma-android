package com.sdds.playground.sandbox.sdds.serv.integration.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.S

internal object SddsServRadioBoxVariationsCompose : ComposeStyleProvider<String, RadioBoxStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxStyle> =
        mapOf(
            "M" to { RadioBox.M.style() },
            "S" to { RadioBox.S.style() },
        )
}
