package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WhistleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WhistleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.333 9.893 C 8.937 8.822 10.822 8.25 12.75 8.25 c 0.298 0.0 0.585 0.119 0.796 0.33 c 0.21 0.21 0.329 0.497 0.329 0.795 v 3.0 h 2.25 v -3.0 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 h 14.625 C 32.496 8.25 33.0 8.754 33.0 9.375 V 15.0 c 0.0 0.502 -0.333 0.944 -0.816 1.082 l -9.412 2.689 c -0.135 0.039 -0.315 0.199 -0.356 0.504 c -0.195 1.477 -0.726 2.894 -1.56 4.142 c -1.07 1.603 -2.593 2.853 -4.375 3.59 c -1.781 0.739 -3.742 0.932 -5.633 0.556 c -1.891 -0.377 -3.629 -1.305 -4.992 -2.669 c -1.364 -1.363 -2.292 -3.1 -2.669 -4.992 c -0.376 -1.891 -0.183 -3.852 0.555 -5.633 c 0.738 -1.782 1.988 -3.305 3.591 -4.376 Z")
        )
    }.build()
}
