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
import com.sdds.plasma.sd.service.styles.counter.CounterStyles
import com.sdds.plasma.sd.service.styles.counter.Default
import com.sdds.plasma.sd.service.styles.counter.L
import com.sdds.plasma.sd.service.styles.counter.M
import com.sdds.plasma.sd.service.styles.counter.S
import com.sdds.plasma.sd.service.styles.counter.SegmentItemCounter
import com.sdds.plasma.sd.service.styles.counter.SegmentItemCounterSize
import com.sdds.plasma.sd.service.styles.counter.SegmentItemCounterView
import com.sdds.plasma.sd.service.styles.counter.Xs
import com.sdds.plasma.sd.service.styles.counter.Xxs
import com.sdds.plasma.sd.service.styles.counter.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cSegmentItemCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Accent")),
        )

    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "SegmentItemCounter.L.Default" to ComposeStyleReference { SegmentItemCounter.L.Default.style() },
            "SegmentItemCounter.L.Accent" to ComposeStyleReference { SegmentItemCounter.L.Accent.style() },
            "SegmentItemCounter.M.Default" to ComposeStyleReference { SegmentItemCounter.M.Default.style() },
            "SegmentItemCounter.M.Accent" to ComposeStyleReference { SegmentItemCounter.M.Accent.style() },
            "SegmentItemCounter.S.Default" to ComposeStyleReference { SegmentItemCounter.S.Default.style() },
            "SegmentItemCounter.S.Accent" to ComposeStyleReference { SegmentItemCounter.S.Accent.style() },
            "SegmentItemCounter.Xs.Default" to ComposeStyleReference { SegmentItemCounter.Xs.Default.style() },
            "SegmentItemCounter.Xs.Accent" to ComposeStyleReference { SegmentItemCounter.Xs.Accent.style() },
            "SegmentItemCounter.Xxs.Default" to ComposeStyleReference { SegmentItemCounter.Xxs.Default.style() },
            "SegmentItemCounter.Xxs.Accent" to ComposeStyleReference { SegmentItemCounter.Xxs.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CounterStyles.SegmentItemCounter.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SegmentItemCounterSize.L
                "M" -> SegmentItemCounterSize.M
                "S" -> SegmentItemCounterSize.S
                "Xs" -> SegmentItemCounterSize.Xs
                "Xxs" -> SegmentItemCounterSize.Xxs
                else -> SegmentItemCounterSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> SegmentItemCounterView.Default
                "Accent" -> SegmentItemCounterView.Accent
                else -> SegmentItemCounterView.Default
            },
        ).key
    }
}
