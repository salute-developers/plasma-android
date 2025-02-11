package com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.plasma.sd.service.styles.radiobox.M
import com.sdds.plasma.sd.service.styles.radiobox.S

internal object PlasmaSdServiceRadioBoxVariationsCompose : ComposeStyleProvider<String, RadioBoxStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxStyle>
        get() = mapOf(
            "M" to { RadioBox.M.style() },
            "S" to { RadioBox.S.style() },
        )
}
