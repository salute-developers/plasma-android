package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.radioboxgroup.M
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroup
import com.sdkit.star.designsystem.styles.radioboxgroup.S

internal object PlasmaStardsRadioBoxGroupVariationsCompose : ComposeStyleProvider<String, RadioBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxGroupStyle> =
        mapOf(
            "M" to { RadioBoxGroup.M.style() },
            "S" to { RadioBoxGroup.S.style() },
        )
}
