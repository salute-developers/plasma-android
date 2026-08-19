// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.counter.Accent
import com.sdds.finai.styles.counter.Black
import com.sdds.finai.styles.counter.Counter
import com.sdds.finai.styles.counter.CounterSize
import com.sdds.finai.styles.counter.CounterStyles
import com.sdds.finai.styles.counter.CounterView
import com.sdds.finai.styles.counter.Dark
import com.sdds.finai.styles.counter.Default
import com.sdds.finai.styles.counter.L
import com.sdds.finai.styles.counter.M
import com.sdds.finai.styles.counter.Negative
import com.sdds.finai.styles.counter.Positive
import com.sdds.finai.styles.counter.S
import com.sdds.finai.styles.counter.Secondary
import com.sdds.finai.styles.counter.Warning
import com.sdds.finai.styles.counter.White
import com.sdds.finai.styles.counter.Xs
import com.sdds.finai.styles.counter.Xxs
import com.sdds.finai.styles.counter.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Positive", "Warning", "Negative", "Black", "White", "Dark", "Secondary"),
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
            "Counter.L.Dark" to ComposeStyleReference { Counter.L.Dark.style() },
            "Counter.L.Secondary" to ComposeStyleReference { Counter.L.Secondary.style() },
            "Counter.M.Default" to ComposeStyleReference { Counter.M.Default.style() },
            "Counter.M.Accent" to ComposeStyleReference { Counter.M.Accent.style() },
            "Counter.M.Positive" to ComposeStyleReference { Counter.M.Positive.style() },
            "Counter.M.Warning" to ComposeStyleReference { Counter.M.Warning.style() },
            "Counter.M.Negative" to ComposeStyleReference { Counter.M.Negative.style() },
            "Counter.M.Black" to ComposeStyleReference { Counter.M.Black.style() },
            "Counter.M.White" to ComposeStyleReference { Counter.M.White.style() },
            "Counter.M.Dark" to ComposeStyleReference { Counter.M.Dark.style() },
            "Counter.M.Secondary" to ComposeStyleReference { Counter.M.Secondary.style() },
            "Counter.S.Default" to ComposeStyleReference { Counter.S.Default.style() },
            "Counter.S.Accent" to ComposeStyleReference { Counter.S.Accent.style() },
            "Counter.S.Positive" to ComposeStyleReference { Counter.S.Positive.style() },
            "Counter.S.Warning" to ComposeStyleReference { Counter.S.Warning.style() },
            "Counter.S.Negative" to ComposeStyleReference { Counter.S.Negative.style() },
            "Counter.S.Black" to ComposeStyleReference { Counter.S.Black.style() },
            "Counter.S.White" to ComposeStyleReference { Counter.S.White.style() },
            "Counter.S.Dark" to ComposeStyleReference { Counter.S.Dark.style() },
            "Counter.S.Secondary" to ComposeStyleReference { Counter.S.Secondary.style() },
            "Counter.Xs.Default" to ComposeStyleReference { Counter.Xs.Default.style() },
            "Counter.Xs.Accent" to ComposeStyleReference { Counter.Xs.Accent.style() },
            "Counter.Xs.Positive" to ComposeStyleReference { Counter.Xs.Positive.style() },
            "Counter.Xs.Warning" to ComposeStyleReference { Counter.Xs.Warning.style() },
            "Counter.Xs.Negative" to ComposeStyleReference { Counter.Xs.Negative.style() },
            "Counter.Xs.Black" to ComposeStyleReference { Counter.Xs.Black.style() },
            "Counter.Xs.White" to ComposeStyleReference { Counter.Xs.White.style() },
            "Counter.Xs.Dark" to ComposeStyleReference { Counter.Xs.Dark.style() },
            "Counter.Xs.Secondary" to ComposeStyleReference { Counter.Xs.Secondary.style() },
            "Counter.Xxs.Default" to ComposeStyleReference { Counter.Xxs.Default.style() },
            "Counter.Xxs.Accent" to ComposeStyleReference { Counter.Xxs.Accent.style() },
            "Counter.Xxs.Positive" to ComposeStyleReference { Counter.Xxs.Positive.style() },
            "Counter.Xxs.Warning" to ComposeStyleReference { Counter.Xxs.Warning.style() },
            "Counter.Xxs.Negative" to ComposeStyleReference { Counter.Xxs.Negative.style() },
            "Counter.Xxs.Black" to ComposeStyleReference { Counter.Xxs.Black.style() },
            "Counter.Xxs.White" to ComposeStyleReference { Counter.Xxs.White.style() },
            "Counter.Xxs.Dark" to ComposeStyleReference { Counter.Xxs.Dark.style() },
            "Counter.Xxs.Secondary" to ComposeStyleReference { Counter.Xxs.Secondary.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CounterStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CounterSize.L
                "M" -> CounterSize.M
                "S" -> CounterSize.S
                "Xs" -> CounterSize.Xs
                "Xxs" -> CounterSize.Xxs
                else -> CounterSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> CounterView.Default
                "Accent" -> CounterView.Accent
                "Positive" -> CounterView.Positive
                "Warning" -> CounterView.Warning
                "Negative" -> CounterView.Negative
                "Black" -> CounterView.Black
                "White" -> CounterView.White
                "Dark" -> CounterView.Dark
                "Secondary" -> CounterView.Secondary
                else -> CounterView.Default
            },
        ).key
    }
}
