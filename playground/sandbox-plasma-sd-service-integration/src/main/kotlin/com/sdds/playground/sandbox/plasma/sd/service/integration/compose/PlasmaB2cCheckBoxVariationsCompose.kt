package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.checkbox.CheckBox
import com.sdds.plasma.sd.service.styles.checkbox.Default
import com.sdds.plasma.sd.service.styles.checkbox.L
import com.sdds.plasma.sd.service.styles.checkbox.M
import com.sdds.plasma.sd.service.styles.checkbox.Negative
import com.sdds.plasma.sd.service.styles.checkbox.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle> =
        mapOf(
            "L.Default" to { CheckBox.L.Default.style() },
            "L.Negative" to { CheckBox.L.Negative.style() },
            "M.Default" to { CheckBox.M.Default.style() },
            "M.Negative" to { CheckBox.M.Negative.style() },
            "S.Default" to { CheckBox.S.Default.style() },
            "S.Negative" to { CheckBox.S.Negative.style() },
        )
}
