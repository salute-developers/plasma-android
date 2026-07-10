package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.537 8.65 c 0.46 -1.417 2.465 -1.417 2.925 0.0 l 1.648 5.07 h 5.33 c 1.49 0.0 2.11 1.906 0.904 2.781 l -4.312 3.134 l 1.647 5.07 c 0.46 1.417 -1.161 2.595 -2.366 1.72 L 18.0 23.29 l -4.313 3.133 c -1.205 0.876 -2.827 -0.302 -2.366 -1.72 l 1.647 -5.07 l -4.313 -3.133 C 7.45 15.627 8.07 13.72 9.56 13.72 h 5.33 l 1.648 -5.07 Z m 1.744 14.436 Z m -0.562 0.0 Z m 0.28 -12.411 l -1.298 3.999 c -0.206 0.633 -0.797 1.062 -1.463 1.062 h -4.205 l 3.402 2.472 c 0.539 0.391 0.764 1.086 0.559 1.72 l -1.3 3.998 l 3.402 -2.471 c 0.539 -0.392 1.269 -0.392 1.808 0.0 l 3.401 2.47 l -1.299 -3.998 c -0.206 -0.633 0.02 -1.328 0.559 -1.72 l 3.401 -2.47 h -4.204 c -0.667 0.0 -1.257 -0.43 -1.463 -1.063 l -1.3 -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 5.017 C 10.83 5.017 5.017 10.83 5.017 18.0 c 0.0 7.17 5.813 12.983 12.983 12.983 c 7.17 0.0 12.983 -5.813 12.983 -12.983 c 0.0 -7.17 -5.813 -12.983 -12.983 -12.983 Z M 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 Z")
        )
    }.build()
}
