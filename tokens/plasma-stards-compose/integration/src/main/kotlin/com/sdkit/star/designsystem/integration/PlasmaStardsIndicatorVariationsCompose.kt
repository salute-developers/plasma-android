// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.indicator.Accent
import com.sdkit.star.designsystem.styles.indicator.Black
import com.sdkit.star.designsystem.styles.indicator.Dark
import com.sdkit.star.designsystem.styles.indicator.Default
import com.sdkit.star.designsystem.styles.indicator.Inactive
import com.sdkit.star.designsystem.styles.indicator.Indicator
import com.sdkit.star.designsystem.styles.indicator.L
import com.sdkit.star.designsystem.styles.indicator.M
import com.sdkit.star.designsystem.styles.indicator.Negative
import com.sdkit.star.designsystem.styles.indicator.Positive
import com.sdkit.star.designsystem.styles.indicator.S
import com.sdkit.star.designsystem.styles.indicator.Warning
import com.sdkit.star.designsystem.styles.indicator.White

internal object PlasmaStardsIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { Indicator.L.Default.style() },
            "L.Accent" to ComposeStyleReference { Indicator.L.Accent.style() },
            "L.Inactive" to ComposeStyleReference { Indicator.L.Inactive.style() },
            "L.Positive" to ComposeStyleReference { Indicator.L.Positive.style() },
            "L.Warning" to ComposeStyleReference { Indicator.L.Warning.style() },
            "L.Negative" to ComposeStyleReference { Indicator.L.Negative.style() },
            "L.Dark" to ComposeStyleReference { Indicator.L.Dark.style() },
            "L.Black" to ComposeStyleReference { Indicator.L.Black.style() },
            "L.White" to ComposeStyleReference { Indicator.L.White.style() },
            "M.Default" to ComposeStyleReference { Indicator.M.Default.style() },
            "M.Accent" to ComposeStyleReference { Indicator.M.Accent.style() },
            "M.Inactive" to ComposeStyleReference { Indicator.M.Inactive.style() },
            "M.Positive" to ComposeStyleReference { Indicator.M.Positive.style() },
            "M.Warning" to ComposeStyleReference { Indicator.M.Warning.style() },
            "M.Negative" to ComposeStyleReference { Indicator.M.Negative.style() },
            "M.Dark" to ComposeStyleReference { Indicator.M.Dark.style() },
            "M.Black" to ComposeStyleReference { Indicator.M.Black.style() },
            "M.White" to ComposeStyleReference { Indicator.M.White.style() },
            "S.Default" to ComposeStyleReference { Indicator.S.Default.style() },
            "S.Accent" to ComposeStyleReference { Indicator.S.Accent.style() },
            "S.Inactive" to ComposeStyleReference { Indicator.S.Inactive.style() },
            "S.Positive" to ComposeStyleReference { Indicator.S.Positive.style() },
            "S.Warning" to ComposeStyleReference { Indicator.S.Warning.style() },
            "S.Negative" to ComposeStyleReference { Indicator.S.Negative.style() },
            "S.Dark" to ComposeStyleReference { Indicator.S.Dark.style() },
            "S.Black" to ComposeStyleReference { Indicator.S.Black.style() },
            "S.White" to ComposeStyleReference { Indicator.S.White.style() },
        )
}
