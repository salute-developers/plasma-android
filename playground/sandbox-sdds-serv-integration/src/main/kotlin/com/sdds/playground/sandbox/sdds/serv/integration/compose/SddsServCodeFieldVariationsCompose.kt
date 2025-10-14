package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.codefield.CodeField
import com.sdds.serv.styles.codefield.L
import com.sdds.serv.styles.codefield.M
import com.sdds.serv.styles.codefield.Segmented

internal object SddsServCodeFieldVariationsCompose : ComposeStyleProvider<String, CodeFieldStyle>() {
    override val variations: Map<String, @Composable () -> CodeFieldStyle> =
        mapOf(
            "L" to { CodeField.L.style() },
            "L.Segmented" to { CodeField.L.Segmented.style() },
            "M" to { CodeField.M.style() },
            "M.Segmented" to { CodeField.M.Segmented.style() },
        )
}
