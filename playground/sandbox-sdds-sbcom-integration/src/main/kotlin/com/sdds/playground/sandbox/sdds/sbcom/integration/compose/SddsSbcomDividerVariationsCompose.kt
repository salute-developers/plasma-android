package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider

internal object SddsSbcomDividerVariationsCompose : ComposeStyleProvider<String, DividerStyle>() {
    override val variations: Map<String, @Composable () -> DividerStyle> =
        mapOf(
            "Default" to { Divider.Default.style() },
        )
}
