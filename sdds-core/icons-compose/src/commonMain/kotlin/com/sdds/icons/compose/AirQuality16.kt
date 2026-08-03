package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AirQuality16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AirQuality16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.95 8.35 c 0.662 0.0 1.2 0.537 1.2 1.2 v 4.2 c 0.0 0.662 -0.537 1.2 -1.2 1.2 h -1.4 c -0.662 0.0 -1.2 -0.538 -1.2 -1.2 v -4.2 c 0.001 -0.663 0.538 -1.2 1.2 -1.2 h 1.4 Z m -1.4 1.0 c -0.11 0.0 -0.199 0.09 -0.2 0.2 v 4.2 c 0.0 0.11 0.09 0.2 0.2 0.2 h 1.4 c 0.11 0.0 0.2 -0.09 0.2 -0.2 v -4.2 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.2 8.35 c 1.05 0.0 1.9 0.851 1.9 1.9 c 0.0 0.276 -0.224 0.5 -0.5 0.5 c -0.275 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.496 -0.403 -0.9 -0.9 -0.9 h -0.35 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 2.1 c 0.0 0.69 0.56 1.25 1.25 1.25 h 0.35 c 0.497 0.0 0.9 -0.403 0.9 -0.9 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.224 0.5 0.5 c 0.0 1.05 -0.85 1.9 -1.9 1.9 h -0.35 c -1.242 0.0 -2.25 -1.008 -2.25 -2.25 v -2.1 c 0.0 -1.242 1.008 -2.25 2.25 -2.25 h 0.35 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 7.276 2.0 7.0 2.0 H 5.75 v 5.1 c 0.0 0.275 -0.224 0.5 -0.5 0.5 s -0.5 -0.225 -0.5 -0.5 V 2.0 H 3.5 C 3.224 2.0 3.0 1.776 3.0 1.5 S 3.224 1.0 3.5 1.0 H 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.122 1.35 c 0.083 -0.263 0.364 -0.41 0.627 -0.328 c 0.263 0.082 0.41 0.364 0.328 0.627 l -1.75 5.6 c -0.065 0.208 -0.259 0.35 -0.477 0.35 c -0.219 0.0 -0.413 -0.142 -0.478 -0.35 l -1.75 -5.6 C 8.54 1.386 8.687 1.105 8.95 1.022 C 9.214 0.94 9.495 1.087 9.577 1.35 l 1.273 4.072 l 1.272 -4.072 Z")
        )
    }.build()
}
