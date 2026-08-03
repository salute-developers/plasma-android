package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinBirrFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinBirrFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.24 11.8 c 0.67 -1.001 1.06 -2.205 1.06 -3.5 C 14.3 4.82 11.48 2.0 8.0 2.0 C 4.522 2.0 1.7 4.82 1.7 8.3 c 0.0 1.295 0.392 2.499 1.062 3.5 h 1.74 L 4.5 11.75 v -6.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.028 c 1.104 0.0 2.0 0.895 2.0 2.0 c 0.0 0.454 -0.152 0.873 -0.406 1.208 c 0.65 0.324 1.1 0.992 1.11 1.768 c 0.007 0.634 -0.28 1.202 -0.736 1.574 h 1.2 l -0.002 -0.05 v -1.37 v -0.042 v -1.94 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.223 0.5 0.5 v 0.08 c 0.372 -0.255 0.821 -0.404 1.306 -0.404 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 c -0.721 0.0 -1.306 0.584 -1.306 1.305 v 1.371 c 0.0 0.017 0.0 0.034 -0.002 0.05 h 3.048 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.5 9.25 v 2.0 h 1.232 c 0.557 0.0 1.006 -0.455 1.0 -1.012 c -0.007 -0.548 -0.453 -0.988 -1.0 -0.988 H 5.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.5 8.25 h 0.528 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 5.5 v 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.525 12.85 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
