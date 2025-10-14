package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.counter.Accent
import com.sdds.plasma.homeds.styles.counter.Black
import com.sdds.plasma.homeds.styles.counter.Counter
import com.sdds.plasma.homeds.styles.counter.Default
import com.sdds.plasma.homeds.styles.counter.L
import com.sdds.plasma.homeds.styles.counter.M
import com.sdds.plasma.homeds.styles.counter.Negative
import com.sdds.plasma.homeds.styles.counter.Positive
import com.sdds.plasma.homeds.styles.counter.S
import com.sdds.plasma.homeds.styles.counter.Warning
import com.sdds.plasma.homeds.styles.counter.White
import com.sdds.plasma.homeds.styles.counter.Xs
import com.sdds.plasma.homeds.styles.counter.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsCounterVariationsCompose : ComposeStyleProvider<String, CounterStyle>() {
    override val variations: Map<String, @Composable () -> CounterStyle> =
        mapOf(
            "L.Default" to { Counter.L.Default.style() },
            "L.Accent" to { Counter.L.Accent.style() },
            "L.Positive" to { Counter.L.Positive.style() },
            "L.Warning" to { Counter.L.Warning.style() },
            "L.Negative" to { Counter.L.Negative.style() },
            "L.Black" to { Counter.L.Black.style() },
            "L.White" to { Counter.L.White.style() },
            "M.Default" to { Counter.M.Default.style() },
            "M.Accent" to { Counter.M.Accent.style() },
            "M.Positive" to { Counter.M.Positive.style() },
            "M.Warning" to { Counter.M.Warning.style() },
            "M.Negative" to { Counter.M.Negative.style() },
            "M.Black" to { Counter.M.Black.style() },
            "M.White" to { Counter.M.White.style() },
            "S.Default" to { Counter.S.Default.style() },
            "S.Accent" to { Counter.S.Accent.style() },
            "S.Positive" to { Counter.S.Positive.style() },
            "S.Warning" to { Counter.S.Warning.style() },
            "S.Negative" to { Counter.S.Negative.style() },
            "S.Black" to { Counter.S.Black.style() },
            "S.White" to { Counter.S.White.style() },
            "Xs.Default" to { Counter.Xs.Default.style() },
            "Xs.Accent" to { Counter.Xs.Accent.style() },
            "Xs.Positive" to { Counter.Xs.Positive.style() },
            "Xs.Warning" to { Counter.Xs.Warning.style() },
            "Xs.Negative" to { Counter.Xs.Negative.style() },
            "Xs.Black" to { Counter.Xs.Black.style() },
            "Xs.White" to { Counter.Xs.White.style() },
            "Xxs.Default" to { Counter.Xxs.Default.style() },
            "Xxs.Accent" to { Counter.Xxs.Accent.style() },
            "Xxs.Positive" to { Counter.Xxs.Positive.style() },
            "Xxs.Warning" to { Counter.Xxs.Warning.style() },
            "Xxs.Negative" to { Counter.Xxs.Negative.style() },
            "Xxs.Black" to { Counter.Xxs.Black.style() },
            "Xxs.White" to { Counter.Xxs.White.style() },
        )
}
