package com.sdds.playground.sandbox.plasma.stards.integration.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radiobox.S

internal object StarDsRadioBoxVariationsCompose : ComposeStyleProvider<String, RadioBoxStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxStyle> =
        mapOf(
            "M" to { RadioBox.M.style() },
            "S" to { RadioBox.S.style() },
        )
}
