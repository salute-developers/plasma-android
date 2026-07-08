package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.33 26.353 c 1.448 -2.155 2.293 -4.748 2.293 -7.537 c 0.0 -7.492 -6.098 -13.566 -13.621 -13.566 c -7.523 0.0 -13.621 6.074 -13.621 13.567 c 0.0 2.788 0.845 5.38 2.294 7.536 h 7.528 C 14.075 26.186 14.0 25.977 14.0 25.75 V 13.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.375 c 2.416 0.0 4.375 1.959 4.375 4.375 c 0.0 1.87 -1.173 3.466 -2.824 4.092 l 2.696 4.793 c 0.2 0.357 0.158 0.786 -0.074 1.093 h 6.781 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 25.75 c 0.0 0.227 -0.075 0.436 -0.203 0.603 h 5.155 c -0.026 -0.035 -0.051 -0.073 -0.074 -0.113 l -3.088 -5.49 H 16.0 v 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 18.75 h 2.355 h 0.035 c 1.305 -0.008 2.36 -1.068 2.36 -2.375 c 0.0 -1.312 -1.063 -2.375 -2.375 -2.375 H 16.0 v 4.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 28.745 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 27.999 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 4.0 Z")
        )
    }.build()
}
