package com.sdds.playground.sandbox.plasma.stards.integration.checkbox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.checkbox.group.CheckBoxGroup
import com.sdkit.star.designsystem.styles.checkbox.group.M
import com.sdkit.star.designsystem.styles.checkbox.group.S

internal object StarDsCheckBoxGroupVariationsCompose : ComposeStyleProvider<String, CheckBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> CheckBoxGroupStyle> =
        mapOf(
            "M" to { CheckBoxGroup.M.style() },
            "S" to { CheckBoxGroup.S.style() },
        )
}
