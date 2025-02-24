package com.sdds.playground.sandbox.plasma.stards.integration.radiobox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.radiobox.group.M
import com.sdkit.star.designsystem.styles.radiobox.group.S

internal object StarDsRadioBoxGroupVariationsCompose :
    ComposeStyleProvider<String, RadioBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxGroupStyle> =
        mapOf(
            "M" to { RadioBoxGroup.M.style() },
            "S" to { RadioBoxGroup.S.style() },
        )
}
