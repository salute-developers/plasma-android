package com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.checkbox.group.CheckBoxGroup
import com.sdds.serv.styles.checkbox.group.M
import com.sdds.serv.styles.checkbox.group.S

internal object SddsServCheckBoxGroupVariationsCompose : ComposeStyleProvider<String, CheckBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxGroupStyle> =
        mapOf(
            "M" to { CheckBoxGroup.M.style() },
            "S" to { CheckBoxGroup.S.style() },
        )
}
