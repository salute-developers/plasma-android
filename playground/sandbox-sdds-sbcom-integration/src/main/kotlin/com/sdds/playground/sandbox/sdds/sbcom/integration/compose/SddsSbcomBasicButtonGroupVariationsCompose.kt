package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.buttongroup.BasicButtonGroup
import com.sdds.sbcom.styles.buttongroup.Default

internal object SddsSbcomBasicButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {
    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
            "Default" to { BasicButtonGroup.Default.style() },
        )
}
