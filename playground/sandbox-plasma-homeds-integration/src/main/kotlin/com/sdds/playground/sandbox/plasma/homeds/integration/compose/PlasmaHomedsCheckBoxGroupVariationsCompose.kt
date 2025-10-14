package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.homeds.styles.checkboxgroup.L
import com.sdds.plasma.homeds.styles.checkboxgroup.M
import com.sdds.plasma.homeds.styles.checkboxgroup.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsCheckBoxGroupVariationsCompose : ComposeStyleProvider<String, CheckBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxGroupStyle> =
        mapOf(
            "L" to { CheckBoxGroup.L.style() },
            "M" to { CheckBoxGroup.M.style() },
            "S" to { CheckBoxGroup.S.style() },
        )
}
