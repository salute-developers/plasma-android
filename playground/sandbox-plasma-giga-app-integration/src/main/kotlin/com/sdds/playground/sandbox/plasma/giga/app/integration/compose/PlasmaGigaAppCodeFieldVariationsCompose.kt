package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.codefield.CodeField
import com.sdds.plasma.giga.app.styles.codefield.L
import com.sdds.plasma.giga.app.styles.codefield.M
import com.sdds.plasma.giga.app.styles.codefield.Segmented
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppCodeFieldVariationsCompose : ComposeStyleProvider<String, CodeFieldStyle>() {
    override val variations: Map<String, @Composable () -> CodeFieldStyle> =
        mapOf(
            "L" to { CodeField.L.style() },
            "L.Segmented" to { CodeField.L.Segmented.style() },
            "M" to { CodeField.M.style() },
            "M.Segmented" to { CodeField.M.Segmented.style() },
        )
}
