package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiLow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiLow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 15.36 c 1.38 0.0 2.5 1.12 2.5 2.5 c 0.0 1.381 -1.12 2.5 -2.5 2.5 s -2.5 -1.119 -2.5 -2.5 c 0.0 -1.38 1.119 -2.5 2.5 -2.5 Z m 0.0 -5.11 c 2.055 0.0 4.027 0.816 5.48 2.27 c 0.293 0.292 0.293 0.768 0.0 1.061 c -0.292 0.293 -0.768 0.293 -1.061 0.0 c -1.172 -1.172 -2.761 -1.83 -4.419 -1.831 c -1.658 0.0 -3.247 0.659 -4.419 1.831 c -0.293 0.293 -0.769 0.293 -1.062 0.0 c -0.292 -0.293 -0.292 -0.769 0.0 -1.061 c 1.454 -1.454 3.426 -2.27 5.481 -2.27 Z")
        )
    }.build()
}
