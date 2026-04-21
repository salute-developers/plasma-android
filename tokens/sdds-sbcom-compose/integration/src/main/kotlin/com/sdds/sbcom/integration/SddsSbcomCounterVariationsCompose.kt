// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.CounterDefaultMute
import com.sdds.sbcom.styles.counter.CounterStyles
import com.sdds.sbcom.styles.counter.MuteNo
import com.sdds.sbcom.styles.counter.MuteYes
import com.sdds.sbcom.styles.counter.resolve

internal object SddsSbcomCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "mute", value = "No", variants = listOf("No", "Yes")),
        )

    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "Counter.MuteNo" to ComposeStyleReference { Counter.MuteNo.style() },
            "Counter.MuteYes" to ComposeStyleReference { Counter.MuteYes.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CounterStyles.Default.resolve(
            mute = when (bindings["mute"]?.toString()) {
                "No" -> CounterDefaultMute.No
                "Yes" -> CounterDefaultMute.Yes
                else -> CounterDefaultMute.No
            },
        ).key
    }
}
