// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.counter.Accent
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.Danger
import com.sdds.sbcom.styles.counter.Primary
import com.sdds.sbcom.styles.counter.Secondary

internal object SddsSbcomCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "Primary" to ComposeStyleReference { Counter.Primary.style() },
            "Secondary" to ComposeStyleReference { Counter.Secondary.style() },
            "Accent" to ComposeStyleReference { Counter.Accent.style() },
            "Danger" to ComposeStyleReference { Counter.Danger.style() },
        )
}
