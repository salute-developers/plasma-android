package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.wheel.CenterAlign
import com.sdkit.star.designsystem.styles.wheel.H1
import com.sdkit.star.designsystem.styles.wheel.LeftAlign
import com.sdkit.star.designsystem.styles.wheel.MixedAlign
import com.sdkit.star.designsystem.styles.wheel.RightAlign
import com.sdkit.star.designsystem.styles.wheel.Wheel

internal object PlasmaStardsWheelVariationsCompose : ComposeStyleProvider<String, WheelStyle>() {
    override val variations: Map<String, @Composable () -> WheelStyle> =
        mapOf(
            "H1" to { Wheel.H1.style() },
            "H1.RightAlign" to { Wheel.H1.RightAlign.style() },
            "H1.CenterAlign" to { Wheel.H1.CenterAlign.style() },
            "H1.LeftAlign" to { Wheel.H1.LeftAlign.style() },
            "H1.MixedAlign" to { Wheel.H1.MixedAlign.style() },
        )
}
