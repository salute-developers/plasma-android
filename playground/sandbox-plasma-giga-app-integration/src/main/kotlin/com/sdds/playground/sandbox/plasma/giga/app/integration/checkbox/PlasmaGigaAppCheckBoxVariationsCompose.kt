package com.sdds.playground.sandbox.plasma.giga.app.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.plasma.giga.app.styles.checkbox.CheckBox
import com.sdds.plasma.giga.app.styles.checkbox.M
import com.sdds.plasma.giga.app.styles.checkbox.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle> =
        mapOf(
            "M" to { CheckBox.M.style() },
            "S" to { CheckBox.S.style() },
        )
}
