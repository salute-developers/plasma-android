package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.485 17.0 C 20.442 15.57 21.0 13.85 21.0 12.0 c 0.0 -4.97 -4.03 -9.0 -9.0 -9.0 s -9.0 4.03 -9.0 9.0 c 0.0 1.85 0.558 3.57 1.516 5.0 H 9.55 c -0.182 -0.137 -0.3 -0.355 -0.3 -0.6 V 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.277 c 1.642 0.0 2.973 1.331 2.973 2.973 c 0.0 1.24 -0.76 2.303 -1.838 2.75 l 1.74 3.056 c 0.189 0.332 0.096 0.748 -0.202 0.971 h 4.535 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.75 16.4 c 0.0 0.245 -0.118 0.463 -0.3 0.6 h 3.6 c -0.08 -0.06 -0.15 -0.137 -0.202 -0.229 l -2.034 -3.574 H 10.75 V 16.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.75 11.697 h 1.485 h 0.028 h 0.014 c 0.813 0.0 1.473 -0.66 1.473 -1.473 c 0.0 -0.814 -0.66 -1.474 -1.473 -1.474 H 10.75 v 2.947 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
