package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Logout36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Logout36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.457 4.5 h 4.423 c 1.933 0.0 3.5 1.567 3.5 3.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 11.5 c -1.067 0.0 -1.806 0.0 -2.382 0.048 C 8.555 6.594 8.238 6.679 8.002 6.8 C 7.484 7.063 7.063 7.484 6.8 8.002 C 6.68 8.238 6.594 8.555 6.548 9.118 C 6.5 9.694 6.5 10.433 6.5 11.5 v 12.999 c 0.0 1.066 0.0 1.806 0.048 2.381 c 0.046 0.564 0.131 0.88 0.252 1.117 c 0.263 0.518 0.684 0.938 1.202 1.202 c 0.236 0.12 0.553 0.206 1.116 0.252 c 0.576 0.047 1.315 0.048 2.382 0.048 h 4.381 c 0.828 0.0 1.499 -0.671 1.499 -1.499 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 c 0.0 1.932 -1.566 3.499 -3.499 3.499 h -4.424 c -1.014 0.0 -1.835 0.0 -2.501 -0.055 c -0.688 -0.056 -1.297 -0.175 -1.862 -0.463 c -0.894 -0.456 -1.62 -1.182 -2.076 -2.076 C 4.73 28.34 4.61 27.73 4.554 27.043 C 4.5 26.377 4.5 25.555 4.5 24.541 V 11.457 c 0.0 -1.014 0.0 -1.835 0.054 -2.501 c 0.057 -0.688 0.176 -1.297 0.464 -1.862 C 5.473 6.2 6.2 5.474 7.094 5.018 C 7.659 4.73 8.268 4.61 8.956 4.554 C 9.622 4.5 10.444 4.5 11.458 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.0 18.0 c 0.0 -0.268 -0.107 -0.524 -0.298 -0.712 l -4.602 -4.54 c -0.393 -0.388 -1.027 -0.384 -1.414 0.009 c -0.388 0.393 -0.384 1.026 0.01 1.414 L 25.561 17.0 H 14.96 c -0.553 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.447 1.0 1.0 1.0 h 10.602 l -2.867 2.828 c -0.393 0.388 -0.397 1.021 -0.01 1.414 c 0.389 0.393 1.022 0.398 1.415 0.01 l 4.602 -4.54 C 28.892 18.524 29.0 18.267 29.0 18.0 Z")
        )
    }.build()
}
