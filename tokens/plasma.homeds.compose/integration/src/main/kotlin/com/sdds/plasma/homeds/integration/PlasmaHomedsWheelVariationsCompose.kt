// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.wheel.CenterAlign
import com.sdds.plasma.homeds.styles.wheel.H1
import com.sdds.plasma.homeds.styles.wheel.LeftAlign
import com.sdds.plasma.homeds.styles.wheel.MixedAlign
import com.sdds.plasma.homeds.styles.wheel.RightAlign
import com.sdds.plasma.homeds.styles.wheel.Wheel

internal object PlasmaHomedsWheelVariationsCompose : ComposeStyleProvider<WheelStyle>() {
    override val variations: Map<String, ComposeStyleReference<WheelStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { Wheel.H1.style() },
            "H1.RightAlign" to ComposeStyleReference { Wheel.H1.RightAlign.style() },
            "H1.CenterAlign" to ComposeStyleReference { Wheel.H1.CenterAlign.style() },
            "H1.LeftAlign" to ComposeStyleReference { Wheel.H1.LeftAlign.style() },
            "H1.MixedAlign" to ComposeStyleReference { Wheel.H1.MixedAlign.style() },
        )
}
