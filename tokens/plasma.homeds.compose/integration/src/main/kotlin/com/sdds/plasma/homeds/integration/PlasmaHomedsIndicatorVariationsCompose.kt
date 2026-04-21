// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.indicator.Accent
import com.sdds.plasma.homeds.styles.indicator.Black
import com.sdds.plasma.homeds.styles.indicator.Dark
import com.sdds.plasma.homeds.styles.indicator.Default
import com.sdds.plasma.homeds.styles.indicator.Inactive
import com.sdds.plasma.homeds.styles.indicator.Indicator
import com.sdds.plasma.homeds.styles.indicator.IndicatorSize
import com.sdds.plasma.homeds.styles.indicator.IndicatorStyles
import com.sdds.plasma.homeds.styles.indicator.IndicatorView
import com.sdds.plasma.homeds.styles.indicator.L
import com.sdds.plasma.homeds.styles.indicator.M
import com.sdds.plasma.homeds.styles.indicator.Negative
import com.sdds.plasma.homeds.styles.indicator.Positive
import com.sdds.plasma.homeds.styles.indicator.S
import com.sdds.plasma.homeds.styles.indicator.Warning
import com.sdds.plasma.homeds.styles.indicator.White
import com.sdds.plasma.homeds.styles.indicator.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Inactive", "Positive", "Warning", "Negative", "Dark", "Black", "White"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "Indicator.L.Default" to ComposeStyleReference { Indicator.L.Default.style() },
            "Indicator.L.Accent" to ComposeStyleReference { Indicator.L.Accent.style() },
            "Indicator.L.Inactive" to ComposeStyleReference { Indicator.L.Inactive.style() },
            "Indicator.L.Positive" to ComposeStyleReference { Indicator.L.Positive.style() },
            "Indicator.L.Warning" to ComposeStyleReference { Indicator.L.Warning.style() },
            "Indicator.L.Negative" to ComposeStyleReference { Indicator.L.Negative.style() },
            "Indicator.L.Dark" to ComposeStyleReference { Indicator.L.Dark.style() },
            "Indicator.L.Black" to ComposeStyleReference { Indicator.L.Black.style() },
            "Indicator.L.White" to ComposeStyleReference { Indicator.L.White.style() },
            "Indicator.M.Default" to ComposeStyleReference { Indicator.M.Default.style() },
            "Indicator.M.Accent" to ComposeStyleReference { Indicator.M.Accent.style() },
            "Indicator.M.Inactive" to ComposeStyleReference { Indicator.M.Inactive.style() },
            "Indicator.M.Positive" to ComposeStyleReference { Indicator.M.Positive.style() },
            "Indicator.M.Warning" to ComposeStyleReference { Indicator.M.Warning.style() },
            "Indicator.M.Negative" to ComposeStyleReference { Indicator.M.Negative.style() },
            "Indicator.M.Dark" to ComposeStyleReference { Indicator.M.Dark.style() },
            "Indicator.M.Black" to ComposeStyleReference { Indicator.M.Black.style() },
            "Indicator.M.White" to ComposeStyleReference { Indicator.M.White.style() },
            "Indicator.S.Default" to ComposeStyleReference { Indicator.S.Default.style() },
            "Indicator.S.Accent" to ComposeStyleReference { Indicator.S.Accent.style() },
            "Indicator.S.Inactive" to ComposeStyleReference { Indicator.S.Inactive.style() },
            "Indicator.S.Positive" to ComposeStyleReference { Indicator.S.Positive.style() },
            "Indicator.S.Warning" to ComposeStyleReference { Indicator.S.Warning.style() },
            "Indicator.S.Negative" to ComposeStyleReference { Indicator.S.Negative.style() },
            "Indicator.S.Dark" to ComposeStyleReference { Indicator.S.Dark.style() },
            "Indicator.S.Black" to ComposeStyleReference { Indicator.S.Black.style() },
            "Indicator.S.White" to ComposeStyleReference { Indicator.S.White.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IndicatorStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IndicatorSize.L
                "M" -> IndicatorSize.M
                "S" -> IndicatorSize.S
                else -> IndicatorSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IndicatorView.Default
                "Accent" -> IndicatorView.Accent
                "Inactive" -> IndicatorView.Inactive
                "Positive" -> IndicatorView.Positive
                "Warning" -> IndicatorView.Warning
                "Negative" -> IndicatorView.Negative
                "Dark" -> IndicatorView.Dark
                "Black" -> IndicatorView.Black
                "White" -> IndicatorView.White
                else -> IndicatorView.Default
            },
        ).key
    }
}
