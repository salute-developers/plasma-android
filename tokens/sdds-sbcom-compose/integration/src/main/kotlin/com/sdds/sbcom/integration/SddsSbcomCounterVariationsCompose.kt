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
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.MuteNo
import com.sdds.sbcom.styles.counter.MuteYes

internal object SddsSbcomCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "MuteNo" to ComposeStyleReference { Counter.MuteNo.style() },
            "MuteYes" to ComposeStyleReference { Counter.MuteYes.style() },
        )
}
