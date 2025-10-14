package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.indicator.Accent
import com.sdds.stylessalute.styles.indicator.Black
import com.sdds.stylessalute.styles.indicator.Dark
import com.sdds.stylessalute.styles.indicator.Default
import com.sdds.stylessalute.styles.indicator.Inactive
import com.sdds.stylessalute.styles.indicator.Indicator
import com.sdds.stylessalute.styles.indicator.L
import com.sdds.stylessalute.styles.indicator.M
import com.sdds.stylessalute.styles.indicator.Negative
import com.sdds.stylessalute.styles.indicator.Positive
import com.sdds.stylessalute.styles.indicator.S
import com.sdds.stylessalute.styles.indicator.Warning
import com.sdds.stylessalute.styles.indicator.White

internal object StylesSaluteIndicatorVariationsCompose : ComposeStyleProvider<String, IndicatorStyle>() {
    override val variations: Map<String, @Composable () -> IndicatorStyle> =
        mapOf(
            "L.Default" to { Indicator.L.Default.style() },
            "L.Accent" to { Indicator.L.Accent.style() },
            "L.Inactive" to { Indicator.L.Inactive.style() },
            "L.Positive" to { Indicator.L.Positive.style() },
            "L.Warning" to { Indicator.L.Warning.style() },
            "L.Negative" to { Indicator.L.Negative.style() },
            "L.Dark" to { Indicator.L.Dark.style() },
            "L.Black" to { Indicator.L.Black.style() },
            "L.White" to { Indicator.L.White.style() },
            "M.Default" to { Indicator.M.Default.style() },
            "M.Accent" to { Indicator.M.Accent.style() },
            "M.Inactive" to { Indicator.M.Inactive.style() },
            "M.Positive" to { Indicator.M.Positive.style() },
            "M.Warning" to { Indicator.M.Warning.style() },
            "M.Negative" to { Indicator.M.Negative.style() },
            "M.Dark" to { Indicator.M.Dark.style() },
            "M.Black" to { Indicator.M.Black.style() },
            "M.White" to { Indicator.M.White.style() },
            "S.Default" to { Indicator.S.Default.style() },
            "S.Accent" to { Indicator.S.Accent.style() },
            "S.Inactive" to { Indicator.S.Inactive.style() },
            "S.Positive" to { Indicator.S.Positive.style() },
            "S.Warning" to { Indicator.S.Warning.style() },
            "S.Negative" to { Indicator.S.Negative.style() },
            "S.Dark" to { Indicator.S.Dark.style() },
            "S.Black" to { Indicator.S.Black.style() },
            "S.White" to { Indicator.S.White.style() },
        )
}
