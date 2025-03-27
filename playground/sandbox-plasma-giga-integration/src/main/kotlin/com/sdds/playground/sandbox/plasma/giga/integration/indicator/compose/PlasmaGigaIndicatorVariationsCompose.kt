package com.sdds.playground.sandbox.plasma.giga.integration.indicator.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.indicator.Accent
import com.sdds.plasma.giga.styles.indicator.Black
import com.sdds.plasma.giga.styles.indicator.Default
import com.sdds.plasma.giga.styles.indicator.Inactive
import com.sdds.plasma.giga.styles.indicator.Indicator
import com.sdds.plasma.giga.styles.indicator.L
import com.sdds.plasma.giga.styles.indicator.M
import com.sdds.plasma.giga.styles.indicator.Negative
import com.sdds.plasma.giga.styles.indicator.Positive
import com.sdds.plasma.giga.styles.indicator.S
import com.sdds.plasma.giga.styles.indicator.Warning
import com.sdds.plasma.giga.styles.indicator.White
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaIndicatorVariationsCompose : ComposeStyleProvider<String, IndicatorStyle>() {
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

            "LBlack" to { Indicator.L.Black.style() },
            "MBlack" to { Indicator.M.Black.style() },
            "SBlack" to { Indicator.S.Black.style() },

            "LWhite" to { Indicator.L.White.style() },
            "MWhite" to { Indicator.M.White.style() },
            "SWhite" to { Indicator.S.White.style() },
        )
}
