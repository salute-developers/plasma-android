package com.sdds.playground.sandbox.plasma.stards.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.Default
import com.sdkit.star.designsystem.styles.checkbox.L
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkbox.Negative
import com.sdkit.star.designsystem.styles.checkbox.S

internal object StarDsCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
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
