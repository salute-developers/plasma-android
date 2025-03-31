package com.sdds.playground.sandbox.stylessalute.integration.checkbox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.checkboxgroup.CheckBoxGroup
import com.sdds.stylessalute.styles.checkboxgroup.M
import com.sdds.stylessalute.styles.checkboxgroup.S

internal object StylesSaluteCheckBoxGroupVariationsCompose :
    ComposeStyleProvider<String, CheckBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxGroupStyle> = mapOf(
        "M" to { CheckBoxGroup.M.style() },
        "S" to { CheckBoxGroup.S.style() },
    )
}
