package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SteeringWheelFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SteeringWheelFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.75 20.045 c 2.482 -0.848 4.447 -2.813 5.295 -5.295 H 17.0 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 3.045 Z M 9.25 17.0 v 3.045 c -2.482 -0.848 -4.447 -2.813 -5.295 -5.295 H 7.0 c 1.243 0.0 2.25 1.007 2.25 2.25 Z m 10.948 -7.256 c -1.594 -0.063 -2.519 -0.625 -3.557 -1.26 l -0.01 -0.006 c -1.145 -0.7 -2.42 -1.48 -4.631 -1.48 c -2.164 0.0 -3.317 0.749 -4.372 1.433 L 7.53 8.495 C 7.002 8.836 6.515 9.14 5.903 9.367 c -0.545 0.202 -1.21 0.351 -2.1 0.379 C 4.79 6.146 8.085 3.5 12.0 3.5 c 3.913 0.0 7.21 2.645 8.198 6.244 Z M 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 Z m -10.0 2.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
    }.build()
}
