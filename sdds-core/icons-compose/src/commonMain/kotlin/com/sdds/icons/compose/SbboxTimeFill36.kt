package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTimeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTimeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.323 14.453 c 0.44 0.438 0.442 1.15 0.003 1.59 l -3.467 3.481 c -0.29 0.307 -0.733 0.426 -1.138 0.304 c -0.09 -0.027 -0.178 -0.065 -0.261 -0.116 l -3.463 -1.986 c -0.54 -0.31 -0.726 -0.997 -0.416 -1.536 c 0.309 -0.539 0.996 -0.725 1.535 -0.416 l 2.738 1.57 l 2.878 -2.888 c 0.439 -0.44 1.15 -0.441 1.591 -0.003 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.101 29.752 c -3.486 0.0 -5.479 -4.504 -2.988 -8.003 l 9.73 -12.768 c 0.426 -0.55 0.928 -1.036 1.508 -1.444 c 1.239 -0.871 2.69 -1.285 4.221 -1.287 c 3.654 -0.004 7.767 2.336 10.565 6.408 c 3.97 5.778 3.79 12.854 -0.406 15.804 c -1.08 0.76 -2.32 1.172 -3.634 1.267 c -0.188 0.013 -0.377 0.02 -0.568 0.02 L 7.101 29.753 Z m 18.42 -2.252 h 0.004 c 1.112 -0.005 2.094 -0.303 2.912 -0.878 c 1.37 -0.964 2.25 -2.715 2.31 -5.06 c 0.06 -2.34 -0.721 -5.093 -2.465 -7.63 c -1.744 -2.537 -4.018 -4.229 -6.19 -4.982 c -0.885 -0.306 -1.726 -0.451 -2.505 -0.45 c -1.132 0.0 -2.133 0.309 -2.942 0.878 c -0.39 0.274 -0.73 0.602 -1.022 0.98 l -0.006 0.007 l -0.031 0.041 C 13.77 12.814 13.729 17.6 16.8 22.068 c 2.478 3.606 5.945 5.423 8.68 5.432 h 0.041 Z")
        )
    }.build()
}
