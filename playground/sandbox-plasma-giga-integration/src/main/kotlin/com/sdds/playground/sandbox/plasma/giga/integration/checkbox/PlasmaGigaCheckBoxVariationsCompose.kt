package com.sdds.playground.sandbox.plasma.giga.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.plasma.giga.styles.checkbox.CheckBox
import com.sdds.plasma.giga.styles.checkbox.M
import com.sdds.plasma.giga.styles.checkbox.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle> =
        mapOf(
            "M" to { CheckBox.M.style() },
            "S" to { CheckBox.S.style() },
        )
}
