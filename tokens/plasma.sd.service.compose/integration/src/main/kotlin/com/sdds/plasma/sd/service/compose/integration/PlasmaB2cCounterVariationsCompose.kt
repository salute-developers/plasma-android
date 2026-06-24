// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.counter.Accent
import com.sdds.plasma.sd.service.styles.counter.Black
import com.sdds.plasma.sd.service.styles.counter.Counter
import com.sdds.plasma.sd.service.styles.counter.CounterDefaultSize
import com.sdds.plasma.sd.service.styles.counter.CounterDefaultView
import com.sdds.plasma.sd.service.styles.counter.CounterStyles
import com.sdds.plasma.sd.service.styles.counter.Default
import com.sdds.plasma.sd.service.styles.counter.L
import com.sdds.plasma.sd.service.styles.counter.M
import com.sdds.plasma.sd.service.styles.counter.Negative
import com.sdds.plasma.sd.service.styles.counter.Positive
import com.sdds.plasma.sd.service.styles.counter.S
import com.sdds.plasma.sd.service.styles.counter.Warning
import com.sdds.plasma.sd.service.styles.counter.White
import com.sdds.plasma.sd.service.styles.counter.Xs
import com.sdds.plasma.sd.service.styles.counter.Xxs
import com.sdds.plasma.sd.service.styles.counter.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Positive", "Warning", "Negative", "Black", "White"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "Counter.L.Default" to ComposeStyleReference { Counter.L.Default.style() },
            "Counter.L.Accent" to ComposeStyleReference { Counter.L.Accent.style() },
            "Counter.L.Positive" to ComposeStyleReference { Counter.L.Positive.style() },
            "Counter.L.Warning" to ComposeStyleReference { Counter.L.Warning.style() },
            "Counter.L.Negative" to ComposeStyleReference { Counter.L.Negative.style() },
            "Counter.L.Black" to ComposeStyleReference { Counter.L.Black.style() },
            "Counter.L.White" to ComposeStyleReference { Counter.L.White.style() },
            "Counter.M.Default" to ComposeStyleReference { Counter.M.Default.style() },
            "Counter.M.Accent" to ComposeStyleReference { Counter.M.Accent.style() },
            "Counter.M.Positive" to ComposeStyleReference { Counter.M.Positive.style() },
            "Counter.M.Warning" to ComposeStyleReference { Counter.M.Warning.style() },
            "Counter.M.Negative" to ComposeStyleReference { Counter.M.Negative.style() },
            "Counter.M.Black" to ComposeStyleReference { Counter.M.Black.style() },
            "Counter.M.White" to ComposeStyleReference { Counter.M.White.style() },
            "Counter.S.Default" to ComposeStyleReference { Counter.S.Default.style() },
            "Counter.S.Accent" to ComposeStyleReference { Counter.S.Accent.style() },
            "Counter.S.Positive" to ComposeStyleReference { Counter.S.Positive.style() },
            "Counter.S.Warning" to ComposeStyleReference { Counter.S.Warning.style() },
            "Counter.S.Negative" to ComposeStyleReference { Counter.S.Negative.style() },
            "Counter.S.Black" to ComposeStyleReference { Counter.S.Black.style() },
            "Counter.S.White" to ComposeStyleReference { Counter.S.White.style() },
            "Counter.Xs.Default" to ComposeStyleReference { Counter.Xs.Default.style() },
            "Counter.Xs.Accent" to ComposeStyleReference { Counter.Xs.Accent.style() },
            "Counter.Xs.Positive" to ComposeStyleReference { Counter.Xs.Positive.style() },
            "Counter.Xs.Warning" to ComposeStyleReference { Counter.Xs.Warning.style() },
            "Counter.Xs.Negative" to ComposeStyleReference { Counter.Xs.Negative.style() },
            "Counter.Xs.Black" to ComposeStyleReference { Counter.Xs.Black.style() },
            "Counter.Xs.White" to ComposeStyleReference { Counter.Xs.White.style() },
            "Counter.Xxs.Default" to ComposeStyleReference { Counter.Xxs.Default.style() },
            "Counter.Xxs.Accent" to ComposeStyleReference { Counter.Xxs.Accent.style() },
            "Counter.Xxs.Positive" to ComposeStyleReference { Counter.Xxs.Positive.style() },
            "Counter.Xxs.Warning" to ComposeStyleReference { Counter.Xxs.Warning.style() },
            "Counter.Xxs.Negative" to ComposeStyleReference { Counter.Xxs.Negative.style() },
            "Counter.Xxs.Black" to ComposeStyleReference { Counter.Xxs.Black.style() },
            "Counter.Xxs.White" to ComposeStyleReference { Counter.Xxs.White.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CounterStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CounterDefaultSize.L
                "M" -> CounterDefaultSize.M
                "S" -> CounterDefaultSize.S
                "Xs" -> CounterDefaultSize.Xs
                "Xxs" -> CounterDefaultSize.Xxs
                else -> CounterDefaultSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> CounterDefaultView.Default
                "Accent" -> CounterDefaultView.Accent
                "Positive" -> CounterDefaultView.Positive
                "Warning" -> CounterDefaultView.Warning
                "Negative" -> CounterDefaultView.Negative
                "Black" -> CounterDefaultView.Black
                "White" -> CounterDefaultView.White
                else -> CounterDefaultView.Default
            },
        ).key
    }
}
