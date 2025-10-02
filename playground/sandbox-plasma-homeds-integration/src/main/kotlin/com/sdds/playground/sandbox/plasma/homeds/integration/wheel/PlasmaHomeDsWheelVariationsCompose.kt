package com.sdds.playground.sandbox.plasma.homeds.integration.wheel

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.wheel.CenterAlign
import com.sdds.plasma.homeds.styles.wheel.H1
import com.sdds.plasma.homeds.styles.wheel.LeftAlign
import com.sdds.plasma.homeds.styles.wheel.MixedAlign
import com.sdds.plasma.homeds.styles.wheel.RightAlign
import com.sdds.plasma.homeds.styles.wheel.Wheel
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsWheelVariationsCompose :
    ComposeStyleProvider<String, WheelStyle>() {
    override val variations: Map<String, @Composable () -> WheelStyle> =
        mapOf(
            "H1MixedAlign" to { Wheel.H1.MixedAlign.style() },
            "H1LeftAlign" to { Wheel.H1.LeftAlign.style() },
            "H1CenterAlign" to { Wheel.H1.CenterAlign.style() },
            "H1RightAlign" to { Wheel.H1.RightAlign.style() },
        )
}
