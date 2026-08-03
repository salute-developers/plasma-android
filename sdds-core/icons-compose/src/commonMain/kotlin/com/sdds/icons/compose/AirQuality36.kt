package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AirQuality36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AirQuality36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.5 19.0 c 1.38 0.0 2.5 1.12 2.5 2.5 v 9.0 c 0.0 1.38 -1.12 2.5 -2.5 2.5 h -3.0 C 9.12 33.0 8.0 31.88 8.0 30.5 v -9.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 h 3.0 Z m -3.0 2.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 9.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 3.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -9.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.75 19.0 c 2.21 0.0 4.0 1.79 4.0 4.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 H 24.0 c -1.519 0.0 -2.75 1.231 -2.75 2.75 v 4.5 c 0.0 1.519 1.231 2.75 2.75 2.75 h 0.75 c 1.105 0.0 2.0 -0.895 2.0 -2.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 c 0.0 2.21 -1.79 4.0 -4.0 4.0 H 24.0 c -2.623 0.0 -4.75 -2.127 -4.75 -4.75 v -4.5 c 0.0 -2.623 2.127 -4.75 4.75 -4.75 h 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.75 3.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 13.0 v 11.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 5.0 H 8.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 7.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.796 3.702 c 0.165 -0.527 0.725 -0.82 1.252 -0.656 c 0.527 0.165 0.82 0.725 0.656 1.252 l -3.75 12.0 C 24.824 16.715 24.437 17.0 24.0 17.0 c -0.437 0.0 -0.824 -0.285 -0.954 -0.702 l -3.75 -12.0 c -0.165 -0.527 0.13 -1.087 0.656 -1.252 c 0.527 -0.165 1.087 0.13 1.252 0.656 L 24.0 12.648 l 2.796 -8.946 Z")
        )
    }.build()
}
