package com.sdds.playground.sandbox.stylessalute.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.checkbox.M
import com.sdds.stylessalute.styles.checkbox.S

internal object StylesSaluteCheckBoxVariationsCompose :
    ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle> = mapOf(
        "M" to { CheckBox.M.style() },
        "S" to { CheckBox.S.style() },
    )
}
