package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GasStationFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GasStationFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.724 1.0 C 3.468 1.0 2.449 2.019 2.449 3.275 V 13.95 H 2.275 c -0.29 0.0 -0.525 0.235 -0.525 0.525 C 1.75 14.765 1.985 15.0 2.275 15.0 h 9.389 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 11.49 v -1.286 c 0.26 0.135 0.556 0.21 0.87 0.21 c 1.044 0.0 1.89 -0.846 1.89 -1.89 V 7.929 c 0.0 -0.584 -0.088 -1.164 -0.263 -1.721 L 13.184 3.65 c -0.082 -0.263 -0.363 -0.41 -0.626 -0.327 c -0.264 0.082 -0.41 0.363 -0.328 0.626 l 0.803 2.558 c 0.144 0.46 0.218 0.94 0.218 1.422 v 3.055 c 0.0 0.492 -0.4 0.89 -0.891 0.89 c -0.425 0.0 -0.78 -0.297 -0.87 -0.694 V 3.275 C 11.49 2.019 10.472 1.0 9.215 1.0 H 4.724 Z m 0.254 3.628 C 4.883 4.815 4.883 5.06 4.883 5.55 v 0.7 c 0.0 0.49 0.0 0.735 0.095 0.922 c 0.084 0.165 0.218 0.299 0.383 0.383 C 5.548 7.65 5.793 7.65 6.283 7.65 h 1.373 c 0.49 0.0 0.735 0.0 0.922 -0.095 c 0.165 -0.084 0.299 -0.218 0.383 -0.383 C 9.056 6.985 9.056 6.74 9.056 6.25 v -0.7 c 0.0 -0.49 0.0 -0.735 -0.095 -0.922 c -0.084 -0.165 -0.218 -0.299 -0.383 -0.383 C 8.391 4.15 8.146 4.15 7.656 4.15 H 6.283 c -0.49 0.0 -0.735 0.0 -0.922 0.095 C 5.196 4.33 5.062 4.463 4.978 4.628 Z")
        )
    }.build()
}
