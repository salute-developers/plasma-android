package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LoginFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LoginFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.968 13.158 C 6.75 12.73 6.75 12.17 6.75 11.05 V 8.51 h 3.046 L 8.528 9.784 C 8.333 9.978 8.334 10.295 8.53 10.49 c 0.196 0.195 0.513 0.194 0.708 -0.002 l 2.117 -2.124 c 0.195 -0.196 0.195 -0.511 0.0 -0.706 L 9.237 5.533 C 9.042 5.337 8.725 5.337 8.529 5.53 c -0.195 0.195 -0.196 0.512 0.0 0.708 L 9.795 7.51 H 6.75 V 4.95 c 0.0 -1.12 0.0 -1.68 0.218 -2.108 C 7.16 2.466 7.466 2.16 7.842 1.968 C 8.27 1.75 8.83 1.75 9.95 1.75 h 0.85 c 1.12 0.0 1.68 0.0 2.108 0.218 c 0.376 0.192 0.682 0.498 0.874 0.874 C 14.0 3.27 14.0 3.83 14.0 4.95 v 6.1 c 0.0 1.12 0.0 1.68 -0.218 2.108 c -0.192 0.376 -0.498 0.682 -0.874 0.874 C 12.48 14.25 11.92 14.25 10.8 14.25 H 9.95 c -1.12 0.0 -1.68 0.0 -2.108 -0.218 c -0.376 -0.192 -0.682 -0.498 -0.874 -0.874 Z M 6.75 7.511 H 4.0 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 2.75 v -1.0 Z")
        )
    }.build()
}
