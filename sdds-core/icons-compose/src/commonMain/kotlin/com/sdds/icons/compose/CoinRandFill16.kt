package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.24 11.8 c 0.67 -1.001 1.06 -2.205 1.06 -3.5 C 14.3 4.82 11.48 2.0 8.0 2.0 C 4.522 2.0 1.7 4.82 1.7 8.3 c 0.0 1.295 0.392 2.499 1.062 3.5 H 6.2 C 6.079 11.709 6.0 11.564 6.0 11.4 V 5.5 C 6.0 5.224 6.224 5.0 6.5 5.0 h 1.588 c 1.139 0.0 2.062 0.923 2.062 2.062 c 0.0 0.869 -0.538 1.613 -1.3 1.916 l 1.235 2.175 c 0.125 0.222 0.064 0.498 -0.135 0.647 h 3.29 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 11.4 c 0.0 0.164 -0.079 0.309 -0.2 0.4 h 2.55 c -0.054 -0.04 -0.1 -0.091 -0.135 -0.153 L 7.784 9.124 H 7.0 V 11.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 8.124 h 1.065 h 0.019 h 0.004 c 0.587 0.0 1.062 -0.476 1.062 -1.062 C 9.15 6.475 8.675 6.0 8.088 6.0 H 7.0 v 2.124 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.525 12.85 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
