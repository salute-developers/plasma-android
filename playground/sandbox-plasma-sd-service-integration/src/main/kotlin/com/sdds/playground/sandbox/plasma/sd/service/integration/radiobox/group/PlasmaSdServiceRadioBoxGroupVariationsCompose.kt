package com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.plasma.sd.service.styles.radiobox.group.M
import com.sdds.plasma.sd.service.styles.radiobox.group.RadioBoxGroup
import com.sdds.plasma.sd.service.styles.radiobox.group.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceRadioBoxGroupVariationsCompose :
    ComposeStyleProvider<String, RadioBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxGroupStyle> =
        mapOf(
            "M" to { RadioBoxGroup.M.style() },
            "S" to { RadioBoxGroup.S.style() },
        )
}
