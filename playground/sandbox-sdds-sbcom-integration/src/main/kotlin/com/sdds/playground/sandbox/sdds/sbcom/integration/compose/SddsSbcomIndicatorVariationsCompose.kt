package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.indicator.Danger
import com.sdds.sbcom.styles.indicator.GlobalWhite
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.Mute
import com.sdds.sbcom.styles.indicator.Success
import com.sdds.sbcom.styles.indicator.Warning

internal object SddsSbcomIndicatorVariationsCompose : ComposeStyleProvider<String, IndicatorStyle>() {
    override val variations: Map<String, @Composable () -> IndicatorStyle> =
        mapOf(
            "Success" to { Indicator.Success.style() },
            "GlobalWhite" to { Indicator.GlobalWhite.style() },
            "Mute" to { Indicator.Mute.style() },
            "Danger" to { Indicator.Danger.style() },
            "Warning" to { Indicator.Warning.style() },
        )
}
