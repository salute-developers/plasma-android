// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.wheel.CenterAlign
import com.sdkit.star.designsystem.styles.wheel.H1
import com.sdkit.star.designsystem.styles.wheel.LeftAlign
import com.sdkit.star.designsystem.styles.wheel.MixedAlign
import com.sdkit.star.designsystem.styles.wheel.RightAlign
import com.sdkit.star.designsystem.styles.wheel.Wheel

internal object PlasmaStardsWheelVariationsCompose : ComposeStyleProvider<WheelStyle>() {
    override val variations: Map<String, ComposeStyleReference<WheelStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { Wheel.H1.style() },
            "H1.RightAlign" to ComposeStyleReference { Wheel.H1.RightAlign.style() },
            "H1.CenterAlign" to ComposeStyleReference { Wheel.H1.CenterAlign.style() },
            "H1.LeftAlign" to ComposeStyleReference { Wheel.H1.LeftAlign.style() },
            "H1.MixedAlign" to ComposeStyleReference { Wheel.H1.MixedAlign.style() },
        )
}
