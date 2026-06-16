// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.indicator.Accent
import com.sdkit.star.designsystem.styles.indicator.Black
import com.sdkit.star.designsystem.styles.indicator.Dark
import com.sdkit.star.designsystem.styles.indicator.Default
import com.sdkit.star.designsystem.styles.indicator.Inactive
import com.sdkit.star.designsystem.styles.indicator.Indicator
import com.sdkit.star.designsystem.styles.indicator.IndicatorDefaultSize
import com.sdkit.star.designsystem.styles.indicator.IndicatorDefaultView
import com.sdkit.star.designsystem.styles.indicator.IndicatorStyles
import com.sdkit.star.designsystem.styles.indicator.L
import com.sdkit.star.designsystem.styles.indicator.M
import com.sdkit.star.designsystem.styles.indicator.Negative
import com.sdkit.star.designsystem.styles.indicator.Positive
import com.sdkit.star.designsystem.styles.indicator.S
import com.sdkit.star.designsystem.styles.indicator.Warning
import com.sdkit.star.designsystem.styles.indicator.White
import com.sdkit.star.designsystem.styles.indicator.resolve

internal object PlasmaStardsIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
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
        return IndicatorStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IndicatorDefaultSize.L
                "M" -> IndicatorDefaultSize.M
                "S" -> IndicatorDefaultSize.S
                else -> IndicatorDefaultSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IndicatorDefaultView.Default
                "Accent" -> IndicatorDefaultView.Accent
                "Inactive" -> IndicatorDefaultView.Inactive
                "Positive" -> IndicatorDefaultView.Positive
                "Warning" -> IndicatorDefaultView.Warning
                "Negative" -> IndicatorDefaultView.Negative
                "Dark" -> IndicatorDefaultView.Dark
                "Black" -> IndicatorDefaultView.Black
                "White" -> IndicatorDefaultView.White
                else -> IndicatorDefaultView.Default
            },
        ).key
    }
}
