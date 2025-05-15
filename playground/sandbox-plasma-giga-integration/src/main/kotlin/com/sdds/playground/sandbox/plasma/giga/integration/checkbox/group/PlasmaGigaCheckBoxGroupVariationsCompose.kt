package com.sdds.playground.sandbox.plasma.giga.integration.checkbox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.giga.styles.checkboxgroup.L
import com.sdds.plasma.giga.styles.checkboxgroup.M
import com.sdds.plasma.giga.styles.checkboxgroup.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaCheckBoxGroupVariationsCompose : ComposeStyleProvider<String, CheckBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxGroupStyle> =
        mapOf(
            "L" to { CheckBoxGroup.L.style() },
            "M" to { CheckBoxGroup.M.style() },
            "S" to { CheckBoxGroup.S.style() },
        )
}
