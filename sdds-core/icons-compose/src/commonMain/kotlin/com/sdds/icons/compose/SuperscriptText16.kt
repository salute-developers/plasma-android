package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SuperscriptText16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SuperscriptText16",
        defaultWidth = 17.dp,
        defaultHeight = 16.dp,
        viewportWidth = 17f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.984 5.83 v 0.825 h 3.097 V 5.83 h -0.932 V 1.25 h -0.624 l -1.541 1.104 v 0.92 l 1.275 -0.92 V 5.83 h -1.275 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.455 12.203 L 4.966 4.966 H 3.74 l -2.454 7.237 h 1.097 l 0.57 -1.716 h 2.774 l 0.579 1.716 h 1.149 Z m -3.12 -5.872 L 5.33 9.298 H 3.342 L 4.336 6.33 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.99 7.36 v 1.51 C 8.285 8.32 8.743 7.95 9.538 7.95 c 0.58 0.0 0.873 0.227 0.873 0.96 v 0.228 H 9.434 c -1.063 0.0 -1.78 0.33 -1.78 1.51 c 0.0 1.013 0.518 1.602 1.39 1.602 c 0.692 0.0 1.219 -0.414 1.426 -1.013 v 0.93 h 0.95 V 8.755 c 0.0 -1.344 -0.621 -1.86 -1.883 -1.86 c -0.743 0.0 -1.261 0.206 -1.546 0.465 Z m 2.42 2.988 c -0.043 0.351 -0.363 0.816 -1.046 0.816 c -0.449 0.0 -0.69 -0.248 -0.69 -0.64 c 0.0 -0.466 0.284 -0.6 0.88 -0.6 h 0.856 v 0.424 Z")
        )
    }.build()
}
