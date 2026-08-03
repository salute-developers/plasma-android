package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MaskFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MaskFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.014 4.096 C 5.784 3.691 4.484 4.618 4.5 5.92 c 0.144 11.7 2.52 18.235 5.432 21.86 C 12.885 31.457 16.272 32.0 18.0 32.0 c 1.729 0.0 5.115 -0.543 8.068 -4.22 c 2.912 -3.625 5.288 -10.16 5.432 -21.86 c 0.016 -1.302 -1.284 -2.229 -2.515 -1.824 C 27.112 4.712 22.846 5.908 18.0 5.908 c -4.846 0.0 -9.112 -1.196 -10.986 -1.812 Z m 8.735 10.757 c 0.0 0.865 -1.008 1.144 -1.757 0.714 L 13.698 15.4 c -0.588 -0.338 -1.312 -0.338 -1.901 0.0 l -0.294 0.168 c -0.75 0.43 -1.757 0.15 -1.757 -0.714 c 0.0 -0.523 0.139 -1.037 0.402 -1.49 c 0.264 -0.454 0.643 -0.83 1.099 -1.092 c 0.456 -0.262 0.974 -0.4 1.5 -0.4 c 0.527 0.0 1.045 0.138 1.501 0.4 c 0.457 0.262 0.836 0.638 1.099 1.091 c 0.263 0.454 0.402 0.968 0.402 1.491 Z m 6.26 0.714 c -0.75 0.43 -1.757 0.15 -1.757 -0.714 c 0.0 -0.523 0.139 -1.037 0.402 -1.49 c 0.264 -0.454 0.642 -0.83 1.099 -1.092 c 0.456 -0.262 0.974 -0.4 1.5 -0.4 c 0.527 0.0 1.045 0.138 1.501 0.4 c 0.456 0.262 0.835 0.638 1.099 1.091 c 0.263 0.454 0.402 0.968 0.402 1.491 c 0.0 0.865 -1.008 1.144 -1.757 0.714 L 24.204 15.4 c -0.589 -0.338 -1.313 -0.338 -1.902 0.0 l -0.293 0.168 Z m -9.896 6.641 c -0.301 -1.316 1.11 -2.131 2.425 -1.824 l 2.304 0.536 c 0.762 0.178 1.556 0.178 2.318 0.0 l 2.304 -0.537 c 1.315 -0.306 2.726 0.509 2.425 1.825 c -0.18 0.785 -0.565 1.524 -1.126 2.159 c -0.56 0.635 -1.281 1.15 -2.107 1.503 c -0.826 0.354 -1.734 0.539 -2.655 0.539 c -0.92 0.0 -1.83 -0.184 -2.655 -0.539 c -0.826 -0.354 -1.547 -0.868 -2.108 -1.503 c -0.56 -0.635 -0.945 -1.374 -1.125 -2.159 Z")
        )
    }.build()
}
