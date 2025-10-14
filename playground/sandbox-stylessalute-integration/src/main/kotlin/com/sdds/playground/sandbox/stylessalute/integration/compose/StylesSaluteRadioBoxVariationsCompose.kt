package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.radiobox.M
import com.sdds.stylessalute.styles.radiobox.RadioBox
import com.sdds.stylessalute.styles.radiobox.S

internal object StylesSaluteRadioBoxVariationsCompose : ComposeStyleProvider<String, RadioBoxStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxStyle> =
        mapOf(
            "M" to { RadioBox.M.style() },
            "S" to { RadioBox.S.style() },
        )
}
