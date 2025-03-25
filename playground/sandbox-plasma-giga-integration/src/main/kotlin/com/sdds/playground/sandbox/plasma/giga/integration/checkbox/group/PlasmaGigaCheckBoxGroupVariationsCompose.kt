package com.sdds.playground.sandbox.plasma.giga.integration.checkbox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.plasma.giga.styles.checkbox.group.CheckBoxGroup
import com.sdds.plasma.giga.styles.checkbox.group.M
import com.sdds.plasma.giga.styles.checkbox.group.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaCheckBoxGroupVariationsCompose : ComposeStyleProvider<String, CheckBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxGroupStyle> =
        mapOf(
            "M" to { CheckBoxGroup.M.style() },
            "S" to { CheckBoxGroup.S.style() },
        )
}
