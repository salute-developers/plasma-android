package com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.radiobox.group.M
import com.sdds.serv.styles.radiobox.group.S

internal object SddsServRadioBoxGroupVariationsCompose :
    ComposeStyleProvider<String, RadioBoxGroupStyle>() {
    override val variations: Map<String, @Composable () -> RadioBoxGroupStyle>
        get() = mapOf(
            "M" to { RadioBoxGroup.M.style() },
            "S" to { RadioBoxGroup.S.style() },
        )
}
