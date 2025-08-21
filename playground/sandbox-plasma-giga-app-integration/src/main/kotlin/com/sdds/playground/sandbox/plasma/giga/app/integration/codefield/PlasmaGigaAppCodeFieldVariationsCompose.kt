package com.sdds.playground.sandbox.plasma.giga.app.integration.codefield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.codefield.CodeField
import com.sdds.plasma.giga.app.styles.codefield.L
import com.sdds.plasma.giga.app.styles.codefield.M
import com.sdds.plasma.giga.app.styles.codefield.Segmented
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppCodeFieldVariationsCompose :
    ComposeStyleProvider<String, CodeFieldStyle>() {

    override val variations: Map<String, @Composable () -> CodeFieldStyle> =
        mapOf(
            "M" to { CodeField.M.style() },
            "MSegmented" to { CodeField.M.Segmented.style() },
            "L" to { CodeField.L.style() },
            "LSegmented" to { CodeField.L.Segmented.style() },
        )
}
