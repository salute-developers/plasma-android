package com.sdds.playground.sandbox.plasma.giga.integration.radiobox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.radioboxgroup.M
import com.sdds.plasma.giga.styles.radioboxgroup.RadioBoxGroup
import com.sdds.plasma.giga.styles.radioboxgroup.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaRadioBoxGroupVariationsCompose :
    ComposeStyleProvider<String, RadioBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxGroupStyle> =
        mapOf(
            "M" to { RadioBoxGroup.M.style() },
            "S" to { RadioBoxGroup.S.style() },
        )
}
