package com.sdds.playground.sandbox.plasma.giga.app.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.checkbox.CheckBox
import com.sdds.plasma.giga.app.styles.checkbox.Default
import com.sdds.plasma.giga.app.styles.checkbox.L
import com.sdds.plasma.giga.app.styles.checkbox.M
import com.sdds.plasma.giga.app.styles.checkbox.Negative
import com.sdds.plasma.giga.app.styles.checkbox.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle> =
        mapOf(
            "LDefault" to { CheckBox.L.Default.style() },
            "MDefault" to { CheckBox.M.Default.style() },
            "SDefault" to { CheckBox.S.Default.style() },
            "LNegative" to { CheckBox.L.Negative.style() },
            "MNegative" to { CheckBox.M.Negative.style() },
            "SNegative" to { CheckBox.S.Negative.style() },
        )
}
