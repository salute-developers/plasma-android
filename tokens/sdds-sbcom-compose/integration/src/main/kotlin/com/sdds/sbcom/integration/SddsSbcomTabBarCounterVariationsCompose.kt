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
import com.sdds.sbcom.styles.counter.Default
import com.sdds.sbcom.styles.counter.TabBarCounter

internal object SddsSbcomTabBarCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { TabBarCounter.Default.style() },
        )
}
