package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorSwatchOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorSwatchOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 16.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 0.01 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 17.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 2.25 c -0.73 0.0 -1.429 0.29 -1.944 0.806 C 2.54 3.57 2.25 4.27 2.25 5.0 v 12.0 c 0.0 1.26 0.5 2.468 1.392 3.358 C 4.532 21.25 5.74 21.75 7.0 21.75 h 12.0 c 0.73 0.0 1.429 -0.29 1.944 -0.806 C 21.46 20.43 21.75 19.73 21.75 19.0 v -4.0 c 0.0 -0.73 -0.29 -1.429 -0.806 -1.944 C 20.43 12.54 19.73 12.25 19.0 12.25 h -0.527 l 0.713 -0.714 c 0.516 -0.516 0.805 -1.215 0.805 -1.944 c 0.0 -0.73 -0.289 -1.429 -0.805 -1.945 L 16.358 4.82 c -0.515 -0.515 -1.215 -0.804 -1.944 -0.804 c -0.638 0.0 -1.253 0.221 -1.742 0.622 L 12.47 4.819 l -0.72 0.72 V 5.0 c 0.0 -0.73 -0.29 -1.429 -0.806 -1.944 C 10.43 2.54 9.73 2.25 9.0 2.25 H 5.0 Z m 14.0 11.5 c 0.331 0.0 0.65 0.132 0.884 0.366 c 0.234 0.235 0.366 0.553 0.366 0.884 v 4.0 c 0.0 0.331 -0.132 0.65 -0.366 0.884 C 19.649 20.118 19.33 20.25 19.0 20.25 h -8.527 l 6.5 -6.5 H 19.0 Z m -10.0 -10.0 c 0.332 0.0 0.65 0.132 0.884 0.366 C 10.118 4.351 10.25 4.668 10.25 5.0 v 12.0 l -0.004 0.161 c -0.04 0.803 -0.377 1.565 -0.948 2.137 C 8.688 19.908 7.862 20.25 7.0 20.25 c -0.862 0.0 -1.688 -0.343 -2.298 -0.952 C 4.092 18.688 3.75 17.862 3.75 17.0 V 5.0 c 0.0 -0.332 0.132 -0.65 0.366 -0.884 C 4.351 3.882 4.668 3.75 5.0 3.75 h 4.0 Z m 5.414 1.765 c 0.332 0.0 0.65 0.132 0.884 0.366 V 5.88 l 2.828 2.828 c 0.234 0.234 0.365 0.552 0.365 0.884 c 0.0 0.331 -0.13 0.65 -0.365 0.884 l -6.376 6.376 V 7.66 l 1.78 -1.78 c 0.235 -0.234 0.553 -0.365 0.884 -0.365 Z")
        )
    }.build()
}
