package com.sdds.playground.sandbox.plasma.stards.integration.compose

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

internal object PlasmaStardsCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
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
