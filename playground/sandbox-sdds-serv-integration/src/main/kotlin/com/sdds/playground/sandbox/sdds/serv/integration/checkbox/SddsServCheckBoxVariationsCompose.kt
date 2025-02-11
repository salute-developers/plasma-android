package com.sdds.playground.sandbox.sdds.serv.integration.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.S

internal object SddsServCheckBoxVariationsCompose : ComposeStyleProvider<String, CheckBoxStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxStyle>
        get() = mapOf(
            "M" to { CheckBox.M.style() },
            "S" to { CheckBox.S.style() },
        )
}
