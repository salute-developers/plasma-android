package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.counter.Accent
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.Danger
import com.sdds.sbcom.styles.counter.Primary
import com.sdds.sbcom.styles.counter.Secondary

internal object SddsSbcomCounterVariationsCompose : ComposeStyleProvider<String, CounterStyle>() {
    override val variations: Map<String, @Composable () -> CounterStyle> =
        mapOf(
            "Primary" to { Counter.Primary.style() },
            "Secondary" to { Counter.Secondary.style() },
            "Accent" to { Counter.Accent.style() },
            "Danger" to { Counter.Danger.style() },
        )
}
