package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SecurityCameraFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SecurityCameraFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.881 6.0 C 6.017 6.0 4.506 7.511 4.506 9.375 v 8.25 C 4.506 19.489 6.017 21.0 7.881 21.0 h 9.06 v 3.006 c 0.0 0.621 -0.504 1.125 -1.126 1.125 H 5.254 v -1.506 c 0.0 -0.621 -0.504 -1.125 -1.125 -1.125 s -1.125 0.504 -1.125 1.125 v 5.25 C 3.004 29.496 3.508 30.0 4.129 30.0 s 1.125 -0.504 1.125 -1.125 v -1.494 h 10.561 c 1.864 0.0 3.375 -1.511 3.375 -3.375 V 21.0 h 6.047 c 1.864 0.0 3.375 -1.511 3.375 -3.375 v -8.25 C 28.612 7.511 27.1 6.0 25.237 6.0 H 7.88 Z m 24.65 3.275 c 0.294 0.182 0.473 0.504 0.473 0.85 v 6.75 c 0.0 0.346 -0.18 0.667 -0.473 0.85 c -0.294 0.182 -0.662 0.2 -0.972 0.045 l -0.755 -0.374 c -0.34 -0.169 -0.556 -0.516 -0.556 -0.896 v -6.0 c 0.0 -0.38 0.215 -0.727 0.556 -0.896 l 0.755 -0.375 c 0.31 -0.154 0.677 -0.136 0.972 0.046 Z m -22.375 1.35 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 5.273 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 h -5.273 Z")
        )
    }.build()
}
