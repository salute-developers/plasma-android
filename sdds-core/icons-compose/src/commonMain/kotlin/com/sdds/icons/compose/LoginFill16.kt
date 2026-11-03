package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
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
            pathData = addPathNodes("M 10.3 1.75 c 1.12 0.0 1.68 0.0 2.108 0.218 c 0.377 0.192 0.683 0.498 0.874 0.874 C 13.5 3.27 13.5 3.83 13.5 4.95 v 6.1 c 0.0 1.12 0.0 1.68 -0.218 2.108 c -0.191 0.377 -0.498 0.683 -0.874 0.874 C 11.98 14.25 11.42 14.25 10.3 14.25 H 9.2 c -1.12 0.0 -1.68 0.0 -2.108 -0.218 c -0.376 -0.191 -0.683 -0.498 -0.874 -0.874 C 6.0 12.73 6.0 12.17 6.0 11.05 V 8.51 h 3.797 L 8.528 9.784 C 8.334 9.98 8.334 10.295 8.53 10.49 c 0.196 0.195 0.512 0.194 0.707 -0.002 l 2.118 -2.125 l 0.064 -0.078 c 0.127 -0.193 0.106 -0.456 -0.063 -0.627 L 9.236 5.533 C 9.041 5.338 8.725 5.336 8.53 5.531 c -0.195 0.195 -0.195 0.512 0.0 0.707 l 1.268 1.273 H 6.0 V 4.95 C 6.0 3.83 6.0 3.27 6.218 2.84 C 6.409 2.467 6.716 2.16 7.092 1.969 C 7.52 1.75 8.08 1.75 9.2 1.75 h 1.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 8.51 H 3.0 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.275 0.224 -0.5 0.5 -0.5 h 3.0 v 1.0 Z")
        )
    }.build()
}
