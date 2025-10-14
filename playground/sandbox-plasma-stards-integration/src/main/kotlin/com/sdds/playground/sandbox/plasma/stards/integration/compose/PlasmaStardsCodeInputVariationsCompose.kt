package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.codeinput.CodeInput
import com.sdkit.star.designsystem.styles.codeinput.L
import com.sdkit.star.designsystem.styles.codeinput.M
import com.sdkit.star.designsystem.styles.codeinput.S

internal object PlasmaStardsCodeInputVariationsCompose : ComposeStyleProvider<String, CodeInputStyle>() {
    override val variations: Map<String, @Composable () -> CodeInputStyle> =
        mapOf(
            "S" to { CodeInput.S.style() },
            "M" to { CodeInput.M.style() },
            "L" to { CodeInput.L.style() },
        )
}
