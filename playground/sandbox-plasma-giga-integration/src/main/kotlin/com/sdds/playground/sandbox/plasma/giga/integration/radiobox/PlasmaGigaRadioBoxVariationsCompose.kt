package com.sdds.playground.sandbox.plasma.giga.integration.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.radiobox.L
import com.sdds.plasma.giga.styles.radiobox.M
import com.sdds.plasma.giga.styles.radiobox.RadioBox
import com.sdds.plasma.giga.styles.radiobox.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaRadioBoxVariationsCompose : ComposeStyleProvider<String, RadioBoxStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxStyle> =
        mapOf(
            "L" to { RadioBox.L.style() },
            "M" to { RadioBox.M.style() },
            "S" to { RadioBox.S.style() },
        )
}
