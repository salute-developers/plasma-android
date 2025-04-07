package com.sdds.playground.sandbox.plasma.stards.integration.counter

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.counter.Accent
import com.sdkit.star.designsystem.styles.counter.Black
import com.sdkit.star.designsystem.styles.counter.Counter
import com.sdkit.star.designsystem.styles.counter.Default
import com.sdkit.star.designsystem.styles.counter.L
import com.sdkit.star.designsystem.styles.counter.M
import com.sdkit.star.designsystem.styles.counter.Negative
import com.sdkit.star.designsystem.styles.counter.Positive
import com.sdkit.star.designsystem.styles.counter.S
import com.sdkit.star.designsystem.styles.counter.Warning
import com.sdkit.star.designsystem.styles.counter.White
import com.sdkit.star.designsystem.styles.counter.Xs
import com.sdkit.star.designsystem.styles.counter.Xxs

internal object StarDsCounterVariationsCompose : ComposeStyleProvider<String, CounterStyle>() {
    override val variations: Map<String, @Composable () -> CounterStyle> =
        mapOf(
            "CounterLDefault" to { Counter.L.Default.style() },
            "CounterMDefault" to { Counter.M.Default.style() },
            "CounterSDefault" to { Counter.S.Default.style() },
            "CounterXsDefault" to { Counter.Xs.Default.style() },
            "CounterXxsDefault" to { Counter.Xxs.Default.style() },

            "CounterLAccent" to { Counter.L.Accent.style() },
            "CounterMAccent" to { Counter.M.Accent.style() },
            "CounterSAccent" to { Counter.S.Accent.style() },
            "CounterXsAccent" to { Counter.Xs.Accent.style() },
            "CounterXxsAccent" to { Counter.Xxs.Accent.style() },

            "CounterLPositive" to { Counter.L.Positive.style() },
            "CounterMPositive" to { Counter.M.Positive.style() },
            "CounterSPositive" to { Counter.S.Positive.style() },
            "CounterXsPositive" to { Counter.Xs.Positive.style() },
            "CounterXxsPositive" to { Counter.Xxs.Positive.style() },

            "CounterLNegative" to { Counter.L.Negative.style() },
            "CounterMNegative" to { Counter.M.Negative.style() },
            "CounterSNegative" to { Counter.S.Negative.style() },
            "CounterXsNegative" to { Counter.Xs.Negative.style() },
            "CounterXxsNegative" to { Counter.Xxs.Negative.style() },

            "CounterLWarning" to { Counter.L.Warning.style() },
            "CounterMWarning" to { Counter.M.Warning.style() },
            "CounterSWarning" to { Counter.S.Warning.style() },
            "CounterXsWarning" to { Counter.Xs.Warning.style() },
            "CounterXxsWarning" to { Counter.Xxs.Warning.style() },

            "CounterLBlack" to { Counter.L.Black.style() },
            "CounterMBlack" to { Counter.M.Black.style() },
            "CounterSBlack" to { Counter.S.Black.style() },
            "CounterXsBlack" to { Counter.Xs.Black.style() },
            "CounterXxsBlack" to { Counter.Xxs.Black.style() },

            "CounterLWhite" to { Counter.L.White.style() },
            "CounterMWhite" to { Counter.M.White.style() },
            "CounterSWhite" to { Counter.S.White.style() },
            "CounterXsWhite" to { Counter.Xs.White.style() },
            "CounterXxsWhite" to { Counter.Xxs.White.style() },
        )
}
