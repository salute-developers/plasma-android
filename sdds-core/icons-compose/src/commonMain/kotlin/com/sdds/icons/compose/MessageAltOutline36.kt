package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAltOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAltOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.225 20.501 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 5.891 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 h -5.891 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.225 14.92 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 11.782 c 0.553 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.447 -1.0 -1.0 -1.0 H 12.225 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.334 17.883 c 0.0 -7.059 5.722 -12.781 12.782 -12.781 s 12.782 5.722 12.782 12.781 c 0.0 7.06 -5.723 12.782 -12.782 12.782 c -1.534 0.0 -3.008 -0.27 -4.373 -0.768 c -0.781 -0.284 -1.547 -0.363 -2.22 -0.175 l -3.937 1.102 c -1.47 0.412 -2.823 -0.942 -2.412 -2.41 l 1.103 -3.939 c 0.188 -0.672 0.109 -1.438 -0.176 -2.219 c -0.497 -1.365 -0.767 -2.838 -0.767 -4.373 Z M 18.116 7.102 c -5.955 0.0 -10.782 4.827 -10.782 10.781 c 0.0 1.298 0.228 2.54 0.647 3.689 c 0.378 1.04 0.556 2.25 0.222 3.443 L 7.12 28.878 l 3.863 -1.082 c 1.194 -0.334 2.403 -0.156 3.443 0.222 c 1.15 0.418 2.391 0.647 3.689 0.647 c 5.955 0.0 10.782 -4.827 10.782 -10.782 c 0.0 -5.954 -4.827 -10.781 -10.782 -10.781 Z")
        )
    }.build()
}
