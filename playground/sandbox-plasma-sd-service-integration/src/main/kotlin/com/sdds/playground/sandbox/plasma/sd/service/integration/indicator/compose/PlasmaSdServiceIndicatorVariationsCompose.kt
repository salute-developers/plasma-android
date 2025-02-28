package com.sdds.playground.sandbox.plasma.sd.service.integration.indicator.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.indicator.Accent
import com.sdds.plasma.sd.service.styles.indicator.Black
import com.sdds.plasma.sd.service.styles.indicator.Dark
import com.sdds.plasma.sd.service.styles.indicator.Default
import com.sdds.plasma.sd.service.styles.indicator.Inactive
import com.sdds.plasma.sd.service.styles.indicator.L
import com.sdds.plasma.sd.service.styles.indicator.M
import com.sdds.plasma.sd.service.styles.indicator.Negative
import com.sdds.plasma.sd.service.styles.indicator.Positive
import com.sdds.plasma.sd.service.styles.indicator.S
import com.sdds.plasma.sd.service.styles.indicator.Warning
import com.sdds.plasma.sd.service.styles.indicator.White
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceIndicatorVariationsCompose :
    ComposeStyleProvider<String, IndicatorStyle>() {
    override val variations: Map<String, @Composable () -> IndicatorStyle> =
        mapOf(
            "LDefault" to { Indicator.L.Default.style() },
            "MDefault" to { Indicator.M.Default.style() },
            "SDefault" to { Indicator.S.Default.style() },

            "LAccent" to { Indicator.L.Accent.style() },
            "MAccent" to { Indicator.M.Accent.style() },
            "SAccent" to { Indicator.S.Accent.style() },

            "LPositive" to { Indicator.L.Positive.style() },
            "MPositive" to { Indicator.M.Positive.style() },
            "SPositive" to { Indicator.S.Positive.style() },

            "LInactive" to { Indicator.L.Inactive.style() },
            "MInactive" to { Indicator.M.Inactive.style() },
            "SInactive" to { Indicator.S.Inactive.style() },

            "LNegative" to { Indicator.L.Negative.style() },
            "MNegative" to { Indicator.M.Negative.style() },
            "SNegative" to { Indicator.S.Negative.style() },

            "LWarning" to { Indicator.L.Warning.style() },
            "MWarning" to { Indicator.M.Warning.style() },
            "SWarning" to { Indicator.S.Warning.style() },

            "LDark" to { Indicator.L.Dark.style() },
            "MDark" to { Indicator.M.Dark.style() },
            "SDark" to { Indicator.S.Dark.style() },

            "LBlack" to { Indicator.L.Black.style() },
            "MBlack" to { Indicator.M.Black.style() },
            "SBlack" to { Indicator.S.Black.style() },

            "LWhite" to { Indicator.L.White.style() },
            "MWhite" to { Indicator.M.White.style() },
            "SWhite" to { Indicator.S.White.style() },
        )
}
