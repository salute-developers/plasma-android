package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbportalOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbportalOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.937 4.0 h 6.313 C 21.216 4.0 22.0 4.784 22.0 5.75 v 9.488 c 0.0 0.967 -0.784 1.75 -1.75 1.75 h -2.658 l -0.06 0.104 c -0.196 0.329 -0.501 0.76 -0.95 1.192 C 15.676 19.16 14.213 20.0 12.0 20.0 c -2.211 0.0 -3.675 -0.84 -4.583 -1.716 c -0.448 -0.431 -0.753 -0.863 -0.948 -1.192 c -0.022 -0.035 -0.042 -0.07 -0.06 -0.104 H 3.75 c -0.966 0.0 -1.75 -0.783 -1.75 -1.75 V 5.75 C 2.0 4.784 2.784 4.0 3.75 4.0 h 6.313 C 10.285 3.137 11.068 2.5 12.0 2.5 c 0.932 0.0 1.715 0.637 1.937 1.5 Z M 12.0 6.5 c 0.74 0.0 1.387 -0.402 1.732 -1.0 h 6.518 c 0.138 0.0 0.25 0.112 0.25 0.25 v 9.488 c 0.0 0.138 -0.112 0.25 -0.25 0.25 H 3.75 c -0.138 0.0 -0.25 -0.112 -0.25 -0.25 V 5.75 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 6.518 c 0.345 0.598 0.992 1.0 1.732 1.0 Z M 8.458 17.204 c -0.075 -0.072 -0.145 -0.144 -0.209 -0.216 h 7.502 c -0.064 0.072 -0.134 0.144 -0.209 0.216 C 14.888 17.834 13.79 18.5 12.0 18.5 s -2.888 -0.665 -3.542 -1.296 Z")
        )
    }.build()
}
