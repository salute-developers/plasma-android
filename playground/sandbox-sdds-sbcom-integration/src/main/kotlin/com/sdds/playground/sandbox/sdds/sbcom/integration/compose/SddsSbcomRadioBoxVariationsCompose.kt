package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.radiobox.Default
import com.sdds.sbcom.styles.radiobox.RadioBox

internal object SddsSbcomRadioBoxVariationsCompose : ComposeStyleProvider<String, RadioBoxStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxStyle> =
        mapOf(
            "Default" to { RadioBox.Default.style() },
        )
}
