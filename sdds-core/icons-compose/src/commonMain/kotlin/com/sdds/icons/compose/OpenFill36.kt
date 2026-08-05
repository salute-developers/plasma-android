package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OpenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OpenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.457 4.5 h 13.084 c 1.014 0.0 1.836 0.0 2.502 0.054 c 0.687 0.057 1.297 0.176 1.862 0.464 c 0.894 0.455 1.62 1.182 2.076 2.076 c 0.288 0.565 0.407 1.174 0.463 1.862 c 0.055 0.666 0.055 1.488 0.055 2.502 V 24.54 c 0.0 1.014 0.0 1.836 -0.055 2.502 c -0.056 0.687 -0.175 1.297 -0.463 1.862 c -0.456 0.894 -1.182 1.62 -2.076 2.076 c -0.566 0.288 -1.175 0.407 -1.862 0.463 c -0.666 0.055 -1.488 0.055 -2.502 0.055 H 11.457 c -1.014 0.0 -1.835 0.0 -2.501 -0.055 c -0.688 -0.056 -1.297 -0.175 -1.862 -0.463 c -0.894 -0.456 -1.62 -1.182 -2.076 -2.076 C 4.73 28.34 4.61 27.73 4.554 27.043 C 4.5 26.377 4.5 25.555 4.5 24.541 V 11.457 c 0.0 -1.014 0.0 -1.835 0.054 -2.501 c 0.057 -0.688 0.176 -1.297 0.464 -1.862 C 5.473 6.2 6.2 5.474 7.094 5.018 C 7.659 4.73 8.268 4.61 8.956 4.554 C 9.622 4.5 10.444 4.5 11.458 4.5 Z m 1.997 7.575 c -0.553 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.447 1.0 1.0 1.0 h 7.055 l -8.52 8.52 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 l 8.52 -8.52 v 7.055 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -9.469 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -9.47 Z")
        )
    }.build()
}
