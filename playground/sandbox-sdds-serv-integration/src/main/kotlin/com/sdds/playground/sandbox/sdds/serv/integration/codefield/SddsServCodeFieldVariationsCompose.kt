package com.sdds.playground.sandbox.sdds.serv.integration.codefield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.codefield.CodeField
import com.sdds.serv.styles.codefield.L
import com.sdds.serv.styles.codefield.M
import com.sdds.serv.styles.codefield.Segmented

internal object SddsServCodeFieldVariationsCompose :
    ComposeStyleProvider<String, CodeFieldStyle>() {

    override val variations: Map<String, @Composable () -> CodeFieldStyle> =
        mapOf(
            "M" to { CodeField.M.style() },
            "MSegmented" to { CodeField.M.Segmented.style() },
            "L" to { CodeField.L.style() },
            "LSegmented" to { CodeField.L.Segmented.style() },
        )
}
