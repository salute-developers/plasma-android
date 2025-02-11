package com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.plasma.sd.service.styles.checkbox.M
import com.sdds.plasma.sd.service.styles.checkbox.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle> =
        mapOf(
            "M" to { CheckBox.M.style() },
            "S" to { CheckBox.S.style() },
        )
}
